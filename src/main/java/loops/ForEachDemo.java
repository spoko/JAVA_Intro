package loops;

public class ForEachDemo {
    public static void main(String[] args) {
        int [] numbers = {4, 6, 34, 12, 56};
        String [] cities = {"Sofia", "Plovdiv", "Burgas", "Varna"};

        for(int number : numbers)
            System.out.printf("Value is: %d%n", number);

        for (String city : cities)
            System.out.printf("City is: %s%n", city);
    }
}
