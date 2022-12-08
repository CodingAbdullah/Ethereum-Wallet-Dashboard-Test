Feature: Testing ENS Lookups Page for content and display



Scenario Outline: User selects ENS Lookups page to enter an incorrect wallet address
Given User lands on ENS To Address Page
When  User selects Navbar to enter an incorrect wallet address <WalletAddress>
Then  Display alert warning User
Examples:
	| WalletAddress 							  |	
	| "abc"			  							  |
	| "0x234r34t"   							  |
	| "123456789"   							  |
	| "walletAddr"  							  |
	| "0xcdbf58a9a9b54a2c43800c50c7192946de85832" | 
	
	
	
Scenario Outline: User selects ENS Lookups page to enter a correct wallet address
Given User lands on ENS Lookups page
When  User selects Navbar to enter a correct wallet address <WalletAddress>
Then  Redirect User to Transactions Page
Examples:
	| WalletAddress                                 |
	| "0x2b6ed29a95753c3ad948348e3e7b1a251080ffb9"  |
	| "0x195b91ccebd51aa61d851fe531f5612dea4efbfd"  |
	| "0x9845e1909dca337944a0272f1f9f7249833d2d19"  |
	| "0x0c23fc0ef06716d2f8ba19bc4bed56d045581f2d"  |
	| "0xcdbf58a9a9b54a2c43800c50c7192946de858321"  |
	
	
	
Scenario: User selects ENS Lookups Page to view Address To ENS page
Given User lands on ENS Lookups page
When  User selects the view Address To ENS button
Then  Redirect User to the Address To ENS page



Scenario: User selects ENS Lookups Page to view ENS To Address page
Given User lands on ENS Lookups page
When  User selects the view ENS To Address button
Then  Redirect User to the ENS To Address page



Scenario: User selects ENS Lookups Page to view ENS Transfers By Name page
Given User lands on ENS Lookups page
When  User selects the view ENS Transfers By Name button
Then  Redirect User to the ENS Transfers By Name page



Scenario: User selects ENS Lookups Page to view ENS Transfers By Id page
Given User lands on ENS Lookups page
When  User selects the view ENS Transfers By Id button
Then  Redirect User to the ENS Transfers By Id page
