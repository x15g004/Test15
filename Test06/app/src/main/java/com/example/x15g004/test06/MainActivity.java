package com.example.x15g004.test06;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText Edit1;
    private EditText Edit2;
    private TextView Text;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //各インスタンスの取得
        Edit1 = (EditText) findViewById(R.id.editText);
        Edit2 = (EditText) findViewById(R.id.editText2);
        Text = (TextView) findViewById(R.id.textView2);
        Button button = (Button) findViewById(R.id.button);

        //タップイベントの取得
        button.setOnClickListener(new View.OnClickListener(){
                    @Override
                    public void onClick(View v) {
                        //EditTextからテキストを読み出しTextView2に書き込み
                        Text.setText(Edit1.getText().toString() + ":" + Edit2.getText().toString());
                    }
    });

//        @Override
//        public void onClick(View v) {
//            //EditTextからテキストを読み出しTextView2に書き込み
//            Text2.setText(
//                    Edit1.getText().toString() + ":"+ Edit2.getText().toString()
//            );
//      }
    }
}
