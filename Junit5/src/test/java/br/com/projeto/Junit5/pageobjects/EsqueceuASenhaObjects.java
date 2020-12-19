package br.com.projeto.Junit5.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class EsqueceuASenhaObjects {
	
	private WebDriver driver;
	
	@FindBy(id="identify_email")
	private WebElement inputSeuEmailOuTelefone;
	
	@FindBy(id="u_0_2")
	private  WebElement butPesquisar;
	
	@FindBy(linkText = "Esqueceu a senha?")
	private WebElement linkEsqueceuSenha;

	public EsqueceuASenhaObjects(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public WebElement getInputSeuEmailOuTelefone() {
		return inputSeuEmailOuTelefone;
	}

	public void setInputSeuEmailOuTelefone(WebElement inputSeuEmailOuTelefone) {
		this.inputSeuEmailOuTelefone = inputSeuEmailOuTelefone;
	}

	public WebElement getButPesquisar() {
		return butPesquisar;
	}

	public void setButPesquisar(WebElement butPesquisar) {
		this.butPesquisar = butPesquisar;
	}

	public WebElement getLinkEsqueceuSenha() {
		return linkEsqueceuSenha;
	}

	public void setLinkEsqueceuSenha(WebElement linkEsqueceuSenha) {
		this.linkEsqueceuSenha = linkEsqueceuSenha;
	}
	
	

	
}
