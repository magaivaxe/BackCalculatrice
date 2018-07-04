/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package operations;

import java.util.Stack;
import java.util.stream.DoubleStream;

/**
 *
 * @author mpgsa
 */
public class FabriquerExpression {
    // champs
    private final String ADDITION = "+";
    private final String SOUTRACTION = "-";
    private final String MULTIPLICATION = "*";
    private final String DIVISION = "/";
    // objets
    public static Stack<Expression> stack = new Stack<>();
    // constructeur
    public FabriquerExpression() {
    }
    
    // Methods
    private Expression batirPolonaise(String str) {
        // Locaux
        Expression resultat;
        Expression aRetourner;
        // Essaye de faire le parse sinon il fait une opération
        try {
            double number = Double.parseDouble(str);
            aRetourner = new Scalaire(number);
        } catch (Exception e) {
            if (ADDITION.equals(str)) {
                resultat = new Addition(stack.pop(), stack.pop());
            } else if (SOUTRACTION.equals(str)) {
                resultat = new Soustraction(stack.pop(), stack.pop());
            } else if (MULTIPLICATION.equals(str)) {
                resultat = new Multiplication(stack.pop(), stack.pop());
            } else {
                resultat = new Division(stack.pop(), stack.pop());
            }
            aRetourner = new Scalaire(resultat.evaluer());
        }
        return aRetourner;
    }
    public void remplirPile(String entre){
        //Locaux
        String [] recu = entre.split("");
        Expression expression;
        //
        for (String str : recu) {
            expression = batirPolonaise(str);
            stack.push(expression);
        }
    }
}
