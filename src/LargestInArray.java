package src;
public class LargestInArray {
    public static int getLargest(int[] numbers){
        int largest = Integer.MIN_VALUE;
        for(int i =0; i<numbers.length; i++){
            if(largest<numbers[i]){
                largest = numbers[i];
            }
        }
        return largest;
    }
    public static void main(String[] args) {
        int[] numbers = {1,2,6,3,5};
        int largestNo = getLargest(numbers);
        System.out.println("The largest no in array is : "+largestNo);
    }
}
