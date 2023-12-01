package com.example.deparommies;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class UsuarioViewHolder extends RecyclerView.ViewHolder {

    public TextView nombreUsuario;
    public TextView apellidoUsuario;
    public TextView edadUsuario;
    public TextView descripUsuario;
    public ImageView imagenUsuario;

    public UsuarioViewHolder(@NonNull View itemView) {
        super(itemView);
        nombreUsuario=itemView.findViewById(R.id.txvNombre);
        apellidoUsuario=itemView.findViewById(R.id.txvApellido);
        edadUsuario=itemView.findViewById(R.id.txvEdad);
        descripUsuario=itemView.findViewById(R.id.txvDescripcion);
        imagenUsuario=itemView.findViewById(R.id.imgUsuario);
    }
}
