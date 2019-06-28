import java.util.logging.Level;

public class ArrayTest {
    public static void main(String[] args) {
        int[] arrays = new int[]{23,5,26,1,59,10};
        System.out.println("数组中的最大值为："+ findMax(arrays));
        System.out.print("数组反转之后的数组：");
        eachArr(reserveArr(arrays));
    }

    public static int findMax(int[] arr){
        int max = 0;
        if (!arr.equals(null)){
            max = arr[0];
            for (int i = 1; i < arr.length; i++) {
                if (arr[i] > max){
                    max = arr[i];
                }
            }
        }
        return max;
    }

    public static int[] reserveArr(int[] arr){
        // 1. 定义一个新的数组，然后将返回的数组付给新数组
//        int[] array = new int[arr.length];
//        for (int i = 0; i < array.length; i++) {
//            array[i] = arr[arr.length-1-i];
//        }
        // 2. 在原数组中进行反转
        int temp = 0;
        for (int i = 0; i < (arr.length)/2; i++) {
            temp = arr[i];
            arr[i] = arr[arr.length-1-i];
            arr[arr.length-1-i] = temp;
        }
        return arr;
    }

    public static void eachArr(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }
}
