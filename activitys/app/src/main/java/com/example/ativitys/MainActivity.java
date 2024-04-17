package com.example.ativitys;

import android.widget.Button;
import android.widget.ImageButton;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button salir = findViewById(R.id.btnsalir);
        salir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });

        // Abrir Foto en nueva activity

        ImageButton boton1 = findViewById(R.id.btnImg1);

        boton1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                // Abrir Activity 2y enviar foto
                Intent a = new Intent(MainActivity.this, MainActivity2.class);
                a.putExtra("imagen_id", R.drawable.admin);
                startActivity(a);
            }
        });
    }
}
