package com.example.sportcoachratingapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.view.Menu;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class CalculatorPage extends AppCompatActivity{
    Button btn0,btn1,btn2,btn3,btn4,btn5,btn6,btn7,btn8,btn9;
    Button btnadd,btnsub,btnmul,btndiv;
    Button btnC, btnAC, btnEqualsto, btnOpen, btnClosed, btnDot;
    String curText;
    String num1;
    String num2;
    String totalstr;
    char operant;
    boolean operantSelected = false;
    double total;
    TextView solution, result;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        curText = "";
        num1 = "";
        num2 = "";
        setContentView(R.layout.activity_calculator_page);
        solution = findViewById(R.id.solution);
        result = findViewById(R.id.result);

        btn0 = findViewById(R.id.button_0);
        btn1 = findViewById(R.id.button_1);
        btn2 = findViewById(R.id.button_2);
        btn3 = findViewById(R.id.button_3);
        btn4 = findViewById(R.id.button_4);
        btn5 = findViewById(R.id.button_5);
        btn6 = findViewById(R.id.button_6);
        btn7 = findViewById(R.id.button_7);
        btn8 = findViewById(R.id.button_8);
        btn9 = findViewById(R.id.button_9);

        btnadd = findViewById(R.id.button_add);
        btnsub = findViewById(R.id.button_sub);
        btnmul = findViewById(R.id.button_mul);
        btndiv = findViewById(R.id.button_div);

        btnC = findViewById(R.id.button_c);
        btnAC = findViewById(R.id.button_AC);
        btnEqualsto = findViewById(R.id.button_equalsto);
        btnOpen = findViewById(R.id.button_openedBracket);
        btnClosed = findViewById(R.id.button_closedBracket);
        btnDot = findViewById(R.id.button_dot);
        btnadd.setOnClickListener(new View.OnClickListener() {

            public void onClick(View view) {
                //This operation will only check if any operant has been entered ONCE
                if(!operantSelected) {
                    curText += "+";
                    operant = '+';
                    solution.setText(curText);
                    operantSelected = true;
                }
            }
        });
        btnsub.setOnClickListener(new View.OnClickListener() {

            public void onClick(View view) {
                if(!operantSelected) {
                    curText += "-";
                    operant = '-';
                    solution.setText(curText);
                    operantSelected = true;
                }
            }
        });
        btnmul.setOnClickListener(new View.OnClickListener() {

            public void onClick(View view) {
                if(!operantSelected) {
                    curText += "x";
                    operant = 'x';
                    solution.setText(curText);
                    operantSelected = true;
                }
            }
        });
        btndiv.setOnClickListener(new View.OnClickListener() {

            public void onClick(View view) {
                if(!operantSelected) {
                    curText += "/";
                    operant = '/';
                    solution.setText(curText);
                    operantSelected = true;
                }
            }
        });

        btn0.setOnClickListener(new View.OnClickListener() {

            public void onClick(View view) {
                curText += "0";
                solution.setText(curText);
                if(operantSelected)
                {
                    num2 += curText;
                }
                else
                {
                    num1 += curText;
                }
            }
        });
        btn1.setOnClickListener(new View.OnClickListener() {

            public void onClick(View view) {
                curText += "1";
                solution.setText(curText);
                if(operantSelected)
                {
                    num2 += curText;
                }
                else
                {
                    num1 += curText;
                }
            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {

            public void onClick(View view) {
                curText += "2";
                solution.setText(curText);
                if(operantSelected)
                {
                    num2 += curText;
                }
                else
                {
                    num1 += curText;
                }
            }
        });
        btn3.setOnClickListener(new View.OnClickListener() {

            public void onClick(View view) {
                curText += "3";
                solution.setText(curText);
                if(operantSelected)
                {
                    num2 += curText;
                }
                else
                {
                    num1 += curText;
                }
            }
        });
        btn4.setOnClickListener(new View.OnClickListener() {

            public void onClick(View view) {
                curText += "4";
                solution.setText(curText);
                if(operantSelected)
                {
                    num2 += curText;
                }
                else
                {
                    num1 += curText;
                }
            }
        });
        btn5.setOnClickListener(new View.OnClickListener() {

            public void onClick(View view) {
                curText += "5";
                solution.setText(curText);
                if(operantSelected)
                {
                    num2 += curText;
                }
                else
                {
                    num1 += curText;
                }
            }
        });
        btn6.setOnClickListener(new View.OnClickListener() {

            public void onClick(View view) {
                curText += "6";
                solution.setText(curText);

                if(operantSelected)
                {
                    num2 += curText;
                }
                else
                {
                    num1 += curText;
                }
            }
        });
        btn7.setOnClickListener(new View.OnClickListener() {

            public void onClick(View view) {
                curText += "7";
                solution.setText(curText);
                if(operantSelected)
                {
                    num2 += curText;
                }
                else
                {
                    num1 += curText;
                }
            }
        });
        btn8.setOnClickListener(new View.OnClickListener() {

            public void onClick(View view) {
                curText += "8";
                solution.setText(curText);
                if(operantSelected)
                {
                    num2 += curText;
                }
                else
                {
                    num1 += curText;
                }
            }
        });
        btn9.setOnClickListener(new View.OnClickListener() {

            public void onClick(View view) {
                curText += "9";
                solution.setText(curText);
                if(operantSelected)
                {
                    num2 += curText;
                }
                else
                {
                    num1 += curText;
                }
            }
        });
        btnDot.setOnClickListener(new View.OnClickListener() {

            public void onClick(View view) {
                curText += ".";
                solution.setText(curText);
                if(operantSelected)
                {
                    num2 += curText;
                }
                else
                {
                    num1 += curText;
                }
            }
        });

        btnAC.setOnClickListener(new View.OnClickListener() {

            public void onClick(View view) {
                curText = "";
                solution.setText(curText);
                result.setText("0");
            }
        });
        btnC.setOnClickListener(new View.OnClickListener() {

            public void onClick(View view) {
                Toast.makeText(CalculatorPage.this,"non disponible",Toast.LENGTH_SHORT).show();
            }
        });
        btnOpen.setOnClickListener(new View.OnClickListener() {

            public void onClick(View view) {
                Toast.makeText(CalculatorPage.this,"non disponible",Toast.LENGTH_SHORT).show();
            }
        });
        btnClosed.setOnClickListener(new View.OnClickListener() {

            public void onClick(View view) {
                Toast.makeText(CalculatorPage.this,"non disponible",Toast.LENGTH_SHORT).show();
            }
        });
        btnEqualsto.setOnClickListener(new View.OnClickListener() {

            public void onClick(View view) {
                result.setText(num1);
                curText = "";
                num1 = "";
                num2 = "";
                totalstr = "";
                operantSelected = false;
            }

        });

    }


}