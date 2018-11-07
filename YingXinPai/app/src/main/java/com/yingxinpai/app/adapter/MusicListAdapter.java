package com.yingxinpai.app.adapter;

import android.content.Context;
import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.yingxinpai.app.R;
import com.yingxinpai.app.model.Music;
import com.yingxinpai.app.widget.CircleImageView;

import java.util.ArrayList;
import java.util.List;

public class MusicListAdapter extends BaseAdapter {

    private Context mContext;
    private List<Music> mMusicList;

    private int playPosition;

    public MusicListAdapter(Context context, List<Music> musicList) {
        this.mContext = context;
        this.mMusicList = musicList;
    }

    @Override
    public int getCount() {
        return mMusicList.size();
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup viewGroup) {
        ViewHolder viewHolder;
        if (convertView == null) {
            viewHolder = new ViewHolder();
            convertView = LayoutInflater.from(mContext).inflate(R.layout.item_music_list, null);

            viewHolder.name = convertView.findViewById(R.id.music_name);
            viewHolder.singer = convertView.findViewById(R.id.music_singer);
            viewHolder.duration = convertView.findViewById(R.id.music_duration);
            viewHolder.effect = convertView.findViewById(R.id.music_effect);

            convertView.setTag(viewHolder);
        }else{
            viewHolder = (ViewHolder) convertView.getTag();
        }

        Music music = mMusicList.get(position);

        if (playPosition == position) {
            viewHolder.name.setTextColor(Color.parseColor("#E54C3D"));
            viewHolder.singer.setTextColor(Color.parseColor("#E54C3D"));
            viewHolder.duration.setTextColor(Color.parseColor("#E54C3D"));
            viewHolder.effect.setVisibility(View.VISIBLE);

        } else {
            viewHolder.name.setTextColor(Color.parseColor("#FFFFFF"));
            viewHolder.singer.setTextColor(Color.parseColor("#FFFFFF"));
            viewHolder.duration.setTextColor(Color.parseColor("#FFFFFF"));
            viewHolder.effect.setVisibility(View.INVISIBLE);
        }

        viewHolder.name.setText(position + 1 + ". "+  music.getName());
        viewHolder.singer.setText(music.getSinger());
        viewHolder.duration.setText(music.getDuration());

        return convertView;
    }


    class ViewHolder{
        public CircleImageView avatar;
        public TextView name;
        public TextView singer;
        public TextView duration;
        public ImageView effect;
    }
}
