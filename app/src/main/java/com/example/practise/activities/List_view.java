package com.example.practise.activities;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import com.example.practise.R;

import java.util.ArrayList;

public class List_view extends AppCompatActivity implements AdapterView.OnItemClickListener

{

    ListView listView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_view);
        listView=(ListView)findViewById(R.id.list1);


        /*ArrayList<String> arrayList=new ArrayList<>();
        arrayList.add("one");
        arrayList.add("two");
        arrayList.add("three");
        arrayList.add("four");*/

        String arrayList[]={"java","andriod","php",".net"};

        ArrayAdapter  arrayAdapter=new ArrayAdapter(getApplicationContext(),android.R.layout.simple_list_item_1,arrayList);
        listView.setAdapter(arrayAdapter);
        listView.setOnItemClickListener(this);

    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

       String iteam= (String)listView.getItemAtPosition(position);

       if(iteam.equals("java")) {
           Toast.makeText(this, "this is java", Toast.LENGTH_SHORT).show();}
       else if(iteam.equals("andriod")) {
           Toast.makeText(this, "this is andriod", Toast.LENGTH_SHORT).show();

           startActivity( new Intent(List_view.this,MainActivity.class));
           finish();
       }

    }
}
