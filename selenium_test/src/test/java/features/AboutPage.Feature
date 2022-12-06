Feature: Testing Display and Content of About Page



Scenario Outline: User selects About Page to enter an incorrect wallet address
Given User lands on About Page
When  User selects Navbar to enter an incorrect wallet address <WalletAddress>
Then  Display alert warning User
Examples:
	| WalletAddress 							  |	
	| "abc"			  							  |
	| "0x234r34t"   							  |
	| "123456789"   							  |
	| "walletAddr"  							  |
	| "0xcdbf58a9a9b54a2c43800c50c7192946de85832" | 
	
	
	
Scenario Outline: User selects About Page to enter a correct wallet address
Given User lands on About Page
When  User selects Navbar to enter a correct wallet address <WalletAddress>
Then  Redirect User to Transactions Page
Examples:
	| WalletAddress                                 |
	| "0x2b6ed29a95753c3ad948348e3e7b1a251080ffb9"  |
	| "0x195b91ccebd51aa61d851fe531f5612dea4efbfd"  |
	| "0x9845e1909dca337944a0272f1f9f7249833d2d19"  |
	| "0x0c23fc0ef06716d2f8ba19bc4bed56d045581f2d"  |
	| "0xcdbf58a9a9b54a2c43800c50c7192946de858321"  | 
	
			
	
Scenario: User selects About Page to view developer details
Given User lands on About Page
When  User selects the developer information link
Then  Redirect User to the developer's about page



Scenario: User selects About Page to read and go home
Given User lands on About Page
When  User selects the Go Home button
Then  Redirect User to the Home Page