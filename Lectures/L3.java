package Lectures;

/* 
 * Lesson 3
 * Saturday, Week 3 - (13/07/24)
 * 
 * =================================================================================
 *   Topics for week 3: Relational and Logical Operators, Scanner Class for Input
 * 
 *  0) Recap on Week 2.
 * 
 *  1) Base Number.
 *      1.1) Memory Unit.
 *      1.2) int 1000 to byte.
 *      1.3) Base Number Conversions.
 * 
 *  2) String
 *      2.1) String Concatenation.
 *      2.2) String Comparison.
 *      2.3) String Length.
 *      2.4) String Methods.
 *      2.5) String to Number && Number to String.
 * 
 *  3) More Relational and Logical Operators.
 *      3.1) Logical AND (&&) Operator.
 *      3.2) Logical OR (||) Operator.
 *      3.3) Logical NOT (!) Operator.
 *      3.4) Short-Circuit Evaluation.
 *      3.5) Bitwise AND (&) Operator.
 *      3.6) Bitwise OR (|) Operator.
 *      3.7) Bitwise XOR (^) Operator.
 *      3.8) Bitwise NOT (~) Operator.
 *      3.9) Logical and Bitwise Operators.
 *      3.10) Combining Logical Operators
 * 
 *  4) Control Flow Statements.
 *      4.1) if-else Statement.
 *      4.2) while Statement.
 *      4.3) for Statement.
 *      4.4) do-while Statement.
 * 
 *  5) Scanner Class as Input from keyboard.
 *      5.1) Using Scanner in Java.
 *      5.2) A Pompt to the User.
 * 
 * =================================================================================
 * 
*/


/* 
 * =================================================================================
 *                               0) Recap on Week 2
 * 
 *  a) Variables.
 *      - A Variable is used to store a value and data type of a data.
 *      - When assigning the variable, the computer will allocate space in the memory
 *        for the expected data.
 *      - Syntax: [data type] [variableName] = [value];
 * 
 *  b) Primitive Data Types.
 *     [1 Byte = 8 Bits].
 *      - There are in total 8 primitive dat1a types:
 *      - byte, 1 Byte = 8 bits, represent an integer [-128 to 127].
 *      - short, 2 Bytes = 16 bits, represent an integer [-32768 to 32767].
 *      - int, 4 Bytes = 32 bits, represent an integer [-2^31 to 2^31 - 1].
 *      - long, 8 Bytes = 64 bits, represent an integer [-2^63 to 2^63 - 1].
 *      - float, 4 Bytes = 32 bits, represent a single-precision of 7 digits.
 *      - double, 8 Bytes = 64 bits, represent a double-precision of 15 digits.
 *      - char - 1 Bytes = 8 bits, represent a single character of ASCII.
 *      - boolean, 1-bits, represent in 1's and 0's (true or false).
 * 
 *  c) Arithmetic Operators.
 *      - Mathematical order of operations:
 *      - 1) B = Brackets: ().
 *      - 2) I = Indicies.
 *      - 3) D = Division, Modulo: /, %.
 *      - 4) M = Multiplication: *.
 *      - 5) A = Addition: +.
 *      - 6) S = Subtraction -.
 *      - Keep in mind that the order of operation doesn't always apply, the 
 *        operation goes from left to right.
 * 
 *  d) Relational and Logical Operators.
 *      - These are logical operators.
 *      - Relational Operators are operators in which compares the relation b/w
 *        two entities.
 *      - Logical Operators are operators in which connects logical constants.
 *      - Relational Operators:
 *      - 1) == - Equal to.
 *      - 2) != - Not equal to.
 *      - 3) > - Greater than.
 *      - 4) < - Less than.
 *      - 5) >= - Greater than equal to.
 *      - 6) <= - Less than equal to.
 * 
 *      - Logical OperatorsL
 *      - 1) && - Logical AND.
 *      - 2) || - Logical OR.
 *      - 3) ! - Logical NOT.
 *      - 4) ^ - Logical XOR.
 *      - 5) & - Bitwise AND.
 *      - 6) | - Bitwise OR.
 * 
 * 
 *  e) Type Casting.
 *      - Implicity type casting or automatic type casting is when you assign
 *        smaller data type to a larger data type.
 * 
 *          int/int = int, double/int = double, int/double = double.
 *      - Explicit type casting is a process of converting one data type into 
 *        another.
 * 
 *  f) Constant (final keyword).
 *      - final is a Java keyword that mark the created variable as final, meaning
 *        this variable cannot be change or update.
 * 
 *  g) Java Math Class.
 *      - Math is a very useful tools for enhancing the mathematical operations.
 * 
 * =================================================================================
*/


/*
 * =================================================================================
 *                                  1) Base Number
 * 
 *  Computers use base 2 (two's complements) to understand the human input, this is
 *  also known as the binaary number system.
 * 
 *  a) Transistors: Computers are built using transistors, which are the building
 *     blocks of digital circuits. Transistors have two stable states; on and off.
 *     These states can be naturally represented by the binary digits 0 and 1.
 * 
 *  b) Logic Gates: The basic logic gates (AND, OR, NOT) that form the foundation of
 *     digital ciruits operate most efficiently using binary signals. This allows
 *     for straightforward implementation of logical operations.
 * ---------------------------------------------------------------------------------
 *                                1.1) Memory Unit
 * 
 *  
 * =================================================================================
*/

public class L3 {
    public static void main(String[] args) {
        
    }
}
