package com.example.unconvert;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private Button button;
    private TextView textview2;
    private EditText editTexttext;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button = findViewById(R.id.button);
        textview2 = findViewById(R.id.textView2);
        editTexttext = findViewById(R.id.editTextText);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "HI click listener worked", Toast.LENGTH_SHORT).show();
                String s = editTexttext.getText().toString();
                int  kg= Integer.parseInt(s);
                double pound = 2.205 * kg;
                textview2.setText("Kg to Pound value is "+ pound);
            }
        });
    }
}