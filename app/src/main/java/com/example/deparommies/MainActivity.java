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

    Usuario user = new Usuario("Juan", "Hurtado", "Juan es un joven que busca departamento en Lima.", "Juan23", "12345", 25, R.drawable.juanfoto);


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        usuario=findViewById(R.id.edtUsuario);
        contrasena=findViewById(R.id.edtContrasena);
        ingresar=findViewById(R.id.btnIngresar);

    }

    public void ingresar(View view){
        if(usuario.getText().toString().equals(user.getUsuario()) && contrasena.getText().toString().equals(user.getContrasena())) {
            Toast.makeText(MainActivity.this, "Datos Correctos", Toast.LENGTH_SHORT).show();
            Intent intent=new Intent(this, UserPage.class);
            intent.putExtra("Usuario", usuario.getText().toString());
            intent.putExtra("Clave de Acceso", contrasena.getText().toString());
            intent.putExtra("Nombre de Usuario", user.getNombre());
            intent.putExtra("Apellido de Usuario", user.getApellido());
            intent.putExtra("Descripcion de Usuario", user.getDescripcion());
            intent.putExtra("Edad de Usuario", user.getEdad());
            intent.putExtra("Foto de Usuario", user.getFoto());

            startActivity(intent);
        }
        else{
            Toast.makeText(MainActivity.this, "Datos No Correctos", Toast.LENGTH_SHORT).show();
        }
    }
}