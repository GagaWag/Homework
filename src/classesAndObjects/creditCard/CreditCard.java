package classesAndObjects.creditCard;

/*      Создать класс CreditCard c полями:
        номер счета
        текущая сумма на счету

        Добавьте метод, который позволяет начислять сумму на кредитную
        карточку.
        Добавьте метод, который позволяет снимать с карточки некоторую
        сумму.
        Добавьте метод, который выводит текущую информацию о карточке.
        Написать программу, которая создает три объекта класса CreditCard у
        которых заданы номер счета и начальная сумма

        Тестовый сценарий для проверки:
        Положите деньги на первые две карточки и снимите с третьей.
        Выведите на экран текущее состояние всех трех карточек.*/

public class CreditCard {
    private String number;
    private double sum;

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public double getSum() {
        return sum;
    }

    public void setSum(double sum) {
        this.sum = sum;
    }

    public CreditCard(String number, double sum) {
        this.number = number;
        this.sum = sum;
    }

    public void addSum(double sumToAdd) {
        this.sum = this.sum + sumToAdd;

    }

    public void removeSum(double sumToRemove) {
        this.sum = this.sum - sumToRemove;

    }

    @Override
    public String toString() {
        return "Account number is " + this.number + "\nAccount sum is " + this.sum;
    }
}


