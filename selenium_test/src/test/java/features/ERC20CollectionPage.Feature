Feature: Testing ERC20 Collection Page for content and display



Scenario Outline: User selects ERC20 Collection Page to enter an incorrect wallet address
Given User lands on ERC20 Collection Page
When  User selects Navbar to enter an incorrect wallet address <WalletAddress>
Then  Display alert warning User
Examples:
	| WalletAddress 							  |	
	| "abc"			  							  |
	| "0x234r34t"   							  |
	| "123456789"   							  |
	| "walletAddr"  							  |
	| "0xcdbf58a9a9b543800c50c7192946de85832"     | 
	
	
	
Scenario Outline: User selects ERC20 Collection Page to enter a correct wallet address
Given User lands on ERC20 Collection Page
When  User selects Navbar to enter a correct wallet address <WalletAddress>
Then  Redirect User to Transactions Page
Examples:
	| WalletAddress                                 |
	| "0x2b6ed29a95753c3ad948348e3e7b1a251080ffb9"  |
	| "0x195b91ccebd51aa61d851fe531f5612dea4efbfd"  |
	| "0x9845e1909dca337944a0272f1f9f7249833d2d19"  |
	| "0x0c23fc0ef06716d2f8ba19bc4bed56d045581f2d"  |
	| "0xcdbf58a9a9b54a2c43800c50c7192946de858321"  |
	
	
	
Scenario Outline: User selects ERC20 Collection Page to enter a correct contract address for ERC20 analytics
Given User lands on ERC20 Collection Page
When  User enters a correct contract address for ERC20 analytics <ContractAddress>
Then  Display wallet analytics information to User
Examples:
	| ContractAddress                                                                  |
	| "0x767fe9edc9e0df98e07454847909b5e959d7ca0e"                                     |
	| "0xC18360217D8F7Ab5e7c516566761Ea12Ce7F9D72"                                     |
	| "0x92d6c1e31e14520e676a687f0a93788b716beff5"                                     |
	| "0x1f9840a85d5af5bf1d1762f925bdaddc4201f984"                                     |
	| "0x15d4c048f83bd7e37d49ea4c83a07267ec4203da"                                     |
	
	

Scenario Outline: User selects ERC20 Collection Page to enter an incorrect contract address for ERC20 analytics
Given User lands on ERC20 Collection Page
When  User enters an incorrect contract address for ERC20 analytics <ContractAddress>
Then  Display alert warning User, clear data if any
Examples:
	| ContractAddress                               |
	| "234567893432"                                |	
	| "123"                                         |
	| "123456789"                                   |
	| "3456768987756543456789765432435467"          |
	| "312345678456768987756543456789765432435467"  |

	
	
Scenario Outline: User selects ERC20 Collection Page to enter a contract address for ERC20 analytics and clears
Given User lands on ERC20 Collection Page
When  User enters a contract address for ERC20 analytics and requests to clear <ContractAddress>	
Then  Clear any contract analytics data
Examples:
	| ContractAddress                              								       |
	| "234567893432"			  				    								   |	
	| "123"   							    										   |
	| "0x92d6c1e31e14520e676a687f0a93788b716beff5"                                     |
	| "0x1f9840a85d5af5bf1d1762f925bdaddc4201f984"                                     |
	| "0x15d4c048f83bd7e37d49ea4c83a07267ec4203da"                                     |

	

Scenario Outline: User selects ERC20 Collection Page to enter a contract address for ERC20 analytics and goes home
Given User lands on ERC20 Collection Page
When  User enters a contract address for ERC20 analytics and requests to go back <ContractAddress>
Then  Redirect User to home Page
Examples:
	| ContractAddress                                                                  |
	| "15752442887165658747405484604166516451266598353086136889322028333596954776495"  |
	| "39110394182665394275633311613465309653268616163844954401607982312046439536894"  |
	| "0x92d6c1e31e14520e676a687f0a93788b716beff5"                                     |
	| "0x1f9840a85d5af5bf1d1762f925bdaddc4201f984"                                     |
	| "0x15d4c048f83bd7e37d49ea4c83a07267ec4203da"                                     |