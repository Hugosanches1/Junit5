package br.com.projeto.Junit5.actions;

import org.openqa.selenium.WebDriver;

import br.com.projeto.Junit5.pageobjects.HomeObjects;

public class HomeActions {
	
	static HomeObjects objHome;
	
	public HomeActions(WebDriver driver) {
		objHome = new HomeObjects(driver);
	}
	
	public static void login() {
		objHome.getInputEmail().sendKeys("hugosanches1@hotmail.com");
		objHome.getInputSenha().sendKeys("helaynn");
		objHome.getButEntrar().click();
	}

}
