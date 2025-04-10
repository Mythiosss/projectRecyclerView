package com.example.newrecyclerview;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class RecyclerActivity extends AppCompatActivity implements makananAdapter.OnItemClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.recyclerview);

        RecyclerView recyclerView = findViewById(R.id.rvMakanan);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        ArrayList<modelMakanan> ListMakanan = new ArrayList<>();
        ListMakanan.add(new modelMakanan("Ayam Bakar", "15.000", R.drawable.ayambakar, "Ayam yang dibakar dengan bumbu khas Indonesia."));
        ListMakanan.add(new modelMakanan("Nasi Goreng", "16.000", R.drawable.nasigoreng, "Nasi goreng spesial dengan telur dan ayam."));
        ListMakanan.add(new modelMakanan("Sop Daging", "20.000", R.drawable.sopdaging, "Sop daging sapi dengan sayuran segar."));
        ListMakanan.add(new modelMakanan("Pizza", "69.000", R.drawable.pizza, "Pizza keju mozzarella dengan topping daging."));
        ListMakanan.add(new modelMakanan("Opor Ayam", "20.000", R.drawable.oporayam, "Ayam dimasak santan khas lebaran."));
        ListMakanan.add(new modelMakanan("Sharlyf bakar", "2.000", R.drawable.oporayam, "Ayam dimasak santan khas lebaran."));



        makananAdapter adapter = new makananAdapter(ListMakanan, this);
        recyclerView.setAdapter(adapter);
    }

    @Override
    public void onItemClick(modelMakanan makanan) {
        Toast.makeText(this, "Kamu memilih " + makanan.getNamaMakanan() + " , " + makanan.getHargaMakanan(), Toast.LENGTH_SHORT).show();
        Intent dtl = new Intent(RecyclerActivity.this, DetailMakanan.class);
        dtl.putExtra("namaMakanan", makanan.getNamaMakanan());
        dtl.putExtra("gambarMakanan", makanan.getGambarMakanan());
        dtl.putExtra("deskripsiMakanan", makanan.getDeskripsiMakanan());
        startActivity(dtl);
    }
}