package com.yingxinpai.app.fragment;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import com.yingxinpai.app.R;
import com.yingxinpai.app.adapter.MusicListAdapter;
import com.yingxinpai.app.model.Music;

import java.util.ArrayList;
import java.util.List;

public class CarTerminalMusicFragment extends Fragment {

    private List<Music> musicList = new ArrayList<>();

    private ListView mListView;
    private MusicListAdapter mAdapter;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_music_list, container, false);

        initData();

        mListView = view.findViewById(R.id.lv_music_list);
        mAdapter = new MusicListAdapter(getContext(), musicList);
        mListView.setAdapter(mAdapter);

        return view;
    }

    private void initData() {
        Music music = new Music();
        music.setName("发现爱");
        music.setSinger("林俊杰");
        music.setDuration("3:45");
        musicList.add(music);

        Music music1 = new Music();
        music1.setName("半岛铁盒");
        music1.setSinger("周杰伦");
        music1.setDuration("3:45");
        musicList.add(music1);

        Music music2 = new Music();
        music2.setName("泡沫");
        music2.setSinger("邓紫棋");
        music2.setDuration("3:45");
        musicList.add(music2);

        Music music3 = new Music();
        music3.setName("莫斯科没有眼泪");
        music3.setSinger("林俊杰");
        music3.setDuration("3:45");
        musicList.add(music3);

        Music music4 = new Music();
        music4.setName("简单爱");
        music4.setSinger("周杰伦");
        music4.setDuration("3:45");
        musicList.add(music4);

        Music music5 = new Music();
        music5.setName("蜗牛");
        music5.setSinger("周杰伦");
        music5.setDuration("3:45");
        musicList.add(music5);

        Music music6 = new Music();
        music6.setName("山丘");
        music6.setSinger("李宗盛");
        music6.setDuration("3:45");
        musicList.add(music6);

        Music music7 = new Music();
        music7.setName("给自己的歌");
        music7.setSinger("李宗盛");
        music7.setDuration("3:45");
        musicList.add(music7);

        Music music8 = new Music();
        music8.setName("我们的歌");
        music8.setSinger("王力宏");
        music8.setDuration("3:45");
        musicList.add(music8);

        Music music9 = new Music();
        music9.setName("简单爱");
        music9.setSinger("周杰伦");
        music9.setDuration("3:45");
        musicList.add(music9);

        Music music10 = new Music();
        music10.setName("给自己的歌");
        music10.setSinger("李宗盛");
        music10.setDuration("3:45");
        musicList.add(music10);
    }
}
