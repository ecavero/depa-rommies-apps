package com.example.deparommies;

import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class DepartamentoAdapter extends RecyclerView.Adapter {

    private List<Departamento> listaDepartamentos;

    public DepartamentoAdapter(List<Departamento> listaDepartamentos) {
        this.listaDepartamentos = listaDepartamentos;
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View layoutItem = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.departamento_item, viewGroup, false);
        DepartamentoViewHolder viewHolder = new DepartamentoViewHolder(layoutItem);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder viewHolder, int i) {
        Departamento departamento = listaDepartamentos.get(i);
        DepartamentoViewHolder departamentoViewHolder = (DepartamentoViewHolder) viewHolder;
        departamentoViewHolder.txtNombre.setText(departamento.getNombre());
        departamentoViewHolder.imgFotoPrincipal.setImageResource(departamento.getFotoPrincipal());
        departamentoViewHolder.txtDescripcion.setText(departamento.getDescripcion());
    }


    @Override
    public int getItemCount() {
        return listaDepartamentos.size();
    }
};