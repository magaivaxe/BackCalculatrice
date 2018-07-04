
package mainPack;

import operations.FabriquerExpression;

/**
 *
 * @author mpgsa
 */
public class Main {

    public static void main(String[] args) {
        // Locaux
        String caluculer = "1 67 +";
        //
        FabriquerExpression fe = new FabriquerExpression();
        fe.remplirPile(caluculer);
        System.out.println(FabriquerExpression.stack.peek().evaluer());
    }
    
}
