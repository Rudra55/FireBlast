package com.example.practise.activities;

import android.content.Intent;
import android.graphics.Bitmap;
import android.provider.MediaStore;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;

import com.example.practise.R;

public class One_to_another extends AppCompatActivity implements View.OnClickListener{



    ImageView imageView;
    Button b1;
    public static final int CAMERA_REQUEST=1000;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_one_to_another);
        imageView=(ImageView)findViewById(R.id.image1);
        b1=(Button)findViewById(R.id.button1);
        b1.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {

        Intent intent=new Intent(MediaStore.ACTION_IMAGE_CAPTURE );
        startActivityForResult(intent,CAMERA_REQUEST );

    }
          //overide
     protected void onActivityResult(int requestCode ,int resultCode,Intent data1){

        if(requestCode==CAMERA_REQUEST)
        {
            Bitmap  photo=(Bitmap) data1.getExtras().get("data");
            imageView.setImageBitmap(photo);
        }
     }
}
