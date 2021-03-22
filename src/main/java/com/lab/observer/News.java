package com.lab.observer;

import java.util.ArrayList;

public class News implements Subject{
    // 動態陣列，用來得知目前的訂閱人數
    private ArrayList<Observer> list = new ArrayList<>();

    @Override
    public void add(Observer observer) {
        list.add(observer);
    }

    @Override
    public void remove(Observer observer) {
        list.remove(observer);
    }

    @Override
    public void notifyObserver(String data) {
        list.forEach(o -> o.update(data));
    }
    
}
