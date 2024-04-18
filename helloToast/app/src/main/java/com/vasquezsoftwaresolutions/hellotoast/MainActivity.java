package com.vasquezsoftwaresolutions.hellotoast;


import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private Button buttonToast;
    private Button buttonCounter;
    private TextView textViewCounter;
    private int counter = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        buttonToast = findViewById(R.id.buttonToast);
        buttonCounter = findViewById(R.id.buttonCounter);
        textViewCounter = findViewById(R.id.textViewCounter);

        buttonToast.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showToast();
            }
        });

        buttonCounter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                increaseCounter();
            }
        });
    }

    private void showToast() {
        CharSequence text = "Hello toast!";
        int duration = Toast.LENGTH_SHORT;
        Toast toast = Toast.makeText(this, text, duration);
        toast.show();
    }

    private void increaseCounter() {
        counter++;
        textViewCounter.setText(String.valueOf(counter));
    }
}
