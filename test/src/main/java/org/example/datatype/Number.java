public class Number {
    int i;
    double j;
    float k;

    public void sum(int a ,int b ,int c){
         i = a+b+c;
        System.out.println(i);

    }
    public void multiply(double a,double b,double c){
         j = a*b*c;
        System.out.println(j);
    }
    public void substract(float a , float b, float c ){
        k =  a-b-c;
        System.out.println(k);
    }

    public static void main(String[] args) {
        Number number = new Number ();
        number.sum(5,6,8);
        number.multiply(13.2,10.1,12.3);
        number.substract(1.5f,0.2f,0.5f);
    }
}
