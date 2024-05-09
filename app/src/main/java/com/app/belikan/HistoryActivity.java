package com.app.belikan;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class HistoryActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_history);

        BottomNavigationView bottomNavigation = findViewById(R.id.bottom_navigation);
        bottomNavigation.setSelectedItemId(R.id.page_3);



        ImageView imageView10 = findViewById(R.id.imageView10);
        imageView10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onBackPressed();
            }
        });

        bottomNavigation.setOnNavigationItemSelectedListener(item -> {
            int itemId = item.getItemId();
            if (itemId == R.id.page_1) {
                Intent intent1 = new Intent(HistoryActivity.this, MainActivity.class);
                startActivity(intent1);
                return true;
            } else if (itemId == R.id.page_2) {
                Intent intent3 = new Intent(HistoryActivity.this, FavoriteActivity.class);
                startActivity(intent3);
                return true;
            } else if (itemId == R.id.page_3) {

                return true;
            } else if (itemId == R.id.page_4) {

                return true;
            } else {
                return false;
            }
        });

    }
}
