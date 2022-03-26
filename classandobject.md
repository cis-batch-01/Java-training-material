# 1.overriding
In any object-oriented programming language, Overriding is a feature that allows a subclass or 
child class to provide a specific implementation of a method that is already provided by one of its super-classes or parent classes.

# 2.overloading
In Java, two or more methods may have the same name if they differ in parameters. These methods are called overloaded methods and this feature is called method overloading.

# 3. static before method
Static is a keyword. The role of adding static before any entity is to make that entity a class entity.
 It means that adding static before methods and variables make them class methods and class variables

# 4. Define Abstraction
In Java, Data Abstraction is defined as the process of reducing the object to its essence so that only
 the necessary characteristics are exposed to the users.

# 5. What is garbage
Java garbage collection is the process by which Java programs perform automatic memory management.
 Java programs compile to bytecode that can be run on a Java Virtual Machine, or JVM for short.

# 6. What is wrapper class
The wrapper class in Java provides the mechanism to convert primitive into object and object into primitive.

# 7.Difference between String builder and string
  StringBuffer
    1.StringBuffer is  thread safe.
    2.StringBuffer is less efficient than StringBuilder.
    3.StringBuffer was introduced in Java 1.0

  String builder
    1.StringBuilder is  not thread safe. 
    2.StringBuffer is less efficient than StringBuffer.
    3.StringBuffer was introduced in Java 1.5

# 8.primitive object
  The language defines eight Java primitive data types: boolean, float, double, byte, short, int, long and char.

# 9. Define Class and Object
  Class
    A class is a template or blueprint from which objects are created. So, an object is the instance(result) of a class.

  Objects
    An object in Java is the physical as well as a logical entity, whereas, a class in Java is a logical entity only.

# 10.What is final class
  The main purpose of using a class being declared as final is to prevent the class from being subclassed.
# 11.What are the types of variable scope?
 Local Variables   - Variable declared inside a methods, constructors, or block of code are called local variables. 
 They can be accessed only inside that method or block of code. 
 Instance Variables - Instance variables are declared inside a class outside any method, constructor, or block.  
 They can be accessed directly by calling the variable name inside the class.
 Class/Static variables - Class variables are declared using static keyword in a class, but outside a method, constructor or a block.
 Static variables are created when the program starts and destroyed when the program ends. 
 There can be only one copy of a class variable, regardless of how many call objects created. 

# 12.Explain Final keyword?

 The final keyword is useful when you want a variable to always store the same value, like PI (3.14159...). The final keyword is called a "modifier".
 The variable name must be in UpperCase for final.
 final String PAN_CARD_NUMBER; 

# 13.inbuild Vs user define packages

 A Package is a group of similar types of classes, interfaces, enumerations, and sub-interfaces.
 Built-in packages: The already defined package like java.io.*, java. lang.* etc., are known as built-in packages.
 User-defined packages:user-defined packages are defined by the programmer.
 Whenever we want to add a class to the package, we have to mention the package name and the “package” keyword at the top of the program.

# 14. What is import in java?
import keyword is used to access package and its classes into the java program. 
It is used to access built-in and user-defined packages into your java source file so that your class can refer to a class that is in another package 
by directly using its name.
import java.util.Date;

# 15. What is garbage collector?
Garbage collection is the process of managing memory, automatically.
It finds the unused objects (that are no longer used by the program) and remove them to free up the memory.
The garbage collection mechanism uses several GC algorithms. The most popular algorithm that is used is Mark and Sweep.

# 16. What is access modifier?
The access modifiers in Java specifies the accessibility or scope of a field, method, constructor, or class. 
We can change the access level of fields, constructors, methods, and class by applying the access modifier on it.
Public: It can be accessed from within the class, outside the class, within the package and outside the package.
Private: It will be accessed only within the class. It cannot be accessed from outside the class.
Protected: It can be accessed within the package and outside the package through child class. If you do not make the child class, it cannot be accessed from outside the package.
Default: It can be accessed within the package and not from outside the package. If you do not specify any access level, it will be the default.

# 17. Define Abstract Class?
Abstraction is a process of hiding the implementation details and showing only functionality to the user.
An abstract class must be declared with an abstract keyword.
It cannot be instantiated.
public Abstract class Example 

# 18. What is "new" keyword?
The Java new keyword is used to create an instance of the class. 
In other words, it instantiates a class by allocating memory for a new object and returning a reference to that memory. 
We can also use the new keyword to create the array object.

List list=new ArrayList();

# 19. How to get value from user for "if" condition?

By using Scanner class, we can get inputs from the user.
num1=scan.nexttInt();
num2=scan.nextInt();
if(num1>num2)
{
System.out.println("Enter number is greater");
}
else
{
System.out.println("Enter number is lesser");
}

# 20. Comment

Comments are the statements that are not executed by the compiler and interpreter.
Comments are used to make the program more readable by adding the details of the code.
Single Line Comment - //This is single line comment  
Multi Line Comment - /* This is multi-line comment */    

# 21. what is static keyword?

Static keyword is mainly used for memory management.
If we want to access class members without creating an instance of the class, we need to declare the class members static.
If we static method, we can call by its class name.

public static int sum(num1,num2)
{
return null;
}


