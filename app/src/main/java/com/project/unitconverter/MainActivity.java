package com.project.unitconverter;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView output;
    EditText EnterNumInMeters;


    Button miles;
    Button millimeters;
    Button kilometers;
    Button centimeters;


    @SuppressLint("SetTextI18n")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        output = findViewById(R.id.output);
        EnterNumInMeters = findViewById(R.id.editTextNumberDecimal);
        miles = findViewById(R.id.miles);
        millimeters = findViewById(R.id.millimeters);
        kilometers = findViewById(R.id.kilometer);
        centimeters = findViewById(R.id.centimeters);

        millimeters.setOnClickListener(v -> {
            String num = EnterNumInMeters.getText().toString();
            int number = Integer.parseInt(num);
            double millimeters = (number * 1000);
            output.setText("value in millimeters:" + millimeters);
        });
        centimeters.setOnClickListener(v -> {
            String num = EnterNumInMeters.getText().toString();
            int number = Integer.parseInt(num);
            double centimeters = (number * 100);
            output.setText("value in centimeter:" + centimeters);
        });
        kilometers.setOnClickListener(v -> {
            String num = EnterNumInMeters.getText().toString();
            int number = Integer.parseInt(num);
            double km = (number / 1000);
            output.setText("value in kilometer:" + km);
        });
        miles.setOnClickListener(v -> {
            String num = EnterNumInMeters.getText().toString();
            int number = Integer.parseInt(num);
            double miles = (number / 1609);
            output.setText("value in miles:" + miles);
        });


    }
}