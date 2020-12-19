package br.com.projeto.Junit5.actions;

import org.openqa.selenium.WebDriver;

import br.com.projeto.Junit5.pageobjects.EsqueceuASenhaObjects;

public class EsqueceuASenhaActions {
	
	static EsqueceuASenhaObjects objEsqueceuSenha;
	
	public EsqueceuASenhaActions(WebDriver driver) {
		objEsqueceuSenha = new EsqueceuASenhaObjects(driver);
	} 
	
	public static void esqueceuSenha() {
		objEsqueceuSenha.getLinkEsqueceuSenha().click();
		objEsqueceuSenha.getInputSeuEmailOuTelefone().sendKeys("hugosanches1@hotmail.com");
		objEsqueceuSenha.getButPesquisar().click();
	}

}
