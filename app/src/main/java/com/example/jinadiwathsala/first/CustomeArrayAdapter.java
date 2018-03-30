package com.example.jinadiwathsala.first;

import android.app.Activity;
import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;


import java.util.ArrayList;

/**
 * Created by Jinadi Wathsala on 12/3/2017.
 */

public class CustomeArrayAdapter extends ArrayAdapter<String> {

    Context context;
    ArrayList<String> arrString;
    private LayoutInflater inflater;

    CustomeArrayAdapter(AppCompatActivity context,
                        ArrayList<String> arrString) {
        super(context, R.layout.single_item, arrString);
        this.context = context;
        this.arrString = arrString;

        this.inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }

    public Context getContext(){
        return super.getContext();
    }
    @SuppressWarnings("rawtypes")
    @Override
    public View getView(final int position, View convertView, ViewGroup parent){
        convertView = inflater.inflate(R.layout.single_item,null);
        TextView tv = (TextView)convertView.findViewById(R.id.tv);
        tv.setText(arrString.get(position));
        //image dan eka methanata damme naha mama..

        return  convertView;
    }
}
