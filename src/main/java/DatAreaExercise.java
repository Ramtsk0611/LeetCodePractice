import java.util.ArrayList;

public class DatAreaExercise {
    public static void main(String[] args) {
        String str = "Welcome to Java";
        str = str.replace(" ","");
//        System.out.println(str);
        int a =10; int b=15;
        System.out.println("Before Swap a: "+a+" & b: "+b);
        a = a+b;
        b = a-b;
        a = a-b;
        System.out.println("After Swap a: "+a+" & b: "+b);

//        listStr.forEach(i -> System.out.println(i));

    }
}
