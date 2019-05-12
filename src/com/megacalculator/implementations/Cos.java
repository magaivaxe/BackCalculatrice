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
public class Cos implements Expression {
  // des Champs

  private Expression operande;
  // Constructeur

  public Cos(Expression operande) {
    this.operande = operande;
  }

  public Cos() {
  }

  @Override
  public double evaluer() {
    return Math.cos(operande.evaluer());
  }

  @Override
  public String toInfix() {
    return "cos(" + operande.evaluer() + ")";
  }

  @Override
  public String toPolonaise() {
    return "cos";
  }
}
