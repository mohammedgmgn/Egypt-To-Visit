package com.example.mahmoudshahen.egypttovisit;

import android.content.Intent;
import android.support.design.widget.CollapsingToolbarLayout;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class DetailActivtiy extends AppCompatActivity {
ImageView mDetailCover;
    TextView mDetail;
    TextView mDscription;
FloatingActionButton mFloatingActionButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_activtiy);
        Toolbar toolbar=(Toolbar)findViewById(R.id.toolbar);
        mFloatingActionButton=(FloatingActionButton)findViewById(R.id.location_fab);
        setSupportActionBar(toolbar);
        mDetailCover=(ImageView)findViewById(R.id.image);
        mDetail=(TextView)findViewById(R.id.place_detail);
        mDetailCover.setImageResource(R.drawable.newaswan);
        mDscription=(TextView)findViewById(R.id.descriptionid);
        mDetail.setText("Egypt most tranquil town is Aswan, set upon the winding curves of the Nile. Backed by orange-hued dunes this is the perfect place to stop and unwind for a few days and soak up the chilled-out atmosphere. Take the river ferry across to Elephantine Island and stroll the colorful streets of the Nubian villages. Ride a camel to the desert monastery of St. Simeon on the East Bank. Or just drink endless cups of tea on one of the riverboat restaurants, while watching the lateen-sailed feluccas drift past. There are plenty of historic sites here and numerous temples nearby, but one of Aswan biggest highlights is simply kicking back and watching the river life go by");
        mFloatingActionButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(DetailActivtiy.this,"toast",Toast.LENGTH_SHORT).show();
            }
        });

    }

}
