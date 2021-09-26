package com.example.a2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onBtnClick(View view){
        TextView txtHello = findViewById(R.id.textView);
        EditText editTxtName = findViewById(R.id.editTextTextPersonName);
        txtHello.setText( "Hello "+editTxtName.getText().toString());
    }
}