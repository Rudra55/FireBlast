package com.example.practise.activities;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.Toast;

import com.example.practise.R;

public class second extends AppCompatActivity {

    EditText t2,t3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        Bundle bundle=getIntent().getExtras();
        t2=(EditText)findViewById(R.id.email);
        t3=(EditText)findViewById(R.id.pass);
        String email=bundle.getString("email");
        String pass=bundle.getString("pass");
        Toast.makeText(this, " email and pass ="+email+" "+pass, Toast.LENGTH_SHORT).show();
        t2.setText(email);
        t3.setText(pass);



    }
}
