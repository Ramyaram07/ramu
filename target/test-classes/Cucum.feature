Feature: Generating 10 order id from adactin hotelpage
Scenario Outline:  Generating 10 order id
Given user is on adactinhotelapp page on chrome browser.
When user enter "<username>" and "<password>".
And user should click login button.
When user select "<location>","<Hotels>","<room type>","<no of rooms>","<checkin date>","<checkout date>","<adults per room>","<child per room>"
When user select hotel and click continue for booking
When user enter "<first name>","<Last name>","<billing address>","<card no>","<card type>","<exp month>","<exp year>" and "<cvv>"
And user click on continue for generating order id
And user print order id to console
Examples:
|username|password|location|Hotels|room type|no of rooms|checkin date|checkout date|adults per room|child per room|first name|Last name|billing address|card no|card type|exp month|exp year|cvv|
|johnking|john@1234|Sydney|Hotel Creek|Deluxe|3 - Three|30/04/2022|03/05/2022|1 - One|4 - Four|Esra|Ozan|london|5678909876543456|VISA|June|2022|097|
|johnking|john@1234|Sydney|Hotel Creek|Double|4 - Four|23/04/2022|24/04/2022|4 - Four|2 - Two|ram|Raj|velecery|8765468360752367|VISA|March|2022|876|
|johnking|john@1234|New York|Hotel Hervey|Super Deluxe|3 - Three|23/04/2022|24/04/2022|4 - Four|3 - Three|Kavi|Priya|velecery|7654296942191873|VISA|March|2022|786|
|johnking|john@1234|Melbourne|Hotel Sunshine|Deluxe|1 - One|23/04/2022|24/04/2022|1 - One|1 - One|ram|tanu|velecery|6578123409625961|VISA|March|2022|962|
|johnking|john@1234|Adelaide|Hotel Hervey|Super Deluxe|3 - Three|23/04/2022|24/04/2022|1 - One|2 - Two|john|jai|velecery|9812373091234876|VISA|June|2022|456|
|johnking|john@1234|London|Hotel Hervey|Super Deluxe|2 - Two|23/04/2022|24/04/2022|4 - Four|2 - Two|hari|priya|velecery|9157320985423769|VISA|March|2022|765|
|johnking|john@1234|New York|Hotel Cornice|Super Deluxe|6 - Six|23/04/2022|24/04/2022|4 - Four|1 - One|tina|kumar|velecery|9087651273929185|VISA|March|2022|986|
|johnking|john@1234|Los Angeles|Hotel Cornice|Deluxe|7 - Seven|23/04/2022|24/04/2022|4 - Four|1 - One|priya|manik|velecery|6903529105639852|VISA|June|2022|487|
|johnking|john@1234|Paris|Hotel Sunshine|Standard|3 - Three|23/04/2022|24/04/2022|2 - Two|4 - Four|geetu|kumar|velecery|4581239840274929|VISA|March|2022|765|
|johnking|john@1234|Paris|Hotel Sunshine|Deluxe|5 - Five|23/04/2022|24/04/2022|1 - One|2 - Two|Aish|rai|velecery|7891235790136859|VISA|July|2022|876|