package school.mjc.stage0.loops.task3;

public class NinesSum {
    public static void main(String[] args) {
        calculateSum(5);
    }
    public static void calculateSum(int lengthOfLastNumber) {

        if(lengthOfLastNumber<1){
            System.out.println("0");return;
        }
        int sum = 0;

        for (int i = 1; i <= lengthOfLastNumber; i++) {
            sum += getNum(i);
        }

        System.out.println(sum);
    }

    private static int getNum(int i) {
        StringBuilder res = new StringBuilder();

        for (int g = 0; g < i; g++) {
            res.append("9");
        }

        return Integer.parseInt(res.toString());

    }
}
