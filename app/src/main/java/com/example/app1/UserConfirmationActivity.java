package com.example.app1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class UserConfirmationActivity extends AppCompatActivity {

    private String username = "Raquel";
    private String password = "2323";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);

        TextView tv = findViewById(R.id.textView);
        String using = getIntent().getStringExtra("USERNAME");
        String passing = getIntent().getStringExtra("PASSWORD");
        tv.setText(using + passing);

        if (username.equals(using) & password.equals(passing) || username.equals(using)) {

            tv.setText("Welcome " +using);
        } else

       tv.setText("Combination is wrong " +passing);
    }
}
//String str = getIntent().getStringExtra("msg");