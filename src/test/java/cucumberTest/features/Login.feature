Feature: Login to account

Scenario Outline: <scenarioUserValidity> username and <scenarioPassValidity> password
Given A <usernameValidity> username
And An <passwordValidity> password
When I press the login button
Then An <messageType> message appears

Examples:
|   scenarioUserValidity    |   scenarioPassValidity    |   usernameValidity    |   passwordValidity    |   messageType |
|   Valid                   |   invalid                 |   valid               |   incorrect           |   error       |
|   Valid                   |   valid                   |   valid               |   correct             |   success     |
|   Invalid                 |   valid                   |   invalid             |   correct             |   error       |
|   Invalid                 |   invalid                 |   invalid             |   incorrect           |   error       |