package exercises;
//输出数值类型的取值范围
public class NumericTypes {
    public static void main(String[] args){

        System.out.println("boolean类型取值范围：" + Boolean.TRUE + "~" + Boolean.FALSE);
        System.out.println("byte类型取值范围：" + Byte.MIN_VALUE + "~" + Byte.MAX_VALUE);
        System.out.println("short类型取值范围：" + Short.MIN_VALUE + "~" + Short.MAX_VALUE);
        System.out.println("int类型取值范围：" + Integer.MIN_VALUE + "~" + Integer.MAX_VALUE);
        System.out.println("long类型取值范围：" + Long.MIN_VALUE + "~" + Long.MAX_VALUE);
        System.out.println("char类型取值范围：" + (int)Character.MIN_VALUE + "~" + (int)Character.MAX_VALUE);
        System.out.println("float类型取值范围：" + Float.MIN_VALUE + "~" + Float.MAX_VALUE);
        System.out.println("double类型取值范围：" + Double.MIN_VALUE + "~" + Double.MAX_VALUE);

    }

}
