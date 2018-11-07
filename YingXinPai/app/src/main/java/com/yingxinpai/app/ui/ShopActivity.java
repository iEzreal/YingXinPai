package com.yingxinpai.app.ui;

import android.graphics.Color;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;

import com.yingxinpai.app.R;

public class ShopActivity extends BaseActivity implements View.OnClickListener {

    private ImageView backIV;

    private LinearLayout mapLayout;
    private LinearLayout audioLayout;
    private LinearLayout socialLayout;
    private LinearLayout otherLayout;

    private ImageView mapIndicatorIV;
    private ImageView audioIndicatorIV;
    private ImageView socialIndicatorIV;
    private ImageView otherIndicatorIV;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shop);

        backIV = findViewById(R.id.iv_back);
        backIV.setOnClickListener(this);

        mapLayout = findViewById(R.id.ll_map);
        mapLayout.setOnClickListener(this);

        audioLayout = findViewById(R.id.ll_audio);
        audioLayout.setOnClickListener(this);

        socialLayout = findViewById(R.id.ll_social);
        socialLayout.setOnClickListener(this);

        otherLayout = findViewById(R.id.ll_other);
        otherLayout.setOnClickListener(this);

        mapIndicatorIV = findViewById(R.id.iv_map_indicator);
        audioIndicatorIV = findViewById(R.id.iv_audio_indicator);
        socialIndicatorIV = findViewById(R.id.iv_social_indicator);
        otherIndicatorIV = findViewById(R.id.iv_other_indicator);
    }

    @Override
    public void onClick(View view) {
        if (view.getId() == R.id.iv_back) {
            finish();

        } else if (view.getId() == R.id.ll_map) {
            mapLayout.setBackgroundColor(Color.parseColor("#E74E3E"));
            audioLayout.setBackgroundColor(Color.parseColor("#393D43"));
            socialLayout.setBackgroundColor(Color.parseColor("#393D43"));
            otherLayout.setBackgroundColor(Color.parseColor("#393D43"));

            mapIndicatorIV.setVisibility(View.VISIBLE);
            audioIndicatorIV.setVisibility(View.INVISIBLE);
            socialIndicatorIV.setVisibility(View.INVISIBLE);
            otherIndicatorIV.setVisibility(View.INVISIBLE);

        } else if (view.getId() == R.id.ll_audio) {
            mapLayout.setBackgroundColor(Color.parseColor("#393D43"));
            audioLayout.setBackgroundColor(Color.parseColor("#E74E3E"));
            socialLayout.setBackgroundColor(Color.parseColor("#393D43"));
            otherLayout.setBackgroundColor(Color.parseColor("#393D43"));

            mapIndicatorIV.setVisibility(View.INVISIBLE);
            audioIndicatorIV.setVisibility(View.VISIBLE);
            socialIndicatorIV.setVisibility(View.INVISIBLE);
            otherIndicatorIV.setVisibility(View.INVISIBLE);

        } else if (view.getId() == R.id.ll_social) {
            mapLayout.setBackgroundColor(Color.parseColor("#393D43"));
            audioLayout.setBackgroundColor(Color.parseColor("#393D43"));
            socialLayout.setBackgroundColor(Color.parseColor("#E74E3E"));
            otherLayout.setBackgroundColor(Color.parseColor("#393D43"));

            mapIndicatorIV.setVisibility(View.INVISIBLE);
            audioIndicatorIV.setVisibility(View.INVISIBLE);
            socialIndicatorIV.setVisibility(View.VISIBLE);
            otherIndicatorIV.setVisibility(View.INVISIBLE);

        } else if (view.getId() == R.id.ll_other) {
            mapLayout.setBackgroundColor(Color.parseColor("#393D43"));
            audioLayout.setBackgroundColor(Color.parseColor("#393D43"));
            socialLayout.setBackgroundColor(Color.parseColor("#393D43"));
            otherLayout.setBackgroundColor(Color.parseColor("#E74E3E"));

            mapIndicatorIV.setVisibility(View.INVISIBLE);
            audioIndicatorIV.setVisibility(View.INVISIBLE);
            socialIndicatorIV.setVisibility(View.INVISIBLE);
            otherIndicatorIV.setVisibility(View.VISIBLE);
        }
    }
}
