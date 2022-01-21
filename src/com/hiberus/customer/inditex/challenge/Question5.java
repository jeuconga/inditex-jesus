package com.hiberus.customer.inditex.challenge;
//Answer: A
/**
 * Copy constructor called
 * (10.0  15.0i)
 */
final class Complex {
    private double re, im;
    public Complex(double re, double im) {
        this.re = re;
        this.im = im;
    }
    Complex(Complex c){
        System.out.println("Copy constructor called");
        re = c.re;
        im = c.im;
    }

    public String toString() {
        return "(" + re + " " + " " + im + "i)";
    }
}
public class Question5 {
    public static void main(String [] args) {
        Complex c1 = new Complex(10, 15);
        Complex c2 = new Complex(c1);
        Complex c3 = c1;
        System.out.println(c2);
    }
}
