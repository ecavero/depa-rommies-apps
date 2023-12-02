package com.example.deparommies;

import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class DepartamentoListAdapter extends RecyclerView.Adapter {

    private List<Departamento> listaDepartamentos;

    public DepartamentoListAdapter(List<Departamento> listaDepartamentos) {
        this.listaDepartamentos = listaDepartamentos;
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View layoutItem = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.departamentos_list_item, viewGroup, false);
        DepartamentoListViewHolder viewHolder = new DepartamentoListViewHolder(layoutItem);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder viewHolder, int i) {
        Departamento departamento = listaDepartamentos.get(i);
        DepartamentoListViewHolder departamentoListViewHolder = (DepartamentoListViewHolder) viewHolder;
        departamentoListViewHolder.txtNombre.setText(departamento.getNombre());
        departamentoListViewHolder.imgFotoPrincipal.setImageResource(departamento.getFotoPrincipal());
        departamentoListViewHolder.txtDescripcion.setText(departamento.getDescripcion());
        departamentoListViewHolder.btnVerDepartamento.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent= new Intent(v.getContext(), DepartamentoView.class);
                intent.putExtra("Nombre Departamento", departamento.getNombre());
                intent.putExtra("Descripcion Departamento", departamento.getDescripcion());
                intent.putExtra("Foto Departamento", departamento.getFotoPrincipal());
                v.getContext().startActivity(intent);
            }
        });
    }


    @Override
    public int getItemCount() {
        return listaDepartamentos.size();
    }
}
