package com.nglog.nglog_android;

import android.app.ActionBar;
import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.Spinner;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Adi on 2016-09-24.
 */
public class SearchActivity extends AppCompatActivity {
    final List<String> searchList = new ArrayList<String>();   //list of serialnumbers/Location

    private Button searchbutton;

    private Context context = this;

        @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search);

         Toolbar my_toolbar = (Toolbar) findViewById(R.id.my_toolbar);
         setSupportActionBar(my_toolbar);
         getSupportActionBar().setTitle(R.string.my_tb_title);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {

        getMenuInflater().inflate(R.menu.main_menu, menu);

        return super.onCreateOptionsMenu(menu);
    }


}


