package auxp.ch18;

import java.util.stream.IntStream;

public class RecursionTests {

    public static void main(String[] args) {
        IntStream.range(0, 20).forEach(i -> System.out.println(fib(i)));

    }



    static int fib(int index) {
        if (index == 0)
            return 0;
        else if (index == 1)
            return 1;
        else
            return fib(index - 2) + fib(index - 1);
    }


}
