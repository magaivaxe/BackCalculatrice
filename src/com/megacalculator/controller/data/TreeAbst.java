/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.megacalculator.controller.data;

import com.megacalculator.expression.EnumMathTypes;

/**
 *
 * @author marcosgomes
 */
abstract class TreeAbst {

  final void buildTree() {
    EnumMathTypes[] values = EnumMathTypes.values();
    for (EnumMathTypes value : values) {
      String location = value.getTreeLocation();
      String symbol = value.getSymbol();
      addNodes(location, symbol);
    }
  }

  private void addNodes(String location, String symbol) {

  }
}
