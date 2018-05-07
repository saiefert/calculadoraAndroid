package com.example.josmar.calculadora;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    private double resultado;

    public double getMultiplica(double num) {
        return this.resultado += num;
    }

    public void setResultado(double resultado){
        this.resultado = resultado;
    }

    public double getResultado() {
        return this.resultado;
    }

    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView = findViewById(R.id.minhaView);
    }

    public void numeros(View view) {
        Button botao = (Button) view;
        String numero = botao.getText().toString();
        String num = botao.getText().toString();
        String guardaNum = textView.getText().toString();
        textView.setText(guardaNum + num);
    }

    public void operacao(View view) {
        Button botaoOp = (Button) view;

        if (botaoOp.getText().toString().equals("C")) {
            textView.setText("");
        } else if (botaoOp.getText().toString().equals("X")) {
            String guardaNumero = textView.getText().toString();
            getMultiplica(Double.parseDouble(guardaNumero));

        } else if (botaoOp.getText().toString().equals("=")) {
            textView.setText(Double.toString(getResultado()));
        }
    }
}
