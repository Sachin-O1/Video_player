package com.sachin.video_player;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.VideoView;

public class MainActivity extends AppCompatActivity {

    Button btnPlay, btnresume, btnPause, btnStop;
    VideoView videoView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnPlay = findViewById(R.id.btn_play);
        btnPause = findViewById(R.id.btn_pause);
        btnStop = findViewById(R.id.btn_stop);
        btnresume = findViewById(R.id.btn_resume);
        videoView = findViewById(R.id.video_view);

        btnPlay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                play();
            }
        });

        btnresume.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                resume();
            }
        });

        btnPause.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                pause();
            }
        });

        btnStop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                stop();
            }
        });
    }

    private void play(){
        if (videoView != null){
            //https://www.google.com/images
            String uriPath = "android.resource://"+getPackageName()+"/"+R.raw.test1;
            Uri uri = Uri.parse(uriPath);
            videoView.setVideoURI(uri);
            videoView.start();
        }
    }
    private void resume(){
        if (videoView != null){
            videoView.start();
        }
    }
    private void pause(){
        if (videoView != null){
            videoView.pause();
        }
    }
    private void stop(){
        if (videoView != null){
            videoView.stopPlayback();
        }
    }
}