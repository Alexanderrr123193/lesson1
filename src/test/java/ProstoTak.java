import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;


import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selenide.*;



public class ProstoTak {
    @BeforeAll
    static void before (){
        Configuration.browserSize = "1920x1080";
        Configuration.timeout = 6000;
        Configuration.pageLoadStrategy = "eager";

    }
    @Test
    void Test123193(){
        open("https://koleso.ru/");
        $("#inputSearchDiginetica").click();
        $("#inputSearchDiginetica").setValue("IKON NOKIAN TYRES AUTOGRAPH ICE 9 205/55 R16");
        $("#inputSearchDiginetica").pressEnter();
        $$(".digi-product__add-to-cart--button_add button").filter(visible).first().click();
        sleep(1000);
        $("a[data-testid='header-btn-basket']").shouldBe(Condition.visible).click();
        $("button[data-testid='btn-design-order']").click();
        $(".PageOrder_Title__AbMEV").should(exist);



        sleep(1000);

    }
}
