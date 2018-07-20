
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
        // Locaux
        FabriquerExpression fe = new FabriquerExpression();
        //
        if (fe.getListInfix().isEmpty() ||
            fe.getListInfix().get(fe.getListInfix().size() - 1)
                    .equals(fe.ADDITION)) {
            return "(" + operandeA.evaluer() + " + " + operandeB.evaluer() + ")";
        }
        return "";
    }

    @Override
    public String toPolonaise() {
        return "+ ";
    }
}
