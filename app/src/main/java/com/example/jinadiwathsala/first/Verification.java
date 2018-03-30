package com.example.jinadiwathsala.first;

import android.app.Activity;
import android.app.Dialog;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.Layout;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.Space;
import android.widget.TextView;
import android.widget.Toast;

/**
 * Created by Jinadi Wathsala on 11/11/2017.
 */

public class Verification extends AppCompatActivity {

    TextView txt1;
    Space spc1;
    TextView  txt2;
    View view1;
    Space spc2;
    TextView txt3;
    EditText edit1;
    View view2;
    Space spc3;
    Button btn1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.verification);

        TextView txt1 = (TextView)findViewById(R.id.txtOne);
        Space spc1 = (Space)findViewById(R.id.spcVerification1);
        TextView  txt2 = (TextView)findViewById(R.id.txTwo);
        View view1 = (View)findViewById(R.id.viewOne);
        Space spc2 =(Space)findViewById(R.id.spcVerification3);
        TextView txt3 = (TextView)findViewById(R.id.txThree);
        EditText edit1 = (EditText)findViewById(R.id.edtUserName);
        View view2 = (View)findViewById(R.id.viewTwo);
        Space spc3 =(Space)findViewById(R.id.spcVerification2);
        final Button btn1 = (Button)findViewById(R.id.btnSubmitVerification);

        LinearLayout.LayoutParams params1=(LinearLayout.LayoutParams)txt1.getLayoutParams();
        params1.width=(getResources().getDisplayMetrics().widthPixels/10)*8;
        params1.leftMargin=(getResources().getDisplayMetrics().widthPixels/20);
        params1.topMargin=(getResources().getDisplayMetrics().widthPixels/5);

        LinearLayout.LayoutParams params2=(LinearLayout.LayoutParams)txt2.getLayoutParams();
        params2.width=(getResources().getDisplayMetrics().widthPixels/10)*8;
        params2.leftMargin=(getResources().getDisplayMetrics().widthPixels/20);

        LinearLayout.LayoutParams params3=(LinearLayout.LayoutParams)view1.getLayoutParams();
        params3.width=(getResources().getDisplayMetrics().widthPixels/10)*8;
        params3.leftMargin=(getResources().getDisplayMetrics().widthPixels/20);

        LinearLayout.LayoutParams params4=(LinearLayout.LayoutParams)txt3.getLayoutParams();
        params4.width=(getResources().getDisplayMetrics().widthPixels/10)*8;
        params4.leftMargin=(getResources().getDisplayMetrics().widthPixels/20);

        LinearLayout.LayoutParams params5=(LinearLayout.LayoutParams)edit1.getLayoutParams();
        params5.width=(getResources().getDisplayMetrics().widthPixels/10)*8;
        params5.leftMargin=(getResources().getDisplayMetrics().widthPixels/20);

        LinearLayout.LayoutParams params6=(LinearLayout.LayoutParams)view2.getLayoutParams();
        params6.width=(getResources().getDisplayMetrics().widthPixels/10)*8;
        params6.leftMargin=(getResources().getDisplayMetrics().widthPixels/20);

        LinearLayout.LayoutParams params7=(LinearLayout.LayoutParams)btn1.getLayoutParams();
        params7.width=(getResources().getDisplayMetrics().widthPixels/10)*8;
        params7.leftMargin=(getResources().getDisplayMetrics().widthPixels/20);

        LinearLayout.LayoutParams params8=(LinearLayout.LayoutParams)spc1.getLayoutParams();
        params8.leftMargin=(getResources().getDisplayMetrics().widthPixels/200);
        params8.topMargin=(getResources().getDisplayMetrics().widthPixels/30);

        LinearLayout.LayoutParams params9=(LinearLayout.LayoutParams)spc2.getLayoutParams();
        params9.leftMargin=(getResources().getDisplayMetrics().widthPixels/20);
        params9.topMargin=(getResources().getDisplayMetrics().widthPixels/30);

        LinearLayout.LayoutParams params10=(LinearLayout.LayoutParams)spc3.getLayoutParams();
        params10.leftMargin=(getResources().getDisplayMetrics().widthPixels/20);
        params10.topMargin=(getResources().getDisplayMetrics().widthPixels/30);

        txt1.setLayoutParams(params1);
        txt2.setLayoutParams(params2);
        view1.setLayoutParams(params3);
        txt3.setLayoutParams(params4);
        edit1.setLayoutParams(params5);
        view2.setLayoutParams(params6);
        btn1.setLayoutParams(params7);
        spc1.setLayoutParams(params8);
        spc2.setLayoutParams(params9);
        spc3.setLayoutParams(params10);



        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Dialog dialog = new Dialog(Verification.this);
                dialog.setTitle("Successfull LogIn");
                dialog.setContentView(R.layout.dialog_one);//calling the layout of the dialog box
                dialog.show();

                TextView txtOne = (TextView)dialog.findViewById(R.id.txtDialogAgree);
                //Space space = (Space)dialog.findViewById(R.id.spcOne);
                Button btnOne = (Button)dialog.findViewById(R.id.btnAgree);

                btnOne.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                       // Toast.makeText(getApplicationContext(), "Welcome you", Toast.LENGTH_SHORT).show();
                        Intent i = new Intent(getApplicationContext(),Home.class);
                        startActivity(i);
                    }
                });

            }
        });



    }
    //to hide the keyboard
    public void hideKeyboard(View view) {
        InputMethodManager inputmethodmanager = (InputMethodManager) getSystemService(Activity.INPUT_METHOD_SERVICE);
        inputmethodmanager.hideSoftInputFromWindow(view.getWindowToken(),0);
    }
}
