
package mainPack;


import java.util.Iterator;
import java.util.List;
import operations.FabriquerExpression;

/**
 *
 * @author mpgsa
 */
public class Main {

    public static void main(String[] args) throws Exception {
        // Locaux
        String calculer = "5 1/";
        //
        FabriquerExpression fe = new FabriquerExpression();
        System.out.println(fe.calculer(calculer));
        print(fe.getListPolonaise());
    }
    
    private static void print(List<String> list){
        Iterator i = list.iterator();
        while (i.hasNext()) {
            System.out.println(i.next());
        }
    }
    
}
