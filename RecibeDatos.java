package com.example.germanriveros.traspasardatos;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.EditText;
import android.widget.TextView;

/**
 * Created by germanriveros on 08-05-16.
 */
public class RecibeDatos extends AppCompatActivity
{

    Bundle b, _b;
    private String _nombre;
    private TextView tv_recibe1;
    private TextView tv_recibe2;
    private TextView tv_recibe3;

    @Override
    protected void onCreate(Bundle saveInstanceState)
    {
        super.onCreate(saveInstanceState);
        setContentView(R.layout.recibe_datos);

        //inicio - Recepción de un valor
        tv_recibe1 = (TextView) findViewById(R.id.tv_recibe1);
        b = getIntent().getExtras();
        _nombre = b.getString("dato1");
        tv_recibe1.setText(_nombre);
        //fin

        //inicio - Recepción de valores
        tv_recibe2 = (TextView) findViewById(R.id.tv_recibe2);
        tv_recibe3 = (TextView) findViewById(R.id.tv_recibe3);
        String[] _datos = new String[2];
        _b = getIntent().getExtras();
        _datos[0] = _b.getString("dat_2");
        _datos[1] = _b.getString("dat_3");

        tv_recibe2.setText(_datos[0]);
        tv_recibe3.setText(_datos[1]);
        //Fin

    }//..

}
