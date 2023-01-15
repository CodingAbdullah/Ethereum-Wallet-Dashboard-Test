Feature: Testing ERC721 Token Holdings Page for content and display



Scenario: User on the page, selects a sidebar link
Given User lands on a particular page
When  User selects a certain link
Then  Redirect User to that page



Scenario Outline: User selects ERC721 Token Holdings Page to enter an incorrect wallet address
Given User lands on ERC721 Token Holdings Page
When  User selects Navbar to enter an incorrect wallet address <WalletAddress>
Then  Display alert warning User
Examples:
	| WalletAddress 							  |	
	| "abc"			  							  |
	| "0x234r34t"   							  |
	| "123456789"   							  |
	| "walletAddr"  							  |
	| "0xcdbf58a9a9b543800c50c7192946de85832"     | 
	
	
	
Scenario Outline: User selects ERC721 Token Holdings Page to enter a correct wallet address
Given User lands on ERC721 Token Holdings Page
When  User selects Navbar to enter a correct wallet address <WalletAddress>
Then  Redirect User to Transactions Page
Examples:
	| WalletAddress                                 |
	| "0x2b6ed29a95753c3ad948348e3e7b1a251080ffb9"  |
	| "0x195b91ccebd51aa61d851fe531f5612dea4efbfd"  |
	| "0x9845e1909dca337944a0272f1f9f7249833d2d19"  |
	| "0x0c23fc0ef06716d2f8ba19bc4bed56d045581f2d"  |
	| "0xcdbf58a9a9b54a2c43800c50c7192946de858321"  |
	
	
	
Scenario Outline: User selects ERC721 Token Holdings Page to enter a correct wallet address for ERC721 holdings
Given User lands on ERC721 Token Holdings Page
When  User enters a correct wallet address for ERC721 holdings <WalletAddress>
Then  Display ERC721 holdings information to User
Examples:
	| WalletAddress                                 |
	| "0x2b6ed29a95753c3ad948348e3e7b1a251080ffb9"  |
	| "0x195b91ccebd51aa61d851fe531f5612dea4efbfd"  |
	| "0x9845e1909dca337944a0272f1f9f7249833d2d19"  |
	| "0x0c23fc0ef06716d2f8ba19bc4bed56d045581f2d"  |
	| "0xcdbf58a9a9b54a2c43800c50c7192946de858321"  |
	
	

Scenario Outline: User selects ERC721 Token Holdings Page to enter an incorrect wallet address for ERC721 holdings
Given User lands on ERC721 Token Holdings Page
When  User enters an incorrect wallet address for ERC721 holdings <WalletAddress>
Then  Display alert warning User clear data if any
Examples:
	| WalletAddress                                 |
	| "234567893432"                                |	
	| "123"                                         |
	| "123456789"                                   |
	| "3456768987756543456789765432435467"          |
	| "312345678456768987756543456789765432435467"  |

	
	
Scenario Outline: User selects ERC721 Token Holdings Page to enter a wallet address for ERC721 holdings and clears
Given User lands on ERC721 Token Holdings Page
When  User enters a wallet address for ERC721 holdings and requests to clear <WalletAddress>	
Then  Clear any ERC721 holdings data
Examples:
	| WalletAddress                                								       |
	| "234567893432"			  				    								   |	
	| "123"   							    										   |
	| "0x9845e1909dca337944a0272f1f9f7249833d2d19"                                     |
	| "0x0c23fc0ef06716d2f8ba19bc4bed56d045581f2d"                                     |
	| "0xcdbf58a9a9b54a2c43800c50c7192946de858321"                                     |

	

Scenario Outline: User selects ERC721 Token Holdings Page to enter a wallet address for ERC721 holdings and goes home
Given User lands on ERC721 Token Holdings Page
When  User enters a wallet address for ERC721 holdings and requests to go back <WalletAddress>
Then  Redirect User to home Page
Examples:
	| WalletAddress                                                                    |
	| "15752442887165658747405484604166516451266598353086136889322028333596954776495"  |
	| "39110394182665394275633311613465309653268616163844954401607982312046439536894"  |
	| "0x9845e1909dca337944a0272f1f9f7249833d2d19"                                     |
	| "0x0c23fc0ef06716d2f8ba19bc4bed56d045581f2d"                                     |
	| "0xcdbf58a9a9b54a2c43800c50c7192946de858321"                                     |	
	
	
	
Scenario: User on the page, selects a footer link
Given User lands on a particular page
When  User selects a footer link
Then  Redirect User to that link