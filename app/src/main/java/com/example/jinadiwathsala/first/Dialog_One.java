package com.example.jinadiwathsala.first;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

/**
 * Created by Jinadi Wathsala on 11/16/2017.
 */

public class Dialog_One extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.dialog_one);

        /*TextView txtOne = (TextView)findViewById(R.id.txtDialogAgree);
        Button btnOne = (Button)findViewById(R.id.btnAgree);


        LinearLayout.LayoutParams params1=(LinearLayout.LayoutParams)txtOne.getLayoutParams();
        params1.width=(getResources().getDisplayMetrics().widthPixels/10)*4;
        params1.leftMargin=(getResources().getDisplayMetrics().widthPixels/10);
        params1.topMargin=(getResources().getDisplayMetrics().widthPixels/10);

        LinearLayout.LayoutParams params2=(LinearLayout.LayoutParams)btnOne.getLayoutParams();
        params2.width=(getResources().getDisplayMetrics().widthPixels/10)*8;
        params2.leftMargin=(getResources().getDisplayMetrics().widthPixels/10);
        params2.topMargin=(getResources().getDisplayMetrics().widthPixels/10);


        txtOne.setLayoutParams(params1);
        btnOne.setLayoutParams(params2);*/
    }
}
