package com.example.deparommies;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText usuario, contrasena;
    Button ingresar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        usuario=findViewById(R.id.edtUsuario);
        contrasena=findViewById(R.id.edtContrasena);
        ingresar=findViewById(R.id.btnIngresar);

    }

    public void ingresar(View view){
        if(usuario.getText().toString().equals("isil") && contrasena.getText().toString().equals("12345")){
            Toast.makeText(MainActivity.this, "Datos Correctos", Toast.LENGTH_SHORT).show();
            Intent intent=new Intent(this, UserPage.class);
            intent.putExtra("Nombre de Usuario", usuario.getText().toString());
            intent.putExtra("Clave de Acceso", contrasena.getText().toString());
            startActivity(intent);
        }
        else{
            Toast.makeText(MainActivity.this, "Datos No Correctos", Toast.LENGTH_SHORT).show();
        }
    }
}