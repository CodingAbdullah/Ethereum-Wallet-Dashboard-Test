Feature: Testing ENS Transfers By ID Page for content and display



Scenario: User on the page, selects a sidebar link
Given User lands on a particular page
When  User selects a certain link
Then  Redirect User to that page



Scenario Outline: User selects ENS Transfers By ID Page to enter an incorrect wallet address
Given User lands on ENS Transfers By ID Page
When  User selects Navbar to enter an incorrect wallet address <WalletAddress>
Then  Display alert warning User
Examples:
	| WalletAddress 							  |	
	| "abc"			  							  |
	| "0x234r34t"   							  |
	| "123456789"   							  |
	| "walletAddr"  							  |
	| "0xcdbf58a9a9b54a2c43800c50c7192946de85832" | 
	
	
	
Scenario Outline: User selects ENS Transfers By ID Page to enter a correct wallet address
Given User lands on ENS Transfers By ID Page
When  User selects Navbar to enter a correct wallet address <WalletAddress>
Then  Redirect User to Transactions Page
Examples:
	| WalletAddress                                 |
	| "0x2b6ed29a95753c3ad948348e3e7b1a251080ffb9"  |
	| "0x195b91ccebd51aa61d851fe531f5612dea4efbfd"  |
	| "0x9845e1909dca337944a0272f1f9f7249833d2d19"  |
	| "0x0c23fc0ef06716d2f8ba19bc4bed56d045581f2d"  |
	| "0xcdbf58a9a9b54a2c43800c50c7192946de858321"  |
	
	 

Scenario Outline: User selects ENS Transfers By ID Page to enter a correct ENS ID to lookup
Given User lands on ENS Transfers By ID Page
When  User enters a correct ENS ID for address lookup <WalletAddress>
Then  Display wallet information to User
Examples:
	| WalletAddress                                 								   |
	| "11573761634988438171839437084610539575953030615581301032941949443954771506921"  |
	| "103122091557825102398109353503627536470133330137711876553834812699100094164410" |
	| "59996768904412012315546874618103943426774616966008885913155021927016982279596"  |
	| "15752442887165658747405484604166516451266598353086136889322028333596954776495"  |
	| "39110394182665394275633311613465309653268616163844954401607982312046439536894"  |
	
	

Scenario Outline: User selects ENS Transfers By ID Page to enter an incorrect ENS ID to lookup
Given User lands on ENS Transfers By ID Page
When  User enters an incorrect ENS ID for address lookup <WalletAddress>
Then  Display alert warning User clear data if any
Examples:
	| WalletAddress 							    |
	| "234567893432"			  				    |	
	| "123"   							    		|
	| "123456789"   							    |
	| "3456768987756543456789765432435467"  		|
	| "312345678456768987756543456789765432435467"  |

	
	
Scenario Outline: User selects ENS Transfers By ID Page to enter an ENS ID to lookup and clears
Given User lands on ENS Transfers By ID Page
When  User enters an ENS ID for address lookup and requests to clear <WalletAddress>	
Then  Data or alerts clear on page 
Examples:
	| WalletAddress                                 								   |
	| "234567893432"			  				    								   |	
	| "123"   							    										   |
	| "123456789"   							    							       |
	| "15752442887165658747405484604166516451266598353086136889322028333596954776495"  |
	| "39110394182665394275633311613465309653268616163844954401607982312046439536894"  |

	

Scenario Outline: User selects ENS Transfers By ID Page to enter an ENS ID to lookup and goes home
Given User lands on ENS Transfers By ID Page
When  User enters an ENS ID for address lookup and requests to go back <WalletAddress>
Then  Redirect User to Home Page
Examples:
	| WalletAddress 							    								   |
	| "15752442887165658747405484604166516451266598353086136889322028333596954776495"  |
	| "39110394182665394275633311613465309653268616163844954401607982312046439536894"  |
	| "123456789"   							    								   |
	| "3456768987756543456789765432435467"  										   |
	| "312345678456768987756543456789765432435467" 								       |
	
	
	
Scenario: User on the page, selects a footer link
Given User lands on a particular page
When  User selects a footer link
Then  Redirect User to that link	