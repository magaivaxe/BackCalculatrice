package com.megacalculator.app;

import com.megacalculator.controller.FabriquerExpression;
import java.util.Iterator;
import java.util.List;

/**
 *
 * @author mpgsa
 */
public class Main {

  public static void main(String[] args) throws Exception {
    // Locaux
    String calculer = "π 9 *";
    //
    FabriquerExpression fe = new FabriquerExpression();
    System.out.println(fe.calculer(calculer));
    print(fe.getListPolonaise());
  }

  private static void print(List<String> list) {
    Iterator<String> i = list.iterator();
    while (i.hasNext()) {
      System.out.print(i.next());
    }
  }

}
