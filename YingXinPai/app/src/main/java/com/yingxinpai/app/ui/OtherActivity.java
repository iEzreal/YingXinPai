package com.yingxinpai.app.ui;

import android.graphics.Color;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;

import com.yingxinpai.app.R;

public class OtherActivity extends BaseActivity implements View.OnClickListener {
    private ImageView backIV;

    private LinearLayout videoLayout;
    private LinearLayout pictureLayout;
    private LinearLayout musicLayout;
    private LinearLayout otherLayout;

    private ImageView videoIndicatorIV;
    private ImageView pictureIndicatorIV;
    private ImageView musicIndicatorIV;
    private ImageView otherIndicatorIV;


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_other);

        backIV = findViewById(R.id.iv_back);
        backIV.setOnClickListener(this);

        videoLayout = findViewById(R.id.ll_video);
        videoLayout.setOnClickListener(this);

        pictureLayout = findViewById(R.id.ll_picture);
        pictureLayout.setOnClickListener(this);

        musicLayout = findViewById(R.id.ll_music);
        musicLayout.setOnClickListener(this);

        otherLayout = findViewById(R.id.ll_other);
        otherLayout.setOnClickListener(this);

        videoIndicatorIV = findViewById(R.id.iv_video_indicator);
        pictureIndicatorIV = findViewById(R.id.iv_picture_indicator);
        musicIndicatorIV = findViewById(R.id.iv_music_indicator);
        otherIndicatorIV = findViewById(R.id.iv_other_indicator);
    }

    @Override
    public void onClick(View view) {
        if (view.getId() == R.id.iv_back) {
            finish();

        } else if (view.getId() == R.id.ll_video) {
            videoIndicatorIV.setVisibility(View.VISIBLE);
            pictureIndicatorIV.setVisibility(View.INVISIBLE);
            musicIndicatorIV.setVisibility(View.INVISIBLE);
            otherIndicatorIV.setVisibility(View.INVISIBLE);

        } else if (view.getId() == R.id.ll_picture) {
            videoIndicatorIV.setVisibility(View.INVISIBLE);
            pictureIndicatorIV.setVisibility(View.VISIBLE);
            musicIndicatorIV.setVisibility(View.INVISIBLE);
            otherIndicatorIV.setVisibility(View.INVISIBLE);

        } else if (view.getId() == R.id.ll_music) {
            videoIndicatorIV.setVisibility(View.INVISIBLE);
            pictureIndicatorIV.setVisibility(View.INVISIBLE);
            musicIndicatorIV.setVisibility(View.VISIBLE);
            otherIndicatorIV.setVisibility(View.INVISIBLE);

        } else if (view.getId() == R.id.ll_other) {
            videoIndicatorIV.setVisibility(View.INVISIBLE);
            pictureIndicatorIV.setVisibility(View.INVISIBLE);
            musicIndicatorIV.setVisibility(View.INVISIBLE);
            otherIndicatorIV.setVisibility(View.VISIBLE);
        }
    }
}
