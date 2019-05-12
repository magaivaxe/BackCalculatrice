package com.megacalculator.expression;

import com.megacalculator.implementations.Addition;
import com.megacalculator.implementations.Cos;
import com.megacalculator.implementations.Division;
import com.megacalculator.implementations.Eleve;
import com.megacalculator.implementations.Factoriel;
import com.megacalculator.implementations.Ln;
import com.megacalculator.implementations.Log;
import com.megacalculator.implementations.Matrice;
import com.megacalculator.implementations.Multiplication;
import com.megacalculator.implementations.Racine;
import com.megacalculator.implementations.Scalaire;
import com.megacalculator.implementations.Sin;
import com.megacalculator.implementations.Soustraction;
import com.megacalculator.implementations.Tan;

public enum EnumMathTypes {
  // Values
  ADDITION("+", "l", new Addition()),
  SOUTRACTION("-", "l,l", new Soustraction()),
  MULTIPLICATION("*", "l,l,l", new Multiplication()),
  DIVISION("/", "l,l,l,l", new Division()),
  SIN("sin", "", new Sin()),
  COS("cos", "", new Cos()),
  TAN("tan", "", new Tan()),
  LN("ln", "", new Ln()),
  LOG("log", "", new Log()),
  INV("1/", "", new Division()),
  CARRE("^2", "", new Multiplication()),
  RACINE("√", "", new Racine()),
  PI("π", "", new Scalaire()),
  E("e", "", new Scalaire()),
  ELEVE("^", "", new Eleve()),
  EXP("exp", "", new Eleve()),
  FAC("!", "", new Factoriel()),
  MAT("mat", "", new Matrice());

  // Fields
  private final String symbol;
  private final String treeLocation;
  private Expression exp;

  // Constructor
  private EnumMathTypes(String symbol, String treeLocation, Expression exp) {
    this.symbol = symbol;
    this.treeLocation = treeLocation;
    this.exp = exp;
  }

  // Getters
  public String getSymbol() {
    return this.symbol;
  }

  public String getTreeLocation() {
    return treeLocation;
  }

  public void setExp(Expression exp) {
    this.exp = exp;
  }

  public Expression getExp() {
    return exp;
  }

}
