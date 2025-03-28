package DimensionalArray;//二维数组

public class TwoDimensionalArray {
    public static void main(String[] args) {
        int a[][]; //定义数组
        int[][] arr1 = new int[3][4];//动态初始化-法1
        int[][] arr2 = {{1, 2, 3}, {2, 3, 4}, {4, 5}}; //静态初始化
        int[][] arr3 = new int[3][]; //动态初始化-法2

        for (int i = 0; i < arr2.length; i++) {
            for (int j = 0; j < arr2[i].length; j++) {
                System.out.print(arr2[i][j] + " ");
            }
            System.out.println();
        }
    }
}