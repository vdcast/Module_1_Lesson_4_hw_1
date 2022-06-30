package com.example.zaniatie_4_dom_1;

import android.util.Log;

public class Human {

    public String name;
    public int age;
    public double height;

    public Human(String name, int age, double height){
        this.name = name;
        this.age = age;
        this.height = height;
    }

    public void growForYear(){
        age++;
        if (age <= 12) height +=8;
        else if ((age > 12) && (age <= 25)) height += 3;
        else if (age > 60) height -= 2;
        Log.d("MYLOG", name + " age: " + age + ", height:  " + height);
    }

    public void growUntilAge(int years){
        for (int i = age; i < years; i++){
            growForYear();
        }
    }

    public void changeName(String newName){
        String oldName = name;
        name = newName;
        Log.d("MYLOG", oldName + ", changed name to: " + name);
    }

}
