package raj.ds;

public class day4_CallByValue {
    public Object number;

    public static void main(String[] args) {
        int number = 10;
        incrementNUmber(number);
        System.out.println("value of number after the method call"+number);

    }

    private static void incrementNUmber(int number) {
        System.out.println("value of the number before increment"+number);
        number = number + 1;
        System.out.println("incremented the number"+number);
    }
}
