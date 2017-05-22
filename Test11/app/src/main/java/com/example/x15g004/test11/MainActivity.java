package com.example.x15g004.test11;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button button = (Button)findViewById(R.id.button);

        //タップイベントを受け取る
        button.setOnClickListener(this);
    }
    @Override
    public void onClick(view v){
        if(v.getId() == R.id.button){
            setContentView(R.layout.layout_sub);
            findViewById(R.id.button2).setOnClickListener(this);
        }else if(v.getId() == R.id.button2){
            setContentView(R.layout.activity_main);
            findViewById(R.id.button2).setOnClickListener(this);
        }
    }



}