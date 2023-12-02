package com.example.deparommies;

import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.deparommies.R;

public class DepartamentoViewHolder extends RecyclerView.ViewHolder {

    public TextView txtNombre;
    public ImageView imgFotoPrincipal;
    public TextView txtDescripcion;


    public DepartamentoViewHolder(@NonNull View itemView) {
        super(itemView);
        txtNombre = itemView.findViewById(R.id.txvTituloDepa);
        imgFotoPrincipal = itemView.findViewById(R.id.imgDepartamento);
        txtDescripcion = itemView.findViewById(R.id.txvDescripcionDepa);

    }
}
