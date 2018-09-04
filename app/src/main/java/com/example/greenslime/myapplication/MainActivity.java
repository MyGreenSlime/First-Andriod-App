package com.example.greenslime.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {
    EditText e1,e2;
    TextView result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        e1 = (EditText)findViewById(R.id.e1);
        e2 = (EditText)findViewById(R.id.e2);
        result = (TextView)findViewById(R.id.fuck);
    }

        public void buClick(View view) {
            int n1 = Integer.parseInt(e1.getText().toString());
            int n2 = Integer.parseInt(e2.getText().toString());
            int re = n1 + n2;
            result.setText(String.valueOf(re));
        }
}
