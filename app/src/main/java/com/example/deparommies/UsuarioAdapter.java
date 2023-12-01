package com.example.deparommies;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class UsuarioAdapter extends RecyclerView.Adapter {

    ArrayList<Usuario> usuarios;

    public UsuarioAdapter(ArrayList<Usuario> usuarios){
        this.usuarios=usuarios;
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View layout_item = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.user_item, viewGroup, false);
        UsuarioViewHolder usuarioViewHolder = new UsuarioViewHolder(layout_item);
        return usuarioViewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder viewHolder, int i) {
        UsuarioViewHolder usuarioViewHolder = (UsuarioViewHolder) viewHolder;
        usuarioViewHolder.nombreUsuario.setText(usuarios.get(i).getNombre());
        usuarioViewHolder.apellidoUsuario.setText(usuarios.get(i).getApellido());
        usuarioViewHolder.edadUsuario.setText(usuarios.get(i).getEdad() + " años");
        usuarioViewHolder.descripUsuario.setText(usuarios.get(i).getDescripcion());
        usuarioViewHolder.imagenUsuario.setImageResource(usuarios.get(i).getFoto());

    }

    @Override
    public int getItemCount() {
        return usuarios.size();
    }
}
