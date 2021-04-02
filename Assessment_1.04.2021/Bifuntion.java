package lambdaExpression.com;

import java.util.function.BiFunction;

class Arithmetic{

    public static int add(int a, int b){
        return a+b;
    }

    public static float add(int a, float b){
        return a+b;
    }

    public static float add(float a, float b){
        return a-b;
    }

}
public class Bifunction {

    public static void main(String[] args) {

        BiFunction<Integer, Integer, Integer>add = Arithmetic :: add;
        int result1 = add.apply(10, 20);
        System.out.println("Value : " + result1);


        BiFunction<Integer, Float, Float>add1 = Arithmetic :: add;
        float result2 = add1.apply(10, 20.0f);
        System.out.println("Value : " + result2);

        BiFunction<Float, Float, Float>sub = Arithmetic :: add;
        float result3 = sub.apply(60.0f, 20.0f);
        System.out.println("Value : " + result3);

    }
}
