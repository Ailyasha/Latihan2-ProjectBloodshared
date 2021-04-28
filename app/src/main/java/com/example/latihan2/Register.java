package com.example.latihan2;

//4/28/1021
//10118070
//Aufa Ilyasha
//IF-2

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Register extends AppCompatActivity {
    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        button = (Button) findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openAlmostThere();
            }
        });
    }

    public void openAlmostThere() {
        Intent intent = new Intent(this, AlmostThere.class);
        startActivity(intent);
    }
}