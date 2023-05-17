package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
EditText i;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        i=findViewById(R.id.input);
    }

    public void ok(View view) {
        String input =i.getText().toString();
        Intent j=new Intent(this,MainActivity2.class);
        j.putExtra("k",input);
        startActivity(j);
    }
}