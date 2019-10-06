package com;

//Implement a singleton class and justify it by creating more than one object for it.
class SingletonDriver {
public static void main(String args[]) 
{ 
    // instantiating Singleton class with variable x 
    Singleton x = Singleton.getInstance(); 

    // instantiating Singleton class with variable y 
    Singleton y = Singleton.getInstance(); 

    // instantiating Singleton class with variable z 
    Singleton z = Singleton.getInstance(); 

    System.out.println("String from x : " + x.s); 
    System.out.println("String from y : " + y.s); 
    System.out.println("String from z : " + z.s); 
    System.out.println("\n"); 

}
} 
