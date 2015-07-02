/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author TOP
 */
class hw1dad {

    public void dadprint() {
        System.out.println("hello world3");
    }
}

public class hw1 extends hw1dad {

    static void hw11() {
        System.out.print("hello world1\n");
    }

    public static void main(String args[]) {
        hw11();
        System.out.println("hello world2");

        hw1 son = new hw1();
        son.dadprint();



    }
}
