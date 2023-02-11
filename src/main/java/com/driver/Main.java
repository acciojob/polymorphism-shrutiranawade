package com.driver;

public class Main {
    public static class Product{
        public int product(int x, int y) {
            //System.out.println(x*y);
            return x*y;
        }
        public int product(int x, int y,int z) {
            //System.out.println(x*y*z);
            return x*y*z;
        }
        public double product(double x, double y) {
           // System.out.println(x*y);
            return x*y;
        }
    }
    public static void main(String[]args){
        Product p = new Product();
        p.product(2,6);
        p.product(2.4,3.5);
        p.product(2,3,6);
    }

}