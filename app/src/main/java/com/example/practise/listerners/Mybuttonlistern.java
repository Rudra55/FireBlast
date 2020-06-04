package com.example.practise.listerners;

import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import com.example.practise.R;
import com.example.practise.activities.Calculator;
import com.example.practise.activities.MainActivity;


public class Mybuttonlistern implements View.OnClickListener
{
    EditText r1,r2,r3;
    MainActivity mainActivity;
    Calculator calculator;
    public Mybuttonlistern(MainActivity mainActivity) {
          this.mainActivity = mainActivity;
    }

    public Mybuttonlistern(Calculator calculator) {this.calculator= this.calculator;

    }


    /*@Override
    public void onClick(View v){

       switch (v.getId())

       {
           case R.id.button1:
               Toast.makeText(mainActivity,"hello friend",Toast.LENGTH_LONG).show();
               break;
           case R.id.button2:
               Toast.makeText(mainActivity,"bye friend",Toast.LENGTH_LONG).show();

       }

    }*/


    public void onClick(View v){
         r1=calculator.getT1();
         r2=calculator.getT2();
       String s1= r1.getText().toString();
       String s2= r2.getText().toString();

            double d1 = Double.parseDouble(s1);
            double d2 = Double.parseDouble(s2);
            double r =d1+d2;
            r3.setText(String.valueOf(r));
            calculator.setT3(r3);





    }

}
