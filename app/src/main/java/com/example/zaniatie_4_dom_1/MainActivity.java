package com.example.zaniatie_4_dom_1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Human dasha = new Human("Dasha", 0,30);

        Human oleg = new Human("Oleg", 0, 28);

        dasha.growUntilAge(88);

        int olegGrowToYears = 78;

        for (int i = oleg.age; i < olegGrowToYears; i++){
            if (i == 75) {
                oleg.changeName("Ivan");
            }
            oleg.growForYear();
        }


    }
}