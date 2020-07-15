package Project5;

public class Employee {
    String name;
    String position;
    String email;
    String phoneNumber;
    int salary;
    int age;

    Employee(String name, String position, String email, String phoneNumber, int salary, int age){
        this.name = name;
        this.position = position;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.salary = salary;
        this.age = age;
    }

    void infoEmployee(){
        System.out.println("Сотрудник: " + name);
        System.out.println("Должность: " + position);
        System.out.println("Email: " + email);
        System.out.println("Номер телефона: " + phoneNumber);
        System.out.println("Зарплата: " + salary + "рублей");
        System.out.println("Возраст: " + age);
        System.out.println();
    }

}
