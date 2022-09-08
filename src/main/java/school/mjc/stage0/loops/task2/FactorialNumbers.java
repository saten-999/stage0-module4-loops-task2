package school.mjc.stage0.loops.task2;

public class FactorialNumbers {
    public void printFactorialRow(int printToInclusive) {
        int i=0;
        int s=1;
        int j=1;

        while(i <= printToInclusive){

            while(j<=i){
                s*= j;
                j++;
            }
            
            i++;
            System.out.println(s);
        }
    }
}
