package com.example.testevideos;

import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.ImageButton;
import android.widget.MediaController;
import android.widget.VideoView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class VideosFragment extends Fragment {

    VideoView video;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_videos, container, false);


        video = (VideoView) view.findViewById(R.id.video_view);
        String path1 = "https://firebasestorage.googleapis.com/v0/b/videoview-247213.appspot.com/o/Video.mp4?alt=media&token=d049cc83-5635-487d-ac48-1a36d5b64844";
        MediaController mc = new MediaController(getActivity());
        mc.setAnchorView(video);
        mc.setMediaPlayer(video);
        Uri uri = Uri.parse(path1);
        video.setMediaController(mc);
        video.setVideoURI(uri);

        final ImageButton ImagemButton = (ImageButton) view.findViewById(R.id.imagembutton);
        ImagemButton.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {


                video.start();
                ImagemButton.setVisibility(v.INVISIBLE);

            }
        });
        return view;
    }
}
