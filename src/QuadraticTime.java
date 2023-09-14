public class QuadraticTime {
    public static void main(String[] args){
        int[] arr = {1,2,3,4,5};
        String[] names = {"Jonathan", "Brianna", "Xander"};
        log1(arr);
        log2(arr);
    }
    public static void log1(int[] numbers){
        // O(n)
        for (int first:numbers) //outer loop
            // O(n)
            for (int second:numbers) //inner loop
                System.out.println(first +","+ second);
        // runtime complexity of the method would be O(n*n) -> O(n^2)
    }
    public static void log2(int[] numbers){
        // O(n)
        for (int first:numbers) //outer loop
            // O(n)
            for (int second:numbers) //inner loop
                // O(n)
                for (int third:numbers) //inner loop
                    System.out.println(first +","+ second +","+ third);
        // runtime complexity of the method would be O(n*n*n) -> O(n^3)
    }
}
