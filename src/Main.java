import java.io.FilterOutputStream;

public class Main {
    public static void main(String[] args) {
        int age = 14;
        if (age >= 18) {
            System.out.println(" Если возраст человека равен " + age + " то он совершеннолетний");
        } else {
            System.out.println(" Если возраст человека равен " + age + " то он не достиг совершеннолетия, нужно немного подождать");
        }
        int temperature = 2;
        if (temperature < 5) {
            System.out.println("На улице " + temperature + " градуса, нужно надеть шапку");
        }
        if (temperature > 5) {
            System.out.println("Если на улице " + temperature + " градусов, можно идти без шапки");
        }
        int speed = 74;
        if (speed > 60) {
            System.out.println("Если скорость " + speed + " км/ч, то придется заплатить штраф");
        }
        if (speed < 60) {
            System.out.println("Если скорость " + speed + " км/ч можно ездить спокойно");
        }
        int years = 32;
        if (years >= 2 && years <= 6) {
            System.out.println("Если возраст человека " + years + " , то ему нужно ходить в детский сад");
        } else {
            System.out.println("Ему не нужно ходить в детский сад");
        }
        if (years >= 7 && years <= 17) {
            System.out.println("Если возраст человека " + years + " , то ему нужно ходить в школу");
        } else {
            System.out.println("Ему не нужно ходить в школу");
        }
        if (years >= 18 && years <= 24) {
            System.out.println("Если возраст человека равен " + years + " ,то ему нужно ходить в институт");
        } else {
            System.out.println("Ему не нужно ходить в институт");
        }
        if (years > 24) {
            System.out.println("Если возраст человека " + years + " ,то ему нужно ходить на работу");
        }
        int year = 8;
        if (year < 5) {
            System.out.println("Если возраст ребенка равен " + year + ",то ему нельзя кататься на атракционе");
        }
        else if (year >= 5 && year < 14) {
            System.out.println("Если возраст ребенка равен " + year + ", то он может кататься только в сопровождении взрослого. Если взрослого нет, то кататься нельзя");
        }
        else if (year >= 14) {
            System.out.println("Если возраст ребенка равен " + year + ", то он может кататься  без сопровождения взрослого");
        }
        int human = 75;
        if (human <= 60) {
            System.out.println("В вагоне " + (60 - human) + " сидячих мест и 42 стоячих места");
        }
        else if (human > 60 && human <= 102) {
            System.out.println("В вагоне нет сидячих мест, но есть " + (102 - human) + " стоячих мест");
        } else {
            System.out.println("Вагон заполнен");
        }
        int one = 4;
        int two = 8;
        int three = 2;
        if (one > two && one > three) {
            System.out.println("максимальное число равно " + one);
        }
        if (two > one && two > three) {
            System.out.println("максимальное число равно " + two);
        }
        if (three > one && three > two) {
            System.out.println("максимальное число " + three);
        }

    }
}