package ru.geekbrains.main.site.at.block;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import ru.geekbrains.main.site.at.BasePage;

public class CoursesNavigation extends BasePage {

    @FindBy(css=".nav-tabs-item #prof-link")
    private WebElement tabProfessions;

    @FindBy(css=".nav-tabs-item #free-link")
    private WebElement tabFreeIntensive;

    @FindBy(css=".nav-tabs-item #cour-link")
    private WebElement tabCourses;

//    @FindBy(css=".nav-tabs-item #prof-link")
//    private WebElement tabCompanies;

    public CoursesNavigation(WebDriver driver) {
        super(driver);
    }

    public BasePage clickTab(Tab tab) {
        switch (tab) {
            case Professions: {
                this.tabProfessions.click();
                break;
            }
            case FreeIntensive: {
                this.tabFreeIntensive.click();
                break;
            }
            case Courses: {
                this.tabCourses.click();
                break;
            }
//            case Companies: {
//                this.tabCompanies.click();
//                break;
//            }
        }

        return this;
    }

    public enum Tab {
        Professions,
        FreeIntensive,
        Courses
        //, Companies
    }
}
