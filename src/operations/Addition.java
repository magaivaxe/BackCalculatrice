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
public class Addition implements Expression{
    // des Champs
    private Expression operandeA;
    private Expression operandeB;
    //Constructeur
    public Addition(Expression operandeA, Expression operandeB) {
        this.operandeA = operandeA;
        this.operandeB = operandeB; 
    }

    @Override
    public double evaluer() {
        return operandeA.evaluer() + operandeB.evaluer();
    }

    @Override
    public String toInfix() {
        //refaire pour les conditions de retour
        return "(" + operandeA.evaluer() + " + " + operandeB.evaluer() + ")";
    }

    @Override
    public String toPolonaise() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    public void atester(){
        
    }
}
