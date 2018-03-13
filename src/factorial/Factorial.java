/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package factorial;

/**
 *
 * @author Elvia Nunez
 */
public class Factorial {

    /**
     * @param args the command line arguments
     */
    public static int calculo(int n){
        if(n<0){
            throw new IllegalArgumentException("Numero" +n+" no puede ser <0");
        }
        int fact=1;
        for(int i=2; i<=n; i++){
            fact*=i;
        }
        if(fact<0){
            throw new ArithmeticException("Overflow, numero "+n+
                    " demasiado grande");
        }
        return fact;
    }
}

    

