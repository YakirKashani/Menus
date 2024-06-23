package com.example.pizzamenu;

import com.example.common.DataManagerBase;
import com.example.common.MenuItem;

import java.util.ArrayList;

public class DataManager extends DataManagerBase {
    @Override
    public ArrayList<MenuItem> getMenuItems() {
        ArrayList<MenuItem> MenuItems = new ArrayList<>();
        MenuItems.add(new MenuItem()
                .setName("Olives Pizza")
                .setImageUrl("https://upload.wikimedia.org/wikipedia/commons/9/91/Pizza-3007395.jpg"));

        MenuItems.add(new MenuItem()
                .setName("Margherita Pizza")
                .setImageUrl("https://upload.wikimedia.org/wikipedia/commons/c/c8/Pizza_Margherita_stu_spivack.jpg"));

        MenuItems.add(new MenuItem()
                .setName("Lemon and Pea Rissoto")
                .setImageUrl("https://upload.wikimedia.org/wikipedia/commons/2/2b/Lemon_Pea_Risotto.jpg"));

        MenuItems.add(new MenuItem()
                .setName("Tomato Pasta")
                .setImageUrl("https://upload.wikimedia.org/wikipedia/commons/9/9d/Bucatini_allamatriciana.jpg"));

        MenuItems.add(new MenuItem()
                .setName("Spaghetti alla carbonara")
                .setImageUrl("https://upload.wikimedia.org/wikipedia/commons/3/33/Espaguetis_carbonara.jpg"));

        MenuItems.add(new MenuItem()
                .setName("Esspresso")
                .setImageUrl("https://upload.wikimedia.org/wikipedia/commons/f/f7/Linea_doubleespresso.jpg"));

        MenuItems.add(new MenuItem()
                .setName("Extra Cheese Pizza")
                .setImageUrl("https://upload.wikimedia.org/wikipedia/commons/d/d3/Supreme_pizza.jpg"));

        MenuItems.add(new MenuItem()
                .setName("Panna cotta")
                .setImageUrl("https://upload.wikimedia.org/wikipedia/commons/1/1a/Croatia_Panna_Cotta_2012_roberta_f.jpg"));

        MenuItems.add(new MenuItem()
                .setName("Tiramisu")
                .setImageUrl("https://upload.wikimedia.org/wikipedia/commons/5/58/Tiramisu_-_Raffaele_Diomede.jpg"));

        MenuItems.add(new MenuItem()
                .setName("vanilla ice cream")
                .setImageUrl("https://upload.wikimedia.org/wikipedia/commons/2/2e/Ice_cream_with_whipped_cream%2C_chocolate_syrup%2C_and_a_wafer_%28cropped%29.jpg"));

        return MenuItems;
    }

}
