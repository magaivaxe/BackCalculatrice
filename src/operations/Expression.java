/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package operations;

/**
 *
 * @author Marcos Gomes
 */
public interface Expression {
    //
    public double evaluer();
    public String toInfix();
    public String toPolonaise();
}
