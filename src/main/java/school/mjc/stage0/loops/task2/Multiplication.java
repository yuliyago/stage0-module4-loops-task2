package school.mjc.stage0.loops.task2;

public class Multiplication {
    public void printMultiplied(int multiplyByAndToInclusive) {
        int counter=0;
        if(multiplyByAndToInclusive==0) System.out.print("");
        else{
            int positiveTop=multiplyByAndToInclusive;
            if(multiplyByAndToInclusive<0) positiveTop*=-1;
            while(counter<=positiveTop){
                System.out.println(counter*multiplyByAndToInclusive);
                counter++;
            }
        }
    }
}
