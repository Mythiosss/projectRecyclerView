package com.example.newrecyclerview;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class makananAdapter extends RecyclerView.Adapter<makananAdapter.listMakananViewHolder> {
    private final ArrayList<modelMakanan> listMakananModel;
    private final OnItemClickListener listener;

    public makananAdapter(ArrayList<modelMakanan> listMakananModel, OnItemClickListener listener) {
        this.listMakananModel = listMakananModel;
        this.listener = listener;
    }

    public interface OnItemClickListener {
        void onItemClick(modelMakanan makanan);
    }

    @NonNull
    @Override
    public listMakananViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item_layout, parent, false);
        return new listMakananViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull listMakananViewHolder holder, int position) {
        modelMakanan ModelMakanan = listMakananModel.get(position);
        holder.tvHargaMakanan.setText(ModelMakanan.getHargaMakanan());
        holder.tvNamaMakanan.setText(ModelMakanan.getNamaMakanan());
        holder.ivMakanan.setImageResource(ModelMakanan.getGambarMakanan());
        holder.itemView.setOnClickListener(v -> listener.onItemClick(ModelMakanan));
    }

    @Override
    public int getItemCount() {
        return listMakananModel.size();
    }

    static class listMakananViewHolder extends RecyclerView.ViewHolder {
        private final TextView tvNamaMakanan;
        private final TextView tvHargaMakanan;
        private final ImageView ivMakanan;

        public listMakananViewHolder(@NonNull View itemView) {
            super(itemView);
            tvNamaMakanan = itemView.findViewById(R.id.tvNamaMakanan);
            tvHargaMakanan = itemView.findViewById(R.id.tvHargaMakanan);
            ivMakanan = itemView.findViewById(R.id.ivMakanan);
        }
    }
}

