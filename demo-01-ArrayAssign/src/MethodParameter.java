public class MethodParameter {
    public static void main(String[] args) {
        B b = new B();
        int[] arr = {1, 2, 3};
        b.test(arr);

        System.out.println("main的:arr数组");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

    }
}
//引用类型传递的是地址，是地址传递，这里的地址就是值，因为在堆中指的对象是一致的，则，形参会影响实参
class B {
    public void test(int[] arr){
        arr[2] = 200;
        System.out.println("test的:arr数组");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println("\n");
    }
}
