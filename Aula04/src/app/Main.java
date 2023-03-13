package app;

import entities.Triangulo;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("digite três lados: ");
        Scanner sc =new Scanner(System.in);
        double ladoA=sc.nextDouble();
        double ladoB=sc.nextDouble();
        double ladoC=sc.nextDouble();

        Triangulo t1 = new Triangulo(ladoA,ladoB,ladoC);
        Triangulo t2 = new Triangulo(8,10,14.5);

        double areaT1= t1.calcularArea();
        double areaT2= t2.calcularArea();
        System.out.println("area t1: "+areaT1);
        System.out.println("area t1: "+areaT2);




//        t1.a=5.0;
//        t1.b=7.0;
//        t1.c=10.0;
//        double p =(t1.a+t1.b+t1.c)/2;
//        double area = Math.sqrt(p*(p-t1.a)*(p-t1.b)*(p-t1.c));
//        System.out.println("Area de P: "+area);
    }
}
