/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interpreter;

import java.util.Stack;

/**
 *
 * @author joelvalenzuela
 */
public class TerminalExpression_Minus implements Expression{
    @Override
    public void interpret(Stack<Integer> s)  { 
        int tmp = s.pop(); 
        s.push( s.pop() - tmp ); 
    }
}
