package guru.qa.tests;

import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;

public class RegistrationFormTests {
    // домашнее задание 3. Погружаемся в инструментарий и библиотеки. от 01 апреля 2022 г.

    @BeforeAll
    static void setUp() {
        Configuration.baseUrl = "https://demoqa.com"; // основной адрес
        Configuration.browserSize = "1920x1080"; // размер браузера
    }

    @Test
    void fillFormTest() {
        open("/automation-practice-form");
        $(".practice-form-wrapper").shouldHave(text("Student Registration Form"));
        executeJavaScript("$('footer').remove()"); // убираем баннер
        executeJavaScript("$('#fixedban').remove()"); // убираем баннер

        $("#firstName").setValue("Alexander");
        $("#lastName").setValue("Pushkin");
        $("#userEmail").setValue("alexanderpushkin@mail.ru");
        $("#gender-radio-1").parent().click(); //parent() указывает на родителя клика
        $("#userNumber").setValue("9261234567");
        $("#dateOfBirthInput").click();
        $(".react-datepicker__month-select").selectOption("May");
        $(".react-datepicker__year-select").selectOption("1999");
        $(".react-datepicker__day--026").click();
        $("#subjectsInput").setValue("English").pressEnter();
        $("#hobbies-checkbox-2").parent().click();
        $("#uploadPicture").uploadFromClasspath("img/1.png");
        $("#currentAddress").setValue("st. Prechistenka 12/2");
        $("#state").click();
        $("#stateCity-wrapper").$(byText("Haryana")).click();
        $("#city").click();
        $("#stateCity-wrapper").$(byText("Karnal")).click();
        $("#submit").click();

        $("#example-modal-sizes-title-lg").shouldHave(text("Thanks for submitting the form"));
        $(".table-responsive").shouldHave(text("Alexander Pushkin"), text("alexanderpushkin@mail.ru"),
                text("9261234567"), text("st. Prechistenka 12/2"), text("English"),
                text("Haryana"), text("Karnal")); // сверка результата
    }
}
