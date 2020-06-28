package com.preethi.simpcalc;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;



public class MainActivity extends AppCompatActivity {
    Button zero,decimal,equal,one,two,three,plus,four,five,six,minus,seven,eight,nine,multiply,divide,clear,allclear;
    EditText edt;
    float val1,val2;
    String cl;
    boolean addition,subtraction,multiplication,division;
    protected void onCreate(Bundle savedInstantState) {
        super.onCreate(savedInstantState);
        setContentView(R.layout.activity_main);
        edt = findViewById(R.id.edt);
        zero = findViewById(R.id.zero);
        decimal = findViewById(R.id.decimal);
        equal = findViewById(R.id.equal);
        one = findViewById(R.id.one);
        two = findViewById(R.id.two);
        three = findViewById(R.id.three);
        plus = findViewById(R.id.plus);
        four = findViewById(R.id.four);
        five = findViewById(R.id.five);
        six = findViewById(R.id.six);
        minus = findViewById(R.id.minus);
        seven = findViewById(R.id.seven);
        eight = findViewById(R.id.eight);
        nine = findViewById(R.id.nine);
        multiply = findViewById(R.id.multiply);
        divide = findViewById(R.id.divide);
        clear = findViewById(R.id.clear);
        allclear = findViewById(R.id.allclear);

        zero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                edt.setText(edt.getText() + "0");
            }
        });
        decimal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                edt.setText(edt.getText() + ".");
            }
        });

        one.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                edt.setText(edt.getText() + "1");
            }
        });
        two.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                edt.setText(edt.getText() + "2");
            }
        });
        three.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                edt.setText(edt.getText() + "3");
            }
        });

        four.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                edt.setText(edt.getText() + "4");
            }
        });
        five.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                edt.setText(edt.getText() + "5");
            }
        });
        six.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                edt.setText(edt.getText() + "6");
            }
        });

        seven.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                edt.setText(edt.getText() + "7");
            }
        });
        eight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                edt.setText(edt.getText() + "8");
            }
        });
        nine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                edt.setText(edt.getText() + "9");
            }
        });



        equal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                {
                    val2 = Float.parseFloat(edt.getText() + "");
                }
                if (addition == true) {
                    edt.setText(val1 +val2 + "");
                }
                if (subtraction == true) {
                    edt.setText(val1 - val2 + "");
                }
                if (multiplication == true) {
                    edt.setText(val1 * val2 + "");
                }
                if (division == true) {
                    edt.setText(val1 / val2 + "");
                }
            }
        });
        plus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (edt == null) {
                    edt.setText("");
                } else {
                    val1 = Float.parseFloat(edt.getText() + "");
                    addition = true;
                    edt.setText(null);
                }
            }
        });
        minus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                val1 = Float.parseFloat(edt.getText() + "");
                subtraction = true;
                edt.setText(null);
            }
        });
        multiply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                val1 = Float.parseFloat(edt.getText() + "");
                multiplication = true;
                edt.setText(null);
            }
        });
        divide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                val1 = Float.parseFloat(edt.getText() + "");
                division = true;
                edt.setText(null);
            }
        });
        allclear.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                edt.setText("");
            }
        }));

        clear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                cl=edt.getText().toString();
                cl=cl.substring(0,cl.length()-1);
                edt.setText(cl);
            }
        });
    }
}