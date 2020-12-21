package com.example.getname;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import java.text.BreakIterator;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final Button button = findViewById(R.id.button);
        final EditText editText = findViewById(R.id.Name);
        final EditText printText = findViewById(R.id.result);
        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                printText.setText("Hi " + editText.getText());
            }
        });
    }
}





