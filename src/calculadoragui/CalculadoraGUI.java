package calculadoragui;

import calculadoragui.vista.InterficieGraficaBasica;
import javax.swing.SwingUtilities;

public class CalculadoraGUI {

    public static void main(String[] args) {
                            SwingUtilities.invokeLater(new Runnable() {
                        @Override
                        public void run() {
                            InterficieGraficaBasica intGraf = new InterficieGraficaBasica();
                            intGraf.setVisible(true);
                        }
                    });
        
    }

}
