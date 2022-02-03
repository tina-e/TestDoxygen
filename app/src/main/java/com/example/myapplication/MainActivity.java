package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initButton();
    }

    /**
     * Initialize button and set OnClickListener
     */
    private void initButton(){
        button = findViewById(R.id.button);
        button.setOnClickListener(view -> changeButtonText());
    }

    /**
     * Toggle button text on click
     */
    private void changeButtonText(){
        if(button.getText().equals("On")){
            button.setText("Off");
        } else {
            button.setText("On");
        }
    }
}