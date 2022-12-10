Feature: Testing ERC721 Lookups Page content and display



Scenario Outline: User selects ERC721 Lookups Page to enter an incorrect wallet address
Given User lands on ERC721 Lookups Page
When  User selects Navbar to enter an incorrect wallet address <WalletAddress>
Then  Display alert warning User
Examples:
	| WalletAddress 							  |	
	| "abc"			  							  |
	| "0x234r34t"   							  |
	| "123456789"   							  |
	| "walletAddr"  							  |
	| "0xcdbf58a9a9b543800c50c7192946de85832"     | 
	
	
	
Scenario Outline: User selects ERC721 Lookups Page to enter a correct wallet address
Given User lands on ERC721 Lookups Page
When  User selects Navbar to enter a correct wallet address <WalletAddress>
Then  Redirect User to Transactions Page
Examples:
	| WalletAddress                                 |
	| "0x2b6ed29a95753c3ad948348e3e7b1a251080ffb9"  |
	| "0x195b91ccebd51aa61d851fe531f5612dea4efbfd"  |
	| "0x9845e1909dca337944a0272f1f9f7249833d2d19"  |
	| "0x0c23fc0ef06716d2f8ba19bc4bed56d045581f2d"  |
	| "0xcdbf58a9a9b54a2c43800c50c7192946de858321"  |
	
	
	
Scenario Outline: User selects ERC721 Lookups Page to enter correct information for ERC721 lookups
Given User lands on ERC721 Lookups Page
When  User enters correct information for ERC721 lookups <ContractAddress> <ID>
Then  Display ERC721 lookups information to User
Examples:
	| ContractAddress                                |  ID                                                                           |
	| "0xbc4ca0eda7647a8ab7c2061c2e118a18a936f13d"   | 568                                                                           |
	| "0x49cf6f5d44e70224e2e23fdcdd2c053f30ada28b"   | 10252                                                                         |
	| "0x348fc118bcc65a92dc033a951af153d14d945312"   | 4494                                                                          |
	| "0x57f1887a8bf19b14fc0df6fd9b2acc9af147ea85"   | 65084948718689133284422947626152801063640730374318838662599214740755233280852 |
	| "0x1a92f7381b9f03921564a437210bb9396471050c"   | 8998                                                                          |
	
	

Scenario Outline: User selects ERC721 Collection Page to enter incorrect information for ERC721 lookups
Given User lands on ERC721 Lookups Page
When  User enters incorrect information for ERC721 lookups <ContractAddress> <ID>
Then  Display alert warning User, clear data if any
Examples:
	| ContractAddress                               |  ID  |
	| "234567893432"                                |  345 |	
	| "123"                                         |  123 |
	| "123456789"                                   |  056 |
	| "3456768987756543456789765432435467"          |  007 |
	| "312345678456768987756543456789765432435467"  |  956 |

	
	
Scenario Outline: User selects ERC721 Collection Page to enter information for ERC721 lookups and clears
Given User lands on ERC721 Lookups Page
When  User enters information for ERC721 lookups and requests to clear <ContractAddress> <ID>
Then  Clear any ERC721 lookup data
Examples:
	| ContractAddress                              								       | ID    |
	| "234567893432"			  				    								   | 56	   |
	| "123"   							    										   | 78    |
	| "0x49cf6f5d44e70224e2e23fdcdd2c053f30ada28b"                                     | 10252 |
	| "0x1a92f7381b9f03921564a437210bb9396471050c"                                     | 5667  |
	| "0x1a92f7381b9f039215647210bb9396471050c"                                        | 8998  |

	

Scenario Outline: User selects ERC721 Collection Page to enter information for ERC721 lookups and goes home
Given User lands on ERC721 Lookups Page
When  User enters information for ERC721 lookups and requests to go back <ContractAddress> <ID>
Then  Redirect User to home Page
Examples:
	| ContractAddress                              								       | ID    |
	| "234567893432"			  				    								   | 56	   |
	| "123"   							    										   | 78    | 
	| "0x49cf6f5d44e70224e2e23fdcdd2c053f30ada28b"                                     | 10252 |
	| "0x1a92f7381b9f03921564a437210bb9396471050c"                                     | 5667  |
	| "0x1a92f7381b9f039215647210bb9396471050c"                                        | 8998  |