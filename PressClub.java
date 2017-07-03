package com.example.hp.clubsofda_iict;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

/**
 * Created by HP on 11-04-2016.
 */
public class PressClub extends AppCompatActivity
{@Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.pressclub);
        Button b = (Button)findViewById(R.id.pressInfo);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(PressClub.this,PressInfo.class);
                startActivity(i);
            }
        });
        Button b1 = (Button)findViewById(R.id.contact);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i1=new Intent(PressClub.this,PressContact.class);
                startActivity(i1);
            }
        });

       Button b2=(Button)findViewById(R.id.gallery);
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i2=new Intent(PressClub.this,PressGallery.class);
                startActivity(i2);
            }
        });

    }
}
