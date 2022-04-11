package com.example.mxplayer;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;


import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class music extends AppCompatActivity {

    MediaPlayer mp;
    Button  Play,Pause,Play1,Pause1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_music);
        Play=findViewById(R.id.play);
        Pause=findViewById(R.id.pause);

        Play1=findViewById(R.id.play1);
        Pause1=findViewById(R.id.pause1);


        Play.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if(mp == null){
                    mp = MediaPlayer.create(music.this,R.raw.n1);
                    mp.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                        @Override
                        public void onCompletion(MediaPlayer mp) {

                        }
                    });
                }
                mp.start();

            }
        });

        Pause.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(mp != null){
                    mp.pause();
                }

            }
        });



        Play1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if(mp == null){
                    mp = MediaPlayer.create(music.this,R.raw.n2);
                    mp.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                        @Override
                        public void onCompletion(MediaPlayer mp) {

                        }
                    });
                }
                mp.start();

            }
        });

        Pause1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if(mp != null){
                    mp.pause();
                }

            }
        });
    }

}






