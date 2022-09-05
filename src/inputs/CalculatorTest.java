/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inputs;

import classes.Calculator;
import java.util.Scanner;

/**
 *
 * @author DERRICK
 */
public class CalculatorTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner keyboard=new Scanner(System.in);
        
        try{
            System.out.println("Enter operand 1");
            // Task 1: add code here
            int op1=keyboard.nextInt();

            System.out.println("Enter operand 2");
            // Task 1: add code here
            int op2=keyboard.nextInt();
            
            Calculator calculator = new Calculator();
            
            
            // Task 2: add code here
            
            
            // Task 4: add code here
            
        }
        catch(// Task 5: add code here){
            System.out.println("Invalid number, re-enter a valid number");
        }
    }
    
}
