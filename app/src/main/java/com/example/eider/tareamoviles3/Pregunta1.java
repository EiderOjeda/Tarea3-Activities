package com.example.eider.tareamoviles3;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Pregunta1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pregunta1);
    }

    public void OnClick2 (View view){
        startActivity(new Intent(Pregunta1.this,Pregunta2.class));

    }
}
