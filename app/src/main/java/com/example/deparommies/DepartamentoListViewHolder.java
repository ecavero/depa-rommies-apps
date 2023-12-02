package com.example.deparommies;

import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class DepartamentoListViewHolder extends RecyclerView.ViewHolder {

    public TextView txtNombre;
    public ImageView imgFotoPrincipal;
    public TextView txtDescripcion;
    public Button btnVerDepartamento;

    public DepartamentoListViewHolder(@NonNull View itemView) {
        super(itemView);
        txtNombre = itemView.findViewById(R.id.txtNombre);
        imgFotoPrincipal = itemView.findViewById(R.id.imgFotoPrincipal);
        txtDescripcion = itemView.findViewById(R.id.txtDescripcion);
        btnVerDepartamento=itemView.findViewById(R.id.btnVerDepartamento);

    }
}
