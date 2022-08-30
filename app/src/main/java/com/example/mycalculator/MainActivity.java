package com.example.mycalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity  {
    double first_input=0,second_input=0;
    TextView textView1;
    Button clear_button,
            div_button,button_sub,button_add,button_equal,button_point,mul_button,button_9,
            button_8,button_7,button_6,button_5,button_4,button_3,button_2,button_1,button_0;
    boolean Add,Sub,Mul,Div;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView1=findViewById(R.id.display_result);

        clear_button=findViewById(R.id.Clear_button);

        div_button=findViewById(R.id.division_button);

        button_sub=findViewById(R.id.Subtract_button);

        button_add=findViewById(R.id.addition_button);

        button_equal=findViewById(R.id.equal_button);

        button_point=findViewById(R.id.point_button);

        mul_button=findViewById(R.id.multiplication_button);

        button_9=findViewById(R.id.nine_button);

        button_8=findViewById(R.id.eight_button);

        button_7=findViewById(R.id.seven_button);

        button_6=findViewById(R.id.six_button);

        button_5=findViewById(R.id.fife_button);

        button_4=findViewById(R.id.four_button);

        button_3=findViewById(R.id.three_button);

        button_2=findViewById(R.id.two_button);

        button_1=findViewById(R.id.one_button);

        button_0=findViewById(R.id.zero_button);







        button_0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textView1.setText(textView1.getText()+"0");
            }
        });

        button_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textView1.setText(textView1.getText()+"1");
            }
        });

        button_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textView1.setText(textView1.getText()+"2");
            }
        });

        button_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textView1.setText(textView1.getText()+"3");
            }
        });

        button_4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textView1.setText(textView1.getText()+"4");
            }
        });

        button_5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textView1.setText(textView1.getText()+"5");
            }
        });

        button_6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textView1.setText(textView1.getText()+"6");
            }
        });

        button_7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textView1.setText(textView1.getText()+"7");
            }
        });

        button_8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textView1.setText(textView1.getText()+"8");
            }
        });

        button_9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textView1.setText(textView1.getText()+"9");
            }
        });

        button_point.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textView1.setText(textView1.getText() + ".");
            }
        });

        button_add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(textView1.getText().length()!=0){
                    first_input=Float.parseFloat(textView1.getText()+"");
                    Add=true;
                    textView1.setText(null);
                }
            }
        });

        button_sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(textView1.getText().length()!=0){
                    first_input=Float.parseFloat(textView1.getText()+"");
                    Sub=true;
                    textView1.setText(null);
                }
            }
        });

        mul_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(textView1.getText().length()!=0){
                    first_input=Float.parseFloat(textView1.getText()+"");
                    Mul=true;
                    textView1.setText(null);
                }
            }
        });

        div_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(textView1.getText().length()!=0){
                    first_input=Float.parseFloat(textView1.getText()+"");
                    Div=true;
                    textView1.setText(null);
                }
            }
        });

        clear_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textView1.setText("");
            }
        });

        button_equal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(Add|Mul|Div|Sub){
                    second_input=Float.parseFloat(textView1.getText()+"");
                }
                if(Add){
                    textView1.setText(first_input+second_input+"");
                    Add=false;
                }

                if(Sub){
                    textView1.setText(first_input-second_input+"");
                    Sub=false;
                }

                if(Div){
                    textView1.setText(first_input/second_input+"");
                    Div=false;
                }

                if(Mul){
                    textView1.setText(first_input*second_input+"");
                    Mul=false;
                }

            }
        });

    }





}




