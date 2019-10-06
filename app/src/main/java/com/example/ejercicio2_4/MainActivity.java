package com.example.ejercicio2_4;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.content.Context;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText txtNumeros;
    EditText txtLetra;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void validarDni(View view)
    {
        txtNumeros = findViewById(R.id.editTextNumeroDni);
        txtLetra = findViewById(R.id.editTextLetraDni);
        char letradni = txtLetra.getText().toString().charAt(0);

        String str = "TRWAGMYFPDXBNJZSQVHLCKE";

        int numeros = Integer.parseInt(txtNumeros.getText().toString());
        int resto = numeros%23;

        Context context = getApplicationContext();
        CharSequence texto;
        int duracion = Toast.LENGTH_SHORT;
        if ( letradni==str.charAt(resto))
        {
            texto = "El dni introducido es valido";
            Toast toast = Toast.makeText(context, texto, duracion);
            toast.show();
        }
        else
        {
            texto = "El dni introducido no es valido";
            Toast toast = Toast.makeText(context, texto, duracion);
            toast.show();
        }



    }
}
