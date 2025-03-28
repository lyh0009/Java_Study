package Basic_Control_Structures;

// 选择结构 - Switch语句
public class SwitichStructure {
    public static void main(String[] args){
        int day = 3;
        switch(day){
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            default:
                System.out.println("其他");
        }
    }
}
