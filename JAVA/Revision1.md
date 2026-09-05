# Today it's 05-September-2026

i am going to revise Java from the beginning for the first time after studying it.

> We will start from the basics
1. Java Syntax - Boiler plate
 ```public class main {
    public static void main(String[] args) {
        System.out.println("Hello World, it's 5th September today");
    }
 } 
 ```

 2. Talking about comments we have two types a. Single line b. Multiple Line

 // this is single line comment
 /* multiple
    line
    comment
*/

3. Types of variable exists in Java...

a. String - stores text, such as "Hello" - string values are surrounded by double quotes.

b. int - stores integers without decimals.

c. float - stores floating point numbers, with decimals.

d. char - stores only single character such as 'a' or 'B'.

e. boolean - stores values with two states - true or false.

howw to create variables - int number = 10;

double = 56.76;

boolean = true;

char = a;
String = "Suraj";

> To print the variables in system.out.println we have to simply concatenate the values with +

for ex. System.out.println("Hello World" + number);  so here output will be like -> # Hello World10.

> we we don't want to change the value of variable we use final keyword.
for ex. final int num = 10;
num = 20; > this will not be assigned or it can give error.

okay so i have checked it will give compilation error for sure if we try to assign value to the final variable.

question > why we use final keyword?
answer > so there are some variable whose values we want should not be changed for example the number of minutes in an hour or your date of birth's year. so for all these purposes we use final keyword.


4. Datatypes is mainly divided into 2 groups : 1. Primitive datatype
         2. Non-primitive datatype

        primitive datatype specifies the type of variable and the kind of values it can hold. here > byte,short,int,long,float,double,boolean,char. etc

        Non-primitive datatype such as Strings,Arrays,Classes

        > float is declared like > float c = 5.8f;

        >if you do char myVar1 = 65 > it will return A because of the ASCII value.


        if we use var while declaring a variable then it means that compiler will automatically understand the datatype of the variable declared uding var.

        > imp. notes about var. 1. var only works when you assign a value at the same time of the declaration. var x; // this gives error

        var x = 5; // this is correct.

        2. second important thing about var is if once you the value to the variable of var then it will stick only to that datatype , it won't change after that.

        var x = 5;  // x is now an int
        x = 10;     // OK - still an int
        x = 9.99;   // Error - can't assign a double to an int


        
    ## When to use var??
    For simple variables, it's usually clearer to write the type directly (int, double, char, etc.).

But for more complex types, such as ArrayList or HashMap, var can make the code shorter and easier to read


5. Type Casting - means converting one data type into another . for example turning an int into a double.

two typess of typecasting
1. widening typecasting - converting a smaller type to a larger type size;

2. narrowing casting - converting a larger type to a smaller type size.

> widening casting is done automatically
int num = 8;
double mydoub = num; // automatic casting int to double.

> Narrowing casting must be done manually by placing the type in parentheses () in front of the value.

this is required because narrowing may result in data loss ( for ex. dropping decimals when converting a double to an int)

double mydoub = 45.56d;
int myint = (int) mydoub; // Manual casting double to int.


6. Order of operations
() parenthesis
* / %
+ -
> < >= <=
== !=
&&
||
=

>Parenthesis always come first. use them to control the order of your calculations.


> to know the length of string just use the variable_name.length() method. and print it using system.out.print  or store it in any variable.

> there are more methods in strings variable_name.toUpperCase();
variable_name.toLowerCase();
variable_name.indexOf() - returns the index of the first occurence of a specified text in a string.(including whitespace).

String txt = "Please locate where 'locate' occurs!";
System.out.println(txt.indexOf("locate")); // Outputs 7


>> that's it for today we are here "Java String Concatenation". 