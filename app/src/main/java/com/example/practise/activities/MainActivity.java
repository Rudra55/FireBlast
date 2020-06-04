package com.example.practise.activities;

import android.os.Bundle;

import android.support.v7.app.AppCompatActivity;

import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.example.practise.R;
import com.example.practise.listerners.Mybuttonlistern;

//implements View.OnClickListener {
public class MainActivity extends AppCompatActivity
{
    Button b1,b2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        b1 =(Button) findViewById(R.id.button1);
        b2 =(Button) findViewById(R.id.button1);

        Mybuttonlistern mybuttonlistern =new Mybuttonlistern(this);

        b1.setOnClickListener(mybuttonlistern);
        b2.setOnClickListener(mybuttonlistern);



        /*b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this,"bye friend",Toast.LENGTH_LONG).show(); */


        }


    }




