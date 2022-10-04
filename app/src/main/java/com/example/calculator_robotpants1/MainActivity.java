package com.example.calculator_robotpants1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.text.DecimalFormat;

public class MainActivity extends AppCompatActivity {
    private EditText Input1;
    private EditText Input2;
    private TextView Result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Input1 = findViewById(R.id.Input1);
        Input2 = findViewById(R.id.Input2);
        Result = findViewById(R.id.Result);
        myButtonListenerMethod();
    }



    public void myButtonListenerMethod() {
        Button Btn_addition = findViewById(R.id.button_addition);
        Btn_addition.setOnClickListener(view -> {

            double N1 = Double.parseDouble((Input1.getText().toString()));
            double N2 = Double.parseDouble((Input2.getText().toString()));

            double sum = N1 + N2;
            DecimalFormat df= new DecimalFormat("#.#");
            double sum_Sv= Double.parseDouble((df.format(sum)));
            Result.setText(String.valueOf(sum_Sv));
        });

        Button Btn_multiplication = findViewById(R.id.button_multiplikation);
        Btn_multiplication.setOnClickListener(view -> {

            double N1 = Double.parseDouble((Input1.getText().toString()));
            double N2 = Double.parseDouble((Input2.getText().toString()));

            double sum = N1 * N2;
            DecimalFormat df= new DecimalFormat("#.#");
            double sum_Sv= Double.parseDouble((df.format(sum)));
            Result.setText(String.valueOf(sum_Sv));

        });


        Button Btn_Percent = findViewById(R.id.button_procent);
        Btn_Percent.setOnClickListener(view -> {

            double N1 = Double.parseDouble((Input1.getText().toString()));
            double N2 = Double.parseDouble((Input2.getText().toString()));

            double sum = N1 * N2;
            double sum2= sum / 100;
            DecimalFormat df= new DecimalFormat("#.##");
            double sum_Sv= Double.parseDouble((df.format(sum2)));
            Result.setText(String.valueOf(sum_Sv));

        });
    }



}


