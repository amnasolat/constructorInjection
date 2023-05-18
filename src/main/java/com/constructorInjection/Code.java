package com.constructorInjection;

public class Code {
    private int a;
    private int b;

    public Code(int a, int b) {
        this.a = a;
        this.b = b;
        System.out.println("integer constructor");
        System.out.println("value of a: "+this.a+",value of b: "+this.b);
    }
    public Code(double a, double b){
        this.a=(int) a;
        this.b=(int) b;
        System.out.println("double constructor");
    }

    public Code(String a, String b){
        this.a=Integer.parseInt(a);
        this.b=Integer.parseInt(b);
        System.out.println("String constructor");
    }
    public void doSum(){
        System.out.println("Sum is: "+(this.a+this.b));
    }
}
