 package com.example.finalnewdocapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.Toast;



 public class MainActivity extends AppCompatActivity {

     @Override
     protected void onCreate(Bundle savedInstanceState) {
         super.onCreate(savedInstanceState);
         setContentView(R.layout.activity_main);
         TextView output = findViewById(R.id.output);

     }
 //To send user to Enter Details on Second Activity
     public void launch(View v) {
         findViewById(R.id.textView1);
         Intent intent = new Intent(MainActivity.this, SecondActivity.class);
         startActivity(intent);
         setContentView(R.layout.activity_second);

         //To get back to main activity with entered details by user
         String name1;
         String age1;
         String gender1;
         EditText nameEdit = (EditText) findViewById(R.id.name);
         EditText ageEdit = (EditText) findViewById(R.id.age);
         RadioButton maleRButton = (RadioButton) findViewById(R.id.maleRButton);
         RadioButton femaleRButton = (RadioButton) findViewById(R.id.femaleRButton);

         Intent OpenList = getIntent();
         name1 = OpenList.getStringExtra("name");
         age1 = OpenList.getStringExtra("age");
         gender1 = OpenList.getStringExtra("gender");
         Toast.makeText(getBaseContext(), name1 + "/" + age1 + "/" + gender1, Toast.LENGTH_LONG).show();
     }

 }