package com.example.assignment;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class loginform extends AppCompatActivity {
    private Button button;


    @SuppressLint("WrongViewCast")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_loginform);
        button = findViewById(R.id.loginform);
        button.setOnClickListener(new View.OnClickListener() {


            /**
             * Called when a view has been clicked.
             *
             * @param v The view that was clicked.
             */
            @Override
            public void onClick(View v) {

            }

            public void login(View view) {
                Intent packageContext;
                Intent intent = new Intent(loginform.this, MainActivity.class);
                startActivity(intent);
            }
        });

    }
}
