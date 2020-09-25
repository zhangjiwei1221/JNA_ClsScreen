import com.sun.jna.Library;
import com.sun.jna.Native;

/**
 * cls interface
 *
 * @author zjw
 * @createTime 2020/9/25 23:10
 */
public interface ClsScreen extends Library {

    ClsScreen DLL = Native.load(System.getProperty("user.dir") + "/clsscreen.dll", ClsScreen.class);

    void cls();
    void sayHello();

}
