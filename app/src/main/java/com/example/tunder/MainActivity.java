package com.example.tunder;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    public void yeyClick(View view)
    {
        Toast.makeText(this, "You have a very high IQ!! Due to Your Good Taste",Toast.LENGTH_SHORT).show();
    }
    public void noClick(View view)
    {
        Toast.makeText(this, "Sorry to Report, but you may have to get checked by some good Neurologist!!",Toast.LENGTH_SHORT).show();
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}