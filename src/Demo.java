import java.util.Objects;
import java.util.Scanner;

/**
 * 演示jna的使用
 *
 * @author zjw
 * @createTime 2020/9/25 23:07
 */
public class Demo {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("请输入你的名字: ");
            System.out.println("欢迎你, " + sc.next());
            System.out.println("是否清屏?(y/n)");
            if (Objects.equals(sc.next(), "y")) {
                ClsScreen.DLL.cls();
            }
            System.out.println("是否退出?(y/n)");
            if (Objects.equals(sc.next(), "y")) break;
        }
    }

}
