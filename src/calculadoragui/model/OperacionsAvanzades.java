
package calculadoragui.model;


public class OperacionsAvanzades extends Operacions{
 /**
     * Aquest metode calcula la potencia del valor op1 i la potencia es op2.
     * 
     * @param op1
     * @param op2
     * @return 
     */
    public double potencia(double op1, double op2){
        return Math.pow(op1, op2);
    }
    
    /**
     * Aquest metode retorna el numero mes gran entre el op1 i el op2.
     * 
     * @param op1
     * @param op2
     * @return 
     */
    public double maxim(double op1, double op2){
        double max;
        
        if (op1 > op2) {
            max = op1;
        }else{
            max = op2;
        }
        
        return max;
    }
    
    /**
     * Aquest metode retorna el numero mes petit entre op1 i op2.
     * 
     * @param op1
     * @param op2
     * @return 
     */
    public double minim(double op1, double op2){
        double min;
        
        if (op1 > op2) {
            min = op1;
        }else{
            min = op2;
        }
        
        return min;
    }
    
    /**
     * Aquest metode retorna el modul de op1 amb op2;
     * 
     * @param op1
     * @param op2
     * @return 
     */
    public double modul(double op1, double op2){
        return op1 % op2;
    }
    
}
