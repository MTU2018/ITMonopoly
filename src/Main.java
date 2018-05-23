public class Main {
    public static void main(String[] args)  {
        System.out.println("Hello world");
        int number = 777;
        System.out.println(number);
        int  v = 2000;
        double p =  v;
        int v1 = 1;
        int v2 = 2;
        int t = 1;
        int s = (v1*t)-(v2*t);
        if(s<0)s=-1*s;
        System.out.println(s);
        int x = 0;
        int z = x;
        if (x>0) z=x*1; else System.out.println(z);
        if (x<0) z=x*-1; else System.out.println(z);
        if (x==0){z=10;System.out.println(z);} else {System.out.println(z=z);}

    }
}