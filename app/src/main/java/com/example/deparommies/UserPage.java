package com.example.deparommies;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class UserPage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_page);

        String usuario=getIntent().getStringExtra("Nombre de Usuario");
        String contrasena=getIntent().getStringExtra("Clave de Acceso");
        Toast.makeText(this, "Nombre de Usuario: "+usuario+"\n"+
                "Clave de Acceso: "+contrasena, Toast.LENGTH_SHORT).show();
    }

    public void salir(View view){

        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
}