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
public class Tan implements Expression{
    // des Champs
    private Expression operande;
    // Constructeur
    public Tan(Expression operande) {this.operande = operande;}
    
    @Override
    public double evaluer() {return Math.tan(operande.evaluer());}

    @Override
    public String toInfix() {return "tan(" + operande.evaluer() + ")";}

    @Override
    public String toPolonaise() {return "tan";}
}
