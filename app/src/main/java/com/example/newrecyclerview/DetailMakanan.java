package com.example.newrecyclerview;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class DetailMakanan extends AppCompatActivity {

    TextView tvNamaMakananDetail;
    TextView tvDeskripsiMakanan;
    ImageView ivMakananDetail;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_detail_makanan);

        tvNamaMakananDetail = findViewById(R.id.tvNamaMakananDetail);
        tvDeskripsiMakanan = findViewById(R.id.tvDeskripsiMakanan);
        ivMakananDetail = findViewById(R.id.ivMakananDetail);
        Intent dtl = getIntent();
        String namaMakanan = dtl.getStringExtra("namaMakanan");
        int gambarMakanan = dtl.getIntExtra("gambarMakanan", 0);
        String deskripsiMakanan = dtl.getStringExtra("deskripsiMakanan");

        tvNamaMakananDetail.setText(namaMakanan);
        ivMakananDetail.setImageResource(gambarMakanan);
        tvDeskripsiMakanan.setText(deskripsiMakanan);

    }
}