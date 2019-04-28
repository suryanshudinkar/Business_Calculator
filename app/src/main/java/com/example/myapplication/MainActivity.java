package com.example.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button but1,but2;
    EditText et1,et2;
    TextView tv1,tv2;
    long sum;
    double num1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        but1= findViewById(R.id.button1);
        but2=findViewById(R.id.button2);

        et1=findViewById(R.id.editText1);
        tv1=findViewById(R.id.textView1);
        tv2=findViewById(R.id.textView2);



        but1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sum=0;
                et1.getText().clear();
                tv1.setText("");
                tv2.setText("");

            }
        });

        but2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (et1.length()==0)
                {

                    et1.setError("Enter a number");
                }
                else {
                    num1=Long.parseLong(et1.getText().toString());
                    double num = Long.parseLong(et1.getText().toString()) * 0.9;
                    sum = sum + (long) num;
                    tv1.setText("Amount= ₹" + String.valueOf(sum));
                    tv2.setText("Last value you entered ="+String.valueOf((long)num1));
                }

                et1.getText().clear();
            }

        });

    }

}
