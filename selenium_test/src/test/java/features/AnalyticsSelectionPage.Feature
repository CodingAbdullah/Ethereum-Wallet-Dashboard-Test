Feature: Testing display and content of Analytics Selection Page



Scenario Outline: User selects Analytics Selection page to enter an incorrect wallet address
Given User lands on Analytics Selection page
When  User selects Navbar to enter an incorrect wallet address <WalletAddress>
Then  Display alert warning User
Examples:
	| WalletAddress 							  |	
	| "abc"			  							  |
	| "0x234r34t"   							  |
	| "123456789"   							  |
	| "walletAddr"  							  |
	| "0xcdbf58a9a9b54a2c43800c50c7192946de85832" | 
	

	
Scenario Outline: User selects Analytics Selection page to enter a correct wallet address
Given User lands on Analytics Selection page
When  User selects Navbar to enter a correct wallet address <WalletAddress>
Then  Redirect User to Transactions page
Examples:
	| WalletAddress                                 |
	| "0x2b6ed29a95753c3ad948348e3e7b1a251080ffb9"  |
	| "0x195b91ccebd51aa61d851fe531f5612dea4efbfd"  |
	| "0x9845e1909dca337944a0272f1f9f7249833d2d19"  |
	| "0x0c23fc0ef06716d2f8ba19bc4bed56d045581f2d"  |
	| "0xcdbf58a9a9b54a2c43800c50c7192946de858321"  | 
	
	

Scenario: User selects Analytics Selection page to view Token Analytics page
Given User lands on Analytics Selection page
When  User selects the view Token Analytics button
Then  Redirect User to the Token Analytics page



Scenario: User selects Analytics Selection page to view Wallet Analytics page
Given User lands on Analytics Selection page
When  User selects the view Wallet Analytics button
Then  Redirect User to the Wallet Analytics page