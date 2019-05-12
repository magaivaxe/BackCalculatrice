/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.megacalculator.controller.data;

import com.megacalculator.expression.EnumMathTypes;
import com.megacalculator.expression.Expression;

/**
 *
 * @author marcosgomes
 */
public class Node {

  private EnumMathTypes mathSymbol;
  private Expression expression;
  private Node leftNode;
  private Node rightNode;

  Node() {
    this.mathSymbol = null;
    this.expression = null;
    this.leftNode = null;
    this.rightNode = null;
  }

  public EnumMathTypes getMathSymbol() {
    return mathSymbol;
  }

  public void setMathSymbol(EnumMathTypes mathSymbol) {
    this.mathSymbol = mathSymbol;
  }

  public Expression getExpression() {
    return expression;
  }

  public void setExpression(Expression expression) {
    this.expression = expression;
  }

  public Node getLeftNode() {
    return leftNode;
  }

  public void setLeftNode(Node leftNode) {
    this.leftNode = leftNode;
  }

  public Node getRightNode() {
    return rightNode;
  }

  public void setRightNode(Node rightNode) {
    this.rightNode = rightNode;
  }

}
