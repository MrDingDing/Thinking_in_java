package unit2;

/**
 * @author blackjack
 * @date 2019/3/27/16:44
 * 创建一个类,它包含一个int域和一个char域，他们都没有初始化，将他们的值打印出来，以验证执行了默认的初始化
 *
 *
 */
public class Practice1 {
    private int intParam;
    private char charParam;
    //todo
    //
    {

    }
    public static void main(String[] args) {
            System.out.print(new Practice1().intParam);
            System.out.println("\n");
            System.out.print(new Practice1().charParam);
    }
}
