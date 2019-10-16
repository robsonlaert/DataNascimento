package com.example.datan;

import androidx.appcompat.app.AppCompatActivity;

import android.app.DatePickerDialog;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.TextView;

import java.util.Calendar;

public class MainActivity extends AppCompatActivity {
    Button btnCalendario;
    TextView txtDataN;
    TextView txtIdade;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnCalendario = (Button)findViewById(R.id.btnCalendario);
        txtDataN = (TextView)findViewById(R.id.txtDataN);
        txtIdade = (TextView)findViewById(R.id.txtIdade);

        btnCalendario.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                pegarData()
            }
        });


    }

    private void pegarData() {

        Calendar c= Calendar.getInstance();
        int dia= c.get(Calendar.DAY_OF_MONTH);
        int mes= c.get(Calendar.MONTH);
        int ano= c.get(Calendar.YEAR);

        DatePickerDialog datePickerDialog= new DatePickerDialog(MainActivity.this,
                new DatePickerDialog.OnDateSetListener() {
                    @Override
                    public void onDateSet(DatePicker datePicker, int year, int month, int dayOfMonth) {
                        txtDataN.setText(dayOfMonth+"/"+ (month+1)+"/"+ year);
                        calcularIdade(dayOfMonth, month, year);

                    }
                },ano, mes, dia);
        datePickerDialog.show();
    }

    private void calcularIdade(int diaN, int mesN, int anoN) {
        Calendar c= Calendar.getInstance();
        int diaA= c.get(Calendar.DAY_OF_MONTH);
        int mesA= c.get(Calendar.MONTH);
        int anoA= c.get(Calendar.YEAR);

        int idade= anoA- anoN;
        if (mesN> mesA){
            idade--;
        }else if (mesA== mesN){
            if (diaN>diaA){
                idade--;

            }
        }
        txtIdade.setText("Idade: "+ idade);
        if (idade<= 12){
            txt
        }


    }
}
