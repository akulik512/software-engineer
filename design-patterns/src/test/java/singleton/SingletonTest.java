package singleton;

import com.akulik.designpatterns.singleton.Singleton;
import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;

class SingletonTest  {

    @Test
    void testSingleton() {
        final int start;
        final int finish;

        System.out.println("--- Start");
        start = LocalDateTime.now().getNano();

        Singleton.getInstance();

        finish = LocalDateTime.now().getNano();
        System.out.println("--- Finish");
        System.out.println("--- Result: start = " + (finish - start));
    }

}