package com.example.deparommies;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Departamento {
    private String nombre;
    private String descripcion;
    private int fotoPrincipal;
    private List<Integer> fotosAdicionales = new ArrayList<>();

    public Departamento(String nombre, String descripcion, int fotoPrincipal) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.fotoPrincipal = fotoPrincipal;
    }

    public void agregarFotosAdicionales(Integer ... fotosParaAgregar) {
        List<Integer> listaFotos = Arrays.asList(fotosParaAgregar);
        fotosAdicionales.addAll(listaFotos);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getFotoPrincipal() {
        return fotoPrincipal;
    }

    public void setFotoPrincipal(int fotoPrincipal) {
        this.fotoPrincipal = fotoPrincipal;
    }
}
