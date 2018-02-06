/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clientwscalculator;

/**
 *
 * @author sergio
 */
public class ClientWSCalculator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Suma: 40 + 40 = " + sum(40, 40));
        System.out.println("Resta: 400 + 40 = " + rest(400, 40));
    }

    private static int sum(int n1, int n2) {
        pack1.Calc_Service service = new pack1.Calc_Service();
        pack1.Calc port = service.getCalcPort();
        return port.sum(n1, n2);
    }

    private static int rest(int n1, int n2) {
        pack1.Calc_Service service = new pack1.Calc_Service();
        pack1.Calc port = service.getCalcPort();
        return port.rest(n1, n2);
    }
    
}
