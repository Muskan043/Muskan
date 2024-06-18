public class BluePen {
//static class
    static String colour ;
    static String name ;

    public static void smoothness(){
        System.out.println("The pen is super smooth");
    }
    public static void speed (){
        System.out.println(" The speed is good");

    }

    public static void main(String[] args) {
        System.out.println(BluePen.colour = "Blue");
        System.out.println(BluePen.name=" WRitoMeter");
        BluePen.smoothness();
        BluePen.speed();
    }
}
