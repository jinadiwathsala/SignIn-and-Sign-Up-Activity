package com.example.jinadiwathsala.first;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Toolbar;

import java.util.ArrayList;

//import com.miguelcatalan.materialsearchview.MaterialSearchView;

/**
 * Created by Jinadi Wathsala on 11/17/2017.
 */

public class Home extends AppCompatActivity {

    EditText editsearch;
    ListView listView;
    private  ArrayList<String> mItems;
    Button btn1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.home);

        editsearch = (EditText)findViewById(R.id.editText1);
        listView = (ListView)findViewById(R.id.listView1);
        btn1 =(Button)findViewById(R.id.btnHomeSihnIn);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(getApplicationContext(),Map.class);
                startActivity(i);
            }
        });

        mItems = new ArrayList<String>();
        mItems.add("Rathnapura");
        mItems.add("Avissawella");
        mItems.add("Eheliyagoda");
        mItems.add("Colombo");
        mItems.add("Gampaha");
        mItems.add("Mathara");
        mItems.add("Galle");
        mItems.add("Kandy");

        listView.setAdapter(new CustomeArrayAdapter(Home.this,mItems));////////////

        editsearch.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                ArrayList<String> temp = new ArrayList<String>();
                int textlength = editsearch.getText().length();
                temp.clear();
                for(int i = 0 ; i < mItems.size(); i++){
                    if(textlength <= mItems.get(i).length()){
                        if(editsearch.getText().toString().equalsIgnoreCase(
                                (String)
                                mItems.get(i).subSequence(0,textlength)))
                        {
                            temp.add(mItems.get(i));
                        }
                    }
                }
                listView.setAdapter(new CustomeArrayAdapter(Home.this,temp));

            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });




    }
}

