package Vista;

import Modelo.Euler;
import javax.swing.JOptionPane;

public class R_Euler {

    private static Euler S_euler;

    public R_Euler() {
        S_euler = new Euler();
    }

    public Euler geteuler() {
        return S_euler;
    }

    public void seteuler(Euler S_euler) {
        this.S_euler = S_euler;
    }
    public static void Menu_Euler() {

        int opciones = 0;
        double V_euler = 0;
        int nuevo = 0;

        do {
            opciones=Integer.parseInt(JOptionPane.showInputDialog(
                            "<<<<<<  Menu  >>>>>> \n"
                            +"\n"
                            + "1. Ingresar exponente\n"
                            + "2. Exponente de euler (x)\n"
                            + "3. Ingresar Otro Exponente\n"
                            + "4. Salir del Menú\n"
                            +"\n"));


            switch (opciones) {
                case 1:
                    if (nuevo == 0) {

                        V_euler=Double.parseDouble(JOptionPane.showInputDialog("Digite el valor del Exponente"));
                        S_euler.SetExponente(V_euler);
                        nuevo = 1;
                    }else {
                        JOptionPane.showMessageDialog(null, " ya hay un Exponente ");
                    }

                    break;
                case 2:
                    if(V_euler!=0) {
                        JOptionPane.showMessageDialog(null,"e^("+S_euler.getExponente()+")= "+S_euler.CalcularEuler());
                    }
                    else {
                        JOptionPane.showMessageDialog(null, "El Exponente es igual a 0,no valido, ingresa un valor nuevamente ");
                    }

                    break;
                case 3:
                    if (nuevo ==1) {
                        if(V_euler==0) {
                            JOptionPane.showMessageDialog(null, "El Exponente es igual a 0,no valido, ingresa un valor nuevamente ");
                        }
                        V_euler=Double.parseDouble(JOptionPane.showInputDialog("Digite otro Exponente"));
                        S_euler.SetExponente(V_euler);
                    }else {
                        JOptionPane.showMessageDialog(null, "ahora no puedes cambiar el valor del Exponente");
                    }

                    break;
                case 4:int salida =JOptionPane.showConfirmDialog(null,"¿desea salir del algoritmo?");
                    if (salida==JOptionPane.YES_OPTION) {
                        continuar=false;}
                    break;
                default:JOptionPane.showMessageDialog(null, "Opcion no valida");
                    break;
            }

        } while (continuar);
    }
    static boolean continuar = true;


}