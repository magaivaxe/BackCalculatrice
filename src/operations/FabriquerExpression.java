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
            } else {
                resultat = new Division(stack.pop(), stack.pop());
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
        String [] recu = analyserExpression(entre);
        //
        for (String str : recu){
            expression = batirPolonaise(str);
            stack.push(expression);
        }
        return stack.peek().evaluer();
    }
    
    /**
     * @param entre
     * @return 
     */
    private String[] analyserExpression(String entre) throws Exception{
        //Locaux
        String [] recu = entre.split(" ");
        int symbol = 0;
        int number = 0;
        //
        analyserTypeExpression(recu);
        //
        for (String s : recu) {
            if (ADDITION.equals(s) || SOUTRACTION.equals(s) ||
                MULTIPLICATION.equals(s) || DIVISION.equals(s)) {
                symbol++;
            } else { number++;}
        }
        //
        if (number - symbol == 1) { return recu; }
        else { throw new Exception(); }
    }
    
    /**
     * @param str 
     */
    private void analyserTypeExpression(String [] str) {
        //
        try {
            double d1 = Double.parseDouble(str[0]);
            double d2 = Double.parseDouble(str[1]);
        } catch (NumberFormatException e) {
            estPolonaise = true;
        }
    }

    public List<String> getListInfix() {
        return ListInfix;
    }

    public List<String> getListPolonaise() {
        return ListPolonaise;
    }
    
    
}
