/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.megacalculator.controller.data;

/**
 *
 * @author marcosgomes
 */
public class MathTree extends TreeAbst {

  private Node root;

  private MathTree() {
    this.root = new Node();
    buildTree();
  }

  // Getters
  public Node getRoot() {
    return root;
  }

  // Singleton
  public static MathTree getInstance() {
    return MathtreeHolder.INSTANCE;
  }

  private static class MathtreeHolder {

    private static final MathTree INSTANCE = new MathTree();
  }
}
