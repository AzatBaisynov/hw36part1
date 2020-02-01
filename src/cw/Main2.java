package cw;

public class Main2 {
    public static void main(String[] args) {
        Day someDay = Day.Sunday;
        switch (someDay) {
            case Monday: System.out.println("Учеба в понедельник"); break;
            case Tuesday: System.out.println("Во вторник не учусь"); break;
            case Wednesday: System.out.println("Учеба в среду"); break;
            case Thursday: System.out.println("В четверг я отдыхаю"); break;
            case Friday: System.out.println("Учеба в пятницу"); break;
            default: System.out.println("Выходной");
        }
    }
}
