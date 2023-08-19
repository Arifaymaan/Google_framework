 Feature: searching products
 
 Scenario Outline: searching product on google
 
 Given i am on the google homepage
 
 
 When i entre the "<Product_name>" in the search bar
 And  i click on the search button
 
 
 Then i can see the search result successfully
 
 
 
 Examples:
 | Product_name |
 |Computer       |
 |Toys           |
 |Flower         |