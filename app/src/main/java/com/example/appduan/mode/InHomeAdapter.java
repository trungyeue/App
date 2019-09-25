package com.example.appduan.mode;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.example.appduan.R;

import java.util.List;

public class InHomeAdapter extends BaseAdapter {

    private Context context;
    private int layout;
    private List<InHome> inHomes;

    public InHomeAdapter(Context context, int layout, List<InHome> inHomes) {
        this.context = context;
        this.layout = layout;
        this.inHomes = inHomes;
    }

    @Override
    public int getCount() {
        return inHomes.size();
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    public class ViewHolder {
        TextView roomType, romName, guestName, roomRate;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        ViewHolder holder;
        if (view == null) {
            holder = new ViewHolder();
            LayoutInflater inflater=(LayoutInflater)context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            view=inflater.inflate(layout,null);
holder.roomType=view.findViewById(R.id.roomType);
holder.romName=view.findViewById(R.id.romName);
holder.guestName=view.findViewById(R.id.guestName);
holder.roomRate=view.findViewById(R.id.roomRate);
view.setTag(holder);
        }else {
holder=(ViewHolder)view.getTag();
        }
InHome inHome=inHomes.get(i);
holder.roomType.setText("RoomType :" + inHome.getRoomType());
holder.romName.setText("RomName :" + inHome.getRomName());
holder.guestName.setText("GuestName :"  + inHome.getGuestName());
holder.roomRate.setText("RoomRate :" + inHome.getRoomRate());
        return view;
    }
}
