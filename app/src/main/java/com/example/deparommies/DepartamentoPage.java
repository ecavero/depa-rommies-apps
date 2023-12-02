package com.example.deparommies;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DepartamentoPage extends AppCompatActivity {

    List<Departamento> departamentos = new ArrayList<>();
    Map<Integer, Departamento> codigos = new HashMap<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.departamentos_page);

        departamentos.add(new Departamento("Lindo Dpto. de 1 dorm amoblado, en moderno edificio con areas comunes", "Alquiler de Moderno Dpto. con linda vista a la calle\n" +
"Ubicado en Calle Centenario 179 - 4° piso, Barranco\n" +
"A dos cuadras del malecón, zona tranquila y residencial. Cerca de Avenidas y transporte público, restaurantes, strip center, tiendas, galerías de arte, etc.\n" +
"Edificio moderno con buenas áreas comunes: Gimnasio equipado, piscina, lavandería, sala de trabajo, sala de eventos y jardín interior. Seguridad 24/7.\n"+
"A.C: 41 m2\n" +
"Cochera c/depósito 21.54 m2\n" +
"Ubicado en 4° piso, Living-comedor con balcon c/vista exterior, bien iluminado, 1 dormitorio, 1 baño completo, Kitchenette tipo americano con línea blanca. Amoblado moderno.\n" +
"Precio incluye amplia cochera en primer sótano c/depósito.\n" +
"Mantenimiento Aprox. S/. 208 + agua\n" +
"Visitas, previa cita.", R.drawable.depa_1));
        departamentos.add(new Departamento("Alquiler de Departamento en La Calera Surquillo", "Departamento ubicado en piso 6 con ascensor directo al departamento, Urb. La Calera cerca al cruce de Villarán con Aviación, Hospital Neoplásica, cerca a parques y avenidas principales.\n" +
"Características:\n" +
"- Habitación principal con closet y baño incorporado (para cama queen) \n" +
"- Habitación secundaria 1, con closet para cama de plaza y media \n" +
"- Habitación secundaria 2 o estudio, sin closet \n" +
"- Sala comedor con balcón y mampara, vista externa \n" +
"-Cocina abierta con tablero, muebles altos y bajos (cocina vitroceramica - electrica)", R.drawable.depa_2));

        for(int i = 0; i < departamentos.size(); i++) {
            Departamento d = departamentos.get(i);
            codigos.put(i + 1, d);
        }

        RecyclerView rvDepartamentos = findViewById(R.id.rvDepartamentos);
        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        rvDepartamentos.setLayoutManager(layoutManager);
        DepartamentoAdapter departamentoAdapter = new DepartamentoAdapter(departamentos);
        rvDepartamentos.setAdapter(departamentoAdapter);
    }
}