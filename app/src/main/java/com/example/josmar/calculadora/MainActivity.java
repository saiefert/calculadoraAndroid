package com.example.josmar.calculadora;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView textView;
    double resultado = 0;
    String operacao = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView = findViewById(R.id.minhaView);
    }

    public void numeros(View view) {

    }

    public void operacao(View view) {
        Button botaoOp = (Button) view;

        String novaOperacao = botaoOp.getText().toString();
        double valorDaTela = Double.valueOf(textView.getText().toString());

        if (operacao == null) {
            operacao = novaOperacao;
            resultado = valorDaTela;

        }else{
            if (operacao == "+"){
                resultado = resultado + valorDaTela;
            } else if (operacao == "-"){
                resultado = resultado - valorDaTela;
            } else if (operacao == "x"){
                resultado = resultado - valorDaTela;
            }else if (operacao == "/") {
                resultado = resultado / valorDaTela;
            }
        }

    }
}