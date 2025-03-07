package Array;

public class Binary {
    public static int Binary_Search(int arr[], int key){

        int start = arr[0];
        int end = arr.length-1;
        int mid = (start+end)/2;
        while (start<=end) {

            if(arr[mid]==key){
                return mid;
            }else if(arr[mid]<key){
                start = mid+1;
            }else{
                end= mid-1;
            }
            
        }
        return -1;

    }
    
    public static void main(String[] args) {
        
        int arr[] = {2,4,6,8,10,12,14};

        int key = 10;

        System.out.println(Binary_Search(arr,key));
    }
}
