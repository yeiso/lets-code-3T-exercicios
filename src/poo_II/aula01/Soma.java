package poo_II.aula01;

public class Soma implements ICalculo {


    @Override
    public String calcular(double n1, double n2) {
        double resultado = n1+n2;
        return n1 + " + " + n2 + " = " + resultado;
    }
}