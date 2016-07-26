package com.example.nikeru8.optionbar;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }



    //OptionMenu，ActionBar上面三個點點
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        menu.add(0, 2, Menu.NONE, " 首頁");
        menu.add(0, 3, Menu.NONE, "哈囉");
        return super.onCreateOptionsMenu(menu);
    }

    //OptionMenu按下之後的反應
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        switch (item.getItemId()) {
            case 2:
                Toast.makeText(MainActivity.this, "首頁", Toast.LENGTH_SHORT).show();
                break;
            case 3:
                Toast.makeText(MainActivity.this, "Hello", Toast.LENGTH_SHORT).show();
        }
        return super.onOptionsItemSelected(item);
    }



}
