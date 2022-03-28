# Java-training-material
# What is class ?
 A class is a user defined blueprint or prototype from which objects are created. It represents the set of properties or methods that are common to all objects of one type.
# What is Method ?
A method is a block of code which only runs when it is called. You can pass data, known as parameters, into a method. Methods are used to perform certain actions, and they are also known as functions.
# What is access Modifiers ?
The access modifiers in Java specifies the accessibility or scope of a field, method, constructor, or class. We can change the access level of fields, constructors, methods, and class by applying the access modifier on it.
# What is Variable ?
A variable is a container which holds the value while the Java program is executed. A variable is assigned with a data type.
Variable is a name of memory location. There are three types of variables in java: local, instance and static.
# What are the datatypes in Java ?
 Data type is the specification of type  and size of an variable ,Which accepts the Data
There are two types of data types in Java: primitive and non-primitive.
Primitive Data types - provide only type and size of the data can be assigned to it.
Primitive data types - includes byte, short, int, long, float, double, boolean and char
Non Primitive Data types - such as String, Arrays and Classes
# Define String
 A String variable contains a collection of characters surrounded by double quotes.
 A String in Java is actually an object, which contain methods that can perform certain operations on strings.
# Define static and non static
# static
 static variables/methods are the Class Property datas can be accesed with the class Name Itself with out any instances.
 Static variables are shared among all instances of a class.
 Static variable is like a global variable and is available to all methods.
# Non Static
  Non static Variables/methods are the Object Properties only accesed with the instance of the class.
  Non static variables are specific to that instance of a class.
  Non static variable is like a local variable and they can be accessed through only instance of a class.
# How to Invoke a method
 Method name itself enough to call the method when its a static method.
 Methods in the same class file then
  if its a static method invoke method with it name itself ex:  display();
  else to invoke it need a Object to access the method,   ex obj.display();
# How to invoke main mathod 
 We can Invoke main method Whenever and wherever we want,
 You can call the main method in any method but java not prefer main method called from somewhere elese.
# Define Scanner
 Scanner is a class in java.util package used for obtaining the input of the primitive types like int, double, etc. and strings.
 Scanner can parse the input String as above mentioned primitive data types.
 Scanner buffer size is 1 KB where BufferedReader have a large buffer size as 8 KB.
 Scanner is not syncronous in nature and should be used only in single threaded case.
#  Define Variable and types
Variable in Java is a data container that saves the data values during Java program execution.
Every variable is assigned a data type that designates the type and quantity of value it can hold. 
Variable is a memory location name of the data. A variable is a name given to a memory location.
 Local Variable - A variable declared inside the body of the method is called local variable.
 Instance Variable - A variable declared inside the class but outside the body of the method, is called an instance variable. It is not declared as static.
 static Variable - A variable that is declared as static is called a static variable. It cannot be local. You can create a single copy of the static variable and share it among all the instances of the class.
# Define Package
 A java package is a group of similar types of classes, interfaces and sub-packages.
 Package in java can be categorized in two form, built-in package and user-defined package.
 There are many built-in packages such as java, lang, io, util, sql etc.
# What is the Naming Convention of Package
Package names are written in all lower case to avoid conflict with the names of classes or interfaces.
Companies use their reversed Internet domain name to begin their package names—for example, 
com.example.mypackage for a package named mypackage created by a programmer at example.com .
# How to create a Movie Class
 In Text Editor 
 save the file with name extention of .java
 In eclipse File-->new --->Class to create the Class
 Name the file and class as Movie
 # "println" is a static method or not?
 println is a non static public method Of PrintStream Class,
 out  is a Instance Of PrintStream Which is a public and static member field of the System class to invoke the println().
 # What are the various methods in String (inbuilt)
compareTo()	- Compares two strings lexicographically	returns int value
concat()	- Appends a string to the end of another string	returns String
equals()- Compares two Strings content returns boolean 
equalsIgnoreCase()	Compares two strings, ignoring case considerations returns	boolean
trim()  - remove the whitespaces before or after the data
# What is array? how the data is stored in array?
 Array is collection of same datatype elemets in a sequential memory address.
 The idea is to store multiple items of the same type together.
 # How do you iterate array values?
  To Iterate the array values form a loop with loop contarint
