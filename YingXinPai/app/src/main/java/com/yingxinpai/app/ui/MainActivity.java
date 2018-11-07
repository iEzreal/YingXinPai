package com.yingxinpai.app.ui;

import android.app.AlertDialog;
import android.content.Intent;
import android.support.v4.widget.DrawerLayout;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Toast;

import com.yingxinpai.app.R;

public class MainActivity extends BaseActivity implements View.OnClickListener {

    private DrawerLayout drawerLayout;

    private ImageView avatarIV;

    private LinearLayout leftDrawerView;

    private LinearLayout mapLLayout;
    private LinearLayout phoneLLayout;
    private LinearLayout musicLLayout;
    private LinearLayout radioLLayout;

    private ImageView shopIV;
    private ImageView settingIV;
    private ImageView otherIV;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initViews();
    }

    @Override
    public void onClick(View v) {
        if (v.getId() == R.id.iv_avatar) {
            if (drawerLayout.isDrawerOpen(leftDrawerView)) {
                drawerLayout.closeDrawer(leftDrawerView, true);

            } else {
                drawerLayout.openDrawer(leftDrawerView, true);
            }

        } else if (v.getId() == R.id.ll_map) {
            showDialog();

        } else if (v.getId() == R.id.ll_phone) {
            Intent intent = new Intent(MainActivity.this, PhoneActivity.class);
            startActivity(intent);

        } else if (v.getId() == R.id.ll_music) {
            Intent intent = new Intent(MainActivity.this, MusicActivity.class);
            startActivity(intent);

        } else if (v.getId() == R.id.ll_radio) {
//            Intent intent = new Intent(MainActivity.this, RadioActivity.class);
//            startActivity(intent);
            Toast.makeText(MainActivity.this, "收音机", Toast.LENGTH_LONG).show();

        } else if (v.getId() == R.id.iv_shop) {
            Intent intent = new Intent(MainActivity.this, ShopActivity.class);
            startActivity(intent);

        } else if (v.getId() == R.id.iv_setting) {
            Intent intent = new Intent(MainActivity.this, SettingActivity.class);
            startActivity(intent);

        } else if (v.getId() == R.id.iv_other) {
            Intent intent = new Intent(MainActivity.this, OtherActivity.class);
            startActivity(intent);
        }
    }

    private void initViews () {
        drawerLayout = findViewById(R.id.activity_na);

        avatarIV = findViewById(R.id.iv_avatar);
        avatarIV.setOnClickListener(this);

        leftDrawerView = findViewById(R.id.left_drawer_menu);

        mapLLayout = findViewById(R.id.ll_map);
        mapLLayout.setOnClickListener(this);

        phoneLLayout = findViewById(R.id.ll_phone);
        phoneLLayout.setOnClickListener(this);

        musicLLayout = findViewById(R.id.ll_music);
        musicLLayout.setOnClickListener(this);

        radioLLayout = findViewById(R.id.ll_radio);
        radioLLayout.setOnClickListener(this);

        shopIV = findViewById(R.id.iv_shop);
        shopIV.setOnClickListener(this);

        settingIV = findViewById(R.id.iv_setting);
        settingIV.setOnClickListener(this);

        otherIV = findViewById(R.id.iv_other);
        otherIV.setOnClickListener(this);
    }

    private void showDialog() {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        View dialogdView = View.inflate(MainActivity.this, R.layout.view_alert_dialog, null);
        final AlertDialog alertDialog = builder.create();
        alertDialog.setView(dialogdView);
        alertDialog.show();
    }
}
