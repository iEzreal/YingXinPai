package com.yingxinpai.app.ui;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.ListView;

import com.yingxinpai.app.R;
import com.yingxinpai.app.adapter.MusicLeftMenuAdapter;
import com.yingxinpai.app.fragment.CarTerminalMusicFragment;
import com.yingxinpai.app.fragment.ConnectPhoneMusicFragment;
import com.yingxinpai.app.model.MusicMenu;

import java.util.ArrayList;

public class MusicActivity extends BaseActivity implements View.OnClickListener {

    private ImageView backIV;

    private FragmentManager fm;

    private CarTerminalMusicFragment terminalMusicFragment;
    private ConnectPhoneMusicFragment phoneMusicFragment;

    private ArrayList<MusicMenu> menuList = new ArrayList<>();

    private ListView mListView;
    private MusicLeftMenuAdapter mAdapter;


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_music);

        fm = getSupportFragmentManager();

        backIV = findViewById(R.id.iv_back);
        backIV.setOnClickListener(this);

        initData();

        mListView = findViewById(R.id.lv_music_menu);
        mAdapter = new MusicLeftMenuAdapter(this, menuList);
        mListView.setAdapter(mAdapter);

        mListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                mAdapter.setCheckPosition(i);
                mAdapter.notifyDataSetChanged();

                showFragment(i);
            }
        });

        showFragment(0);
    }


    @Override
    public void onClick(View view) {
        if (view.getId() == R.id.iv_back) {
            finish();
        }
    }

    private void showFragment(int index) {
        FragmentTransaction transaction = fm.beginTransaction();
        hideFragment(transaction);
        switch (index) {
            case 0: {
                if (terminalMusicFragment == null) {
                    terminalMusicFragment = new CarTerminalMusicFragment();
                    transaction.add(R.id.id_content, terminalMusicFragment);
                } else {
                    transaction.show(terminalMusicFragment);
                }
                break;
            }

            case 1: {
                if (phoneMusicFragment == null) {
                    phoneMusicFragment = new ConnectPhoneMusicFragment();
                    transaction.add(R.id.id_content, phoneMusicFragment);
                } else {
                    transaction.show(phoneMusicFragment);
                }
                break;
            }
        }
        transaction.commit();
    }

    private void hideFragment(FragmentTransaction transaction) {
        if (terminalMusicFragment != null) {
            transaction.hide(terminalMusicFragment);
        }

        if (phoneMusicFragment != null) {
            transaction.hide(phoneMusicFragment);
        }
    }


    private void initData() {
        MusicMenu menu0 = new MusicMenu();
        menu0.setName("机车音乐");
        menu0.setColor("#3598DB");
        menu0.setImage(R.mipmap.ic_trigon_blue);
        menu0.setSelected(true);
        menuList.add(menu0);

        MusicMenu menu1 = new MusicMenu();
        menu1.setName("链接一");
        menu1.setColor("#E74E3E");
        menu1.setImage(R.mipmap.ic_trigon_red);
        menu1.setSelected(false);
        menuList.add(menu1);

        MusicMenu menu2 = new MusicMenu();
        menu2.setName("链接二");
        menu2.setColor("#5ECC59");
        menu2.setImage(R.mipmap.ic_trigon_green);
        menu2.setSelected(false);
        menuList.add(menu2);

        MusicMenu menu3 = new MusicMenu();
        menu3.setName("链接三");
        menu3.setColor("#FFAA23");
        menu3.setImage(R.mipmap.ic_trigon_yellow);
        menu3.setSelected(false);
        menuList.add(menu3);
    }

}
