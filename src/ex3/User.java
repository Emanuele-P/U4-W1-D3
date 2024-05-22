package ex3;

import java.time.LocalDate;
import java.util.Random;

public class User {

    //attributes
    private int userId;
    private String name;
    private String surname;
    private String mail;
    private LocalDate date;

    //constructor
    public User(String name, String surname, String mail) {
        Random random = new Random();
        LocalDate nDate = LocalDate.now();
        this.userId = random.nextInt(00000, 99999);
        this.name = name;
        this.surname = surname;
        this.mail = mail;
        this.date = nDate;
    }

    //encapsulation

    public int getUserId() {
        return userId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public LocalDate getDate() {
        return date;
    }

}
