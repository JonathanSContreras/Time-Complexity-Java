public class ConstantTime {
    public static void main(String[] args){
        int[] arr = {1,2,3,4,5};
        constantTime(arr);

    }
    public static void constantTime(int[] numbers){
        // O(1)
        System.out.println(numbers[0]);
    }
}
