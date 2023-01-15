package classesAndObjects.figure;

/*      Figure
        Написать иерархию классов «Фигуры». Фигура -> Треугольник -> Прямоугольник -> Круг.
        Реализовать ф-ю подсчета площади для каждого типа фигуры и подсчет периметра.
        Создать массив из 5 фигур.
        Вывести на экран сумму периметра всех фигур в массиве.*/
public class Main {
    public static void main(String[] args) {

        double sum = 0;

        Figure[] figure = {new Rectangle(4, 3),
                new Triangle(6, 10, 6),
                new Circle(10),
                new Circle(20),
                new Circle(30)};

        for (Figure i : figure) {
            System.out.println(i.getName() + ": circumference = " + i.getCircumference());
            sum = sum + i.getCircumference();
        }
        System.out.println("Cумма периметра всех фигур = " + sum);
    }
}
