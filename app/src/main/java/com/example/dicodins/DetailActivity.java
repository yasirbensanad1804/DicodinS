package com.example.dicodins;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class DetailActivity extends AppCompatActivity {
    public TextView tvdetails;
    public ImageView imgwisata;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        tvdetails = findViewById(R.id.tv_item_name);
        imgwisata = findViewById(R.id.img_item_photo);

        Wisata extra = getIntent().getParcelableExtra("objek");
        imgwisata.setImageResource(extra.getPhoto());
        tvdetails.setText(extra.getDetail());
    }
}
