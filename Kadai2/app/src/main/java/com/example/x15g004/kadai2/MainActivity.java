package com.example.x15g004.kadai2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.SeekBar;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    SeekBar seekBar = (SeekBar)findViewById(R.id.seekBar);
    TextView textView = (TextView)findViewById(R.id.textView);

    seekBar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener(){
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
