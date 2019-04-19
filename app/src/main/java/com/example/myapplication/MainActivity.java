package com.example.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button but1,but2 ,but3 ;
    EditText et1,et2;
    TextView tv1;
    long sum;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        but1= findViewById(R.id.button1);
        but2=findViewById(R.id.button2);

        et1=findViewById(R.id.editText1);
        tv1=findViewById(R.id.textView1);


        but1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sum=0;
                tv1.setText("");

            }
        });

        but2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
             double num=Long.parseLong(et1.getText().toString())*0.9;
             sum=sum+(long)num;
             tv1.setText("Amount= ₹"+String.valueOf(sum));
                et1.getText().clear();
            }

        });

    }

}
