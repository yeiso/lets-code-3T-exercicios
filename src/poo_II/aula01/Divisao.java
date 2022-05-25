package poo_II.aula01;

public class Divisao implements ICalculo {


    @Override
    public String calcular(double n1, double n2) {
        if(n2 != 0) {
            double resultado = n1 / n2;
            return n1 + " / " + n2 + " = " + resultado;
        } else {
            return "Divisao por zero. NaN";
        }
    }
}
