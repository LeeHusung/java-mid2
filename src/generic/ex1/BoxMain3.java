package generic.ex1;

public class BoxMain3 {

    public static void main(String[] args) {
        GenericBox<Integer> integerGenericBox = new GenericBox<>(); //생성 시점에 T의 타입이 결정됨
        integerGenericBox.set(10);
        Integer integer = integerGenericBox.get();
        System.out.println("integer = " + integer);

        GenericBox<String> stringGenericBox = new GenericBox<>();
        stringGenericBox.set("hello");
        String str = stringGenericBox.get();
        System.out.println("str = " + str);

        //원하는 모든 타입 사용 가능
        GenericBox<Double> doubleGenericBox = new GenericBox<>();
        doubleGenericBox.set(10.5);
        Double dou = doubleGenericBox.get();
        System.out.println("dou = " + dou);
    }
}
