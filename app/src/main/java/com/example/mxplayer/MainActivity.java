package com.example.mxplayer;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    Button b1,b2,b3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        b1=findViewById(R.id.button);//about
        b2=findViewById(R.id.button2);//contact us
        b3=findViewById(R.id.button4);//gallery

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(MainActivity.this,about.class);
                startActivity(i);
                Toast.makeText(MainActivity.this, "about", Toast.LENGTH_SHORT).show();
            }
        });

        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(MainActivity.this,music.class);
                startActivity(i);
                Toast.makeText(MainActivity.this, "contact", Toast.LENGTH_SHORT).show();
            }
        });

        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(MainActivity.this,gallry.class);
                startActivity(i);
                Toast.makeText(MainActivity.this, "gallery", Toast.LENGTH_SHORT).show();
            }
        });




    }
}