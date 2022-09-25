package school.mjc.stage0.loops.task3;

public class GreatestCommonDivisor {
    public  void printGCD(int first, int second) {

        int n=Math.max(first,second);

        while (!(first%n==0&&second%n==0)){
            n--;
        }
        System.out.println(n);
    }
}
