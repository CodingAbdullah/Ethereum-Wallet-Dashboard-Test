Feature: Testing display and content of Token Analytics Selection Page



Scenario: User on the page, selects a sidebar link
Given User lands on a particular page
When  User selects a certain link
Then  Redirect User to that page



Scenario Outline: User selects Token Analytics Selection page to enter an incorrect wallet address
Given User lands on Token Analytics page
When  User selects Navbar to enter an incorrect wallet address <WalletAddress>
Then  Display alert warning User
Examples:
	| WalletAddress 							  |	
	| "abc"			  							  |
	| "0x234r34t"   							  |
	| "123456789"   							  |
	| "walletAddr"  							  |
	| "0xcdbf58a9a9b54a2c43800c50c7192946de85832" | 
	

	
Scenario Outline: User selects Token Analytics Selection age to enter a correct wallet address
Given User lands on Token Analytics page
When  User selects Navbar to enter a correct wallet address <WalletAddress>
Then  Redirect User to Transactions page
Examples:
	| WalletAddress                                 |
	| "0x2b6ed29a95753c3ad948348e3e7b1a251080ffb9"  |
	| "0x195b91ccebd51aa61d851fe531f5612dea4efbfd"  |
	| "0x9845e1909dca337944a0272f1f9f7249833d2d19"  |
	| "0x0c23fc0ef06716d2f8ba19bc4bed56d045581f2d"  |
	| "0xcdbf58a9a9b54a2c43800c50c7192946de858321"  | 
	
	

Scenario: User selects ERC20 Collection Analytics page to view the ERC20 Collection page
Given User lands on Token Analytics page
When  User selects the view ERC20 Collection Analytics button
Then  Redirect User to the ERC20 Collection Analytics page



Scenario: User selects ERC721 Collection Analytics page to view the ERC721 Collection page
Given User lands on Token Analytics page
When  User selects the view ERC721 Collection Analytics button
Then  Redirect User to the ERC721 Collection Analytics page



Scenario: User on the page, selects a footer link
Given User lands on a particular page
When  User selects a footer link
Then  Redirect User to that link