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
public class Log implements Expression {
  // des Champs

  private Expression operande;
  // Constructeur

  public Log(Expression operande) {
    this.operande = operande;
  }

  public Log() {
    throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
  }

  @Override
  public double evaluer() {
    return Math.log10(operande.evaluer());
  }

  @Override
  public String toInfix() {
    return "log(" + operande.evaluer() + ")";
  }

  @Override
  public String toPolonaise() {
    return "log";
  }
}
