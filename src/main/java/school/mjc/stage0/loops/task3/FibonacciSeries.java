package school.mjc.stage0.loops.task3;

public class FibonacciSeries {

    public void printFibonacci(int lastFibonacci) {

        int first = 0;
        int second = 1;
        int third=0;

        System.out.println(first);
        System.out.println(second);

        for (int i = 2; i <lastFibonacci; i++) {

            third=first+second;
            first=second;
            second=third;


            System.out.println(third);


        }
    }
}
