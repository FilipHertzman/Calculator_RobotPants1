package com.example.calculator_robotpants1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.text.DecimalFormat;


//Rafat
public class MainActivity extends AppCompatActivity {
    EditText Input1;
    EditText Input2;
    TextView Result;
    Button button_clear;





    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Input1 = findViewById(R.id.Input1);
        Input2 = findViewById(R.id.Input2);
        Result = findViewById(R.id.Result);
        button_clear = findViewById(R.id.button_clear);
        myButtonListenerMethod();
    }


    public void myButtonListenerMethod() {

        Button Btn_addition = findViewById(R.id.button_addition);
        Btn_addition.setOnClickListener(view -> {

            if (Input1.getText().toString().trim().length() <= 0) {
            Toast.makeText(MainActivity.this, "First input x: is empty", Toast.LENGTH_SHORT).show();
        }

            else if (Input2.getText().toString().trim().length()<=0) {
                Toast.makeText(this, "Second input y: is empty", Toast.LENGTH_SHORT).show();
            }


            else {

                double N1 = Double.parseDouble((Input1.getText().toString()));
                double N2 = Double.parseDouble((Input2.getText().toString()));

                double sum = N1 + N2;
                DecimalFormat df = new DecimalFormat("#.#");
                double sum_Sv = Double.parseDouble((df.format(sum)));
                Result.setText(String.valueOf(sum_Sv));

            }


        });

        Button Btn_multiplication = findViewById(R.id.button_multiplikation);
        Btn_multiplication.setOnClickListener(view -> {

            if (Input1.getText().toString().trim().length() <= 0) {
                Toast.makeText(MainActivity.this, "First input x: is empty", Toast.LENGTH_SHORT).show();
            }

            else if (Input2.getText().toString().trim().length()<=0) {
                Toast.makeText(this, "Second input y: is empty", Toast.LENGTH_SHORT).show();
            }


            else {

                double N1 = Double.parseDouble((Input1.getText().toString()));
                double N2 = Double.parseDouble((Input2.getText().toString()));

                double sum = N1 * N2;
                DecimalFormat df = new DecimalFormat("#.#");
                double sum_Sv = Double.parseDouble((df.format(sum)));
                Result.setText(String.valueOf(sum_Sv));

            }});


        Button Btn_Percent = findViewById(R.id.button_procent);
        Btn_Percent.setOnClickListener(view -> {
            if (Input1.getText().toString().trim().length() <= 0) {
                Toast.makeText(MainActivity.this, "First input x: is empty", Toast.LENGTH_SHORT).show();
            }

            else if (Input2.getText().toString().trim().length()<=0) {
                Toast.makeText(this, "Second input y: is empty", Toast.LENGTH_SHORT).show();
            }


            else {

                double N1 = Double.parseDouble((Input1.getText().toString()));
                double N2 = Double.parseDouble((Input2.getText().toString()));

                double sum = N1 * N2;
                double sum2 = sum / 100;
                DecimalFormat df = new DecimalFormat("#.##");
                double sum_Sv = Double.parseDouble((df.format(sum2)));
                Result.setText(String.valueOf(sum_Sv));

            }});

        //Filip Hertzman, roten ur
        Button Btn_Roten_ur = findViewById(R.id.button_roten_ur);
        Btn_Roten_ur.setOnClickListener(view -> {
            if (Input1.getText().toString().trim().length() <= 0) {
                Toast.makeText(MainActivity.this, "First input x: is empty", Toast.LENGTH_SHORT).show();
            }

            else if (Input2.getText().toString().trim().length()<=0) {
                Toast.makeText(this, "Second input y: is empty", Toast.LENGTH_SHORT).show();
            }


            else {

                double N1 = Double.parseDouble((Input1.getText().toString()));


                double sum = Math.sqrt(N1);
                DecimalFormat df = new DecimalFormat("#.#");
                double sum_Sv = Double.parseDouble((df.format(sum)));
                Result.setText(String.valueOf(sum_Sv));

            }});

        //Filip Hertzman, Pythagoras sats
        Button Btn_Pythagoras_sats = findViewById(R.id.button_pythagoras_sats);
        Btn_Pythagoras_sats.setOnClickListener(view -> {

            double N1 = Double.parseDouble((Input1.getText().toString()));
            double N2 = Double.parseDouble((Input2.getText().toString()));

            double sum = (Math.sqrt(N1 * N1 + N2 * N2));
            DecimalFormat df = new DecimalFormat("#.##");
            double sum_Sv = Double.parseDouble((df.format(sum)));
            Result.setText(String.valueOf(sum_Sv));

        });

        // Filip Hertzman, Clear Button
        Button Button_clear = findViewById(R.id.button_clear);
       Button_clear.setOnClickListener(view -> {
           Input1.getText().clear();
           Input2.getText().clear();


       });







    }
}









