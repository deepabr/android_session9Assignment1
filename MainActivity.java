package com.example.deepa.menuchangetextcolour;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;

import static android.R.attr.id;
import static com.example.deepa.menuchangetextcolour.R.id.redcolor;


public class MainActivity extends AppCompatActivity {
    TextView text;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        text=(TextView)findViewById(R.id.text);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {

        getMenuInflater().inflate(R.menu.mainmenu,menu);

        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId())
        {

            case redcolor:
                text.setTextColor(getResources().getColor(R.color.red));

                return true;


            case R.id.greencolor:
                text.setTextColor(getResources().getColor(R.color.green));
                return true;


            case R.id.blueolor:
                text.setTextColor(getResources().getColor(R.color.blue));
                return true;


            default:
                return super.onOptionsItemSelected(item);
        }
    }
}