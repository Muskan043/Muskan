package org.example.statics;

public class BlackPen {
//non-static class
    String colour;
    String name;

    public void smoothness(){
        System.out.println("The pen is super smooth");
    }
    public void speed(){
        System.out.println(" The speed is good");
    }}
class dog{
    public static void main(String[] args) {
     BlackPen blackpen = new BlackPen();
     blackpen.smoothness();
     blackpen.speed();
        System.out.println(blackpen.name = "WRitoMeter");
        System.out.println(blackpen.colour = "black ");
    }
}
