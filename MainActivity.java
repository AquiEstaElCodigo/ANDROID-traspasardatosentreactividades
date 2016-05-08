package com.example.germanriveros.traspasardatos;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity
{

    private EditText et_envia1;
    private Button btn_enviar1;

    private EditText et_envia2;
    private EditText et_envia3;
    private Button btn_enviar2;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        et_envia1 = (EditText) findViewById(R.id.et_envia1);
        et_envia2 = (EditText) findViewById(R.id.et_envia2);
        et_envia3 = (EditText) findViewById(R.id.et_envia3);
        btn_enviar1 = (Button) findViewById(R.id.btn_enviar1);
        btn_enviar2 = (Button) findViewById(R.id.btn_enviar2);

        btn_enviar1.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {

                String nombre = et_envia1.getText().toString();
                Intent i = new Intent(MainActivity.this, RecibeDatos.class);

                i.putExtra("dato1",nombre);
                startActivity(i);
                et_envia1.setText("");
            }
        });


        btn_enviar2.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {

                String nombre2 = et_envia2.getText().toString();

                //Recibimos el dato que corresponde a la edad y cambiamos su tipo a entero
                //en caso de realizar querer realizar alguna operación con este.
                int edad = Integer.parseInt(et_envia3.getText().toString());

                //En esta línea cambiamos su tipo para poder enviarlo, el paso anterior
                String s_edad = Integer.toString(edad);

                String[] datos = new String[]{nombre2,s_edad};

                Intent i = new Intent(MainActivity.this, RecibeDatos.class);

                i.putExtra("dat_2",datos[0]); //Sin duda esto se puede
                i.putExtra("dat_3",datos[1]); //hacer de mejor forma.

                startActivity(i);

                //Limpiar los edit text
                et_envia2.setText("");
                et_envia3.setText("");

            }
        });

    }//..




}
