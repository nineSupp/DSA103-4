package Lectures;

/* 
 * (06/07/24 (Sat., Week 2)) - Lesson 2
 * Name: Suppatouch Srinual
 * ID: 2420210037
 * 
 * Ajarn. Email: chanakarn.kin@tni.ac.th (Mon - Tues).
 * 
 * 
 * =================================================================================
 * 
 * Topics for week 2: Variables, Data Types and Basic Operators
 * 
 * 0) Recap on Week 1.
 * 
 * 1) Introduction Data Types and Operators.
 * 
 * 2) Variables.
 * 
 * 3) Declaring Variables.
 * 
 * 4) Naming a Variables.
 * 
 * 5) Java Keywords.
 * 
 * 6) Assigning Variables.
 * 
 * 7) Memory Diagram.
 * 
 * 8) Printing Variables.
 * 
 * 9) Primitive Data Types.
 * 
 * 10) Integers.
 *      10.1) byte
 *      10.2) short
 *      10.3) int
 *      10.4) long
 * 
 * 11) Byte.
 * 
 * 12) Floating-Point.
 * 
 * 13) Characters (char).
 * 
 * 14) Unicode.
 * 
 * 15) Boolean.
 * 
 * 16) Conclusion for Primitive Data Types.
 * 
 * 17) Literals or Value of a Variables.
 * 
 * 18) Initializing a Variables.
 * 
 * 19) Operators (Arithmetic Operators).
 *      20.1) Modulo or Modulus (%).
 *      20.2) Increments and Decrements.
 *      20.3) Operators and Data Types.
 * 
 * 20) Implicit and Type Casting.
 * 
 * 21) Casting Incompatible Types: Explicit Type Casting.
 * 
 * 22) Constant (final).
 * 
 * 23) Java Math Class (Java library).
 *      23.1) Math.ceil().
 * 
 * 24) Spacing.
 * 
 * 25) Logical Operators (boolean).
 * 
 * 26) *** Class Exercise 2: ***
 *          2.1) ICS2.1
 *          2.2) ICS2.2
 * 
 * =================================================================================
 * 
*/


public class L2 {
    /*
     * 0) Recap on Week 1.
     * 
     *  The basic syntax of Java class.
     * 
     * -------------------------------------------------
     *  class CLASSNAME {
     *       public static void main(String[] args) {
     *           STATEMENTS
     *       }
     *  }
     * -------------------------------------------------
     */


    /*
     * 1) Introduction Data Types and Operators
     * 
     *  *** For Java you need to keep in mind the data types when declaring a variables,
     *      unlike Python. I.e, int x = 4; (Java), x = 4 (Python). ***
     * 
     *  In this class we will learn more about data types.
     */


    /*
     * 2) Variables
     * 
     *  The syntax of declare variables in Java:
     * 
     * -------------------------------------------------
     *  (dataType) (variableName) = (data value);
     * -------------------------------------------------
     *  For example;
     *      a) int thisIsVariableOfTypeInt = 4;
     *      b) String thisIsVariableOfTypeString = "Hello World!";
     * 
     * 
     *  2.1) Technically, once you declare a variables, your computer will reserved the memory
     *      space for particular variables.
     * 
     *  2.2) The variableName is the location in memory that stores the data. Thus, to store data
     *       we first need to delcare the variables.
     * 
     *  2.3) *** Always name your variableName meaningfully.
     * 
     *  2.4) There are many ways to name a variables:
     *      a) variableName = camelCase.
     *      b) variable_name = underscore.
     *      c) variableName1 or variable_name_1 = numerical.
     * 
     *  2.5) Rules of naming a variable:
     *      a) String a Letter or Underscore = a letter from (A-Z) or (a-z) or a dollar-sign ($) or underscore (_).
     *      
     *      b) *** Cannot start a variableName with digit!!
     *      
     *      c) Case-Sensitive = variableName can be the same name using different cases. i.e., int name = 4; and int Name = 4;
     *         this will create two variables 'name' and 'Name' both has the same value of 4.
     * 
     *      d) *** You cannot name a variable that exist in Java Keywords:
     *         {
     *              abstract
     *              assert
     *              boolean
     *              break
     *              byte
     *              case
     *              catch
     *              char
     *              class
     *              const
     *              continue
     *              default
     *              do
     *              double
     *              else
     *              enum
     *              extends
     *              final
     *              finally
     *              float
     *              for
     *              goto
     *              if
     *              implements
     *              import
     *              instanceof
     *              int
     *              interface
     *              long
     *              native
     *              new
     *              package
     *              private
     *              protected
     *              public
     *              return
     *              short
     *              static
     *              strictfp
     *              super
     *              switch
     *              synchronized
     *              this
     *              throw
     *              throws
     *              transient
     *              try
     *              void
     *              volatile
     *              while
     *         }


    byte = 8 : [2^8-1, 2^8-1 -1]
    short = 16
    int = 32
    long = 64



    *** [1 byte = 8 bits]!!!!!
     */

    public static void main(String[] args) {
        
    }
}
