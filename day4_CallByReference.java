package raj.ds;

public class day4_CallByReference {

    int number = 10;

    public static void increment(day4_CallByReference object) {
        object.number = object.number+1;
        System.out.println("number value after increment, inside method: "+object.number);
    }

    public static void main(String[] args) {
        day4_CallByReference object = new day4_CallByReference();
        System.out.println("value of the number before method call: "+object.number);
        increment(object);
        System.out.println("value of the number after the method call: "+ object.number);

    }

}
