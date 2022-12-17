package Pages;

import Base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Page01 extends BasePage {

    protected static final String registrar = "//*[@id=\"__next\"]/div/div[2]/div/div[1]/form/div[3]/button[2]";

    protected static final String registrarEmail = "//*[@id=\"__next\"]/div/div[2]/div/div[2]/form/div[2]/input";

    protected static final String registrarNome = "//*[@id=\"__next\"]/div/div[2]/div/div[2]/form/div[3]/input";

    protected static final String registrarSenha = "//*[@id=\"__next\"]/div/div[2]/div/div[2]/form/div[4]/div/input";

    protected static final String confirmarSenha = "//*[@id=\"__next\"]/div/div[2]/div/div[2]/form/div[5]/div/input";

    protected static final String botaoCadastrar = "//*[@id=\"__next\"]/div/div[2]/div/div[2]/form/button";

    protected static final String btnCriadoSucesso = "btnCloseModal";


    protected static final String acessoEmail = "//*[@id=\"__next\"]/div/div[2]/div/div[1]/form/div[1]/input";

    protected static final String acesspPassword =  "//*[@id=\"__next\"]/div/div[2]/div/div[1]/form/div[2]/div/input";

    protected static final String botaoAcessar= "//*[@id=\"__next\"]/div/div[2]/div/div[1]/form/div[3]/button[1]";


    protected static final String botaoExtrato = "btn-EXTRATO";

    protected static final String botaoVoltarExtrato = "btnBack";


    protected static final String botaoTransferencia = "btn-TRANSFERÊNCIA";

    protected static final String nConta = "//*[@id=\"__next\"]/div/div[3]/form/div[1]/div[1]/input";

    protected static final String nDigito = "//*[@id=\"__next\"]/div/div[3]/form/div[1]/div[2]/input";

    protected static final String valor = "//*[@id=\"__next\"]/div/div[3]/form/div[2]/input";

    protected static final String descricao = "//*[@id=\"__next\"]/div/div[3]/form/div[3]/input";

    protected static final String botaoTransferirAgora = "//*[@id=\"__next\"]/div/div[3]/form/button";

    protected static final String mensagemErro = "modalText";

    public void registrarConta() {
        WebElement acessar = getWebElement(By.xpath(registrar));
        acessar.click();
    }
    public void inputPersonalDetails(String email, String nome, String senha, String confirmacaoSenha) {

        WebElement campoEmail = getWebElement(By.xpath(registrarEmail));
        campoEmail.clear();
        campoEmail.sendKeys(email);

        WebElement campoName = getWebElement(By.xpath(registrarNome));
        campoName.clear();
        campoName.sendKeys(nome);

        WebElement campoSenha = getWebElement(By.xpath(registrarSenha));
        campoSenha.clear();
        campoSenha.sendKeys(senha);

        WebElement campoConfSenha = getWebElement(By.xpath(confirmarSenha));
        campoConfSenha.clear();
        campoConfSenha.sendKeys(confirmacaoSenha);
    }
    public void btnFecharModal() {
        WebElement fecharModal = getWebElement(By.id(btnCriadoSucesso));
        fecharModal.click();
    }
    public void cadastrarConta() {
        WebElement acessar = getWebElement(By.xpath(botaoCadastrar));
        acessar.click();
    }
    public void inputAccessDetails(String email, String senha) {

        WebElement campoAcessoEmail = getWebElement(By.xpath(acessoEmail));
        campoAcessoEmail.clear();
        campoAcessoEmail.sendKeys(email);

        WebElement campoAcessoSenha = getWebElement(By.xpath(acesspPassword));
        campoAcessoSenha.clear();
        campoAcessoSenha.sendKeys(senha);
    }
    public void confirmarAcesso() {
        WebElement acessarLogin = getWebElement(By.xpath(botaoAcessar));
        acessarLogin.click();
    }
    public void acessoExtrato() {
        WebElement extrato = getWebElement(By.id(botaoExtrato));
        extrato.click();

    }
    public void sairExtrato(){
        WebElement voltar = getWebElement(By.id(botaoVoltarExtrato));
        voltar.click();
    }
    public void acessarTransferencia(){
        WebElement transferir = getWebElement(By.id(botaoTransferencia));
        transferir.click();

    }
    public void inputTransferenciaDetails(String conta, String digito, String nValor, String texto) {
        WebElement campoConta   = getWebElement(By.xpath(nConta ));
        campoConta.clear();
        campoConta.sendKeys(conta);

        WebElement campoDigito = getWebElement(By.xpath(nDigito));
        campoDigito.clear();
        campoDigito.sendKeys(digito);

        WebElement campoValor = getWebElement(By.xpath(valor));
        campoValor.clear();
        campoValor.sendKeys(nValor);

        WebElement campoTexto = getWebElement(By.xpath(descricao));
        campoTexto.clear();
        campoTexto.sendKeys(texto);
    }
    public void concluirTransferencia(){
        WebElement concluirTransferir = getWebElement(By.xpath(botaoTransferirAgora));
        concluirTransferir.click();
    }

    public String getError() {
        WebElement resultado = getWebElement(By.id(mensagemErro));
        return resultado.getText();
    }
}
