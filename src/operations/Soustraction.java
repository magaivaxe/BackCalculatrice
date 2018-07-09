/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package operations;

/**
 *
 * @author mpgsa
 */
public class Soustraction implements Expression{
    // des Champs
    private Expression operandeA;
    private Expression operandeB;
    //Constructeur
    public Soustraction(Expression operandeA, Expression operandeB) {
        this.operandeA = operandeA;
        this.operandeB = operandeB;
    }
    
    
    @Override
    public double evaluer() {
        return operandeA.evaluer() - operandeB.evaluer();
    }

    @Override
    public String toInfix() {
        return "(" + operandeA.evaluer() + " - " + operandeB.evaluer() + ")";
    }

    @Override
    public String toPolonaise() {
        return "-";
    }
}
