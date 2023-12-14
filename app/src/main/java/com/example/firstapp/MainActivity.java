package com.example.firstapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    private Integer contador = 0;

    private TextView textContador;

    private Button buttonMais;

    private Button buttonMenos;

    private Button btnSobre;

    private Button btnCamera;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textContador = findViewById(R.id.textContador);
        buttonMais = findViewById(R.id.buttonMais);
        buttonMenos = findViewById(R.id.buttonMenos);
        btnSobre = findViewById(R.id.buttonSobre);
        btnCamera = findViewById(R.id.buttonCamera);
        textContador.setText(String.valueOf(this.getContador()));
    }

    public Integer getContador(){
        return this.contador;
    }

    public void adicionar(View view){
        this.contador++;
        textContador.setText(String.valueOf(this.getContador()));
    }

    public void subtrair(View view){
        this.contador--;
        textContador.setText(String.valueOf(this.getContador()));
    }

    public void abreSobre(View view){
        Intent i = new Intent(MainActivity.this, SobreActivity.class);
        i.putExtra("contador", this.getContador());
        startActivity(i);
    }

    public void abreCamActivity(View view){
        Intent i = new Intent(MainActivity.this, CamActivity.class);
        startActivity(i);
    }
}