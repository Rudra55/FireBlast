package com.example.practise.activities;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.practise.R;

import java.util.Timer;
import java.util.TimerTask;

public class Login extends AppCompatActivity {

    EditText t1,t2;
    Button b1;
    private boolean exit=false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

         b1 =(Button)findViewById(R.id.submit);
         t1 =(EditText) findViewById(R.id.email);
         t2 =(EditText) findViewById(R.id.pass);

         b1.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View v) {
                String email=t1.getText().toString();
                String pass=t2.getText().toString();

                if(email.isEmpty()&&pass.isEmpty())
                {

                    //t1.setError("plz provide all field");
                    //t1.requestFocus();
                    Toast.makeText(Login.this, "fill all details", Toast.LENGTH_SHORT).show();

                }

                else
                {
                    Intent intent =new Intent(Login.this,second.class);
                    intent.putExtra("email",email);
                    intent.putExtra("pass",pass);


                    startActivity(intent);



                }

             }
         });

    }

    @Override
    public void onBackPressed() {
        //super.onBackPressed();
        //finish();
        if(exit)
        {
            finish();
        }
        else
        {
            Toast.makeText(Login.this, "back press twice   ", Toast.LENGTH_SHORT).show();
        }
        Timer timer=new Timer();
        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                exit=false;
            }

        },2000 );
        exit=true;

    }
}

