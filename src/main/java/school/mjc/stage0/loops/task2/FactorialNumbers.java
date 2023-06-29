package school.mjc.stage0.loops.task2;

public class FactorialNumbers {
    public void printFactorialRow(int printToInclusive) {
        int multiplier=1;
        int factorial=1;
        System.out.println(factorial);
        while(multiplier<=printToInclusive){
            factorial*=multiplier;
            System.out.println(factorial);
            multiplier++;
        }
    }
}
