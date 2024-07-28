package Lectures;

/* 
 * Lesson 2
 * Saturday, Week 2 - (6/07/24)
 * 
 * =================================================================================
 *          Topics for week 2: Variables, Data Types and Basic Operators
 * 
 *  0) Recap on Week 1.
 * 
 *  1) Variables.
 *      1.1) Declaring the Variables.
 *          1.1.1) Naming a Variable.
 *          1.1.2) Java Reserved Word.
 *      1.2) Assigning the Variables.
 *      1.3) Memory Diagram.
 *      1.4) Outputting Variables.
 * 
 *  2) Primitive Data Types.
 *      2.1) Integers.
 *      2.2) Byte.
 *      2.3) Floating-Point Types.
 *      2.4) Characters (char).
 *      2.5) Boolean.
 * 
 *  3) Arithmetic Operators.
 *     3.1) Modulo %
 *     3.2) Increment and Decrement.
 *     3.3) Operators and Data Types.
 * 
 *  4) Retional and Logical Operators.
 *     4.1) Truth Table.
 * 
 *  5) Type Casting.
 *     5.1) Implicit Type Casting.
 *     5.2) Explicit Type Casting.
 * 
 *  6) Constant (final keyword).
 * 
 *  7) Java Math Class.
 *      7.1) Math.PI.
 *      7.2) Math.E.
 *      7.3) Math.sqrt().
 *      7.4) Math.pow().
 *      7.5) Math Trigonometric Functions.
 * 
 *  8) *** ICS 2.1: In Class Assignment 2.1 ***
 * 
 *  9) *** ICS 2.2L: In Class Assignment 2.2 ***
 * 
 * =================================================================================
 * 
*/


/* 
 * =================================================================================
 *                               0) Recap on Week 1
 * 
 *  Programming Languages:
 *      a) Easier to understand than CPU instructions.
 *      b) Needs to be translated for the CPU to understand it.
 * 
 *          [Source Code] -----> [javac] -----> [Byte Code] -----> [Java]
 * 
 * Basic Java class structure:
 * ---------------------------------------------------------------------------------
 *      class Hello {
 *          public static void main(String [] args) {
 *              System.out.println("Hello world.");
 *          }
 *      }
 * ---------------------------------------------------------------------------------
 *  Syntax:
 * 
 *      class CLASSNAME {
 *          public static void main(String[] args) {
 *              STATEMENTS
 *          }
 *      }
 * ---------------------------------------------------------------------------------
 * 
 *  1) Simple: Java has concise, cohesive set of features that makes it easy to
 *             learn.
 * 
 *  2) Secure: Java provides a secure means of creating internet applications.
 * 
 *  3) Portable: Java program can execute in any environment for which there is a
 *               Java run-time system.
 * 
 *  4) Object-oriented: Java embodies the modern, OOP philosophy.
 * 
 *  5) Robust: Java encourages error-free programming by being strictly typed and
 *             performing run-time checks.
 * 
 *  6) Multithreaded: Java provides integrated support for multithreaded programming.
 * 
 *  7) Architecture-neutral: Java is not tied to a specific machine or OS 
 *                           architecture.
 * 
 *  8) Interpreted: Java supports cross-platform code through the use of Java
 *                  bytecode.
 * 
 *  9) High performance: The Java bytecode is highly optimized for speed of 
 *                       execution.
 * 
 *  10) Distributed: Java was designed with the distributed environment of the
 *                   Internet in mind.
 * 
 *  11) Dynamic: Java a program carry with them substantial amounts of run-time type
 *               information that is used to verify and recieve accesses to objs of
 *               run time.
 * 
 * ---------------------------------------------------------------------------------
 *  Introduction Data Types and Operations:
 * 
 *      a. Java is a strongly typed language.
 * 
 *      b. This means that all operations are type checked by the compiler for type
 *         compatibility.
 * 
 *      c. Data Types.
 * 
 *      d. Arithmetic Operators (Mathematical operators such as +, -, *, /, %).
 * =================================================================================
*/


/* 
 * =================================================================================
 *                                   1) Variables
 * 
 *  1) A variables will store the value of the data and its data type.
 * 
 *  2) By storing the data value to the memory address.
 * 
 *  3) Varirable syntax for Java:
 * 
 *          [Data type] [Variable name] = [Data Value];
 * 
 *     Example:
 *             int age = 35;
 *          boolean isActive = true;
 *          String name = "Johnatthan";
 * 
 * ---------------------------------------------------------------------------------
 *                             1.1) Declaring Variables
 * 
 *  1) One of the most powerful features of programming languages is the ability to
 *     define and manage variables.
 * 
 *  2) A variable is a named location in memory that stores data.
 * 
 *  3) To store data, we first need to declare the variable. For example,
 * 
 *          String messge;      // Initializing the variable named "message".
 *          int x;              // Initializing the variable named "x".
 * 
 *     [Note]: When a variable is initialzing, this means that the we are creating a
 *           reserve space on the memory with any value. The range of the reserve 
 *           memory depends on the data type you've initialzed.
 * 
 *  * Example of Memory Diagram:
 * ---------------------------------------------------------------------------------
 *      String firstName;
 *      String lastName;
 *      int hour, minutes;
 * ---------------------------------------------------------------------------------
 *                                                          RAM
 *                                      firstName      [            ]
 *                                       lastName      [            ]
 *                                           hour      [            ]
 *                                        minutes      [            ]
 * 
 * ---------------------------------------------------------------------------------
 *                             1.1.1) Naming a Variable
 * 
 *  These are the rules of to name a variable:
 * 
 *      1) Cannot start the first character vairable name with a digit or special 
 *         characters (except underscore _).
 * 
 *      2) Followed by Letters, Digits, Dollor Signs, or Underscores: After the 
 *         first character, variable names can include any combination of letters,
 *         digits (0-9), special characters ($, _).
 * 
 *      3) Case-Sensitive: Variable names are case-sensitive. For example,
 *         'myVariable' and 'myvariable' are considered different variables.
 * 
 *      4) No Reserved Keywords: Variable names cannot be a keyword or reserved word
 *         in Java (e.g. int, class, void, etc).
 * 
 *      5) Meaningful and Descriptive: While not strict rule, it's a good practice
 *         to choose meaningful and descriptive names that convey the purpose of
 *         the variable. For example, totalPRice is more descriptive than tp.
 * 
 *      6) Camel Case Convention: By convention, Java developers use camel case for
 *         variable names. This means starting with a lowercase letter and 
 *         capitalizing the first letter of each subsequent word (e.g. myVariable).
 * 
 * ---------------------------------------------------------------------------------
 *                             1.1.2) Java Reserved Word
 * 
 *  These are the list of reserved words:
 * 
 *  1. abstract     13. assert      24. boolean     34. break       43. byte
 *  2. catch        14. char        25. class       35. const       44. continue
 *  3. do           15. double      26. else        36. enum        45. extends
 *  4. finally      16. float       27. for         37. goto        46. if
 *  5. import       17. instanceof  28. int         38. interface   47. long
 *  6. new          18. package     29. private     39. protected   48. public
 *  7. short        19. static      30. strictfp    40. super       49. switch
 *  8. this         20. throw       31. throws      41. transient   50. try
 *  9. volatile     21. while       32. return      42. void
 *  10. case        22. implement   33. synchronized
 *  11. default     23. native
 *  12. final
 * 
 * ---------------------------------------------------------------------------------
 *                              1.2) Assigning Variables
 * 
 *  We can use an assignment statement to assign a value to a variable using the =
 *  operator. For exmaple:
 * 
 *      ---------------------------
 *          String message;
 *          int hour, minute;
 * 
 *          message = "Hello";
 *          hour = 11;
 *          minute = 59;
 *      ---------------------------
 * ---------------------------------------------------------------------------------
 *                                 1.3) Memory Diagram
 * 
 *  We can combine the declaration statement and the assignment statement into a
 *  single line. For example:
 * 
 *      ---------------------------
 *          int a;
 *          a = 5;
 * 
 *          int a = 5;
 *          int b = a;
 *          a = 3;
 *      ---------------------------
 * 
 *  For this concept, please don't get confuse with Pointer. Since the data type is
 *  a primitive data type (int). When 'b' is assigned to 'a' and if the value of
 *  'a' changed it does not effect the value of variable 'b'.
 * 
 * ---------------------------------------------------------------------------------
 *                             1.4) Outputting Variables
 * 
 *  For a computer languasge, there are only 3 specific ways to output the program:
 * 
 *      1) Print - Is to display the output onto a monitor (This is the most 
 *         simpliest form of aqquiring the output).
 * 
 *      2) Return - Based off from the result of a function, we can use this result
 *         for future uses.
 * 
 *      3) Makeshift file - Get the output or outputs on a file (such as CSV, etc.)
 *         so that we can use the file later.
 * =================================================================================
*/


/*
 * =================================================================================
 *                             2) Primitive Data Types
 * 
 *  1) Java contains two general categories of built-in data types: OOP and non-OOP.
 * 
 *  2) Java object--oriented types are defined by classes, and a discussion of
 *     classes is deferred until later.
 * 
 *  3) However, at the core of Java are eight primitive (also called elemental or
 *     simple) types of data.
 * 
 *  4) *** Keep in mind: 1 byte = 8 bits ***
 * ---------------------------------------------------------------------------------
 *  Primitive Data Types
 * 
 *   [Data Type]      [Sizes]        [Description]
 * 
 *  1) boolean         1 bit      True or False (1 and 0).
 * 
 *  2) byte            8 bits     8-bit signed integer values between -128 to 127.
 *                     1 byte
 * 
 *  3) char            8 bits     Store a single character of ASCII characters.
 * 
 *  4) double         64 bits     Double-precision 64-bit IEEE 754 floating point.
 *                    8 bytes     (4.9x10^(-324) to 1.8x10^(308)).
 * 
 *  5) float          32 bits     Single-precision 32-bit IEEE 754 floating point.
 *                    4 bytes    (1.4x10^(-45) to 3.4x10^(38)) or 7 digits.
 * 
 *  6) int            32 bits     Signed integer values between -2^31 to 2^31-1.
 * 
 *  7) long           64 bits     Signed integer values between -2^63 to 2^63-1.
 * 
 *  8) short          16 bits     Signed integer values between -32,768 to 32,767.
 * ---------------------------------------------------------------------------------
 *                                   2.1) Integers
 * 
 *  Java defines four integer types: byte, short, int, and long. And these are their
 *  ranges:
 * 
 *      1) byte: -128 to 127
 *      2) short: -32,768 to 32,767
 *      3) int: -2^31 to 2^31-1.
 *      4) long: -2^63 to 2^63-1.
 * ---------------------------------------------------------------------------------
 *                                     2.2) Byte
 * 
 *  ** NOTE: 1 byte = 8 bits.
 *  ** NOTE: The last bit block at the leftmost is always reserved for the sign bit.
 *  
 *  a) Bit block of +127 memory representation of 8 bit:
 * 
 *  [ 0 ] [ 1 ] [ 1 ] [ 1 ] [ 1 ] [ 1 ] [ 1 ] [ 1 ] = +127
 * 
 *         2^6 + 2^5 + 2^4 + 2^3 + 2^2 + 2^1 + 2^0 = 127
 * 
 * 
 *  b) Bit block of -128 memory representation of 8 bit:
 * 
 *  [ 1 ] [ 1 ] [ 0 ] [ 0 ] [ 0 ] [ 0 ] [ 0 ] [ 0 ] = -128
 * 
 *    1
 * ---------------------------------------------------------------------------------
 *                             2.3) Floating-Point Types
 * 
 *  1) There are two kinds of floating-point types. 'float' and 'double', which repr
 *     -esent single-precision and double-precision floating-point numbers respectiv
 *     -ely.
 * 
 *  2) Type float again is 32 bits wide and type double is 64 bits wide.
 * 
 *  a) Bit block representation of single-precision 32 bits:
 * 
 *      [ 1 bit ]     [ 8 bits ]        [ 23 bits ]
 *          |              |                |
 *      Sign bit    Biased Exponent      Mantissa
 *          |              |                |
 *      [ 1 bit ]     [ 11 bits ]       [ 52 bits ]
 * ---------------------------------------------------------------------------------
 *                              2.4) Characters (char)
 * 
 *  1) Java, char is an unsigned 16-bit type having a range of 0 to 65,535.
 * 
 *  2) The standard 8-bit ASCII character set is a subset of Unicode and ranges from
 *     0 to 127.
 * 
 *  3) Thus, the ASCII characters are still valid Java characters.
 * 
 *  4) For ASCII references: http://www.asciitable.com/.
 * ---------------------------------------------------------------------------------
 *                                   2.5) Boolean
 * 
 *  1) The Boolean type only represents 2 things; true or false.
 * 
 *  2) Java defines the values true and false using the reserved words true and 
 *     false.
 * 
 *  3) The binary value of true and false is strictly just 1's and 0's.
 * =================================================================================
*/


/* 
 * =================================================================================
 *                              3) Arithmetic Operators
 * 
 *  Just like in maths, there are Arithmetic Operators. These operators
 * 
 *  Here are a lists of Artihmetic Operators:
 * 
 *      1) + = Addtion.
 *      2) - = Subtraction.
 *      3) * = Multiplication.
 *      4) / = Division.
 *      5) % = Modulo.
 *      6) ++ = Increment.
 *      7) -- = Decrement.
 * 
 *  The order of mathematical operations follows the BIDMAS rule same as in maths:
 *      B - Brackets
 *      I - Indices
 *      D - Division
 *      M - Multiplication
 *      A - Addition
 *      S - Subtraction
 * 
 *  However, when it comes to Multplication and Division, they are on the same level
 *  as well as Addition and Subtraction. 
 * ---------------------------------------------------------------------------------
 *                                 3.1) Modulo %
 * 
 *  In Java, the modulus operator (%) is used to find the remainder of a division
 *  operation between two numbers. Here's a simple explanation:
 * 
 *      10 % 3 = 1          # (10 - (3 * 3)).
 *       5 % 3 = 2          # (5 - (3 * 1)).
 *       4 % 2 = 0          # (4 - (2 * 2)).
 *       7 % 2 = 1          # (7 - (2 * 3)).
 * ---------------------------------------------------------------------------------
 *                           3.2) Increment and Decrement
 * 
 *  1) Increment Operator:
 *      a) Prefix Increment (++variable): Increase the variable by 1 and return.
 *      b) Postfix Increment (variable++): Return the variable and increase by 1.
 * 
 *  2) Decrement Operator:
 *      a) Prefix Decrement (--variable): Decrease the variable by 1 and return.
 *      b) Postfix Decrement (variable--): Return the variable and decrease by 1.
 * 
 *  Example,
 *      -------------------------------------------------------
 *          int x = 1;
 *          int y = 1;
 * 
 *          System.out.println(--x);    // minus then reutnr x.
 *          System.out.println(y--);    // return y then minus.
 * 
 *          // Output
 *          0
 *          1
 *      -------------------------------------------------------
 * 
 *  More examples,
 *      -------------------------------------------------------
 *          int x = 3;                  // x = 4
 *          int y = ++x*2;              // y = 8
 * 
 *          int x = 3;                  // x = 4
 *          int y = x++*2;              // y = 6
 * 
 *          int x = 3;                  // x = 2
 *          int y = --x*2;              // y = 4
 * 
 *          int x = 3;                  // x = 2
 *          int y = x--*2;              // y = 6
 *      -------------------------------------------------------
 * 
 *  ** NOTE: Increments and Decrement doesn't have to specifically be only + and -.
 * For instance,
 *      -------------------------------------------------------
 *          int x = 4;
 * 
 *          x *= 2    --->    x = x * 2    --->    x = 8
 *          x /= 2    --->    x = x / 2    --->    x = 2
 *          x %= 2    --->    x = x % 2    --->    x = 0
 *          x += 2    --->    x = x + 2    --->    x = 6
 *          x -= 2    --->    x = x - 2    --->    x = 2
 *      -------------------------------------------------------
 * ---------------------------------------------------------------------------------
 *                           3.3) Operators and Data Types
 * 
 *  Why won't this code work, Why?
 *      ---------------------------------
 *          int x = 24;
 *          byte b = x;
 *      ---------------------------------
 * 
 *  But why does this work?
 *      ---------------------------------
 *          byte y = 24;
 *          int a = y;
 *      ---------------------------------
 * 
 *  The reason why the first code doesn't work is because the data type of 'x' is
 *  an integer and the data type of 'b' is a byte. Since the data type of 'b' is a
 *  byte, it can only store a value between -128 to 127. The value of 'x' is 24,
 * 
 *  ** NOTE: Identifying the value for data type float and long.
 *      float f = 32.5f;
 *      double d = 32.5;
 *      long l = 32l;
 *      int x = 32;
 * 
 *     You need to always end floating point and long with 'f' and 'l' respectively.
 *     Because Java think that anything with a floating point is a double, unless
 *     you use 'f' at the end.
 * 
 *  How about the output of 5/2?
 *      ---------------------------------------------
 *          System.out.println(5/2);        // 2
 *          System.out.println(5.0/2.0);    // 2.5
 *          System.out.println(5/2.0);      // 2.5
 *      ---------------------------------------------
 * ---------------------------------------------------------------------------------
 *                           4) Retional and Logical Operators
 * 
 *  These are a LOGICAL operators unlike ARITHMETIC operators, which only concerned
 *  with mathematical operations. Logical operators are used to make decisions in
 *  your code, where the results will always be a boolean value.
 * 
 *  Relational Operators:
 *    1) ==    Equal to.
 *    2) !=    Not equal to.
 *    3) >     Greater than.
 *    4) <     Less than.
 *    5) >=    Greater than or equal to.
 *    6) <=    Less than or equal to.
 * 
 *  Logical Operators:
 *  ** NOTE: (Bitwise = variable that can store 1's and 0's)
 *  ** NOTE: (Logical = variable that can store true or false)
 * 
 *    1) &&    Logical AND.
 *    2) ||    Logical OR.
 *    3) !     Logical NOT.
 *    4) ^     Logical XOR.
 *    5) &     Bitwise AND.
 *    6) |     Bitwise OR.
 * ---------------------------------------------------------------------------------
 *                                  4.1) Truth Table
 * 
 *  Here is a truth table for the logical operators:
 * 
 *        p      q     p & q      p | q      !p     p ^ q
 * 
 *      false  false   false      false      true   false
 *      true   false   false      true       false  true
 *      false  true    false      true       true   true
 *      true   true    true       true       false  false
 * ---------------------------------------------------------------------------------
 * =================================================================================
*/


/*
 * =================================================================================
 *                                  5) Type Casting
 * 
 *  Type casting is when you assign a value of one primitive data type to another.
 *  There are two kinds of type casting:
 * ---------------------------------------------------------------------------------
 *                             5.1) Implicit Type Casting
 * 
 *  Or Automatic Type Casting. This is when you assign a smaller data type to a
 *  larger data type. For example,
 * 
 *      -------------------
 *          int x = 4;
 *          double y = x;
 *      -------------------
 *      ** NOTE: The value of 'x' is 4 and the value of 'y' is 4.0.
 * 
 *      ----------------------------------------
 *          5/2 = 2; int/int = int
 *          5.0/2 = 2.5; double/int = double
 *          5/2.0 = 2.5; int/double = double
 *      ----------------------------------------
 *----------------------------------------------------------------------------------
    *                          5.2) Explicit Type Casting
 * 
 * =================================================================================
*/


public class L2 {

    public static void main(String[] args) {
        // 1. Variables.
        int age = 35;
        boolean isActive = true;
        String name = "Johnatthan";

        System.out.println(age);         // 35
        System.out.println(isActive);    // true
        System.out.println(name);        // Johnatthan

        //----------------------------------------------
        // 1,2. Assigning Variables.
        String message;
        int hour, minute;

        message = "Hello";
        hour = 11;
        minute = 59;

        System.out.println(message);    // Hello
        System.out.println(hour);       // 11
        System.out.println(minute);     // 59
        //----------------------------------------------
    }
}
