package com.example.jinadiwathsala.first;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.ScrollView;

/**
 * Created by Jinadi Wathsala on 11/11/2017.
 */

public class SignIn extends AppCompatActivity {

    Button btn1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.signin);

        ScrollView scrollviewtwo = (ScrollView)findViewById(R.id.scrTwo);
        btn1 =(Button)findViewById(R.id.btnSignUp2);

        LinearLayout.LayoutParams params1=(LinearLayout.LayoutParams)scrollviewtwo.getLayoutParams();
        params1.width=(getResources().getDisplayMetrics().widthPixels/10)*8;
        //params1.height=(getResources().getDisplayMetrics().heightPixels/14);
        params1.leftMargin=(getResources().getDisplayMetrics().widthPixels/20);
        // params1.rightMargin=(getResources().getDisplayMetrics().widthPixels/10);

        scrollviewtwo.setLayoutParams(params1);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(getIntent());
            }
        });
    }
}
