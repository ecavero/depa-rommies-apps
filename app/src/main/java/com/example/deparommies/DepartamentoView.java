package com.example.deparommies;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import java.util.ArrayList;

public class DepartamentoView extends AppCompatActivity {

    ArrayList<Departamento> departamentos = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_departamento_view);
        String nombre=getIntent().getStringExtra("Nombre Departamento");
        String descripcion=getIntent().getStringExtra("Descripcion Departamento");
        int foto=getIntent().getIntExtra("Foto Departamento", 0);

        departamentos.add(new Departamento(nombre, descripcion,foto));

        RecyclerView rvdepartamento = findViewById(R.id.rvDepartamentoView);

        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
        rvdepartamento.setLayoutManager(linearLayoutManager);

        DepartamentoAdapter adapter = new DepartamentoAdapter(departamentos);
        rvdepartamento.setAdapter(adapter);

    }

    public void regresar(View view){

        Intent intent = new Intent(this, DepartamentoListPage.class);
        startActivity(intent);
    }
}