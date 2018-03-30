package com.example.jinadiwathsala.first;

import android.content.Intent;
import android.support.constraint.ConstraintLayout;
import android.graphics.Typeface;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.Space;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import com.weiwangcn.betterspinner.library.material.MaterialBetterSpinner;

/**
 * Created by Jinadi Wathsala on 11/9/2017.
 */

public class SignUp  extends AppCompatActivity {
    private EditText editUserName, editPhone, editNic, editPassword, editRePassword;
    private String userName, phone, nic, password, rePassword , date , month, year;
    private com.weiwangcn.betterspinner.library.material.MaterialBetterSpinner spnDate , spnMonth, spnYear;
    Button btn_resart, btn_submit;






    String[] SPRINGLIST = {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
    String[] SPRINGLIST1 = {"2012", "2011", "2010", "2009", "2008", "2007", "2006", "2005", "2004", "2003", "2002", "2001", "2000", "1999", "1998", "1997", "1996", "1995", "1994", "1993", "1992", "1991", "1990", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", ""};
    String[] SPRINGLIST0 = {"01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "26", "27", "28", "29", "30", "31"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.signup);



        ImageView imgsignup = (ImageView)findViewById(R.id.imgSignUp);
        EditText edti1 = (EditText)findViewById(R.id.edtUserName);
        View view1 =(View)findViewById(R.id.vw1);
        EditText edit2 = (EditText)findViewById(R.id.edtPhone);
        View view2 = (View)findViewById(R.id.vw2);
        EditText edit3 = (EditText)findViewById(R.id.edtNic);
        View view3 = (View)findViewById(R.id.vw3);
        TextView txtview1 = (TextView)findViewById(R.id.txtBirth);
        com.weiwangcn.betterspinner.library.material.MaterialBetterSpinner spn1 = (com.weiwangcn.betterspinner.library.material.MaterialBetterSpinner)findViewById(R.id.android_material_design_spinner0);
        com.weiwangcn.betterspinner.library.material.MaterialBetterSpinner spn2 = (com.weiwangcn.betterspinner.library.material.MaterialBetterSpinner)findViewById(R.id.android_material_design_spinner);
        com.weiwangcn.betterspinner.library.material.MaterialBetterSpinner spn3 = (com.weiwangcn.betterspinner.library.material.MaterialBetterSpinner)findViewById(R.id.android_material_design_spinner1);
        View view4 = (View)findViewById(R.id.vw4);
        EditText edit4 = (EditText)findViewById(R.id.edtPassword);
        View view5 = (View)findViewById(R.id.vw5);
        EditText edit5 = (EditText)findViewById(R.id.edtRePassword);
        View view6 = (View)findViewById(R.id.vw6);
        Space spce1 = (Space)findViewById(R.id.spcSigUp1);
        Button btn1 = (Button)findViewById(R.id.btnReset);
        Space spce2 = (Space)findViewById(R.id.spcHome);
        Button btn2 = (Button)findViewById(R.id.btnSubmitSignUp);
        ScrollView scrlview1 = (ScrollView)findViewById(R.id.scrlOne);
        Space spacesignup = (Space)findViewById(R.id.spcSignUp);
        Space spacesignup2 = (Space)findViewById(R.id.spcSigUp1);

        LinearLayout.LayoutParams params1=(LinearLayout.LayoutParams)scrlview1.getLayoutParams();
        params1.width=(getResources().getDisplayMetrics().widthPixels/10)*8;
        //params1.height=(getResources().getDisplayMetrics().heightPixels/14);
        params1.leftMargin=(getResources().getDisplayMetrics().widthPixels/20);
        //params1.rightMargin=(getResources().getDisplayMetrics().widthPixels/10);

        LinearLayout.LayoutParams params2=(LinearLayout.LayoutParams)spacesignup.getLayoutParams();
        params2.leftMargin=(getResources().getDisplayMetrics().widthPixels/10);
        params2.topMargin=(getResources().getDisplayMetrics().widthPixels/30);


        /*imgsignup.setLayoutParams(params1);
        edti1.setLayoutParams(params1);
        view1.setLayoutParams(params1);
        edit2.setLayoutParams(params1);
        view2.setLayoutParams(params1);
        edit3.setLayoutParams(params1);
        view3.setLayoutParams(params1);
        txtview1.setLayoutParams(params1);
        spn1.setLayoutParams(params1);
        spn2.setLayoutParams(params1);
        spn3.setLayoutParams(params1);
        view4.setLayoutParams(params1);
        edit4.setLayoutParams(params1);
        view5.setLayoutParams(params1);
        edit5.setLayoutParams(params1);
        view6.setLayoutParams(params1);
        spce1.setLayoutParams(params1);
        btn1.setLayoutParams(params1);
        spce2.setLayoutParams(params1);
        btn2.setLayoutParams(params1);*/
        scrlview1.setLayoutParams(params1);
        spacesignup.setLayoutParams(params2);
        spacesignup2.setLayoutParams(params2);

        editUserName = (EditText) findViewById(R.id.edtUserName);
        editPhone = (EditText) findViewById(R.id.edtPhone);
        editNic = (EditText) findViewById(R.id.edtNic);
        editPassword = (EditText) findViewById(R.id.edtPassword);
        editRePassword = (EditText) findViewById(R.id.edtRePassword);//create objects for spinners
        btn_submit = (Button) findViewById(R.id.btnSubmitSignUp);
        btn_resart = (Button) findViewById(R.id.btnReset);
        spnDate = (com.weiwangcn.betterspinner.library.material.MaterialBetterSpinner)findViewById(R.id.android_material_design_spinner0);
        spnMonth = (com.weiwangcn.betterspinner.library.material.MaterialBetterSpinner)findViewById(R.id.android_material_design_spinner);
        spnYear = (com.weiwangcn.betterspinner.library.material.MaterialBetterSpinner)findViewById(R.id.android_material_design_spinner1);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        /// Typeface typeface = Typeface.createFromAsset(getAssets(),"LHANDW.TTF");
        //TextView txtsignup = (TextView)findViewById(R.id.txtSignUp);
        //txtsignup.setTypeface(typeface);

        //To create the drop down list
        /*Spinner spndate = (Spinner)findViewById(R.id.spnDate);
        ArrayAdapter<String> myadapter = new ArrayAdapter<String>(SignUp.this,
                android.R.layout.simple_list_item_1,getResources().getStringArray(R.array.date));
                myadapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                spndate.setAdapter(myadapter);*/

        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this,
                android.R.layout.simple_dropdown_item_1line, SPRINGLIST);
        MaterialBetterSpinner betterSpinner = (MaterialBetterSpinner) findViewById(R.id.android_material_design_spinner);
        betterSpinner.setAdapter(arrayAdapter);

        ArrayAdapter<String> arrayAdapter1 = new ArrayAdapter<String>(this,
                android.R.layout.simple_dropdown_item_1line, SPRINGLIST1);
        MaterialBetterSpinner betterSpinner1 = (MaterialBetterSpinner) findViewById(R.id.android_material_design_spinner1);
        betterSpinner1.setAdapter(arrayAdapter1);

        ArrayAdapter<String> arrayAdapter0 = new ArrayAdapter<String>(this,
                android.R.layout.simple_dropdown_item_1line, SPRINGLIST0);
        MaterialBetterSpinner betterSpinner0 = (MaterialBetterSpinner) findViewById(R.id.android_material_design_spinner0);
        betterSpinner0.setAdapter(arrayAdapter0);


        btn_resart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(getIntent());
            }
        });

        btn_submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                register();

            }
        });


    }

    public void register() {
        initialize();
        if (!validation()) {
            Toast.makeText(this, "Sign Up has Failed", Toast.LENGTH_SHORT).show();
        } else {
            signUpSucces();
        }
    }

    public void signUpSucces(){
        //after inserting the correct inputs..
        Toast.makeText(this, "Sign Up successful", Toast.LENGTH_SHORT).show();
        btn_submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent b = new Intent(getApplicationContext(),Verification.class);
                startActivity(b);
            }
        });

    }


    public boolean  validation(){
        boolean valid = true;
        if(userName.isEmpty()||userName.length()>32){
            editUserName.setError("please Enter the Valid Name");
            valid = false;
        }
        if(phone.isEmpty()||phone.length()>10){
            editPhone.setError("please Enter the Valid Phone Number");
            valid = false;
        }

        if(nic.isEmpty()||nic.length()>9){
            editNic.setError("please Enter the Valid Phone NIC number");
            valid = false;
        }
        if(password.isEmpty()){
            editPassword.setError("please Enter the password between 8 and 16 characters");
            valid = false;
        }
       /* if(rePassword.isEmpty()||(password == rePassword)){
            Toast.makeText(this, "Password does not match", Toast.LENGTH_SHORT).show();
            valid = false;
        }*/
        if(date.isEmpty()){
            spnDate.setError("please fill this");
            valid = false;
        }

        if(month.isEmpty()){
            spnMonth.setError("please fill this");
            valid = false;
        }

        if(year.isEmpty()){
            spnYear.setError("please fill this");
            valid = false;
        }


        return valid;
    }

    public void initialize(){
        userName = editUserName.getText().toString().trim();
        phone = editPhone.getText().toString().trim();
        nic = editNic.getText().toString().trim();
        password = editPassword.toString().trim();
        rePassword = editRePassword.getText().toString().trim();
        date = spnDate.getText().toString().trim();
        month = spnMonth.getText().toString().trim();
        year = spnYear.getText().toString().trim();


    }
}
