package com.lesson12;

import com.codeborne.selenide.Selenide;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Selenide.$;

import java.awt.*;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.UnsupportedFlavorException;
import java.io.IOException;

import java.util.Arrays;
import java.util.Collections;
public class TranslateTest {

    @Test
    public void testTranslation() throws Exception {
        String phrase = "Я круто вивчу TestNG";
        String sourceLanguage = "uk";

        String[] targetLanguages = {"sq", "ar", "az", "bn", "bg", "ca", "zh", "zt", "cs", "da", "nl", "en", "eo", "et", "fi", "fr", "de", "el", "he", "hi"};
        Collections.shuffle(Arrays.asList(targetLanguages));

        for (String targetLanguage : targetLanguages) {
            String translatedTextGoogle = getTranslationFromGoogle(phrase, sourceLanguage, targetLanguage);

            String translatedTextLibreTranslate = getTranslationFromLibreTranslate(phrase, sourceLanguage, targetLanguage);
            
            Assert.assertEquals(translatedTextGoogle, translatedTextLibreTranslate, "Translations from Google Translate and LibreTranslate do not match.");

            System.out.printf("Translation test for '%s' completed.\n", targetLanguage);
        }
        System.out.println("Tests completed.");
    }

    private String getTranslationFromGoogle(String phrase, String sourceLanguage, String targetLanguage) {
        Selenide.open("https://translate.google.com/?sl=" + sourceLanguage + "&tl=" + targetLanguage + "&text=" + phrase);

        //I don't understand how to wait for the loader to disappear, so use sleep
        Selenide.sleep(5000);

        String copyButtonSelector = "body#yDmH0d div.YJGJsb > span:nth-child(2) > button > div.VfPpkd-Bz112c-RLmnJb";
        $(By.cssSelector(copyButtonSelector)).click();

        try {
            Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
            return (String) clipboard.getData(DataFlavor.stringFlavor); // Get the copied text
        } catch (IOException | UnsupportedFlavorException e) {
            e.printStackTrace();
            return null;
        }
    }

    private String getTranslationFromLibreTranslate(String phrase, String sourceLanguage, String targetLanguage) {
        try {
            String apiUrl = "https://libretranslate.com/translate";
            Process process = Runtime.getRuntime().exec("curl -X POST -H \"Content-Type: application/json\" -d '{\"q\":\"" + phrase + "\",\"source\":\"" + sourceLanguage + "\",\"target\":\"" + targetLanguage + "\",\"format\":\"text\",\"api_key\":\"\"}' " + apiUrl);
            process.waitFor();

            Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
            return (String) clipboard.getData(DataFlavor.stringFlavor); // Get the copied text
        } catch (IOException | InterruptedException | UnsupportedFlavorException e) {
            e.printStackTrace();
            return null;
        }
    }
}
