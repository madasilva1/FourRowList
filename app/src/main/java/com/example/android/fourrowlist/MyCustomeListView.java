
package com.example.android.fourrowlist;
import android.app.Activity;
import android.app.ListActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.SimpleAdapter;

import com.example.android.fourrowlist.R;

import java.util.ArrayList;
import java.util.HashMap;

public class MyCustomeListView extends ListActivity {
    @Override
    protected void onCreate(Bundle saveInstanceState){
        super.onCreate(saveInstanceState);
        setContentView(R.layout.row_layout);
        SimpleAdapter adapter = new SimpleAdapter(
                this,
                list,
                R.layout.row_layout,
                new String[] {"pen","price","color"},
                new int[] {R.id.FirstText,R.id.SecondText, R.id.ThirthText,R.id.listRowTextView}

        );

        populateList();


        setListAdapter(adapter);
    }
    static final ArrayList<HashMap<String, String>> list =

            new ArrayList<HashMap<String, String>>();


    private void populateList() {
        HashMap<String,String> temp = new HashMap<String,String>();

        temp.put("pen","Mont Blanc");
        temp.put("price", "$200.00");
        temp.put("color", "Silver, Grey, Black");
        list.add(temp);
        HashMap<String,String> temp1 = new HashMap<String,String>();
        temp1.put("pen","Gucci");
        temp1.put("price", "300.00$");
        temp1.put("color", "Gold, Red");
        list.add(temp1);
        HashMap<String,String> temp2 = new HashMap<String,String>();
        temp2.put("pen","Parker");
        temp2.put("price", "400.00$");
        temp2.put("color", "Gold, Blue");
        list.add(temp2);
        HashMap<String,String> temp3 = new HashMap<String,String>();
        temp3.put("pen","Sailor");
        temp3.put("price", "500.00$");
        temp3.put("color", "Silver");
        list.add(temp3);
        HashMap<String,String> temp4 = new HashMap<String,String>();
        temp4.put("pen","Porsche Design");
        temp4.put("price", "600.00$");
        temp4.put("color", "Silver, Grey, Red");
        list.add(temp4);
    }
}