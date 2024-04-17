package com.example.ativitys;

import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageView imageView1 = findViewById(R.id.imgeView1);
        Drawable drawable = getResources().getDrawable(R.drawable.girl);
        imageView1.setImageDrawable(drawable);
        imageView1.setAdjustViewBounds(true);
        imageView1.setScaleType(ImageView.ScaleType.FIT_CENTER);


    }
}