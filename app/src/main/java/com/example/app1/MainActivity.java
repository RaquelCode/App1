package com.example.app1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

import android.widget.EditText;

public class MainActivity extends AppCompatActivity {




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //Button myButton = (Button)findViewById(R.id.button);



    }
 public void goToActivity(View view){



     Log.i("INFO" ,"Transitioning to" +  UserConfirmationActivity.class.getName());
     EditText user = findViewById(R.id.username);
     EditText pass = findViewById(R.id.password);
     String user2 = user.getText().toString();
     String pass2= user.getText().toString();

     Log.i("INFO","Username is " +user.getText().toString());
     Log.i("INFO","Password is " +pass.getText().toString());


     Intent intent = new Intent(getApplicationContext(), UserConfirmationActivity.class);
      intent.putExtra("USERNAME", user2);
      intent.putExtra("PASSWORD", pass2);
      startActivity(intent);


    }



}