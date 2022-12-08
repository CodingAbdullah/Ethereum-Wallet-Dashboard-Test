Feature: Testing ENS Transfers By Name Page for content and display



Scenario Outline: User selects ENS Transfers By Name Page to enter an incorrect wallet address
Given User lands on ENS Transfers By Name Page
When  User selects Navbar to enter an incorrect wallet address <WalletAddress>
Then  Display alert warning User
Examples:
	| WalletAddress 							  |	
	| "abc"			  							  |
	| "0x234r34t"   							  |
	| "123456789"   							  |
	| "walletAddr"  							  |
	| "0xcdbf58a9a9b54a2c43800c50c7192946de85832" | 
	
	
	
Scenario Outline: User selects ENS Transfers By Name Page to enter a correct wallet address
Given User lands on ENS To Address Page
When  User selects Navbar to enter a correct wallet address <WalletAddress>
Then  Redirect User to Transactions Page
Examples:
	| WalletAddress                                 |
	| "0x2b6ed29a95753c3ad948348e3e7b1a251080ffb9"  |
	| "0x195b91ccebd51aa61d851fe531f5612dea4efbfd"  |
	| "0x9845e1909dca337944a0272f1f9f7249833d2d19"  |
	| "0x0c23fc0ef06716d2f8ba19bc4bed56d045581f2d"  |
	| "0xcdbf58a9a9b54a2c43800c50c7192946de858321"  |
	
	 

Scenario Outline: User selects ENS Transfers By Name Page to enter a correct ENS name to lookup
Given User lands on ENS Transfers By Name Page
When  User enters a correct ENS name for address lookup <WalletAddress>
Then  Display wallet information to User
Examples:
	| WalletAddress                                 |
	| "baller.eth"                                  |
	| "addr.eth"                                    |
	| "car.eth"                                     |
	| "truck.eth"                                   | 
	| "usb.eth"  								    |
	
	

Scenario Outline: User selects ENS Transfers By Name Page to enter incorrect ENS name to lookup
Given User lands on ENS Transfers By Name Page
When  User enters an incorrect ENS name for address lookup <WalletAddress>
Then  Display alert warning User, clear data if any
Examples:
	| WalletAddress 							    |
	| "abc.e"			  						    |	
	| "0x234r34t.et"   							    |
	| "123456789"   							    |
	| "walletAddr"  							    |
	| "0xcdbf58a9a9b54a2c43800c50c7192946de858321"  |

	
	
Scenario Outline: User selects ENS Transfers By Name Page to enter an ENS name to lookup and clears
Given User lands on ENS Transfers By Name Page
When  User enters an ENS name for address lookup and requests to clear <WalletAddress>	
Then  Data or alerts clear on page 
Examples:
	| WalletAddress                                 |
	| "baller.eth"                                  |
	| "addr.eth"                                    |
	| "0x234r34t.et"   							    |
	| "truck.eth"                                   | 
	| "0xcdbf58a9a9b54a2c43800c50c7192946de858321"  |

	

Scenario Outline: User selects ENS Transfers By Name Page to enter an ENS name to lookup and goes home
Given User lands on ENS Transfers By Name Page
When  User enters an ENS name for address lookup and requests to go back <WalletAddress>
Then  Redirect User to Home Page
Examples:
	| WalletAddress 							    |
	| "car.eth"                                     |
	| "truck.eth"                                   | 
	| "usb.eth"  								    |
	| "0x0c23fc0ef06716d2f8ba19bc4bed56d045581f2d"  |
	| "0xcdbf58a9a9b54a2c43800c50c7192946de858321"  |