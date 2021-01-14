package advanced;

/**
 * Created by amit on 29-Aug-2020
 */
public class JavaSingleton {

    public String str;

    private static JavaSingleton instance = null;

    private JavaSingleton() {

    }

    public static JavaSingleton getSingleInstance() {
        if (instance == null) {
            instance = new JavaSingleton();
        }
        return instance;
    }
}
