/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.megacalculator.implementations;

import com.megacalculator.expression.Expression;

/**
 *
 * @author sire_marcos
 */
public class Factoriel implements Expression{
    // des Champs
    private Expression operande;
    // Constructeur
    public Factoriel(Expression operande) {
        this.operande = operande;
    }
    
    /**
     * @param n
     * @return 
     */
    private double factorielle(double n){
        //
        if(n <= 1){ return n; }
        return n * factorielle(n - 1);
    }
    
    @Override
    public double evaluer() { return factorielle(operande.evaluer()); }

    @Override
    public String toInfix() {
        return "!";
    }

    @Override
    public String toPolonaise() {
        return "!";
    }
}
