/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exceptionsubclassesbeforesuperclass;

/**
 * Program to explain that, when we use multiple catch statements, it is important
 * to remember that exception subclasses must come before any of their superclasses
 * @author tiago.lucas
 */
public class ExceptionSubClassesBeforeSuperClass {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        try{
            int a=0;
            int b=10/a;
        }
        catch(Exception e){
            System.out.println("Generic Exception catch");
        }
        /*catch(ArithmeticException e){
            //Error unreachable code
            System.out.println("This is never reached");
        }*/
    }
    
}
