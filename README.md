# Ethereum-Wallet-Dashboard-Test
QA application which tests the features of the Dashboard application, using Selenium WebDriver and the Cucumber Framework.

### `Selenium WebDriver`

<a href="https://www.selenium.dev" target="_blank" rel="noreferrer"> <img src="https://raw.githubusercontent.com/devicons/devicon/master/icons/selenium/selenium-original.svg" alt="react" width="100" height="100"/></a>

Selenium WebDriver is used to automate web application testing to verify that pages work as expected.  
**Utilizing the Page Factory model, page objects were created utilizing the xpath selector to select page attributes.**

This project contains four packages under the **test** directory: **pages**, **stepDefinitions**, **features**, and **options**.

Each route in the Ethereum Wallet Dashboard site has its own unique page. There are 19 pages total, therefore, 19 different
page object models in this test. These are stored in the pages package.

The options package contains the test runner class which is essentially the glue which brings the pages, features and their
step definitions together.

The features package contains the feature files that have the behaviour-oriented test cases. These are run against the pages' functionality to see if they match the desired output.

The step definitions package contains the code implementation of these feature files and their pages. This is where all the 
test cases run and evaluated based on their behaviour to see if the output produced is the desired outcome.



### `Cucumber Framework`

<a href="https://cucumber.io/" target="_blank" rel="noreferrer"> <img src="https://raw.githubusercontent.com/devicons/devicon/master/icons/cucumber/cucumber-plain-wordmark.svg" alt="express" width="100" height="100"/></a>

A framework that is essentially a testing tool that supports Behavior Driven Development (BDD). It offers a way to write tests that anybody can understand, regardless of their technical knowledge.

The feature files are written in plain English, Gherkin. These consists of steps outlined by Given, When, Then, And scenarios. These are then mapped out individually using a Step definition equivalent class which contains the code implementation of these steps. It is here that, with Assert statements, tests cases are verified.



### `Start Here`

There is a `.jar` file added to this project for a compact import to any workspace, for the purposes of learning and investigating. It also contains a bash script in the root directory of this project which can be executed, downloading all the files, directories, and packages to the Desktop.

Please note that you will need to run this as a maven project and import the dependencies outlined in the `pom.xml` file of this project. The bash script only allows for preliminary setup. 



### `Links`

For more information, here are links to the available resources used in this project.

[Selenium WebDriver](https://www.selenium.dev/documentation/webdriver/)
[Cucumber Framework](https://cucumber.io/)