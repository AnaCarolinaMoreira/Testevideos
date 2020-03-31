package com.example.testevideos.tab_fragment;

import android.content.Intent;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ImageButton;
import android.widget.MediaController;
import android.widget.VideoView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.example.testevideos.R;
import com.example.testevideos.activity.FullVideoActivity;

public class VideosFragment extends Fragment {

  //  VideoView video;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        final View view = inflater.inflate(R.layout.fragment_videos, container, false);

      final ImageButton ImagemButton = (ImageButton) view.findViewById(R.id.imagembutton);

        ImagemButton.setOnClickListener(new View.OnClickListener() {

        @Override
        public void onClick(View v) {
            ImagemButton.setVisibility(v.INVISIBLE);
            openFullVideoActivity();
            }
        });
        return view;
    }

    public  void  openFullVideoActivity(){
        Intent intent = new Intent(getActivity(), FullVideoActivity.class);
        startActivity(intent);
    }

}