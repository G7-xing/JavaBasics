public class MethodParameter01 {
    public static void main(String[] args) {
        int a =  2 ;
        int b = 3 ;
        AA c = new AA();
        c.swap(a,b);
        System.out.println("main方法中的a,b "+ "a = " + a + " b = " + b );
    }
}
//基本数据类型，传递的是值拷贝，形参的任何改变不影响实参。
class AA {
    public void swap(int a,int b){
        System.out.println("交换前：" + "a = " + a + " b = " + b );
        int temp = a;
        a = b;
        b = temp;
        System.out.println("交换后：" + "a = " + a + " b = " + b );
    }
}
