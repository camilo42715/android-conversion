package com.example.estudiantes.conversion;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Conversion extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_conversion);

    }


    public void Sumar (View vista){
        EditText a=(EditText) findViewById(R.id.numeroa);
        EditText b=(EditText) findViewById(R.id.numerob);
        double numeroa=Double.parseDouble(String.valueOf(a.getText()));
        double numerob=Double.parseDouble(String.valueOf(b.getText()));
        Button botonsuma=(Button) findViewById(R.id.suma);
        double resultado=numeroa+numerob;
        TextView textico=(TextView) findViewById(R.id.resultado);
        textico.setText("el resultado de su suma es "+resultado);
    }
    public void resta (View vista){
        EditText a=(EditText) findViewById(R.id.numeroa);
        EditText b=(EditText) findViewById(R.id.numerob);
        double numeroa=Double.parseDouble(String.valueOf(a.getText()));
        double numerob=Double.parseDouble(String.valueOf(b.getText()));
        double resultado=numeroa-numerob;
        TextView textico=(TextView) findViewById(R.id.resultado);
        textico.setText("el resultado de su resta es "+resultado);



    }
    public void conversion (View vista){
        EditText a=(EditText) findViewById(R.id.numeroa);
        double numeroa=Double.parseDouble(String.valueOf(a.getText()));
        double resultado=(numeroa*1.8)+32;
        TextView textico=(TextView) findViewById(R.id.resultado);
        textico.setText("el resultado de la conversion es "+resultado);
    }
}
