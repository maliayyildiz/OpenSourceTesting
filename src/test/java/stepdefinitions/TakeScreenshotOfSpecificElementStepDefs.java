package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.Point;
import org.openqa.selenium.interactions.Actions;
import utilities.Driver;
import utilities.ReusableMethods;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;
import java.awt.event.MouseEvent;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class TakeScreenshotOfSpecificElementStepDefs {
    @Given("go to webpage")
    public void go_to_webpage() {
        Driver.getDriver().get("https://organicoepsom.co.uk/");
    }

    @When("user select the element which will take screenshot of element")
    public void user_select_the_element_which_will_take_screenshot_of_element() {
        Driver.getDriver().findElement(By.xpath("(//h3)[1]")).click();
    }

    @Then("take a screenshot of specific element")
    public void take_a_screenshot_of_specific_element() throws IOException {
        WebElement selectedPicture = Driver.getDriver().findElement(By.xpath("(//div[@class='slick-slide slick-current slick-active'])[2]"));
        File screenshot = ((TakesScreenshot)Driver.getDriver()).getScreenshotAs(OutputType.FILE);
        BufferedImage fullImage = ImageIO.read(screenshot);

        Point elementPoint = selectedPicture.getLocation();

        int selectedPictureWidth = selectedPicture.getSize().getWidth();
        int selectedPictureHeight = selectedPicture.getSize().getHeight();

        BufferedImage elementScreenshot = fullImage.getSubimage(elementPoint.getX(),elementPoint.getY(),selectedPictureWidth,selectedPictureHeight);

        ImageIO.write(elementScreenshot,"png",screenshot);

        FileUtils.copyFile(screenshot,(new File("expectedPicture.jpeg")));

    }

    @When("user view button on element which will take screenshot of element")
    public void userViewButtonOnElementWhichWillTakeScreenshotOfElement() {

    WebElement firstElementQuickViewButton = Driver.getDriver().findElement(By.xpath("//a[@data-id='2901']"));
    firstElementQuickViewButton.click();
        ReusableMethods.wait(4);
    }

    @Then("take a screenshot of specific element II")
    public void takeAScreenshotOfSpecificElementII() {

    }

    @When("select the element")
    public void selectTheElement() {
        Driver.getDriver().findElement(By.xpath("(//h3)[1]")).click();
    }

    @Then("download picture like save as")
    public void downloadPictureLikeSaveAs() throws InterruptedException, AWTException {
      //  Driver.getDriver().findElement(By.xpath("(//div[@class='slick-slide slick-current slick-active'])[1]")).click();
        WebElement selectedPictured = Driver.getDriver().findElement(By.xpath("//img[@class='attachment-thumbnail size-thumbnail']"));

        Actions actions =new Actions(Driver.getDriver());
        actions.moveToElement(selectedPictured).build().perform();

        //ReusableMethods.scrollToElement(Driver.getDriver().findElement(By.className("ciyashop-product-thumbnail__image")));
      //  Point elementPoint = selectedPictured.getLocation();


       // Actions actions = new Actions(Driver.getDriver());
        //actions.moveToElement(selectedPicture);
//        actions.contextClick(selectedPicture).build().perform();

       // actions.sendKeys(Keys.COMMAND+"V").build().perform();
        Thread.sleep(1000);
        Robot robot = new Robot();
         ReusableMethods.wait(5);
       // System.out.println(elementPoint.getX()+"  " +elementPoint.getY());
      //  robot.mouseMove(235 ,662);

        robot.mousePress(InputEvent.BUTTON3_DOWN_MASK);
        robot.mouseRelease(InputEvent.BUTTON3_DOWN_MASK);
        Thread.sleep(1000);

        robot.keyPress(KeyEvent.VK_DOWN);
        robot.keyRelease(KeyEvent.VK_DOWN);
        Thread.sleep(1000);
        robot.keyPress(KeyEvent.VK_DOWN);
        robot.keyRelease(KeyEvent.VK_DOWN);
        Thread.sleep(1000);
        robot.keyPress(KeyEvent.VK_ENTER);
        robot.keyRelease(KeyEvent.VK_ENTER);


//        robot.keyPress(KeyEvent.VK_S);
//        robot.keyRelease(KeyEvent.VK_S);
//
//        robot.keyPress(KeyEvent.VK_ENTER);
//        robot.keyRelease(KeyEvent.VK_ENTER);

//        robot.keyPress(KeyEvent.VK_DOWN);
//        robot.keyRelease(KeyEvent.VK_DOWN);
//        Thread.sleep(2000);
//        robot.keyPress(KeyEvent.VK_DOWN);
//        robot.keyRelease(KeyEvent.VK_DOWN);
//        Thread.sleep(2000);
//        robot.keyPress(KeyEvent.VK_ENTER);
//        robot.keyRelease(KeyEvent.VK_ENTER);
//        Thread.sleep(2000);
//        robot.keyPress(KeyEvent.VK_ENTER);
//        robot.keyRelease(KeyEvent.VK_ENTER);


    }
}
