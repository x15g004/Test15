package com.example.x15g004.kadai1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final TextView text = (TextView) findViewById(R.id.textView);
        final EditText edit1 = (EditText) findViewById(R.id.editText);
        final EditText edit2 = (EditText) findViewById(R.id.editText2);
        final EditText edit3 = (EditText) findViewById(R.id.editText3);
        Button button = (Button) findViewById(R.id.button);
        //タップイベントの取得
//        button.setOnClickListener(this);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //EditTextからテキストを読み出しTextViewに書き込み
                text.setText(edit1.getText().toString() + ":" + edit2.getText().toString() + ":" + edit3.getText().toString());
            }
        });
    }
}

//    @Override
//    public void onClick(View v) {
//        //EditTextからテキストを読み出しTextViewに書き込み
//            text.setText(edit1.getText().toString() + ":"+ edit2.getText().toString()+ ":"+ edit3.getText().toString());
//    }

