# so today i learned about mysql from basics let me quote here the topics i learned today for the revision purpose..


1. Mysql Select - so select is used to extract the information from the database.

for ex. SELECT * FROM Customers(here Customers is the name of the database table.)

here * this all will return all the colums of the Customers Table, if we want specific table then we have to name the colum in the select clause like ...
```SELECT CustomerName, Country FROM Customers.```

2. Then we have Mysql Select Distinct - so this distinct will basically extract only the unique values from the colums we have mentioned in the select clause. there won't be any duplicates.


3. Mysql Where clause - so this clause is basically used to put the conditions while fetching any data/information from the database table.

for ex. SELECT * FROM Customers
        WHERE Country='India';
    > so here i have put the condition of india so it will only return the records where the country mentioned is India.


4. Mysql ORDER BY - this clause is used to arrange the extracted data from the database in ascending or descending order.

for ex. SELECT * FROM Customers
        WHERE Country='UK'
        ORDER BY CustomerName ASC; > here ASC if we don't even write then also it's fine because by default it remains ascending but for descending we have to write DESC;


5. Mysql AND - this is used to satisfy multiple conditons Country AND City or various stuff like that
Same with OR and NOT - not any different from the other programming languages.


### That's it for today now we will study further tomorrow... 5/sep/2026