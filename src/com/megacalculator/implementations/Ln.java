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
public class Ln implements Expression {
  // des Champs

  private Expression operande;
  // Constructeur

  public Ln(Expression operande) {
    this.operande = operande;
  }

  public Ln() {
    throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
  }

  @Override
  public double evaluer() {
    return Math.log(operande.evaluer());
  }

  @Override
  public String toInfix() {
    return "ln(" + operande.evaluer() + ")";
  }

  @Override
  public String toPolonaise() {
    return "ln";
  }
}
