package poo_II.aula05;

import java.time.LocalDate;
import java.time.Period;

public class Client extends People{

    private String rg;
    private String cpf;

    public Client(String name, LocalDate birthday, String rg, String cpf) {
        super(name, birthday);
        this.rg = rg;
        this.cpf = cpf;
    }

    protected int getAge(){

        LocalDate today = LocalDate.now();
        return Period.between(getBirthday(), today).getYears();
    }
}
