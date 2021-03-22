package com.ocp.day12;

public class Army {
    public static void main(String[] args) {
        Truck truck = new Truck();
        Tank tank = new Tank();
        Fight fight = new Fight();
              
        truck.move();
        tank.move();
        tank.shoot();
        fight.shoot();
    }
    
}
