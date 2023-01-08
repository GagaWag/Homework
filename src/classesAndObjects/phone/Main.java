package classesAndObjects.phone;

 /*Класс Phone.
         Создайте класс Phone, который содержит переменные number, model и
         weight.
         Создайте три экземпляра этого класса. Выведите на консоль значения их переменных.
         Добавить в класс Phone методы:
         receiveCall, имеет один параметр – имя звонящего. Выводит на консоль сообщение “Звонит {name}”.
         getNumber – возвращает номер телефона. Вызвать эти методы для каждого из объектов.
         Добавить конструктор в класс Phone, который принимает на вход три
         параметра для инициализации переменных класса - number, model и
         weight.
         Добавить конструктор, который принимает на вход два параметра для
         инициализации переменных класса - number, model.
         Добавить конструктор без параметров.
         Вызвать из конструктора с тремя параметрами конструктор с двумя.
         Добавьте перегруженный метод receiveCall, который принимает два
         параметра - имя звонящего и номер телефона звонящего. Вызвать этот
         метод.
         Создать метод sendMessage с аргументами переменной длины (Шилдт, стр. 213).
         Данный метод принимает на вход номера телефонов, которым будет отправлено сообщение. Метод выводит на консоль
         номера этих телефонов.*/

class Main {
    public static void main(String[] args) {
        Phone firstPhone = new Phone(375292904236L, "Samsung", 130);
        Phone secondPhone = new Phone(37533345474L, "LG", 140);
        Phone thirdPhone = new Phone(375445675445L, "Xiaomi", 150);
        System.out.println(firstPhone.toString());
        System.out.println(secondPhone.toString());
        System.out.println(thirdPhone.toString());
        firstPhone.receiveCall();
        firstPhone.getNumber();
        secondPhone.getNumber();
        thirdPhone.getNumber();
        firstPhone.receiveCall("23", 556);
        firstPhone.sendMessage(375292904235L, 345465444563L, 434355654324L);
    }
}

