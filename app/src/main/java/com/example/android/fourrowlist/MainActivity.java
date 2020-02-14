package com.example.android.fourrowlist;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
       Button button = (Button)findViewById(R.id.enter_button);



        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(), "SimpleButton", Toast.LENGTH_LONG).show();
                Intent listIntent = new Intent(MainActivity.this, MyCustomeListView.class);
                startActivity(listIntent);
            }
        });


    }
}
