package operations;

/**
 * @author mpgsa
 */
public class Multiplication implements Expression{
    // des Champs
    private Expression operandeA;
    private Expression operandeB;
    // Constructeur
    public Multiplication(Expression operandeA, Expression operandeB) {
        this.operandeA = operandeA;
        this.operandeB = operandeB;
    }
    
    @Override
    public double evaluer() {
        return operandeA.evaluer() * operandeB.evaluer();
    }

    @Override
    public String toInfix() {
        return "(" + operandeA.evaluer() + " * " + operandeB.evaluer() + ")";
    }

    @Override
    public String toPolonaise() {
        return "*";
    }
}
