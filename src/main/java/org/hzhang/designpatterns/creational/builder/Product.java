package org.hzhang.designpatterns.creational.builder;

/**
 * Created by Zhang Huan on 13/03/2018.
 */
public class Product {
    private String A;
    private String B;
    private String C;

    public void Show() {
        System.out.println(A + " " + B + " " + C);
    }

    public String getA() {
        return A;
    }

    public void setA(String a) {
        A = a;
    }

    public String getB() {
        return B;
    }

    public void setB(String b) {
        B = b;
    }

    public String getC() {
        return C;
    }

    public void setC(String c) {
        C = c;
    }
}
