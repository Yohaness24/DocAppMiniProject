package com.example.finalnewdocapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.Display;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;

import java.util.Scanner;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        EditText nameEdit = (EditText) findViewById(R.id.name);
        EditText ageEdit = (EditText) findViewById(R.id.age);
        RadioButton c = (RadioButton) findViewById(R.id.maleRButton);
        RadioButton d = (RadioButton) findViewById(R.id.femaleRButton);
        Button btn = (Button) findViewById(R.id.submit);


        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(SecondActivity.this, MainActivity.class);
                intent.putExtra("name", nameEdit.getText().toString());
                intent.putExtra("age", ageEdit.getText().toString());
                if (c.isChecked()) {
                    intent.putExtra("gender", "male");
                } else if (d.isChecked()) {
                    intent.putExtra("gender", "female");
                }
                startActivity(intent);
            }
        });
    }
}
