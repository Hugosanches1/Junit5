package br.com.projeto.Junit5.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomeObjects {
	
	private WebDriver driver;
	
	@FindBy(id="email")
	private WebElement inputEmail;
	
	@FindBy(name="pass")
	private WebElement inputSenha;
	
	@FindBy(id="u_0_f")
	private WebElement butEntrar;

	public HomeObjects(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public WebElement getInputEmail() {
		return inputEmail;
	}

	public void setInputEmail(WebElement inputEmail) {
		this.inputEmail = inputEmail;
	}

	public WebElement getInputSenha() {
		return inputSenha;
	}

	public void setInputSenha(WebElement inputSenha) {
		this.inputSenha = inputSenha;
	}

	public WebElement getButEntrar() {
		return butEntrar;
	}

	public void setButEntrar(WebElement butEntrar) {
		this.butEntrar = butEntrar;
	}
	
	

}
