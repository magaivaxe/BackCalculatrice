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
public class Scalaire implements Expression {
  // des Champs

  private double scalaire;
  // objets

  // Constructeur
  public Scalaire(double scalaire) {
    this.scalaire = scalaire;
  }

  public Scalaire() {
    throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
  }

  @Override
  public double evaluer() {
    return scalaire;
  }

  @Override
  public String toInfix() {
    String aRetourner = Double.toString(scalaire);
    return aRetourner;
  }

  @Override
  public String toPolonaise() {
    String aRetourner = Double.toString(scalaire);
    return aRetourner + " ";
  }
}
