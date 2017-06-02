package com.mode.single;

public class StaticInnerSingle {

    public static void main(String[] args) {
        // TODO Auto-generated method stub

    }
    
    private static class SingleHolder{
        private static StaticInnerSingle sis = new StaticInnerSingle();
    }
    
    private StaticInnerSingle(){}
    
    public StaticInnerSingle getInstance(){
        return SingleHolder.sis;
    }

}
