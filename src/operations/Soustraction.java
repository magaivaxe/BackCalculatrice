/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package operations;

/**
 *
 * @author mpgsa
 */
public class Soustraction implements Expression{
    // des Champs
    private Expression operandeA;
    private Expression operandeB;
    
    @Override
    public double evaluer() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String toInfix() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String toPolonaise() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public Expression getOperandeA() {
        return operandeA;
    }

    public void setOperandeA(Expression operandeA) {
        this.operandeA = operandeA;
    }

    public Expression getOperandeB() {
        return operandeB;
    }

    public void setOperandeB(Expression operandeB) {
        this.operandeB = operandeB;
    }
    
    
    
}
