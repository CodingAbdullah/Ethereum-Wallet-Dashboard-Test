Feature: Testing display and content of ENSERC721Selection Page



Scenario: User on the page, selects a sidebar link
Given User lands on a particular page
When  User selects a certain link
Then  Redirect User to that page



Scenario Outline: User selects Coin Prices page to enter an incorrect wallet address
Given User lands on Coin Prices page
When  User selects Navbar to enter an incorrect wallet address <WalletAddress>
Then  Display alert warning User
Examples:
	| WalletAddress 							  |	
	| "abc"                                       |
	| "0x234r34t"   							  |
	| "123456789"   							  |
	| "walletAddr"  							  |
	| "0xcdbf58a9a9b54a2c43800c50c7192946de85832" | 
	

	
Scenario Outline: User selects Coin Prices page to enter a correct wallet address
Given User lands on Coin Prices page
When  User selects Navbar to enter a correct wallet address <WalletAddress>
Then  Redirect User to Transactions page
Examples:
	| WalletAddress                                 |
	| "0x2b6ed29a95753c3ad948348e3e7b1a251080ffb9"  |
	| "0x195b91ccebd51aa61d851fe531f5612dea4efbfd"  |
	| "0x9845e1909dca337944a0272f1f9f7249833d2d19"  |
	| "0x0c23fc0ef06716d2f8ba19bc4bed56d045581f2d"  |
	| "0xcdbf58a9a9b54a2c43800c50c7192946de858321"  | 
	
	
	
Scenario: User selects the Show Prices button to display coin prices
Given User lands on Coin Prices page 
When  User selects show coin prices button
Then  Display coin prices to User and change button to hide coin prices



Scenario: User selects the Show Prices button to display and click a particular coin
Given User lands on Coin Prices page
When  User selects show coin prices button
And   User selects a random coin to select
Then  Redirect User to the selected coin price page



Scenario: User selects the Hide Coin Prices button to hide coin prices
Given User lands on Coin Prices Page
When  User selects hide coin prices button
Then  Hide coin prices to User and change button to show coin prices



Scenario: User on the page, selects a footer link
Given User lands on a particular page
When  User selects a footer link
Then  Redirect User to that link