package school.mjc.stage0.loops.task2;

public class PrimeNumbers {
    public void printPrimeNumbers(int printToInclusive) {
        int i=2;
        int j=2;
        boolean prime=true;

        while(i < printToInclusive){
            j=2;
            while(j<= i/2){
                
                if(i%j==0){
                 
                    prime =false;
                    break;       
                }else{
                    prime =true;
                }
                j++;
            }
            if(prime){
                System.out.println(i);
            }
            
            i++;
            
        }
    }

    public static void main(String[] args){
        PrimeNumbers m = new PrimeNumbers();

        m.printPrimeNumbers(33);
    }
}
