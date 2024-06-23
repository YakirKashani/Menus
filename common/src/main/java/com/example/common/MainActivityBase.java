package com.example.common;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.google.android.material.imageview.ShapeableImageView;
import com.google.android.material.textview.MaterialTextView;

public class MainActivityBase extends AppCompatActivity {

    protected DataManagerBase dataManager;
    private RecyclerView main_RV_Menu;
    private MenuAdapter menuAdapter;
    private ShapeableImageView main_SIV_Logo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
//        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
//            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
//            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
//            return insets;
//        });

        findViews();
        initViews();
    }

    private void findViews() {
        main_RV_Menu = findViewById(R.id.main_RV_Menu);
        main_SIV_Logo = findViewById(R.id.main_SIV_Logo);
    }
    private void initViews() {

        menuAdapter = new MenuAdapter(this,dataManager.getMenuItems());
        GridLayoutManager gridLayoutManager = new GridLayoutManager(this,2);
        main_RV_Menu.setLayoutManager(gridLayoutManager);
        main_RV_Menu.setAdapter(menuAdapter);


    }


}