package com.concordia.cejv669.fragmentclass5;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class WelcomeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome);
        Intent i=getIntent();
        TextView info=findViewById(R.id.welcomText);
        info.setText(i.getStringExtra("uname").toString());
    }
}
