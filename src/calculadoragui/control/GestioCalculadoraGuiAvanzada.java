
package calculadoragui.control;

import calculadoragui.model.OperacionsAvanzades;
import calculadoragui.vista.InterficieGraficaAvanzada;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class GestioCalculadoraGuiAvanzada implements ActionListener{
    private InterficieGraficaAvanzada ig;
    private OperacionsAvanzades opers;

    public GestioCalculadoraGuiAvanzada(InterficieGraficaAvanzada ig) {
        this.ig = ig;
        opers = new OperacionsAvanzades();
    }

    /**
     * Mètode de la interfície Listener de l'esdeveniment ActionEvent. Es dóna 
     * resposta a l'esdevenimnet click dels botons de les operacions de la vista.
     * Si algun dels valors dels operands no correspon a un valor numéric, 
     * l'excepció generada de tipus NumberFormatException és recollida en un 
     * catch i s'envia un missatge d'error a la vista.
     */
    
    public void actionPerformed(ActionEvent e) {
        String accio = e.getActionCommand();
        try {

            switch (accio) {

                case "+":
                    suma();
                    break;
                case "-":
                    resta();
                    break;
                case "x":
                    multiplicacio();
                    break;
                case "/":
                    divisio();
                    break;
                case ">":
                    //Màxim
                    maxim();
                    break;
                case "<":
                    //Mínim
                    minim();
                    break;
                case "POT":
                    //Potencia
                    potencia();
                    break;
                case "%":
                    //Modul
                    modul();
                    break;
            }
        } catch (NumberFormatException ex) {
            ig.mostrarMissatgeError("Valors no numèrics");
            ig.buidarTextFields();
        }
    }

    /**
     * Recull de la vista els valors dels operands,crida al mètode suma del
     * model i envia el resultat de la suma a la vista.
     */
    private void suma() {
        ig.setResultat(opers.suma(ig.getOper1(), ig.getOper2()));
    }

    /**
     * Recull de la vista els valors dels operands,crida al mètode resta del
     * model i envia el resultat de la resta a la vista.
     */
    private void resta() {
        ig.setResultat(opers.resta(ig.getOper1(), ig.getOper2()));
    }

    /**
     * Recull de la vista els valors dels operands,crida al mètode multiplicacio
     * del model i envia el resultat de la multiplicacio a la vista.
     */
    private void multiplicacio() {
        ig.setResultat(opers.multiplicacio(ig.getOper1(), ig.getOper2()));
    }

    /**
     * Recull de la vista els valors dels operands, es comprova que el segon
     * sigui diferent de 0, en aquest cas es crida al mètode divisio del model i
     * envia el resultat de la divisio a la vista. Si el segon operand és 0,
     * s'envia un missatge a la vista.
     */
    private void divisio() {
        double oper2 = ig.getOper2();
        if (oper2 != 0) {
            ig.setResultat(opers.divisio(ig.getOper1(), ig.getOper2()));
        } else {
            ig.mostrarMissatgeError("No es pot dividir per 0");
        }
    }
    
    
    /**
     * Recull els valors dels operands i crida al metode que calcula 
     * la potencia del opreand 1 amb el operand 2.
     */
    private void potencia() {
        ig.setResultat(opers.potencia(ig.getOper1(), ig.getOper2()) );
    }
    
    
    /**
     * Recull els valors dels operands i crida al metode que comprova quin dels dos operands
     * es més gran.
     */
    private void maxim() {
        ig.setResultat(opers.maxim(ig.getOper1(), ig.getOper2()));
    }
    
    
    /**
     * Recull els valors dels operands i crida al metode que comprova
     * quin dels 2 operands es més petit.
     */
    private void minim() {
        ig.setResultat(opers.minim(ig.getOper1(), ig.getOper2()));
    }
    
    /**
     * Recull els valors dels operands i crida al metode que calcula el
     * modul del operand 1 amb el operand 2.
     */
    private void modul(){
        ig.setResultat(opers.modul(ig.getOper1(), ig.getOper2()));
    }
    
    
    
}
