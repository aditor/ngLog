package com.nglog.nglog_android;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.Spinner;

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



        Button searchButton = (Button) findViewById(R.id.search_button);
        searchButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //onSearchItem();
            }
        });

    }

   /* public void onClickSearchItem(View view) {
        final Dialog dialog = new Dialog(this);
        dialog.setContentView(R.layout.dialog_layout);
        nameInput = (EditText)dialog.findViewById(R.id.edit_name);
        final Spinner initialSpinner = (Spinner) dialog.findViewById(R.id.spinner_initial);

        final LinearLayout wholelist = (LinearLayout) findViewById(R.id.wholelist);

        button = (Button) findViewById(R.id.Adder);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Button OKbutton = (Button) dialog.findViewById(R.id.OK);
                OKbutton.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {

                        Item instance = new Item(nameInput.getText().toString(),
                                Integer.parseInt(initialSpinner.getSelectedItem().toString()),
                                Integer.parseInt(changeSpinner.getSelectedItem().toString()),
                                timeSpinner.getSelectedItem().toString(), Level.LOW);
                        inventoryList.add(instance);

                        wholelist.addView(createNewTextView(nameInput.getText().toString()));

                        Toast.makeText(getApplicationContext(), "Item has been added", Toast.LENGTH_SHORT).show();


                        dialog.dismiss();
                    }
                });

                dialog.show();
            }
        });
    }*/

    /*private TextView createNewTextView(String text) {
        final TextView textView = new TextView(this);
        textView.setText(text);
        return textView;
    }*/
}


