package guru.qa;

import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.WebDriverRunner;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class SimpleTest {

    @BeforeEach
    void openYA(){
        Selenide.open("https://yandex.ru/");
    }

    @AfterEach
    void close(){
        WebDriverRunner.closeWindow();
    }


    @Test
    void assertTest1() {

        // поиск в новостях

    }

    @Test
    void assertTest2() {

        // поиск в картинках

    }

}
