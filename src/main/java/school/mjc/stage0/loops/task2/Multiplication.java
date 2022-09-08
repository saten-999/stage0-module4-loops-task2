package school.mjc.stage0.loops.task2;

public class Multiplication {
    public void printMultiplied(int multiplyByAndToInclusive) {
        int i=0;
        int s=1;
        int ind=1;

        if(multiplyByAndToInclusive<0){
            ind = -multiplyByAndToInclusive;
        }else{
            ind=multiplyByAndToInclusive;
        }

        if(multiplyByAndToInclusive!=0){
            while(i <= ind){
                s= i*multiplyByAndToInclusive;
                i++;
                System.out.println(s);
            }
        }
        
        
    }
}
