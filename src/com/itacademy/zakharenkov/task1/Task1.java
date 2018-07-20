package com.itacademy.zakharenkov.task1;

/*
 * Created by Roman Zakharenkov on 19.07.2018.
 *
 * It-academy.
 * Lesson 6. Homework 6.
 * Task 1.
 *
 * Внимание. При выполнении задания держите в уме принцип
    инкапсуляции.
    Создать класс Point, описывающий точку в двумерных
    координатах.
    Полями этого класса должны быть координаты x и y.
    Класс должен иметь один конструктор, принимающий координаты
    x и y.
    Сделайте информацию о координатах скрытой, а получить её
    можно только с помощью методов доступа (get/set).
    Создать метод distance, принимающий объект Point и
    определяющий расстояние до неё.
    Используя класс точки, создать класс Rectangle, описывающий
    прямоугольник.
    В нём хранятся два поля типа Point - координаты левого верхнего и
    правого нижнего углов.
    Создать следующие методы в классе Rectangle:
    - Высчитывающий площадь прямоугольника
    - Высчитывающий длину диагонали
    Написать тестовый класс с методом main программу,
    демонстрирующим создание объекта класса Rectangle и
    применение вышеперечисленных методов.
 */

import java.util.Scanner;

public class Task1 {

    public static void main(String[] args) {
        System.out.println("Введите координаты верхнего левого угла прямоугольника :");
        Point topLeft = inputXY();

        System.out.println("Введите координаты нижнего правого угла прямоугольника:");
        Point bottomRight = inputXY();

        Rectangle rectangle = new Rectangle(topLeft, bottomRight);
        System.out.println("Площадь прямоугольника равна: " + rectangle.calculateSquareRectangle());
        System.out.println("Диагональ прямоугольника равна: " + rectangle.calculateDiagonal());
    }

    public static Point inputXY() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите координату x точки:");
        double x = scanner.nextDouble();

        System.out.println("Введите координату y точки:");
        double y = scanner.nextDouble();

        return new Point(x, y);
    }
}
