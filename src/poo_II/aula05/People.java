package poo_II.aula05;

import java.time.LocalDate;

public class People {

    private String name;
    private LocalDate birthday;

    public People(String name, LocalDate birthday) {
        this.name = name;
        this.birthday = birthday;
    }

    public String getName() {
        return name;
    }

    public LocalDate getBirthday() {
        return birthday;
    }
}
