package operations;

import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

/**
 * @author mpgsa
 */
public class FabriquerExpression {
    // champs
    final String ADDITION = "+";
    final String SOUTRACTION = "-";
    final String MULTIPLICATION = "*";
    final String DIVISION = "/";
    final String SIN = "sin";
    final String COS = "cos";
    final String TAN = "tan";
    final String LN = "ln";
    final String LOG = "log";
    final String INV = "1/";
    final String CARRE = "^2";
    final String RACINE = "√";
    final String PI = "π";
    final String E = "e";
    final String ELEVE = "^";
    final String EXP = "exp";
    
    private boolean estPolonaise = false;
    // objets
    private Stack<Expression> stack = new Stack<>();
    private List<String> ListInfix = new LinkedList();
    private List<String> ListPolonaise = new LinkedList();
    // constructeur
    public FabriquerExpression() {}
    
    /**
     * @param str
     * @return 
     */
    private Expression batirPolonaise(String str){
        // Locaux
        Expression resultat;
        Expression aRetourner;
        //
        try {
            double number = Double.parseDouble(str);
            aRetourner = new Scalaire(number);
            ListPolonaise.add(aRetourner.toPolonaise());
        } catch (NumberFormatException e) {
            if (ADDITION.equals(str)) {
                resultat = new Addition(stack.pop(), stack.pop());
            } else if (SOUTRACTION.equals(str)) {
                resultat = new Soustraction(stack.pop(), stack.pop());
            } else if (MULTIPLICATION.equals(str)) {
                resultat = new Multiplication(stack.pop(), stack.pop());
            } else if (DIVISION.equals(str)){
                resultat = new Division(stack.pop(), stack.pop());
            } else if (SIN.equals(str)) {
                resultat = new Sin(stack.pop());
            } else if (COS.equals(str)) {
                resultat = new Cos(stack.pop());
            } else if (TAN.equals(str)) {
                resultat = new Tan(stack.pop());
            } else if (LN.equals(str)) {
                resultat = new Ln(stack.pop());
            } else if (LOG.equals(str)) {
                resultat = new Log(stack.pop());
            } else if (INV.equals(str)) {
                resultat = new Division(stack.pop(),new Scalaire(1));
            } else if (CARRE.equals(str)) {
                resultat = new Multiplication(stack.peek(),stack.pop());
            } else if (RACINE.equals(str)) {
                resultat = new Racine(stack.pop());
            } else if (PI.equals(str)) {
                resultat = new Scalaire(Math.PI);
            } else if (E.equals(str)) {
                resultat = new Scalaire(Math.E);
            } else if (ELEVE.equals(str)) {
                resultat = new Eleve(stack.pop(),stack.pop());
            }else{
                resultat = new Eleve(new Scalaire(10), stack.pop());
            }
            ListInfix.add(resultat.toInfix());
            ListPolonaise.add(resultat.toPolonaise());
            aRetourner = new Scalaire(resultat.evaluer());
        }
        return aRetourner;
    }
    
    /**
     * @param entre
     * @throws java.lang.Exception
     */
    public double calculer(String entre) throws Exception{
        //Locaux
        Expression expression;
        String [] recu = entre.split(" ");
        //
        for (String str : recu){
            expression = batirPolonaise(str);
            stack.push(expression);
        }
        if (stack.size() == 1) {
            return stack.peek().evaluer();
        } else {
            throw new Exception();
        }
    }
    
    public List<String> getListInfix() {
        return ListInfix;
    }

    public List<String> getListPolonaise() {
        return ListPolonaise;
    }
    
    
}
