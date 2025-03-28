package DimensionalArray;

public class OneDimensionalArray {
    public static void main(String[] args) {
        int[] arr; //定义数组
        int[] arr1 = new int[5];//动态初始化
        int[] arr2 = {1, 2, 3, 4, 5}; //静态初始化

        for (int i : arr2) //遍历数组arr2
        {
            System.out.println(i);
        }
    }
}
