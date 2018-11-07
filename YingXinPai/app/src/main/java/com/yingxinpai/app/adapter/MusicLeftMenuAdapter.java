package com.yingxinpai.app.adapter;

import android.content.Context;
import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.yingxinpai.app.R;
import com.yingxinpai.app.model.MusicMenu;
import com.yingxinpai.app.widget.CircleImageView;

import java.util.ArrayList;

public class MusicLeftMenuAdapter extends BaseAdapter {

    private Context mContext;
    private ArrayList<MusicMenu> mMenuList;

    private int checkPosition;

    public MusicLeftMenuAdapter(Context context, ArrayList<MusicMenu> menuList) {
        this.mContext = context;
        this.mMenuList = menuList;
    }


    public int getCheckPosition() {
        return checkPosition;
    }

    public void setCheckPosition(int checkPosition) {
        this.checkPosition = checkPosition;
    }

    @Override
    public int getCount() {
        return mMenuList.size();
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
            convertView = LayoutInflater.from(mContext).inflate(R.layout.item_music_left_menu, null);

            viewHolder.indicator = convertView.findViewById(R.id.iv_music_menu_indicator);
            viewHolder.container = convertView.findViewById(R.id.ll_music_menu_container);
            viewHolder.icon = convertView.findViewById(R.id.iv_music_menu_icon);
            viewHolder.name = convertView.findViewById(R.id.tv_music_menu_name);

            convertView.setTag(viewHolder);

        }else{
            viewHolder = (ViewHolder) convertView.getTag();
        }


        MusicMenu menu = mMenuList.get(position);
        viewHolder.container.setBackgroundColor(Color.parseColor(menu.getColor()));
        viewHolder.indicator.setImageResource(menu.getImage());
        viewHolder.name.setText(menu.getName());
        if (checkPosition == position) {
            viewHolder.indicator.setVisibility(View.VISIBLE);
        } else {
            viewHolder.indicator.setVisibility(View.INVISIBLE);
        }



        return convertView;
    }


    class ViewHolder{
        public ImageView indicator;

        public LinearLayout container;
        public ImageView icon;
        public TextView name;
    }
}
