package com.pages;

import static com.codeborne.selenide.Condition.exist;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.sleep;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.codeborne.selenide.SelenideElement;
import com.main.appmanager.ApplicationManager;

public class tko_11_NewContainerAddress {
	public static ApplicationManager app;
	WebDriver driver;

	public tko_11_NewContainerAddress() {

		app = new ApplicationManager();
	}


	public SelenideElement login() {
		return $(By.xpath("//input[@placeholder='Логин']")).waitUntil(visible, app.timeOut);
	}
	
	public SelenideElement password() {
		return $(By.xpath("//input[@placeholder='Пароль']")).waitUntil(visible, app.timeOut);
	}

	public SelenideElement buttonGo() {
		return $(By.xpath("//div[@class='v-button v-widget c-login-submit-button v-button-c-login-submit-button icon v-button-icon']")).waitUntil(visible, app.timeOut);
	}

	public SelenideElement agent() {
		return $(By.xpath("//table[@class='v-table-table']/tbody/tr")).waitUntil(visible, app.timeOut);
	}

	public SelenideElement menuContainer() {
		return $(By.xpath("//div[@class='v-captiontext' and text()='Контейнерные площадки']")).waitUntil(visible, app.timeOut);
	}


	public SelenideElement selectObject() {
		return $(By.xpath("//div[@class='v-table-cell-wrapper']")).waitUntil(visible, app.timeOut);
	}
	public SelenideElement buttonAdd() {
		return $(By.xpath("//div[@class='v-button v-widget primary v-button-primary icon v-button-icon']")).waitUntil(visible, app.timeOut);
	}
	public SelenideElement buttonCreate() {
		return $(By.xpath("(//div[@class='v-slot v-slot-icon v-slot-c-primary-action'])[2]")).waitUntil(visible, app.timeOut);
	}
	public SelenideElement textWidth() {
		return $(By.xpath("//input[@class='v-textfield v-widget c-empty-value']")).waitUntil(visible, app.timeOut);
	}
	public SelenideElement textLong() {
		return $(By.xpath("(//div[@class='v-widget v-has-caption v-caption-on-top'])[2]/input")).waitUntil(visible, app.timeOut);
	}
	public SelenideElement buttonMarker() {
		return $(By.xpath("//div[@class='v-slot v-slot-primary v-align-right v-align-bottom']")).waitUntil(visible, app.timeOut);
	}
	public SelenideElement menuAccess() {
		return $(By.xpath("//div[@class='v-filterselect-button']")).waitUntil(visible, app.timeOut);
	}
	public SelenideElement selectAccess() {
		return $(By.xpath("//div[@class='v-filterselect-suggestmenu']//td")).waitUntil(visible, app.timeOut);
	}
	public SelenideElement addContainer() {
		return $(By.xpath("(//div[@class='v-button v-widget icon v-button-icon'])[4]")).waitUntil(visible, app.timeOut);
	}
	public SelenideElement boxType() {
		return $(By.xpath("//tr[@class='v-grid-row v-grid-row-has-data']/td")).waitUntil(visible, app.timeOut);
	}
	public SelenideElement menuType() {
		return $(By.xpath("(//div[@class='v-filterselect-button'])[2]")).waitUntil(visible, app.timeOut);
	}
	public SelenideElement selectType() {
		return $(By.xpath("//div[@class='v-filterselect-suggestmenu']//tr[2]")).waitUntil(visible, app.timeOut);
	}
	public SelenideElement textQuantity() {
		return $(By.xpath("//input[@class='v-textfield v-widget v-textfield-error v-textfield-error-error v-textfield-required v-required v-has-width c-empty-value']")).waitUntil(visible, app.timeOut);
	}
	public SelenideElement buttonOkContainer() {
		return $(By.xpath("//button[@class='v-grid-editor-save']")).waitUntil(visible, app.timeOut);
	}
	public SelenideElement buttonOk() {
		return $(By.xpath("(//div[@class='v-button v-widget icon v-button-icon c-primary-action v-button-c-primary-action'])[3]")).waitUntil(visible, app.timeOut);
	}
	public SelenideElement buttonSelect() {
		return $(By.xpath("//div[@class='v-button v-widget c-window-action-button v-button-c-window-action-button icon v-button-icon c-primary-action v-button-c-primary-action']")).waitUntil(visible, app.timeOut);
	}
	
	public SelenideElement buttonExport() {
		return $(By.xpath("//div[@class='v-button v-widget borderless v-button-borderless']")).waitUntil(visible, app.timeOut);
	}
	public SelenideElement checkboxTuesday() {
		return $(By.xpath("(//div[@class='v-slot'])[21]//label")).waitUntil(visible, app.timeOut);
	}
	public SelenideElement checkboxThursday() {
		return $(By.xpath("(//div[@class='v-slot'])[23]//label")).waitUntil(visible, app.timeOut);
	}
	public SelenideElement checkboxSaturday() {
		return $(By.xpath("(//div[@class='v-slot'])[25]//label")).waitUntil(visible, app.timeOut);
	}
	public SelenideElement buttonOkExport() {
		return $(By.xpath("(//div[@class='v-button v-widget primary v-button-primary icon v-button-icon'])[2]")).waitUntil(visible, app.timeOut);
	}
	public SelenideElement buttonOkExport2() {
		return $(By.xpath("(//div[@class='v-button v-widget icon v-button-icon c-primary-action v-button-c-primary-action'])[2]")).waitUntil(visible, app.timeOut);
	}
	public SelenideElement menuMyRequest() {
		return $(By.xpath("//div[@class='v-captiontext' and text()='Мои заявки']")).waitUntil(visible, app.timeOut);
	}
	public SelenideElement MyRequest() {
		return $(By.xpath("//table[@class='v-table-table']/tbody/tr")).waitUntil(visible, app.timeOut);
	}
	
	public void start() {

		login().sendKeys("6783");
		sleep(1000);
		password().sendKeys("6783");
		sleep(1000);
		buttonGo().click();
		sleep(1500);

	}
	public void selectAgent() {


		agent().doubleClick();
		sleep(1000);
		menuContainer().click();
		sleep(1000);
		selectObject().click();
		sleep(1000);
		buttonAdd().click();
		sleep(1000);

	}

	public void editAgent() {

		buttonCreate().click();
		sleep(3000);
		textWidth().sendKeys("52,273785");
		sleep(1000);
		textLong().sendKeys("104,314589");
		sleep(1000);
		buttonMarker().click();
		sleep(1500);
		menuAccess().click();
		sleep(1000);
		selectAccess().click();
		sleep(1000);
		addContainer().click();
		sleep(1000);
		boxType().doubleClick();
		sleep(2500);
		menuType().click();
		sleep(1000);
		selectType().click();
		sleep(1000);
		textQuantity().sendKeys("3");
		sleep(1000);
		buttonOkContainer().click();
		sleep(1000);
		buttonOk().click();
		sleep(3000);
		buttonSelect().click();
		sleep(1000);
		buttonExport().click();
		sleep(1000);
		checkboxTuesday().click();
		sleep(500);
		checkboxThursday().click();
		sleep(500);
		checkboxSaturday().click();
		sleep(500);
		buttonOkExport().click();
		sleep(1000);
		buttonOkExport2().click();
		sleep(2000);
		menuMyRequest().click();
		sleep(1000);
		MyRequest().click();
		sleep(6000);
	}
	// Загрузка файла
	public SelenideElement file() {
		File file = new File("");
		String fileName="\\files\\NDFL.jpg";
		
		SelenideElement locator = $(By.xpath("//*[@name='files[]']")).waitUntil(exist, app.timeOut);
		locator.uploadFile(new File(file.getAbsolutePath()+fileName));
		return locator;

	}

	public void AddProperty() {
		
		app.tko_11().start();
		app.tko_11().selectAgent();
		app.tko_11().editAgent();



	}

}
