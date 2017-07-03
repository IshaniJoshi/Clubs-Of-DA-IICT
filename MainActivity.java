package com.example.hp.clubsofda_iict;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        String[] details={"Programming Club","DA theatre Group","Music Club","Press Club","HeadRush","Radio DA-IICT","Sambhav"};
        ArrayAdapter<String> adapter=new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,details);
        ListView list =(ListView) findViewById(R.id.listView);
        list.setAdapter(adapter);
        list.setOnItemClickListener((new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(MainActivity.this,"You clicked"+position,Toast.LENGTH_LONG).show();
                switch(position)
                {
                    case 0:
                        Intent i = new Intent(MainActivity.this,ProgrammingClub.class);
                        startActivity(i);
                        break;
                    case 1:
                        Intent i1=new Intent(MainActivity.this,dtg.class);
                        startActivity(i1);
                        break;
                    case 2:
                        Intent i2=new Intent(MainActivity.this,MusicClub2.class);
                        startActivity(i2);
                        break;
                    case 3:
                        Intent i3=new Intent(MainActivity.this,PressClub.class);
                        startActivity(i3);
                        break;
                    case 4:
                        Intent i4=new Intent(MainActivity.this,HeadRush.class);
                        startActivity(i4);
                        break;
                    case 5:
                        Intent i5 = new Intent(MainActivity.this,radioClub.class);
                        startActivity(i5);
                        break;
                    case 6:
                        Intent i6 = new Intent(MainActivity.this,Sambhav.class);
                        startActivity(i6);
                        break;


                }
            }
        }));







        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}