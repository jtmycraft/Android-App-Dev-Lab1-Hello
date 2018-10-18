package com.edu.taruc.hello;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private TextView textViewMsg;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        textViewMsg = findViewById(R.id.textViewMessage);

    }

    public void showMessage(View view) {
        textViewMsg.setText("Hello, <your name here>");
    }

    public void clearMessage(View view) {
        textViewMsg.setText("");
    }
}
