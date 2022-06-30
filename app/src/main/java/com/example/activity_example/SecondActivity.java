package com.example.activity_example;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.d("LIFE_CIRCLE", "SecondActivity - onCreate()");
        setContentView(R.layout.activity_second);

        TextView textView = findViewById(R.id.txtVw);

        String text = getIntent().getExtras().getString("myText");

        textView.setText(text);
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d("LIFE_CIRCLE", "SecondActivity - onStart()");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("LIFE_CIRCLE", "SecondActivity - onResume()");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("LIFE_CIRCLE", "SecondActivity - onPause()");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("LIFE_CIRCLE", "SecondActivity - onStop()");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("LIFE_CIRCLE", "SecondActivity - onDestroy()");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d("LIFE_CIRCLE", "SecondActivity - onRestart()");
    }
}