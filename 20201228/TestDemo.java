import java.util.Arrays;

public class TestDemo {


    //给定两个整型数组, 交换两个数组的内容
    public static void main(String[] args) {
        int[] arr1 = new int[] {1,5,8,25,58,34,65,32,25};
        int[] arr2 = new int[] { 2,58,65,58,65,21,1,45,65,22};
        exchange(arr1,arr2);

    }
    public static void exchange(int[]arr1,int[]arr2){
        int[] arr3;
        arr3 = arr2;
        arr2 = arr1;
        arr1 = arr3;
        String newarr1 = Arrays.toString(arr2);
        String newarr2 = Arrays.toString(arr1);


        System.out.println(newarr1);
        System.out.println(newarr2);


    }





    //给定整型数组, 把所有的偶数放到数组前面, 把所有奇数放到数组后面.

    public static void main3(String[] args) {
        int[] arr = new int[]{2, 5, 6, 7, 8, 44, 22, 56, 23, 33, 44,12};
        int[] arr1 = expand(arr);
        String newarr = Arrays.toString(arr1);
        System.out.println(newarr);

    }

    public static int[] expand(int[] arr) {
        int a = 0;
        int b = arr.length - 1;

        while (a < b) {
            if (arr[a] % 2 == 0) {
                a++;

            }else{
                if(arr[b] % 2 != 0){
                    b--;
                }else{
                    int tmp = arr[a];
                    arr[a] = arr[b];
                    arr[b] = tmp;
                }
            }

        }

        return arr;



    }




    public static void main2(String[] args) {


        System.out.println(new Test());

    }
















    public static void main1(String[] args) {
       Person person = new Person();
       person.a = 10;
       person.func1();
       System.out.println(person);
       int a = 10;

    }
}
class Person {
    public int a;
    public static int b;


    public int getA() {
        return a;
    }

    public static int getB() {
        return b;
    }

    public void setA(int a) {
        this.a = a;
    }

    public static void setB(int b) {
        Person.b = b;
    }

    @Override
    public String toString() {
        return "Person{" +
                "a=" + a +
                '}';
    }

    public static void func() {
        System.out.println(b);
    }

    public void func1() {
        System.out.println(b);
    }


}

class Test{

    public String toString() {

        System.out.print("aaa");

        return "bbb";

    }

}