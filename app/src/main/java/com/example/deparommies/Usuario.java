package com.example.deparommies;

public class Usuario {

    private String nombre, apellido, descripcion, usuario, contrasena;
    private int edad, foto;

    public Usuario(String nombre, String apellido, String descripcion, String usuario, String contrasena, int edad, int foto) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.descripcion = descripcion;
        this.usuario = usuario;
        this.contrasena = contrasena;
        this.edad = edad;
        this.foto = foto;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public String getUsuario() {
        return usuario;
    }

    public String getContrasena() {
        return contrasena;
    }

    public int getEdad() {
        return edad;
    }

    public int getFoto() {
        return foto;
    }

}
