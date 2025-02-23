package String;

public class Comparr {
    public static void main(String[] args) {
        
        String Fruit [] = {"apple","banana","mango"};

        String largest  = Fruit[0];
        for(int i =1; i<Fruit.length; i++){
            if(largest.compareTo(Fruit[i])<0){
                largest = Fruit[i];
            }
        }

        System.out.println(largest + " ");

    }

}
