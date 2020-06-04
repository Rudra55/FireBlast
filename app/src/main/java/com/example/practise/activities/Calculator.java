package com.example.practise.activities;

import  android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.example.practise.R;
import com.example.practise.listerners.Mybuttonlistern;

public class Calculator extends AppCompatActivity {

    EditText t1,t2,t3;
    
    Button b1,b2,b3,b4;
    String s1,s2;

    public EditText getT1() {
        return t1;
    }

    public void setT1(EditText t1) {
        this.t1 = t1;
    }

    public EditText getT2() {
        return t2;
    }

    public void setT2(EditText t2) {
        this.t2 = t2;
    }

    public EditText getT3() {
        return t3;
    }

    public void setT3(EditText t3) {
        this.t3 = t3;
    }

    public Button getB1() {
        return b1;
    }

    public void setB1(Button b1) {
        this.b1 = b1;
    }

    public Button getB2() {
        return b2;
    }

    public void setB2(Button b2) {
        this.b2 = b2;
    }

    public String getS1() {
        return s1;
    }

    public void setS1(String s1) {
        this.s1 = s1;
    }

    public String getS2() {
        return s2;
    }

    public void setS2(String s2) {
        this.s2 = s2;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculator);
        t1=(EditText)findViewById(R.id.ed1);
        t2=(EditText)findViewById(R.id.ed2);
        t3=(EditText)findViewById(R.id.ed3);
        b1=(Button)findViewById(R.id.add);
        b2=(Button)findViewById(R.id.sub);

        Mybuttonlistern mybuttonlistern =new Mybuttonlistern(this);




        //b3=(Button)findViewById(R.id.mul);
        //b4=(Button)findViewById(R.id.div);

         b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               s1= t1.getText().toString();
               s2= t2.getText().toString();
               if(s1.isEmpty())
               {
                   t1.setError("plz provide no");
                   t1.requestFocus();

               }

               else if(s2.isEmpty())
               {

                   t2.setError("plz provide no 2");
                   t2.requestFocus();
               }
               else {
                   double d1 = Double.parseDouble(s1);
                   double d2 = Double.parseDouble(s2);
                   double r =d1+d2;
                   t3.setText(String.valueOf(r));


               }

            }
        });


        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                s1= t1.getText().toString();
                s2= t2.getText().toString();
                if(s1.isEmpty())
                {
                    t1.setError("plz provide no");
                    t1.requestFocus();

                }

                else if(s2.isEmpty())
                {

                    t2.setError("plz provide no 2");
                    t2.requestFocus();
                }
                else {
                    double d1 = Double.parseDouble(s1);
                    double d2 = Double.parseDouble(s2);
                    double r =d1-d2;
                    t3.setText(String.valueOf(r));


                }

            }
        });

        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                s1= t1.getText().toString();
                s2= t2.getText().toString();
                if(s1.isEmpty())
                {
                    t1.setError("plz provide no");
                    t1.requestFocus();

                }

                else if(s2.isEmpty())
                {

                    t2.setError("plz provide no 2");
                    t2.requestFocus();
                }
                else {
                    double d1 = Double.parseDouble(s1);
                    double d2 = Double.parseDouble(s2);
                    double r =d1*d2;
                    t3.setText(String.valueOf(r));


                }

            }
        });

        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                s1= t1.getText().toString();
                s2= t2.getText().toString();
                if(s1.isEmpty())
                {
                    t1.setError("plz provide no");
                    t1.requestFocus();

                }

                else if(s2.isEmpty())
                {

                    t2.setError("plz provide no 2");
                    t2.requestFocus();
                }
                else {
                    double d1 = Double.parseDouble(s1);
                    double d2 = Double.parseDouble(s2);
                    double r =d1/d2;
                    t3.setText(String.valueOf(r));


                }

            }
        });

    }
}
