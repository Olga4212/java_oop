package ru.geekbrains.main.site.at.page.content;

import org.openqa.selenium.WebDriver;
import ru.geekbrains.main.site.at.BasePage;
import ru.geekbrains.main.site.at.block.CoursesNavigation;
import ru.geekbrains.main.site.at.block.Header;
import ru.geekbrains.main.site.at.block.LeftNavigation;

public class CoursePage extends BasePage {
    private CoursesNavigation coursesNavigation;
    private LeftNavigation leftNavigation;
    private Header header;

    public CoursePage(WebDriver driver) {
        super(driver);

        this.leftNavigation = new LeftNavigation(driver);
        this.coursesNavigation = new CoursesNavigation(driver);
        this.header = new Header(driver);
    }

    public LeftNavigation getLeftNavigation() {
        return this.leftNavigation;
    }

    public Header getHeader() {
        return header;
    }

    @Override
    public CoursePage closedPopUp() {
        super.closedPopUp();
        return this;
    }

    public CoursesNavigation getCoursesNavigation() {
        return coursesNavigation;
    }
}