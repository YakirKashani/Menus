package com.example.burger_menu;

import com.example.common.DataManagerBase;
import com.example.common.MenuItem;

import java.util.ArrayList;

public class DataManager extends DataManagerBase {
    @Override
    public ArrayList<MenuItem> getMenuItems() {
        ArrayList<MenuItem> MenuItems = new ArrayList<>();
        MenuItems.add(new MenuItem()
                .setName("Double burger")
                .setImageUrl("https://upload.wikimedia.org/wikipedia/commons/7/71/McD_Big_Mac.jpg"));

        MenuItems.add(new MenuItem()
                .setName("Burger and fries")
                .setImageUrl("https://upload.wikimedia.org/wikipedia/commons/4/4a/Impossible_Burger_-_Gott%27s_Roadside-_2018_-_Stierch.jpg"));

        MenuItems.add(new MenuItem()
                .setName("Rice Burger")
                .setImageUrl("https://upload.wikimedia.org/wikipedia/commons/3/34/MOS_Kaisen01.JPG"));

        MenuItems.add(new MenuItem()
                .setName("Danish Burger")
                .setImageUrl("https://upload.wikimedia.org/wikipedia/commons/6/65/Danish_Beef_Sandwich.JPG"));

        MenuItems.add(new MenuItem()
                .setName("Korean Burger")
                .setImageUrl("https://upload.wikimedia.org/wikipedia/commons/4/4c/Bulgogi_burger_2.jpg"));

        MenuItems.add(new MenuItem()
                .setName("Indian Burger")
                .setImageUrl("https://upload.wikimedia.org/wikipedia/commons/4/40/Jumbo_Vada_Pav_%28dodged%29.jpg"));

        MenuItems.add(new MenuItem()
                .setName("Beef Burger with Egg")
                .setImageUrl("https://upload.wikimedia.org/wikipedia/commons/0/05/Beef_Burger_In_Kota_Kinabalu%2C_Malaysia.jpg"));

        MenuItems.add(new MenuItem()
                .setName("Kriek beer")
                .setImageUrl("https://upload.wikimedia.org/wikipedia/commons/6/60/Kriek_Beer_1.jpg"));

        MenuItems.add(new MenuItem()
                .setName("Coca Cola")
                .setImageUrl("https://upload.wikimedia.org/wikipedia/commons/e/e8/15-09-26-RalfR-WLC-0098_-_Coca-Cola_glass_bottle_%28Germany%29.jpg"));

        return MenuItems;
    }
}
