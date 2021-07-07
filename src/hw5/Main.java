package hw5;

public class Main {
    public static void main(String[] args) {
        Employee employee = new Employee("Ivan", "Ivanov", "Accountant assistant", "bfhjfjddj@mail.ru",
                1234567, 15000, 21);
        employee.info();


        Employee[] employeesArray = {
                new Employee("David", "Varlamov", "Cleaner", "shhdgffji@mailbox.com", 892323546, 10000, 34),
                new Employee("Petr", "Petrov", "Software developer", "eyrfygfghfh@gmail.com", 87734562, 70000, 37),
                new Employee("Elena", "Bistrova", "Software tester", "lhjhjgyiti@gmail.com", 84467867, 50000, 30),
                new Employee("Semen", "Semenov", "Security", "jgjfgyyyr@gmail.com", 89880533, 30000, 45),
                new Employee("Tamara", "Pavlovna", "Chef", "nvmbcdgd.@mail.ru", 89755432, 24000, 50),
        };
        for (int i = 0; i < employeesArray.length; i++) {
            if (employeesArray[i].getAge() >= 40) {
                System.out.println(employeesArray[i]);
            }
        }
    }
}
