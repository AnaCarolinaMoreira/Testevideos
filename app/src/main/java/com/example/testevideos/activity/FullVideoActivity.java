package com.example.testevideos.activity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.MediaController;
import android.widget.VideoView;

import androidx.appcompat.app.AppCompatActivity;
import com.example.testevideos.R;



public class FullVideoActivity extends AppCompatActivity {

    // Video
    private VideoView videoView;
    private Intent intent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
       setContentView(R.layout.activity_full_video);
   //    getSupportActionBar().hide();
     videoView = findViewById(R.id.video_view);
        View decorView = getWindow().getDecorView();
        int uiOp = View.SYSTEM_UI_FLAG_FULLSCREEN;
        decorView.setSystemUiVisibility(uiOp);
        videoView.setMediaController(new MediaController(this));
        videoView.setVideoPath("https://firebasestorage.googleapis.com/v0/b/videoview-247213.appspot.com/o/Video.mp4?alt=media&token=d049cc83-5635-487d-ac48-1a36d5b64844");
        videoView.start();

    }
}