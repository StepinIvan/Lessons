package lesson_1_5;

public class lesson_1_5 {
    /*
    1. Создать класс "Сотрудник" с полями: ФИО, должность, email, телефон, зарплата, возраст.
    2. Конструктор класса должен заполнять эти поля при создании объекта.
    3. Внутри класса «Сотрудник» написать метод, который выводит информацию об объекте в
    консоль.
    4. Создать массив из 5 сотрудников.

    5. С помощью цикла вывести информацию только о сотрудниках старше 40 лет. */

    public static void main(String[] args) {
        Employee[] employeeArray = new Employee[5];
        employeeArray[0] = new Employee("Иванов", "Иван", "Иванович", "Разработчик", "ivanov@mail.ru", " 8-777-777-77-77", 70000, 46);
        employeeArray[1] = new Employee("Петров", "Петр", "Петрович", "Техник", "petrov@mail.ru", " 8-888-888-88-88", 80000, 28);
        employeeArray[2] = new Employee("Александров", "Александр", "Александрович", "Инженер", "alexandrov@mail.ru", " 8-666-666-66-66", 90000, 29);
        employeeArray[3] = new Employee("Алексеев", "Алексей", "Алексеевич", "Администратор", "alex@mail.ru", " 8-555-555-55-55", 40000, 42);
        employeeArray[4] = new Employee("Юрьев", "Юрий", "Юрьевич", "Менеджер", "yuri@mail.ru", " 8-444-444-44-44", 50000, 36);

        for (int i = 0; i < employeeArray.length; i++ ) {
            if (employeeArray[i].getAge() > 40) {
                employeeArray[i].infoEmployee();
            }
        }
    }


}
