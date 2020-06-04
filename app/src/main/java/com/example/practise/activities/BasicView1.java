package com.example.practise.activities;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ImageButton;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;
import android.widget.ToggleButton;

import com.example.practise.R;

public class BasicView1 extends AppCompatActivity implements View.OnClickListener

{


    Button b1,b2;
    ImageButton i1;
    RadioButton r1,r2;
    RadioGroup rg;
    CheckBox c1,c2;
    ToggleButton t1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_basic_view1);
        b1=(Button)findViewById(R.id.button1);
        b2=(Button)findViewById(R.id.button2);
        i1=(ImageButton)findViewById(R.id.image1);
        c1=(CheckBox)findViewById(R.id.check1);
        c2=(CheckBox)findViewById(R.id.check2);
        r1=(RadioButton) findViewById(R.id.radio1);
        r2=(RadioButton) findViewById(R.id.radio2);
        t1=(ToggleButton) findViewById(R.id.toggleButton);
        rg=(RadioGroup) findViewById(R.id.RG1);
        b1.setOnClickListener(this);

        c1.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(isChecked)
                    dispalyMessage("B.Tech is checked");
            }
        });

        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dispalyMessage("click on button via anoymous");

            }
        });

        rg.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {

                if(checkedId==r1.getId())
                dispalyMessage("Male radio button");
                else
                    dispalyMessage("Female radio button");

            }
        });

    }

    @Override
    public void onClick(View v) {
      dispalyMessage("click on button via listner");


    }

    public void dispalyMessage(String msg){

        Toast.makeText(this, "msg = "+msg, Toast.LENGTH_SHORT).show();
    }

    public void imgclick(View view) {
        dispalyMessage("click on button via image button");

    }
}

