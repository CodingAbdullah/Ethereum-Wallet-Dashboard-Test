#!bin/sh

# Make sure you have Node and Git installed on your machine
# This script is complaint with linux distributions only

# Run this command: 
# sh ETH_WALLET_DASHBOARD_TEST_SETUP_LINUX.sh <machine-name-goes-here> to run the project setup

NAME="$1"
cd "/Users/${NAME}/Desktop/"

# Create a test directory in the desktop folder of the local machine
echo 'This is just a test repository to show you how to set up the project.'
echo 'Make sure to have Node and Git installed on your machine'
echo 'Make sure to add the right dependencies from Maven to your POM.xml to run Selenium and Cucumber tests'

mkdir ethereum_wallet_dashboard_test
cd ethereum_wallet_dashboard_test

mkdir features stepDefinitions options main pages
cd features

touch AboutPage.Feature AddressToENSPage.Feature AnalyticsSelectionPage.Feature ENSERC721SelectionPage.Feature ENSLookupsPage.Feature ENSToAddressPage.Feature ENSTransfersByIdPage.Feature ENSTransfersByNamePage.Feature ERC20CollectionPage.Feature ERC20TokenHoldingsPage.Feature ERC20TokenPricesPage.Feature ERC721CollectionPage.Feature ERC721HoldingsPage.Feature ERC721LookupsPage.Feature EthDashboardHomePage.Feature GasStationPage.Feature PricesPage.Feature TokenAnalyticsPage.Feature WalletAnalyticsPage.Feature

# Add step definition classes to be implemented
echo 'Adding Step Definition classes...'
cd ..
cd stepDefinitions
touch AboutPageStepDefinition.java AnalyticsToENSPageStepDefinition.java ENSERC721SelectionPageStepDefinition.java ENSLookupsPageStepDefinition.java ENSToAddressPageStepDefinition.java ENSTransfersByIdPageStepDefinition.java ENSTransfersByNamePageStepDefinition.java ERC20CollectionPageStepDefinition.java ERC20TokenHoldingsPageStepDefinition.java ERC20TokenPricesPageStepDefinition.java ERC721CollectionPageStepDefinition.java ERC721HoldingsPageStepDefinition.java ERC721LookupsPageStepDefinition.java EthDashboardHomePageStepDefinition.java GasStationPageStepDefinition.java PricesPageStepDefinition.java TokenAnalyticsPageStepDefinition.java WalletAnalyticsPageStepDefinition.java

# Add feature files to define the test cases
echo 'Adding feature files for test cases...'
cd ..
cd options
touch TestRunner.java

# Main java file where all pages, features, and step definitions can be linked (optional)
echo 'Adding Main java file...'
cd ..
cd main
touch Main.java

# Page models to represent pages to be tested, following the PageFactory architecture
cd ..
cd pages
touch AboutPage.java AddressToENSPage.java AnalyticsSelectionPage.java ENSERC721SelectionPage.java ENSLookupsPage.java ENSToAddressPage.java ENSTransfersByIdPage.java ENSTransfersByNamePage.java ERC20CollectionPage.java ERC20TokenHoldingsPage.java ERC20TokenPricesPage.java ERC721CollectionPage.java ERC721HoldingsPage.java ERC721LookupsPage.java EthDashboardHomePage.java GasStationPage.java PricesPage.java TokenAnalyticsPage.java WalletAnalyticsPage.java

cd ..
echo 'Project setup complete!' 
echo 'Please make sure to have Maven, Jave (JRE/JDK) to proceed. Add the following dependencies from the Maven repository:'
echo '1: Selenium-Java'
echo '2: Cucumber-Java'
echo '3: Cucumber-Junit'
echo '4: Cucumber-Core'
echo '5: JUnit'