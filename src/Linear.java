public class Linear {
    public static void main(String[] args){
        int[] arr = {1,2,3,4,5};
        String[] names = {"Jonathan", "Brinanna", "Xander"};
        // linear1(arr);
        // linear2(arr);
        linear3(arr, names);

    }
    public static void linear1(int[] numbers){
        // O(n)
        for(int i = 0; i < numbers.length; i++)
            System.out.println(numbers[i]);
    }
    public static void linear2(int[] numbers){
        // O(n)
        // for each loop
        // for each number in numbers, print numbers
        for(int number:numbers)
            System.out.println(number);
    }
    public static void linear3(int[] numbers, String[] names){
        // O(n)
        for(int i=0; i <  numbers.length; i++)
            System.out.println(numbers[i]);
        // O(m)
        for(int i=0; i <  names.length; i++)
            System.out.println(names[i]);
        // runtime complexity = O(n+m) = O(n)
    }
}
