package classesAndObjects.employees;

/*      Employees
        Создать классы "Директор", "Рабочий", "Бухгалтер".
        Реализовать интерфейс с методом, который печатает название должности и
        имплементировать этот метод в созданные классы.*/

public class Main {
    public static void main(String[] args) {
        Director director1 = new Director();
        director1.printProfession();
    }
}
