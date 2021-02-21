/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interpreter;

import java.util.ArrayList;
import java.util.Stack;

/**
 *
 * @author joelvalenzuela
 */
public class Parser {
    private ArrayList<Expression> parseTree = new ArrayList<Expression>(); // only one NonTerminal Expression here

   public Parser(String s) {
       for (String token : s.split(" ")) {
           if(token.equals("+")){
               parseTree.add( new TerminalExpression_Plus() );
           }
           else if (token.equals("-")){
               parseTree.add( new TerminalExpression_Minus() );
           }
           else{
               parseTree.add( new TerminalExpression_Number(Integer.valueOf(token)) );
           }
       }
   }

   public int evaluate() {
       Stack<Integer> context = new Stack<Integer>(); 
       for (Expression e : parseTree) e.interpret(context);
       return context.pop();
   }
}
