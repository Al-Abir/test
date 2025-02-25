package Math;

public class Sieve {
    
    public static void main(String[] args) {
        int num =20;
        boolean [] seive = new boolean[num];

        for(int i =0; i<seive.length; i++){
            seive[i] = true;
        }

        for(int i=2; i<Math.sqrt(num); i++){

            if(seive[i]== true){
                for(int j= i*i; j<num; j=j+i){
                    seive[j]= false;
                }
            }
        }
        for(int i=2; i<seive.length; i++){
            if(seive[i]==true){
                System.out.println(i);
            }
        }
    }
}
