/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.megacalculator.implementations;

import com.megacalculator.expression.Expression;

/**
 *
 * @author mpgsa
 */
public class Soustraction implements Expression {
  // des Champs

  private Expression operandeA;
  private Expression operandeB;
  //Constructeur

  public Soustraction(Expression operandeA, Expression operandeB) {
    this.operandeA = operandeA;
    this.operandeB = operandeB;
  }

  public Soustraction() {
  }

  @Override
  public double evaluer() {
    return operandeB.evaluer() - operandeA.evaluer();
  }

  @Override
  public String toInfix() {
    return "(" + operandeB.evaluer() + " - " + operandeA.evaluer() + ")";
  }

  @Override
  public String toPolonaise() {
    return "-";
  }
}
