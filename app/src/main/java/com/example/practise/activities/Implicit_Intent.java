package com.example.practise.activities;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.practise.R;

public class Implicit_Intent extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_implicit__intent);
        final EditText e1= (EditText)findViewById(R.id.url1);
        Button b1=(Button)findViewById(R.id.fb);
        Button b2=(Button)findViewById(R.id.click);
        final EditText e2= (EditText)findViewById(R.id.call);
        Button b3=(Button)findViewById(R.id.click1);
        Button b4=(Button)findViewById(R.id.btn3);

        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String mobile= e2.getText().toString();
                String mobi="tel:"+mobile;
                if(!mobile.isEmpty())
                {
                    Intent intent =new Intent(Intent.ACTION_CALL,Uri.parse(mobi));
                    startActivity(intent);

                }
                else
                    Toast.makeText(Implicit_Intent.this, "enter mobile no", Toast.LENGTH_SHORT).show();

            }
        });

        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               String mobile= e2.getText().toString();
               String mobi="tel:"+mobile;
               if(!mobile.isEmpty())
               {
                   Intent intent =new Intent(Intent.ACTION_DIAL,Uri.parse(mobi));
                   startActivity(intent);

               }
               else
                   Toast.makeText(Implicit_Intent.this, "enter mobile no", Toast.LENGTH_SHORT).show();
            }
        });

        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url=e1.getText().toString();
                if(!url.isEmpty())
                {
                    Intent intent=new Intent(Intent.ACTION_VIEW);
                    intent.setData(Uri.parse(url));
                    startActivity(intent);


                }
            }
        });

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent=new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse("https://www.facebook.com/"));
                startActivity(intent);

            }
        });


    }
}
