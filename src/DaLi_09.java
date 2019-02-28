import lib.Data.ArrayTool;
import lib.Data.MatrixManip;
import lib.Geometry.Rectangle;
import lib.Misc.Randomizer;
import lib.Misc.StopWatch;

import java.util.Date;
import java.util.GregorianCalendar;

import static lib.Misc.IO.*;
public abstract class DaLi_09 {

    public static void main(String[] args) {
        ex06();

    }

    public static void ex00() {
    }

    public static void ex01() {//The Rectangle class
        Rectangle rect1 = new Rectangle(4,40);
        Rectangle rect2 = new Rectangle(3.5,35.9);

        println("%.3f %.3f %.3f %.3f", rect1.getWidth(), rect1.getHeight(), rect1.area(), rect1.perimeter());
        println("%.3f %.3f %.3f %.3f", rect2.getWidth(), rect2.getHeight(), rect2.area(), rect2.perimeter());
    }

    public static void ex02() {//The Stock class
    }

    public static void ex03() {//Use the Date class
        int exp = 18;
        for (int i = 1; i <= exp; i++) {
            Date date = new Date((long)Math.pow(10, i));

        }
    }

    public static void ex04() {//Use the Random class
        ArrayTool.printArray(Randomizer.randomIntsArray(50, 0, 100));
    }

    public static void ex05() {//Use the GregorianCalendar class
        GregorianCalendar gc1 = new GregorianCalendar();
        println(gc1.toString());
        println(gc1.get(GregorianCalendar.YEAR) + " " + gc1.get(GregorianCalendar.MONTH) + " " + gc1.get(GregorianCalendar.DAY_OF_MONTH));
        gc1.setTimeInMillis(1234567898765L);
        println(gc1.get(GregorianCalendar.YEAR) + " " + gc1.get(GregorianCalendar.MONTH) + " " + gc1.get(GregorianCalendar.DAY_OF_MONTH));
    }

    public static void ex06() {
    }

    public static void ex07() {
    }

    public static void ex08() {
    }

    public static void ex09() {
    }

    public static void ex10() {
    }

    public static void ex11() {
    }

    public static void ex12() {
    }

    public static void ex13() {
    }
}