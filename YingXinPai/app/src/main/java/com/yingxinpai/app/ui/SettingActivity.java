package com.yingxinpai.app.ui;

import android.graphics.Color;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;

import android.widget.ImageView;
import android.widget.LinearLayout;

import com.yingxinpai.app.R;


public class SettingActivity extends BaseActivity implements View.OnClickListener {

    private ImageView backIV;

    private LinearLayout commLayout;
    private LinearLayout appLayout;
    private LinearLayout equipLayout;
    private LinearLayout scanLayout;

    private ImageView commIndicatorIV;
    private ImageView appIndicatorIV;
    private ImageView equipIndicatorIV;
    private ImageView scanIndicatorIV;


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_setting);

        backIV = findViewById(R.id.iv_back);
        backIV.setOnClickListener(this);

        commLayout = findViewById(R.id.ll_comm);
        commLayout.setOnClickListener(this);

        appLayout = findViewById(R.id.ll_app);
        appLayout.setOnClickListener(this);

        equipLayout = findViewById(R.id.ll_equipment);
        equipLayout.setOnClickListener(this);

        scanLayout = findViewById(R.id.ll_scan);
        scanLayout.setOnClickListener(this);

        commIndicatorIV = findViewById(R.id.iv_comm_indicator);
        appIndicatorIV = findViewById(R.id.iv_app_indicator);
        equipIndicatorIV = findViewById(R.id.iv_equipment_indicator);
        scanIndicatorIV = findViewById(R.id.iv_scan_indicator);
    }

    @Override
    public void onClick(View view) {
        if (view.getId() == R.id.iv_back) {
            finish();

        } else if (view.getId() == R.id.ll_comm) {
            commLayout.setBackgroundColor(Color.parseColor("#E74E3E"));
            appLayout.setBackgroundColor(Color.parseColor("#393D43"));
            equipLayout.setBackgroundColor(Color.parseColor("#393D43"));
            scanLayout.setBackgroundColor(Color.parseColor("#393D43"));

            commIndicatorIV.setVisibility(View.VISIBLE);
            appIndicatorIV.setVisibility(View.INVISIBLE);
            equipIndicatorIV.setVisibility(View.INVISIBLE);
            scanIndicatorIV.setVisibility(View.INVISIBLE);

        } else if (view.getId() == R.id.ll_app) {
            commLayout.setBackgroundColor(Color.parseColor("#393D43"));
            appLayout.setBackgroundColor(Color.parseColor("#E74E3E"));
            equipLayout.setBackgroundColor(Color.parseColor("#393D43"));
            scanLayout.setBackgroundColor(Color.parseColor("#393D43"));

            commIndicatorIV.setVisibility(View.INVISIBLE);
            appIndicatorIV.setVisibility(View.VISIBLE);
            equipIndicatorIV.setVisibility(View.INVISIBLE);
            scanIndicatorIV.setVisibility(View.INVISIBLE);

        } else if (view.getId() == R.id.ll_equipment) {
            commLayout.setBackgroundColor(Color.parseColor("#393D43"));
            appLayout.setBackgroundColor(Color.parseColor("#393D43"));
            equipLayout.setBackgroundColor(Color.parseColor("#E74E3E"));
            scanLayout.setBackgroundColor(Color.parseColor("#393D43"));

            commIndicatorIV.setVisibility(View.INVISIBLE);
            appIndicatorIV.setVisibility(View.INVISIBLE);
            equipIndicatorIV.setVisibility(View.VISIBLE);
            scanIndicatorIV.setVisibility(View.INVISIBLE);

        } else if (view.getId() == R.id.ll_scan) {
            commLayout.setBackgroundColor(Color.parseColor("#393D43"));
            appLayout.setBackgroundColor(Color.parseColor("#393D43"));
            equipLayout.setBackgroundColor(Color.parseColor("#393D43"));
            scanLayout.setBackgroundColor(Color.parseColor("#E74E3E"));

            commIndicatorIV.setVisibility(View.INVISIBLE);
            appIndicatorIV.setVisibility(View.INVISIBLE);
            equipIndicatorIV.setVisibility(View.INVISIBLE);
            scanIndicatorIV.setVisibility(View.VISIBLE);
        }
    }
}
