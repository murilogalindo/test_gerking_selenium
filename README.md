## test_gerking_selenium

## (Projeto não foi executado pois quando rodo a automação e aparecer um CAPTCHA). Para tratar isso, só em ambiente controlado.

## Configurando e rodando o projeto
## Você irá precisar

Instalação Instalar o Java SDK Alguma IDE para JAVA Eclipse ou Intellij Baixar as libs do Selenium - https://www.selenium.dev/downloads/ Baixar o Chromedriver - https://chromedriver.chromium.org/downloads

## Configurar no pom.xml
Pesquisas no MVN Reepository https://mvnrepository.com/
Junit 4.13
seleniumhq 4.0.0
cucumber 6.8.0


Iniciando o Java Passo 1 - Instalar o Java em seu computador Baize e Insale o Java Software Development Kit (JDK)

## Estrutura do Projeto

## Projeto iciado para estudos

Dificuldade: fácil

Tecnologias escolhidas: Linguagem Java Framework de testes automatizados: Selenium WebDriver Framework de testes automatizados: JUnit * Cucumber e linguagem Guerkin

## Resumo:
Encontrar path relativo de driver

Básico de WebDriver

Básico de BDD

Básico de gherkin 

Criar um método de teste

Validar resultados de teste

## Estrutura do Projeto

## Features:
Onde são criados os arquivos .feature para escrita da linguagem gherkin

## setpDefinitions
Pasta onde são criadas as classes de testes

## testRunner
Classe reposnsável por chamar e executar os cenários de testes


Abre a sua IDE e importe o porjeto mporte as libs do Selenium Configure o caminho da pasta onde está seu arquivo webdriver através do código: System.setProperty("webdriver.chrome.driver", "/home/user/Documentos/webdrivers/chromedriver");

No projeto: Clique com o botão direito sobre a classe TestRunner.java
