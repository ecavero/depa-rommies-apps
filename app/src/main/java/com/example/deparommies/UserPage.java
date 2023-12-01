package com.example.deparommies;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import java.util.ArrayList;


public class UserPage extends AppCompatActivity {

    ArrayList<Usuario> usuarios = new ArrayList<>();

    Usuario user = new Usuario("Juan", "Hurtado", "Juan es un joven que busca departamento en Lima.", "Juan23", "12345", 25, R.drawable.juanfoto);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_page);

        String usuario=getIntent().getStringExtra("Nombre de Usuario");
        String contrasena=getIntent().getStringExtra("Clave de Acceso");
        Toast.makeText(this, "Nombre de Usuario: "+usuario+"\n"+
                "Clave de Acceso: "+contrasena, Toast.LENGTH_SHORT).show();

        usuarios.add(user);

        RecyclerView rvusuarios = findViewById(R.id.rvUsuarios);

        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
        rvusuarios.setLayoutManager(linearLayoutManager);

        UsuarioAdapter adapter = new UsuarioAdapter(usuarios);
        rvusuarios.setAdapter(adapter);
    }

    public void salir(View view){

        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
}