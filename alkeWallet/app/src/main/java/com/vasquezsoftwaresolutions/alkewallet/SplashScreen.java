package com.vasquezsoftwaresolutions.alkewallet;

import android.graphics.*;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;


public class SplashScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.loginsignuppage);

        // 1. Primero, obtén la imagen original que deseas redondear
        Bitmap originalBitmap = BitmapFactory.decodeResource(getResources(), R.drawable.send_icon);

        // 2. Crea un bitmap vacío con las mismas dimensiones que la imagen original
        Bitmap roundedBitmap = Bitmap.createBitmap(originalBitmap.getWidth(), originalBitmap.getHeight(), Bitmap.Config.ARGB_8888);

        // 3. Crea un objeto de lienzo (Canvas) para dibujar en el bitmap redondeado
        Canvas canvas = new Canvas(roundedBitmap);

        // 4. Crea un objeto de pintura (Paint) para configurar el borde redondeado
        Paint paint = new Paint();
        paint.setAntiAlias(true);
        paint.setShader(new BitmapShader(originalBitmap, Shader.TileMode.CLAMP, Shader.TileMode.CLAMP));

        // 5. Dibuja un círculo o un rectángulo redondeado en el lienzo
        RectF rect = new RectF(0, 0, originalBitmap.getWidth(), originalBitmap.getHeight());
        float cornerRadius = 50; // Ajusta este valor para cambiar el radio de los bordes redondeados
        canvas.drawRoundRect(rect, cornerRadius, cornerRadius, paint);

        // 6. ¡Ahora tienes el bitmap con los bordes redondeados!
        // Puedes establecer este bitmap redondeado en una ImageView o usarlo como desees
        ImageView imageView = findViewById(R.id.imgView4);
        imageView.setImageBitmap(roundedBitmap);
    }
}
