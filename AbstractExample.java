/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parth;

abstract class AbstractClass {
    private int a;
    private int b;

    public AbstractClass(int a, int b) {
        this.a = a;
        this.b = b;
        
    }
    
}

public class AbstractExample extends AbstractClass {
    int c; 
    public AbstractExample(int a, int b, int c) {
        super(a, b);
        this.c = c;
    }
    
}
