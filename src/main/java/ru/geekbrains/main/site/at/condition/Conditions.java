package ru.geekbrains.main.site.at.condition;

import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

public class Conditions {
    public static ExpectedCondition<Boolean> innerHtmlIsGreater(final WebElement element, final int value) {
        return new ExpectedCondition<Boolean>() {
            public Boolean apply(WebDriver driver) {
                try {
                    String elementText = element.getAttribute("innerHTML");
                    assertThat(Integer.parseInt(elementText), greaterThan(value));
                    return true;
                } catch (StaleElementReferenceException var3) {
                    return null;
                }
            }

            public String toString() {
                return String.format("text of element ('%s') is greater than %d", element, value);
            }
        };
    }

    public static ExpectedCondition<Boolean> innerHtmlIsBeetween(final WebElement element, final int from, final int to) {
        return new ExpectedCondition<Boolean>() {
            public Boolean apply(WebDriver driver) {
                try {
                    String elementText = element.getAttribute("innerHTML");
                    assertThat(Integer.parseInt(elementText), allOf(
                            greaterThan(from),
                            lessThan(to)
                            )
                    );
                    return true;
                } catch (StaleElementReferenceException var3) {
                    return null;
                }
            }

            public String toString() {
                return String.format("text of element ('%s') is between  %d and %d", element, from, to);
            }
        };
    }

    public static ExpectedCondition<Boolean> innerHtmlIsNotEquals(final WebElement element, final int value) {
        return new ExpectedCondition<Boolean>() {
            public Boolean apply(WebDriver driver) {
                try {
                    String elementText = element.getAttribute("innerHTML");
                    assertThat(
                            Integer.parseInt(elementText),
                            not(comparesEqualTo(value))
                    );
                    return true;
                } catch (StaleElementReferenceException var3) {
                    return null;
                }
            }

            public String toString() {
                return String.format("text of element ('%s') is not equal than %d", element, value);
            }
        };
    }

    public static ExpectedCondition<Boolean> exists(final WebElement element) {
        return new ExpectedCondition<Boolean>() {
            public Boolean apply(WebDriver driver) {
                return element != null;
            }

            public String toString() {
                return String.format("text of element ('%s') exists", element);
            }
        };
    }
}
