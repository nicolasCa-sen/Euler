package Vista;

import javax.swing.JOptionPane;
import Vista.R_Euler;

public class R_Principal {
    public void menu2() {
        boolean continuar = true;
        do  {

            String msj = JOptionPane.showInputDialog(null,
                    "<<<<<<  Menu Principal  >>>>>>"+
                    "\n "+
                    "\n1 . Calculadora de función exponencial"+
                    "\n2 . salir del menu"+
                    "\n "+
                    "\ndigite una opcion :  "+
                    "\n  ");

            int opc = Integer.parseInt(msj);

            switch (opc) {

                case 1 :
                    JOptionPane.showMessageDialog( null, "ingreso al menu exponencial de Euler  : ");
                    R_Euler Imc2 = new R_Euler();
                    R_Euler.Menu_Euler();
                    break;

                case 2 :
                    JOptionPane.showConfirmDialog(null, "fin del programa  ");
                    continuar = false;
                    break;
                default:JOptionPane.showConfirmDialog(null, "el valor no corresponde a ninguna opcio del menu ");
            }
        }while(continuar);

    }
    public static void main(String[] args) {
        R_Principal runnerp= new R_Principal();
        runnerp.menu2();


    }
}
