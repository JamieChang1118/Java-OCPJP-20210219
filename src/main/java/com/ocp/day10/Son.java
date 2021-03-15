package com.ocp.day10;


public class Son extends Father{
    // 因為 Son 繼承 Father 所以 Father 物件會先被建立，然後 Son 物件才被建立
    public Son() {
        // super();  因為這裡有一個隱含的 super()
        System.out.println("兒子被建立");
    }
    
    
    @Override
    public void hobby() {
        //super.hobby();
        System.out.println("LoL");  // Son 自己的興趣
    }

           
}
