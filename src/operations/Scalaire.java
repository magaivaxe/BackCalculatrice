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
public class Scalaire implements Expression{
    // des Champs
    private double scalaire;
    // Méthodes
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

    public double getScalaire() {
        return scalaire;
    }

    public void setScalaire(double scalaire) {
        this.scalaire = scalaire;
    }
    
    
    
}
