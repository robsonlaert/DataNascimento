package com.example.nascdata;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.app.DatePickerDialog;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.TextView;

import java.util.Calendar;

public class MainActivity extends AppCompatActivity {

    Button btnCalcula;
    EditText txtData;
    TextView txtIdade, txtMaioridade;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnCalcula = (Button) findViewById(R.id.btnCalcula);
        txtData = (EditText) findViewById(R.id.txtData);
        txtIdade = (TextView) findViewById(R.id.txtIdade);
        txtMaioridade = (TextView) findViewById(R.id.txtMaioridade);

        btnCalcula.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                pegarData();
            }
        });
            }

    private void pegarData() {
        Calendar c= Calendar.getInstance();
        int dia = c.get(Calendar.DAY_OF_MONTH);
        int mes= c.get(Calendar.MONTH);
        int ano= c.get(Calendar.YEAR);
        DatePickerDialog datePickerDialog = new DatePickerDialog(MainActivity.this, new DatePickerDialog.OnDateSetListener() {
            @Override
            public void onDateSet(DatePicker view , int year, int month, int dayofmonth) {
                txtData.setText(DAY_OF);

            }
        },ano, mes, dia);
    }


}
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                  