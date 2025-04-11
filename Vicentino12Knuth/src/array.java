public class array {
    public static void main(String[] args) {

        String[] names = {"Muj", "Enzo", "Prince", "Memeg", "Izra"};
        System.out.println("Names in the array:");
        for (String name : names) {
            System.out.println(name);
        }

        int[] numbers = {10, 20, 30, 40, 50};
        numbers[1] = 25; 
        System.out.println("\nUpdated integer array:");
        for (int number : numbers) {
            System.out.println(number);
        }
      
        int[] values = {15, 42, 7, 89, 23};
        int max = values[0]; 
        for (int value : values) {
            if (value > max) {
                max = value;
            }
        }
        System.out.println("\nMaximum value in the array: " + max);
    }
}
