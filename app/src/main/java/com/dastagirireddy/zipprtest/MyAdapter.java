package com.dastagirireddy.zipprtest;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

import java.util.List;

class MyAdapter extends BaseAdapter{
    Context ct;
    List<LocationDetails> details;


    MyAdapter(Context ct, List<LocationDetails> details) {

        this.ct = ct;
        this.details = details;

    }

    @Override
    public int getCount() {
        return details.size();
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        LayoutInflater li = (LayoutInflater) ct.getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        View v = li.inflate(R.layout.listitem, null);
        return null;
    }
}
