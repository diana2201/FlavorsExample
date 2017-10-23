package com.example.codescrum.moviesexample;

import android.content.res.Resources;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView txt_env;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txt_env = (TextView) findViewById(R.id.txt_env);

        Resources res = getResources();

        txt_env.setText(res.getString(R.string.env_name));
    }
}
