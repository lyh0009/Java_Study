package Basic_Control_Structures;

// 循环语句 - do~while循环
public class DoWhileLoop {
    // 打印1~10的数字
    public static void main(String[] args){
        int i = 1;
        do{
            System.out.println("当前数字为：" + i);
            i++;
        }while(i <= 10);
    }
}
