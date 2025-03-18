package ru.otus.java.basic.oop1;

public class User {
    private String name;
    private String surname;
    private String patronymic;
    private int уearOfBirth;

    public String getName() {
        return name;
    }


    public String getSurname() {
        return surname;
    }


    public String getPatronymic() {
        return patronymic;
    }


    public int getУearOfBirth() {
        return уearOfBirth;
    }


    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    private String email;

    public User(String name, String surname, String patronymic, int уearOfBirth, String email) {
        this.name = name;
        this.surname = surname;
        this.patronymic = patronymic;
        this.уearOfBirth = уearOfBirth;
        this.email = email;
    }

    public void name() {
        System.out.println(name);
    }

    public void surname() {
        System.out.println(surname);
    }

    public void patronymic() {
        System.out.println(patronymic);
    }

    public void уearOfBirth() {
        System.out.println(уearOfBirth);
    }

    public void info() {
        System.out.println("ФИО: " + surname + " " + name + " " + patronymic);
        System.out.println("Год рождения: " + уearOfBirth);
        System.out.println("e-mail: " + email);
    }

    public void email() {
        System.out.println(email);
    }

}
