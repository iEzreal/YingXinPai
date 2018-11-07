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
import com.yingxinpai.app.model.Menu;
import com.yingxinpai.app.model.MusicMenu;

import java.util.ArrayList;

public class MenuAdapter extends BaseAdapter {

    private Context mContext;
    private ArrayList<Menu> mMenuList;

    private int checkPosition;

    public MenuAdapter(Context context, ArrayList<Menu> menuList) {
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
            convertView = LayoutInflater.from(mContext).inflate(R.layout.item_menu, null);

            viewHolder.indicator = convertView.findViewById(R.id.iv_music_menu_indicator);
            viewHolder.container = convertView.findViewById(R.id.ll_music_menu_container);
            viewHolder.icon = convertView.findViewById(R.id.iv_music_menu_icon);
            viewHolder.name = convertView.findViewById(R.id.tv_music_menu_name);

            convertView.setTag(viewHolder);

        }else{
            viewHolder = (ViewHolder) convertView.getTag();
        }


        Menu menu = mMenuList.get(position);
        viewHolder.indicator.setImageResource(menu.getIndicator());
        viewHolder.name.setText(menu.getText());
        if (checkPosition == position) {
            viewHolder.indicator.setVisibility(View.VISIBLE);
            viewHolder.container.setBackgroundColor(Color.parseColor(menu.getBgSelectedColor()));
        } else {
            viewHolder.indicator.setVisibility(View.INVISIBLE);
            viewHolder.container.setBackgroundColor(Color.parseColor(menu.getBgNormalColor()));
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
