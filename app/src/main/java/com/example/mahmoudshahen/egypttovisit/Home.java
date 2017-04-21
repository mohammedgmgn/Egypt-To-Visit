package com.example.mahmoudshahen.egypttovisit;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;

public class Home extends AppCompatActivity {

    RecyclerView landmarks;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        landmarks = (RecyclerView) findViewById(R.id.rv_landmarks);
    }
}
