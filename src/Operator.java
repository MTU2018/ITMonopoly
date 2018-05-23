public class Operator {
    public static void main (String [] args){
    int a = 1;
    int b = 2;
    int c = a/b;
    double x = a/b;
    int v = a+b;
    int r = a-b;
    int e = a*b;
    int k = ++a + b;
    int j = a++ + b;
        System.out.println(c);
        System.out.println(x);
        System.out.println(v);
        System.out.println(r);
        System.out.println(e);
        System.out.println(k);
        System.out.println(j);

        int a1 = 3;
        int b1 = 4;
        int c1 = 5;
        int x1 = (a1 + (b1*2))/c1;
        System.out.println(x1);

        boolean boolValue;
        int a2 = 20;
        int b2 = -30;
        System.out.println (a2 > b2);
        System.out.println (a2 < b2);
        System.out.println (a2 >= b2);
        System.out.println (a2 <= b2);
        System.out.println (a2 == b2);
        System.out.println (a2 != b2);

        boolean b4 = a2 > 0 && b2 > 0;
        System.out.println (b4);
        boolean b5 = a2 > 0 && (b2 > 0 || b2 < -50) ^ (b2*5 > 7);
        System.out.println (b5);
        boolean b6 = a2 > 0 & ++b2 > 0 ;
        System.out.println (b5);

            }
}
