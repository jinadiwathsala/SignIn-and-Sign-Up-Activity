package com.example.jinadiwathsala.first;

import android.app.ActionBar;
//import android.support.v7.app.ActionBar;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.Typeface;
import android.graphics.drawable.ColorDrawable;
import android.support.constraint.ConstraintLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Space;

//import com.miguelcatalan.materialsearchview.MaterialSearchView;

public class MainActivity extends AppCompatActivity {
    Button b1;
    Button b2;
   // ActionBar actionbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

      // actionbar = getSupportActionBar();
      // getActionBar().setBackgroundDrawable(new ColorDrawable(Color.parseColor("#DC143C")));



        Typeface typeface = Typeface.createFromAsset(getAssets(),"LHANDW.TTF");
        Button signin = (Button)findViewById(R.id.btnSignIn);
        signin.setTypeface(typeface);

        Button signup = (Button)findViewById(R.id.btnSignUp);
        signup.setTypeface(typeface);

        ImageView imageview = (ImageView)findViewById(R.id.imghome);
        Space space = (Space)findViewById(R.id.spcHome);

        LinearLayout.LayoutParams params1=(LinearLayout.LayoutParams)signin.getLayoutParams();
        params1.width=(getResources().getDisplayMetrics().widthPixels/10)*8;
        params1.leftMargin=(getResources().getDisplayMetrics().widthPixels/10);
        params1.topMargin=(getResources().getDisplayMetrics().widthPixels/10);


        LinearLayout.LayoutParams params2=(LinearLayout.LayoutParams)signup.getLayoutParams();
        params2.width=(getResources().getDisplayMetrics().widthPixels/10)*8;
        params2.leftMargin=(getResources().getDisplayMetrics().widthPixels/10);

        LinearLayout.LayoutParams params3=(LinearLayout.LayoutParams)imageview.getLayoutParams();
        params3.width=(getResources().getDisplayMetrics().widthPixels/10)*8;
        params3.leftMargin=(getResources().getDisplayMetrics().widthPixels/10);
        params3.topMargin=(getResources().getDisplayMetrics().widthPixels/10);

        LinearLayout.LayoutParams params4=(LinearLayout.LayoutParams)space.getLayoutParams();
        params4.leftMargin=(getResources().getDisplayMetrics().widthPixels/10);
        params4.topMargin=(getResources().getDisplayMetrics().widthPixels/30);

        imageview.setLayoutParams(params3);
        signin.setLayoutParams(params1);
        space.setLayoutParams(params4);
        signup.setLayoutParams(params2);


        b1 = (Button)findViewById(R.id.btnSignUp);
        b2 = (Button)findViewById(R.id.btnSignIn);


        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(getApplicationContext(),SignUp.class);
                startActivity(i);
            }
        });

        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent j = new Intent(getApplicationContext(),SignIn.class);
                startActivity(j);
            }
        });









    }
}
