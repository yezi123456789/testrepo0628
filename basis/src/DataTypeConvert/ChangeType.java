package DataTypeConvert;

public class ChangeType {
    public static void main(String[] args) {
        // 当给定的数值超过数据类型所能容纳的最大值时，会发生类型不匹配的错误。
        byte b = 15;
        short s = 20;
        int x = 30;
        s += 1;
        System.out.println(s);
    }
}
