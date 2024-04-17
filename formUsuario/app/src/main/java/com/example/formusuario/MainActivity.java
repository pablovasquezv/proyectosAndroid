package com.example.formusuario;

import android.content.Intent;
import android.view.View;
import android.widget.ImageView;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    /**
     * Estas líneas declaran cuatro variables de tipo ImageView llamadas imageView1, imageView2, imageView3 e imageView4.
     * Estas variables se utilizarán para referenciar las imágenes en la interfaz de usuario.
     */
    private ImageView imageView1, imageView2, imageView3, imageView4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        /**
         *
         Estas líneas buscan y asignan las vistas de las imágenes en el diseño de la actividad a las variables
         imageView1, imageView2, imageView3 e imageView4. Esto permite acceder y manipular las imágenes en el código.
         */
        imageView1 = findViewById(R.id.imageView1);
        imageView2 = findViewById(R.id.imageView2);
        imageView3 = findViewById(R.id.imageView3);
        imageView4 = findViewById(R.id.imageView4);


        /**
         * Este bloque de código establece un OnClickListener en imageView1.
         * Cuando se hace clic en imageView1, se llama al método openSecondActivity y se pasa el recurso de imagen
         * avatarprofilepng como argumento.
         *
         */
        imageView1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openSecondActivity(R.drawable.avatarprofilepng);
            }
        });
        /**
         * Este bloque de código establece un OnClickListener en imageView2.
         * Cuando se hace clic en imageView1, se llama al método openSecondActivity y se pasa el recurso de imagen
         * avatarprofilepng como argumento.
         *
         */
        imageView2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openSecondActivity(R.drawable.perfilusuarioavatar);
            }
        });
        /**
         * Este bloque de código establece un OnClickListener en imageView3.
         * Cuando se hace clic en imageView1, se llama al método openSecondActivity y se pasa el recurso de imagen
         * avatarprofilepng como argumento.
         *
         */
        imageView3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openSecondActivity(R.drawable.imgmen);
            }
        });

        /**
         * Este bloque de código establece un OnClickListener en imageView4.
         * Cuando se hace clic en imageView1, se llama al método openSecondActivity y se pasa el recurso de imagen
         * avatarprofilepng como argumento.
         *
         */
        imageView4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openSecondActivity(R.drawable.imgwoman);
            }
        });
    }


    /**
     * Este método openSecondActivity crea un nuevo intento para iniciar la actividad MainActivity2.
     * Se agrega un extra al intento con el identificador de la imagen seleccionada. Luego, se inicia la actividad
     * MainActivity2 con el intento.
     * @param imageId
     */
    private void openSecondActivity(int imageId) {
        Intent intent = new Intent(MainActivity.this, MainActivity2.class);
        intent.putExtra("imageId", imageId);
        startActivity(intent);
    }
}