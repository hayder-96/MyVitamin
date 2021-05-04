package com.hayali.mymyvitamin;

import android.content.Context;
import android.content.Intent;
import android.media.MediaPlayer;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.Filter;
import android.widget.Filterable;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class AdbterFruitandVegit extends BaseAdapter implements Filterable {


   final ArrayList<NameFruitandViget> arrayList;
    final ArrayList<NameFruitandViget> list;
    final Context context;


    public AdbterFruitandVegit(ArrayList<NameFruitandViget> arrayList, Context context) {

        this.arrayList = arrayList;
        this.context = context;
        this.list = new ArrayList<>();
        this.list.addAll(arrayList);

    }


    @Override
    public int getCount() {
        return arrayList.size();
    }

    @Override
    public Object getItem(int position) {
        return arrayList.get(position);
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(final int position, View convertView, ViewGroup parent) {

        View view = convertView;

        if (view == null) {
            view = LayoutInflater.from(context).inflate(R.layout.split_fruit_vegit, null, false);
        }

        TextView textfruit1 = view.findViewById(R.id.textfrut1);
        final Button frut1 = view.findViewById(R.id.frut1);
        final NameFruitandViget c = arrayList.get(position);
        textfruit1.setText(c.getName1());
        frut1.setBackground(c.getImage1());

        frut1.setTag(c.getName1());


        frut1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                MediaPlayer m = MediaPlayer.create(context, R.raw.sound_click);
                m.start();
                String ng = (String) frut1.getTag();
                Intent io = new Intent(context, ActivityVitamin.class);
                io.putExtra("id", ng);
                context.startActivity(io);


            }

        });
        return view;
    }


    @Override
    public Filter getFilter() {

        return filter;
    }

    final Filter filter = new Filter() {
        @Override
        protected FilterResults performFiltering(CharSequence constraint) {

            ArrayList<NameFruitandViget> listflter = new ArrayList<>();
            if (constraint == null || constraint.length() == 0) {

                listflter.addAll(list);
            } else {

                String filterList = constraint.toString().toLowerCase().trim();
                for (NameFruitandViget item : list) {

                    if (item.getName1().toLowerCase().contains(filterList)) {
                        listflter.add(item);
                    }
                }
            }

            FilterResults results = new FilterResults();
            results.values = listflter;
            return results;


        }

        @Override
        protected void publishResults(CharSequence constraint, FilterResults results) {

            arrayList.clear();
            arrayList.addAll((List) results.values);
            notifyDataSetChanged();
        }


    };
}


