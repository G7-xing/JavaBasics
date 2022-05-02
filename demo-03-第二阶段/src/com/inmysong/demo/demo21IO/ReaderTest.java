package com.inmysong.demo.demo21IO;

/**
 * @version 1.0
 * @Author S-user
 * @Date 2022/5/1 0:18
 * @description 模拟修饰器设计模式
 * 节点流是底层流，直接更数据源打交道
 *  * 处理流/包装流包装节点流，既可以消除不同节点流的实现差异，也可以提供更加方柏霓的方法来完成输入输出
 *  * 处理流使用了修饰器设计模式，不会直接与数据相接
 *  * 处理流的特点：
 *  * 性能的提高，主要以增加缓冲 的方式来提高输入输出的效率
 *  * 操作的便捷，处理流可以提供一系列边界的方法来一次输入输出大批量的数据没使用更加灵活方便
 */
public abstract class ReaderTest {
    public void readFile(){}
    public void readString(){}
}

class Test{
    public static void main(String[] args) {
        BufferedReaderTest bufferedReaderTest = new BufferedReaderTest(new FileReader01());
        bufferedReaderTest.readFiles(10);
    }
}
class BufferedReaderTest extends ReaderTest{
    private ReaderTest readerTest;

    public BufferedReaderTest(ReaderTest readerTest) {
        this.readerTest = readerTest;
    }
    public void readFiles(int num){
        for (int i = 0; i <num; i++) {
            readerTest.readFile();
        }
    }
    public void readStrings(int num){
        for (int i = 0; i <num; i++) {
            readerTest.readString();
        }
    }
}
class FileReader01 extends ReaderTest{
    //
    public void readFile(){
        System.out.println("对文件进行读取");
    }
}
class StringReader01 extends ReaderTest{
    // 字节流
    public void readString(){
        System.out.println("读取字符串。。。。。");
    }
}
