import java.util.Map;
import java.util.Properties;

public class EnvDemo {
    public static void main(String[] args) {
        String course = System.getenv("COURSE");
        String appName = System.getProperty("app.name", "(not set)");

        System.out.println("=== Environment Variables (subset) ===");
        System.out.println("COURSE: " + course);
        System.out.println("HOME:   " + System.getenv("HOME"));

        System.out.println("\n=== System Properties (subset) ===");
        System.out.println("app.name:      " + appName);
        System.out.println("java.version:  " + System.getProperty("java.version"));
        System.out.println("os.name:       " + System.getProperty("os.name"));
        System.out.println("user.dir:      " + System.getProperty("user.dir"));
    }
}
