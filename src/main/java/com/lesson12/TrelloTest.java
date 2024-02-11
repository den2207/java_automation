package com.lesson12;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import com.github.javafaker.Faker;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Selectors.byClassName;
import static com.codeborne.selenide.Selenide.$;

public class TrelloTest {
    String email = "bolag15513@rohoza.com";
    String password = ",D78)argKcH*JH#";


    @Test(priority = 0)
    public void testLogin() {
        Selenide.open("https://trello.com/uk/login");

        SelenideElement emailField = $("input#user.form-field").shouldBe(Condition.visible);
        emailField.setValue(email);
        Selenide.screenshot("Email screen");

        SelenideElement loginButton = $("input#login.button");
        loginButton.click();
        Selenide.screenshot("Email success");

        SelenideElement passwordButton = $("input#password");
        passwordButton.click();
        passwordButton.setValue(password);
        Selenide.screenshot("Password screen");

        $("button#login-submit").shouldBe(Condition.visible).click();
        Selenide.screenshot("Password success");
    }

    @Test(priority = 1)
    public void testOpenBoard() {
        SelenideElement boardElement = $("div[title='My Trello board'].board-tile-details-name");
        boardElement.shouldBe(Condition.visible);
        boardElement.click();
        Selenide.screenshot("Board open success");
    }

    @Test(priority = 2)
    public void testCreateCard() {
        SelenideElement addButton = $("[data-testid='list-add-card-button']");
        addButton.shouldBe(Condition.visible).click();

        SelenideElement textarea = $("[data-testid='list-card-composer-textarea']");
        textarea.shouldBe(Condition.visible);

        String randomCardName = String.valueOf(Faker.instance().name());

        textarea.setValue(randomCardName);

        SelenideElement createdCard = $("[data-testid='list-card-composer-add-card-button']");
        createdCard.shouldBe(Condition.visible).click();

        //Idk how delete sleep
        Selenide.sleep(2000);

        //IDK how choose data-testid='card-name specific for my name
        SelenideElement matchingCardLink;
        matchingCardLink = $("a[data-testid='card-name']")
                .shouldBe(Condition.visible)
                .shouldHave(Condition.exactText(randomCardName));
        matchingCardLink.click();
    }

    @Test(priority = 3)
    public void testCardField() {
        //TODO: Add this, I cant select any fields
    }

    @Test(priority = 4)
    public void testDeleteCard(){
        SelenideElement archiveButton = Selenide.$(byClassName("js-archive-card"));
        archiveButton.scrollTo();
        archiveButton.shouldBe(Condition.visible);
        archiveButton.click();

        Selenide.screenshot("Archive button");

        SelenideElement deleteButton = Selenide.$(byClassName("js-delete-card"));
        deleteButton.shouldBe(Condition.visible);
        deleteButton.click();
        Selenide.screenshot("Delete button");

        SelenideElement deleteConfirmationButton = Selenide.$(byClassName("nch-button--danger"));
        deleteConfirmationButton.shouldBe(Condition.visible);
        deleteConfirmationButton.click();

    }
}
