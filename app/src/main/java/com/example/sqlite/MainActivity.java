package com.example.sqlite;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.sqlite.db.Mydatabase;

public class MainActivity extends AppCompatActivity {

    EditText editNombre, editApellido, editEdad;
    Button btnAgregar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editNombre =(EditText)findViewById(R.id.editNombre);
        editApellido =(EditText)findViewById(R.id.editApellido);
        editEdad=(EditText)findViewById(R.id.editEdad);
        btnAgregar= (Button) findViewById(R.id.btnAgregar);

        final Mydatabase mydatabase = new Mydatabase(getApplicationContext());

        btnAgregar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mydatabase.agregarPersonas(editNombre.getText().toString(),editApellido.getText().toString(),editEdad.getText().toString());
                Toast.makeText(getApplicationContext(), "SE AGREGÓ CORRECTAMENTE", Toast.LENGTH_SHORT).show();
            }
        });
;    }
}