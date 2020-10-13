package com.example.app1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.nfc.Tag;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //Button myButton = (Button)findViewById(R.id.button);
    }
 public void goToActivity(View view){



     Log.i("INFO" ,"Transitioning to" +  Activity2.class.getName());
     EditText ip = findViewById(R.id.firstName);
     Log.i("INFO","First name is " +ip.getText().toString());




     Intent intent = new Intent(getApplicationContext(),Activity2.class);
    intent.putExtra("msg", "Hello Activity2!");
    startActivity(intent);


    }



}