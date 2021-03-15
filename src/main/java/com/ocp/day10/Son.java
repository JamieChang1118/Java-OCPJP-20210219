package com.ocp.day10;


public class Son extends Father{
    // 因為 Son 繼承 Father 所以 Father 物件會先被建立，然後 Son 物件才被建立
    public Son() {
        System.out.println("兒子被建立");
    }
    
    
    @Override
    public void hobby() {
        //super.hobby();
        System.out.println("LoL");
    }

           
}
