import auxp.MainFX;
import auxp.ch20.BouncingBallsPane;
import auxp.ch20.CalendarComparator;
import auxp.ch20.LinkedNumbersPane;
import javafx.application.Application;
import lib.Data.ListManip;
import lib.Misc.Randomizer;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.GregorianCalendar;
import java.util.Scanner;

import static lib.Misc.IO.println;
import static lib.Misc.IO.scanNext;

public abstract class DaLi_20 {

    public static void main(String[] args) {

        ex05();

    }

    public static void ex00() {
    }
    public static void ex01() {//Display words in descending alphabetical order
        File lorem = new File("src/res/txt/lorem.txt");
        ArrayList<String> words = new ArrayList<>();

        try(Scanner scan = new Scanner(lorem).useDelimiter("[ .,:;\n]")){
            while(scan.hasNext()){
                String newWord = scan.next().trim();
                if(!(newWord.length()<1 || " ".equals(newWord)))
                    words.add(newWord);
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
//        words.sort(new Comparator<String>() {
//            @Override
//            public int compare(String o1, String o2) {
//                return Integer.compare(0, o1.compareTo(o2));
//
//            }
//        });
        words.sort((o1,o2) -> Integer.compare(0, o1.compareTo(o2)));
        ListManip.printList(words);
    }
    public static void ex02() {//Store numbers in a linked list
        MainFX.initializeToolkit();//JavaFX toolkit init
        MainFX ui = new MainFX(new LinkedNumbersPane());
        ui.go();
    }
    public static void ex03() {//Guessing the capitals
        ArrayList<String> states = new ArrayList<>();
        states.add("Alabama");
        states.add("Alaska");
        states.add("Arizona");
        ArrayList<String> capitals = new ArrayList<>();
        capitals.add("Montgomery");
        capitals.add("Juneau");
        capitals.add("Phoenix");
        ArrayList<Integer> shuffled = new ArrayList<>();
        for (String state :states) {
            shuffled.add(states.indexOf(state));
        }
        ListManip.shuffle(shuffled);
        int count =0;
        for (int i = 0; i < shuffled.size(); i++) {
            String answer = scanNext("What is the capital of %s?", states.get(shuffled.get(i)));
            if (answer.equalsIgnoreCase(capitals.get(shuffled.get(i)))) {
                println("Your answer is correct");
                count++;
            } else println("Correct answer is %s", capitals.get(shuffled.get(i)));
        }
        println("Correct count is %d", count);
    }
    public static void ex04() {//Implement Comparable
        ArrayList<GregorianCalendar> calendars = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            GregorianCalendar gc = new GregorianCalendar();
            gc.setTimeInMillis(Math.abs(Randomizer.randomLong()));
            calendars.add(gc);
        }
        calendars.sort(new CalendarComparator());
        for(GregorianCalendar calendar : calendars){
            System.out.printf("%d-%d-%d%n", calendar.get(GregorianCalendar.DAY_OF_MONTH),calendar.get(GregorianCalendar.MONTH)+1,calendar.get(GregorianCalendar.YEAR));
        }
    }
    public static void ex05() {//Combine colliding bouncing balls
        Application.launch(BouncingBallsPane.class, "");
    }
    public static void ex06() {//Use iterators on ArrayList
    }
    public static void ex07() {//Game: hangman
    }
    public static void ex08() {//Game: lottery
    }
    public static void ex09() {//Remove the largest ball first
    }
    public static void ex10() {//Perform set operations on priority queues
    }
    public static void ex11() {//Remove Consecutive Integers
    }
    public static void ex12() {//Create Stack from list
    }
    public static void ex13() {//Postfix notation
    }
    public static void ex14() {//Postfix notation
    }
    public static void ex15() {//Game: the 24-point card game
    }
    public static void ex16() {//Game: the 24-point card game
    }
    public static void ex17() {//Game: the 24-point card game
    }
    public static void ex18() {//Directory size
    }
    public static void ex19() {//Use Comparator
    }
    public static void ex20() {//Nonrecursive Tower of Hanoi
    }
    public static void ex21() {//Use Comparator
    }
    public static void ex22() {//Nonrecursive Tower of Hanoi
    }
    public static void ex23() {//Evaluate expression
    }
}