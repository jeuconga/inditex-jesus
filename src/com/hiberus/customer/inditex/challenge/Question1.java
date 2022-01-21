package com.hiberus.customer.inditex.challenge;

//Answer: compiler error.
//If a method is declared as final, it is not possible to override it.
class Base {
    //final public void show() {
        public void show() {
        System.out.println("Base: Base::show()");
    }
}
class Derived extends Base {
    public void show() {
        System.out.println("Derived::show() called");
    }
}
class Main {
    public static void main(String[] args) {
        Base b = new Derived();
        b.show();
    }

}
