package com.megacalculator.controller;

import com.megacalculator.expression.EnumMathTypes;
import com.megacalculator.expression.Expression;
import com.megacalculator.implementations.Addition;
import com.megacalculator.implementations.Cos;
import com.megacalculator.implementations.Division;
import com.megacalculator.implementations.Eleve;
import com.megacalculator.implementations.Factoriel;
import com.megacalculator.implementations.Ln;
import com.megacalculator.implementations.Log;
import com.megacalculator.implementations.Multiplication;
import com.megacalculator.implementations.Racine;
import com.megacalculator.implementations.Scalaire;
import com.megacalculator.implementations.Sin;
import com.megacalculator.implementations.Soustraction;
import com.megacalculator.implementations.Tan;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

/**
 * @author mpgsa
 */
public class FabriquerExpression {

  // objets
  private final Stack<Expression> stack;
  private final List<String> ListInfix;
  private final List<String> ListPolonaise;
  // constructeur

  public FabriquerExpression() {
    this.stack = new Stack<>();
    this.ListInfix = new LinkedList<>();
    this.ListPolonaise = new LinkedList<>();
  }

  /**
   * @param str
   * @return
   */
  private Expression batirPolonaise(String str) {
    // Locals
    Expression resultat;
    Expression aRetourner;
    //
    try {
      double number = Double.parseDouble(str);
      aRetourner = new Scalaire(number);
      ListPolonaise.add(aRetourner.toPolonaise());
    } catch (NumberFormatException e) {
      if (EnumMathTypes.ADDITION.getSymbol().equals(str)) {
        resultat = new Addition(stack.pop(), stack.pop());
      } else if (EnumMathTypes.SOUTRACTION.getSymbol().equals(str)) {
        resultat = new Soustraction(stack.pop(), stack.pop());
      } else if (EnumMathTypes.MULTIPLICATION.getSymbol().equals(str)) {
        resultat = new Multiplication(stack.pop(), stack.pop());
      } else if (EnumMathTypes.DIVISION.getSymbol().equals(str)) {
        resultat = new Division(stack.pop(), stack.pop());
      } else if (EnumMathTypes.SIN.getSymbol().equals(str)) {
        resultat = new Sin(stack.pop());
      } else if (EnumMathTypes.COS.getSymbol().equals(str)) {
        resultat = new Cos(stack.pop());
      } else if (EnumMathTypes.TAN.getSymbol().equals(str)) {
        resultat = new Tan(stack.pop());
      } else if (EnumMathTypes.LN.getSymbol().equals(str)) {
        resultat = new Ln(stack.pop());
      } else if (EnumMathTypes.LOG.getSymbol().equals(str)) {
        resultat = new Log(stack.pop());
      } else if (EnumMathTypes.INV.getSymbol().equals(str)) {
        resultat = new Division(stack.pop(), new Scalaire(1));
      } else if (EnumMathTypes.CARRE.getSymbol().equals(str)) {
        resultat = new Multiplication(stack.peek(), stack.pop());
      } else if (EnumMathTypes.RACINE.getSymbol().equals(str)) {
        resultat = new Racine(stack.pop());
      } else if (EnumMathTypes.PI.getSymbol().equals(str)) {
        resultat = new Scalaire(Math.PI);
      } else if (EnumMathTypes.E.getSymbol().equals(str)) {
        resultat = new Scalaire(Math.E);
      } else if (EnumMathTypes.ELEVE.getSymbol().equals(str)) {
        resultat = new Eleve(stack.pop(), stack.pop());
      } else if (EnumMathTypes.FAC.getSymbol().equals(str)) {
        resultat = new Factoriel(stack.pop());
      } else {
        /* fonction exp */
        resultat = new Eleve(stack.pop(), new Scalaire(10));
      }
      ListInfix.add(resultat.toInfix());
      ListPolonaise.add(resultat.toPolonaise());
      aRetourner = new Scalaire(resultat.evaluer());
    }
    return aRetourner;
  }

  /**
   * @param entre
   * @throws java.lang.Exception
   */
  public double calculer(String entre) throws Exception {
    //Locals
    Expression expression;
    String[] recu = entre.split(" ");
    //
    if (!recu[0].equals(EnumMathTypes.MAT.getSymbol())) {
      for (String str : recu) {
        expression = batirPolonaise(str);
        stack.push(expression);
      }
      if (stack.size() == 1) {
        return stack.peek().evaluer();
      } else {
        throw new Exception();
      }
    } else {
      // matrix calculus
      return 1;
    }

  }

  public List<String> getListInfix() {
    return ListInfix;
  }

  public List<String> getListPolonaise() {
    return ListPolonaise;
  }

}
