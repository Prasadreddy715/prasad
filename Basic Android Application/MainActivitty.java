package com.example.admin.link;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.*;
import android.widget.Button;
import android.widget.EditText;



public class MainActivity extends AppCompatActivity {
    EditText et,et2,et3,et4;
    Button sub;
    String text;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        et2 = (EditText)findViewById(R.id.editText2);
        et3 = (EditText)findViewById(R.id.editText3);
        et4 = (EditText)findViewById(R.id.editText4);

    }
            public void onClick(View view) {
               et = (EditText)findViewById(R.id.editText1);
                text = et.getText().toString();
                Intent i = new Intent(view.getContext(),    second.class);
                startActivity(i);

            }
}
