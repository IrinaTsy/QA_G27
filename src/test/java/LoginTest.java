import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.enabled;
import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;
import static java.time.Duration.ofSeconds;
import static org.junit.jupiter.api.Assertions.assertEquals;


public class LoginTest {

    @Test
    void SucsessfulLoginTest() {
        open("https://school.qa.guru");
        $("[name=email]").setValue("qagurubot@gmail.com");
        $("[name=password]").setValue("somepasshere").pressEnter();
       // $("[class=page-header]").shouldBe(enabled, ofSeconds(400)); задержка
        $("[class=page-header]").shouldHave(text("Список тренингов"));
        //String title = $("[class=page-header]").text();
        //assertEquals("Список тренингов",title);
    }

//проверить, что есть фраза Check QA Guru Bot + негативные тесты



    //-------------------------HomeWork-------------------------

    @Test
    void UnsucsessfulWrongPass() {
        open("https://school.qa.guru");
        $("[name=email]").setValue("qagurubot@gmail.com");
        $("[name=password]").setValue("dsrtokj").pressEnter();
        $(".btn-error").shouldHave(text("Неверный пароль"));

    }

    @Test
    void UnsucsessfulWrongPass2() {
        open("https://school.qa.guru");
        $("[name=email]").setValue("qagurubot@gmail.com");
        $("[name=password]").setValue("123").pressEnter();
        $(".btn-error").shouldHave(text("Неверный пароль"));

    }

    @Test
    void UnsucsessfulWrongPass3() {
        open("https://school.qa.guru");
        $("[name=email]").setValue("qagurubot@gmail.com");
        $("[name=password]").setValue("SOMEPASSHERE").pressEnter();
        $(".btn-error").shouldHave(text("Неверный пароль"));

    }

    @Test
    void UnsucsessfulWrongPass4() {
        open("https://school.qa.guru");
        $("[name=email]").setValue("qagurubot@gmail.com");
        $("[name=password]").setValue("КАКОЙ-ТО ПАРОЛЬ").pressEnter();
        $(".btn-error").shouldHave(text("Неверный пароль"));

    }

    @Test
    void UnsucsessfulWrongPass5() {
        open("https://school.qa.guru");
        $("[name=email]").setValue("qagurubot@gmail.com");
        $("[name=password]").setValue("какой-то пароль").pressEnter();
        $(".btn-error").shouldHave(text("Неверный пароль"));

    }

    @Test
    void UnsucsessfulWrongPass6() {
        open("https://school.qa.guru");
        $("[name=email]").setValue("qagurubot@gmail.com");
        $("[name=password]").setValue("").pressEnter();
        $(".btn-error").shouldHave(text("Не заполнено поле Пароль"));

    }

    @Test
    void UnsucsessfulWrongPass7() {
        open("https://school.qa.guru");
        $("[name=email]").setValue("qagurubot@gmail.com");
        $("[name=password]").setValue("      ").pressEnter();
        $(".btn-error").shouldHave(text("Неверный пароль"));

    }

    @Test
    void UnsucsessfulWrongPass8() {
        open("https://school.qa.guru");
        $("[name=email]").setValue("qagurubot@gmail.com");
        $("[name=password]").setValue("#*@").pressEnter();
        $(".btn-error").shouldHave(text("Неверный пароль"));

    }

    @Test
    void UnsucsessfulWrongEmail1() {
        open("https://school.qa.guru");
        $("[name=email]").setValue("qagurubotgmail.com");
        $("[name=password]").setValue("somepasshere").pressEnter();
        $(".btn-error").shouldHave(text("Неверный формат e-mail"));
    }

    @Test
    void UnsucsessfulWrongEmail2() {
        open("https://school.qa.guru");
        $("[name=email]").setValue("qaguru@botgmailcom");
        $("[name=password]").setValue("somepasshere").pressEnter();
        $(".btn-error").shouldHave(text("Неверный формат e-mail"));
    }

    @Test
    void UnsucsessfulWrongEmail3() {
        open("https://school.qa.guru");
        $("[name=email]").setValue("qaguru@botgmail.");
        $("[name=password]").setValue("somepasshere").pressEnter();
        $(".btn-error").shouldHave(text("Неверный формат e-mail"));
    }

    @Test
    void UnsucsessfulWrongEmail4() {
        open("https://school.qa.guru");
        $("[name=email]").setValue("@botgmail.com");
        $("[name=password]").setValue("somepasshere").pressEnter();
        $(".btn-error").shouldHave(text("Неверный формат e-mail"));
    }

    @Test
    void UnsucsessfulWrongEmail5() {
        open("https://school.qa.guru");
        $("[name=email]").setValue("1@botgmail.com");
        $("[name=password]").setValue("somepasshere").pressEnter();
        $(".btn-error").shouldHave(text("Неверный пароль"));
    }

    @Test
    void UnsucsessfulWrongEmail6() {
        open("https://school.qa.guru");
        $("[name=email]").setValue("абц@botgmail.com");
        $("[name=password]").setValue("somepasshere").pressEnter();
        $(".btn-error").shouldHave(text("Неверный формат e-mail"));
    }

    @Test
    void UnsucsessfulWrongEmail7() {
        open("https://school.qa.guru");
        $("[name=email]").setValue("qaguru@botGmail.com");
        $("[name=password]").setValue("somepasshere").pressEnter();
        $(".btn-error").shouldHave(text("Неверный пароль"));
    }

    @Test
    void UnsucsessfulWrongEmail8() {
        open("https://school.qa.guru");
        $("[name=email]").setValue("qaguru@botгmail.com");
        $("[name=password]").setValue("somepasshere").pressEnter();
        $(".btn-error").shouldHave(text("Неверный формат e-mail"));
    }

    @Test
    void UnsucsessfulWrongEmail9() {
        open("https://school.qa.guru");
        $("[name=email]").setValue("qaguru@botglmail.com");
        $("[name=password]").setValue("somepasshere").pressEnter();
        $(".btn-error").shouldHave(text("Неверный пароль"));
    }

    @Test
    void UnsucsessfulWrongEmail10() {
        open("https://school.qa.guru");
        $("[name=email]").setValue("");
        $("[name=password]").setValue("somepasshere").pressEnter();
        $(".btn-error").shouldHave(text("Не заполнено поле E-mail"));
    }

    @Test
    void UnsucsessfulWrongEmail11() {
        open("https://school.qa.guru");
        $("[name=email]").setValue("   ");
        $("[name=password]").setValue("somepasshere").pressEnter();
        $(".btn-error").shouldHave(text("Неверный формат e-mail"));
    }

    @Test
    void UnsucsessfulWrongEmail12() {
        open("https://school.qa.guru");
        $("[name=email]").setValue("qaguru@botgmail*com");
        $("[name=password]").setValue("somepasshere").pressEnter();
        $(".btn-error").shouldHave(text("Неверный формат e-mail"));
    }

    @Test
    void UnsucsessfulWrongEmail13() {
        open("https://school.qa.guru");
        $("[name=email]").setValue("qaguru@.com");
        $("[name=password]").setValue("somepasshere").pressEnter();
        $(".btn-error").shouldHave(text("Неверный формат e-mail"));
    }

    @Test
    void UnsucsessfulWrongEmail14() {
        open("https://school.qa.guru");
        $("[name=email]").setValue("qaguru@123.com");
        $("[name=password]").setValue("somepasshere").pressEnter();
        $(".btn-error").shouldHave(text("Неверный пароль"));
    }

    @Test
    void UnsucsessfulWrongEmail15() {
        open("https://school.qa.guru");
        $("[name=email]").setValue("qaguru@*.com");
        $("[name=password]").setValue("somepasshere").pressEnter();
        $(".btn-error").shouldHave(text("Неверный формат e-mail"));
    }

    @Test
    void UnsucsessfulWrongEmail16() {
        open("https://school.qa.guru");
        $("[name=email]").setValue("qaguru@   .com");
        $("[name=password]").setValue("somepasshere").pressEnter();
        $(".btn-error").shouldHave(text("Неверный формат e-mail"));
    }

    @Test
    void UnsucsessfulWrongEmail17() {
        open("https://school.qa.guru");
        $("[name=email]").setValue("qaguru@абц.com");
        $("[name=password]").setValue("somepasshere").pressEnter();
        $(".btn-error").shouldHave(text("Неверный формат e-mail"));
    }

    @Test
    void UnsucsessfulWrongEmail18() {
        open("https://school.qa.guru");
        $("[name=email]").setValue("qaguru@АБЦ.com");
        $("[name=password]").setValue("somepasshere").pressEnter();
        $(".btn-error").shouldHave(text("Неверный формат e-mail"));
    }

    @Test
    void UnsucsessfulWrongEmail19() {
        open("https://school.qa.guru");
        $("[name=email]").setValue("qaguru@BOTgmail.com");
        $("[name=password]").setValue("somepasshere").pressEnter();
        $(".btn-error").shouldHave(text("Неверный пароль"));
    }

    @Test
    void UnsucsessfulWrongEmail20() {
        open("https://school.qa.guru");
        $("[name=email]").setValue("qaguru@botgmail.абц");
        $("[name=password]").setValue("somepasshere").pressEnter();
        $(".btn-error").shouldHave(text("Неверный формат e-mail"));
    }

    @Test
    void UnsucsessfulWrongEmail21() {
        open("https://school.qa.guru");
        $("[name=email]").setValue("qaguru@botgmail.*#@");
        $("[name=password]").setValue("somepasshere").pressEnter();
        $(".btn-error").shouldHave(text("Неверный формат e-mail"));
    }

    @Test
    void UnsucsessfulWrongEmail22() {
        open("https://school.qa.guru");
        $("[name=email]").setValue("qaguru@botgmail.  ");
        $("[name=password]").setValue("somepasshere").pressEnter();
        $(".btn-error").shouldHave(text("Неверный формат e-mail"));
    }

    @Test
    void UnsucsessfulWrongEmail23() {
        open("https://school.qa.guru");
        $("[name=email]").setValue("qaguru@botgmail.COM");
        $("[name=password]").setValue("somepasshere").pressEnter();
        $(".btn-error").shouldHave(text("Неверный пароль"));
    }

    @Test
    void UnsucsessfulWrongEmail24() {
        open("https://school.qa.guru");
        $("[name=email]").setValue("qaguru@botgmail.far");
        $("[name=password]").setValue("somepasshere").pressEnter();
        $(".btn-error").shouldHave(text("Неверный пароль"));
    }

    @Test
    void UnsucsessfulWrongEmail25() {
        open("https://school.qa.guru");
        $("[name=email]").setValue("qaguru@botgmail.АБЦ");
        $("[name=password]").setValue("somepasshere").pressEnter();
        $(".btn-error").shouldHave(text("Неверный формат e-mail"));
    }
}