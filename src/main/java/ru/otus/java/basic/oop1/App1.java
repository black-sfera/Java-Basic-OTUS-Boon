package ru.otus.java.basic.oop1;

public class App1 {
    public static void main(String[] args) {

        User[] users = new User[10];
        users[0] = new User("Alyosha", "Bravo", "Alexeyevich", 1987, "A.Bravo@mail.ru");
        users[1] = new User("Stepan", "Bravo", "Alexeyevich", 1965, "SBravo@mail.ru");
        users[2] = new User("Ivan", "Bravo", "Alexeyevich", 2007, "IBravo@mail.ru");
        users[3] = new User("Ilya", "Bravo", "Alexeyevich", 2000, "IlBravo@mail.ru");
        users[4] = new User("Igor", "Bravo", "Alexeyevich", 1977, "IgBravo@mail.ru");
        users[5] = new User("Anastasia", "Bravo", "Alekseevna", 1993, "ABravo@mail.ru");
        users[6] = new User("Galina", "Bravo", "Alekseevna", 1989, "GBravo@mail.ru");
        users[7] = new User("Maria", "Bravo", "Alekseevna", 1967, "MBravo@mail.ru");
        users[8] = new User("Alena", "Bravo", "Alekseevna", 1957, "AlBravo@mail.ru");
        users[9] = new User("Victoria", "Bravo", "Alekseevna", 1999, "VBravo97@mail.ru");

        for (int i = 0; i < users.length; i++) {
            User user = users[i];
            int age = 2025 - user.getУearOfBirth();

            if (age >= 40) {
                user.info();
            }

        }

    }
}

