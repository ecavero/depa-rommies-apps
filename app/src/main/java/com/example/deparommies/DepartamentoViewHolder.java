package com.example.deparommies;

import android.view.View;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class DepartamentoViewHolder extends RecyclerView.ViewHolder {
    public CheckBox cbSeleccion;
    public TextView txtNombre;

    public ImageView imgFotoPrincipal;
    public TextView txtDescripcion;

    public DepartamentoViewHolder(@NonNull View itemView) {
        super(itemView);
        cbSeleccion = itemView.findViewById(R.id.cbSeleccion);
        txtNombre = itemView.findViewById(R.id.txtNombre);
        imgFotoPrincipal = itemView.findViewById(R.id.imgFotoPrincipal);
        txtDescripcion = itemView.findViewById(R.id.txtDescripcion);

    }
}
