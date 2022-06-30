package com.example.activity_example;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.d("LIFE_CIRCLE", "MainActivity - onCreate()");
        setContentView(R.layout.activity_main);

        EditText editText = findViewById(R.id.edTxt);
        Button btn = findViewById(R.id.button);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String text = editText.getText().toString();
                Intent intent = new Intent(MainActivity.this, SecondActivity.class);
                intent.putExtra("myText", text);

                startActivity(intent);
            }
        });
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d("LIFE_CIRCLE", "MainActivity - onStart()");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("LIFE_CIRCLE", "MainActivity - onResume()");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("LIFE_CIRCLE", "MainActivity - onPause()");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("LIFE_CIRCLE", "MainActivity - onStop()");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("LIFE_CIRCLE", "MainActivity - onDestroy()");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d("LIFE_CIRCLE", "MainActivity - onRestart()");
    }
}