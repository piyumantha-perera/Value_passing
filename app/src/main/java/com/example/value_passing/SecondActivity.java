package com.example.value_passing;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {
    TextView msg;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        msg=findViewById(R.id.textViewMessage);

        Intent intent=getIntent();

        String name=intent.getStringExtra("name");
        msg.setText(" hello " + name);
    }
}
