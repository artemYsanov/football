package com.example.football;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView textView;
    TextView textView2;
    int count;
    int count2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        count = 0;
        textView = findViewById(R.id.textView);
        Button button = findViewById(R.id.button);

        count2 = 0;
        textView2 = findViewById(R.id.textView2);
        Button button2 = findViewById(R.id.button2);

        Button button3 = findViewById(R.id.button3);
    }

    public void Click(View view) {
        count++;
        textView.setText(String.valueOf(count));
    }
    //String.valueOf - конвертация из String в int.
    public void Click2(View view) {
        count2++;
        textView2.setText(String.valueOf(count2));
    }
    public void Click3(View view) {
        count = 0;
        count2 = 0;
        textView.setText(String.valueOf(count));
        textView2.setText(String.valueOf(count2));
    }
}