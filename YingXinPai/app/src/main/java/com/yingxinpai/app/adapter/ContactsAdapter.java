package com.yingxinpai.app.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.yingxinpai.app.R;
import com.yingxinpai.app.widget.CircleImageView;

public class ContactsAdapter extends BaseAdapter {

    private Context mContext;

    public ContactsAdapter(Context context) {
        this.mContext = context;
    }


    @Override
    public int getCount() {
        return 10;
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
            convertView = LayoutInflater.from(mContext).inflate(R.layout.item_contacts, null);

            viewHolder.avatar = convertView.findViewById(R.id.iv_avatar);
            viewHolder.name = convertView.findViewById(R.id.tv_name);
            viewHolder.phone = convertView.findViewById(R.id.tv_phone);
            viewHolder.time = convertView.findViewById(R.id.tv_time);

            convertView.setTag(viewHolder);
        }else{
            viewHolder = (ViewHolder) convertView.getTag();
        }

        return convertView;
    }


    class ViewHolder{
        public CircleImageView avatar;
        public TextView name;
        public TextView phone;
        public TextView time;
    }
}
