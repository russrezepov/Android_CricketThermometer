package com.example.cricketthermometer;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.text.DecimalFormat;
import java.util.Set;

public class MainActivity extends AppCompatActivity {

    EditText etChirps;
    Button btnCalculate;
    TextView tvResults;
    DecimalFormat formatter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    etChirps = findViewById(R.id.etChirps);
    btnCalculate = findViewById(R.id.btnCalculate);
    tvResults = findViewById(R.id.tvResult);

    tvResults.setVisibility(View.GONE);

    formatter = new DecimalFormat("#0.0");

    btnCalculate.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            if (etChirps.getText().toString().isEmpty())
            {
                Toast.makeText(MainActivity.this, "Please Enter Value", Toast.LENGTH_SHORT).show();
            }
            else
            {
                int chirpsEntered = Integer.parseInt(etChirps.getText().toString().trim());

                double temp = (chirpsEntered / 3.0) + 4;

                String results = "The Approximate Temperature Outside is:" + formatter.format(temp) + " Degrees Celcius";

                tvResults.setText(results);
                tvResults.setVisibility(View.VISIBLE);
            }
        }
    });

    }
}
