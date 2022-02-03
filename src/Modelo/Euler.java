package Modelo;

public class Euler {


    private final static int LIMITE = 30;

    private double Exponente ;

    public Euler(){
        this.Exponente =0.0;
    }

    public double getExponente() {
        return Exponente ;
    }

    public void SetExponente(double Exponente) {
        this.Exponente  = Exponente;
    }

    public double CalcularFactorial(int numero) {
        double fact=1;
        for(int i=1; i<=numero; i++ ){
            fact=fact*i;
        }
        return fact;
    }
    public double CalcularEuler() {
        int i=0;
        double totalSerie=0;

        while(i<=LIMITE) {

            double pot2= Math.pow(Exponente,i) ;
            double fac = CalcularFactorial(i);
            double operacion = (pot2/fac);
            totalSerie += operacion;;
            i++;
        }

        return totalSerie;
    }





    public String datosFunciones() {
        return ("+getExponente()+");



    }
}