package com.example.ativitys;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.content.Intent;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        recibirDatos();

        // Volver a Activity
        Button volver = findViewById(R.id.Home);
        volver.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity2.this, MainActivity.class);
                startActivity(i);
            }
        });

        // CERRAR aplicacion y activity
        Button cerrar = findViewById(R.id.cerrar);
        cerrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finishAffinity();
            }
        });
    };

    public void recibirDatos() {

        Bundle extras = getIntent().getExtras();
        int int_imagen = getIntent().getIntExtra("imagen_id", 0);

        ImageView imagenRecibida = findViewById(R.id.imgMuestra);

        imagenRecibida.setImageResource(int_imagen);
    }

}
