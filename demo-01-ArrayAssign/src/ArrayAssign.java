public class ArrayAssign {
    public static void main(String[] args) {
        //基本数据类型赋值，赋值方式是值拷贝
        int i = 10;
        int j = i;
        j = 20;
        System.out.println(i);
        System.out.println(j);

        //数组在默认情况下是引用传递，赋值是地址，赋值方式为引用传达；
        //是一个地址，arr2变化会影响arr1,就是地址拷贝

        int[] arr1 = {1,2,3};
        int[] arr2 = arr1;

        arr2[2] = 10;

        for (int k = 0; k < arr1.length; k++) {
            System.out.println(arr1[k]);
        }


        //两个数组进行值拷贝，他们的数据空间是独立的
        int[] array1 = {1,2,3};
        int[] array2 = new int[array1.length];
        for (int z = 0; z < array2.length; z++) {
            array2[z] = array1[z];
        }
        //修改array2
        array2[2] = 30;

        for (int l = 0; l < array1.length; l++) {
            System.out.println(array1[l]);
        }
    }
}
