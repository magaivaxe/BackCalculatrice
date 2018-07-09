
package mainPack;


import operations.FabriquerExpression;

/**
 *
 * @author mpgsa
 */
public class Main {

    public static void main(String[] args) throws Exception {
        // Locaux
        String calculer = "1 67 12 5 98 + - / *";
        //
        FabriquerExpression fe = new FabriquerExpression();
        System.out.println(fe.calculer(calculer));
    }
    
}
