package com.example.eider.tareamoviles3;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Pregunta3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pregunta3);
    }

    public void OnClick4 (View view){
        startActivity(new Intent(Pregunta3.this,Pregunta4.class));

    }
}
