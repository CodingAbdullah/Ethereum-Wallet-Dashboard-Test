Feature: Testing Address To ENS Page for content and display



Scenario Outline: User selects Address To ENS Page to enter an incorrect wallet address
Given User lands on Address To ENS Page
When  User selects Navbar to enter an incorrect wallet address <WalletAddress>
Then  Display alert warning User
Examples:
	| WalletAddress 							  |	
	| "abc"			  							  |
	| "0x234r34t"   							  |
	| "123456789"   							  |
	| "walletAddr"  							  |
	| "0xcdbf58a9a9b54a2c43800c50c7192946de85832" | 
	
	
	
Scenario Outline: User selects Address To ENS Page to enter a correct wallet address
Given User lands on Address To ENS Page
When  User selects Navbar to enter a correct wallet address <WalletAddress>
Then  Redirect User to Transactions Page
Examples:
	| WalletAddress                                 |
	| "0x2b6ed29a95753c3ad948348e3e7b1a251080ffb9"  |
	| "0x195b91ccebd51aa61d851fe531f5612dea4efbfd"  |
	| "0x9845e1909dca337944a0272f1f9f7249833d2d19"  |
	| "0x0c23fc0ef06716d2f8ba19bc4bed56d045581f2d"  |
	| "0xcdbf58a9a9b54a2c43800c50c7192946de858321"  |
	
	 

Scenario Outline: User selects Address To ENS Page to enter correct wallet address lookup
Given User lands on Address To ENS Page
When  User enters a correct wallet address for ENS lookup <WalletAddress>
Then  Display wallet information to User
Examples:
	| WalletAddress                                 |
	| "0x2b6ed29a95753c3ad948348e3e7b1a251080ffb9"  |
	| "0x195b91ccebd51aa61d851fe531f5612dea4efbfd"  |
	| "0x9845e1909dca337944a0272f1f9f7249833d2d19"  |
	| "0x0c23fc0ef06716d2f8ba19bc4bed56d045581f2d"  |
	| "0xcdbf58a9a9b54a2c43800c50c7192946de858321"  |
	
	

Scenario Outline: User selects Address To ENS Page to enter incorrect wallet address lookup
Given User lands on Address To ENS Page
When  User enters an incorrect wallet address for ENS lookup <WalletAddress>
Then  Display alert warning User, clear data if any
Examples:
	| WalletAddress 							  |
	| "abc"			  							  |	
	| "0x234r34t"   							  |
	| "123456789"   							  |
	| "walletAddr"  							  |
	| "0xcdbf58a9a9b54a2c43800c50c7192946de85832" | 

	
	
Scenario Outline: User selects Address To ENS Page to enter an address to lookup and clears
Given User lands on Address To ENS Page
When  User enters an address for lookup and requests to clear <WalletAddress>	
Then  Data or alerts clear on page
Examples: 
	| WalletAddress 							    |
	| "abc"			  							    |	
	| "0x234r34t"   							    |
	| "0x9845e1909dca337944a0272f1f9f7249833d2d19"  |
	| "0x0c23fc0ef06716d2f8ba19bc4bed56d045581f2d"  |
	| "0xcdbf58a9a9b54a2c43800c50c7192946de858321"  |

	

Scenario Outline: User selects Address To ENS Page to enter an address to lookup and goes home
Given User lands on Address To ENS Page
When  User enters an address for lookup and requests to go back <WalletAddress>
Then  Redirect User to Home Page
Examples:
	| WalletAddress 							    |
	| "abc"			  							    |	
	| "0x234r34t"   							    |
	| "0x9845e1909dca337944a0272f1f9f7249833d2d19"  |
	| "0x0c23fc0ef06716d2f8ba19bc4bed56d045581f2d"  |
	| "0xcdbf58a9a9b54a2c43800c50c7192946de858321"  |