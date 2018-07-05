
package mainPack;

import operations.Addition;
import operations.Expression;
import operations.FabriquerExpression;

/**
 *
 * @author mpgsa
 */
public class Main {

    public static void main(String[] args) {
        // Locaux
        String calculer = "1 67 12 5 98 + - / *";
        //
        FabriquerExpression fe = new FabriquerExpression();
        fe.remplirPile(calculer);
        System.out.println(FabriquerExpression.stack.peek().evaluer());
    }
    
}
