package guru.qa;

import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.WebDriverRunner;
import org.junit.jupiter.api.*;

public class SimpleTest {

    @BeforeAll
    static void initDB() {
        System.out.println("### @BeforeAll");
    }

    @BeforeEach
    void openYA(){
        System.out.println("### @BeforeEach");
      //  Selenide.open("https://yandex.ru/");
    }

    @AfterEach
    void close(){
        System.out.println("### @AfterEach");
      //  WebDriverRunner.closeWindow();
    }

    @AfterAll
    static void cleanDB() {
        System.out.println("### @BeforeAll");
    }


    @Test
    void assertTest() {
        System.out.println("###   @Test 0");

        // поиск в новостях

    }

    @Test
    void assertTest1() {
        System.out.println("###   @Test 1");

        // поиск в картинках

    }

}
