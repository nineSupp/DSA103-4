package Lectures;

/* 
 * Lesson 1
 * Saturday, Week 1 - (29/06/24)
 * 
 * Ajarn. Email: chanakarn.kin@tni.ac.th (Mon - Tues).
 * 
 * **********************************************
 * ----------------------------------------------
 * Grading System:
 * - Class Attendance = 10%
 * - Quiz = 10%
 * - Homework and Laboratory = 30%
 * - Project (Individual and Group) = 20%
 * - Final Exam = 30%
 * ----------------------------------------------
 * **********************************************
 * 
 * =================================================================================
 *              Topics for week 1: Introduction to course of Java
 * 
 *  1) What Is Programming?
 *      1.1) Key Aspects of Programming.
 *      1.2) High-level vs. Low-level Language.
 *      1.3) Machine Code.
 *      1.4) Fundamental Programming Concepts.
 * 
 *  2) Basic Java Revisited.
 *  
 *  3) *** PA 1.1: Hello World! ***
 * 
 * =================================================================================
 * 
*/


/*  
 * =================================================================================
 *                             1. What Is Programming?
 * 
 *  A) A Progrma = A sequence of instruction that specifies how to perform a computa
 *                 -tion on computer hardware.
 * 
 *  B) Computation = A systematics mathematically equation that are likely to solve
 *                   problems.
 * 
 *  C) Programming = A proccess of creating or generating a sets of instuctions for a
 *                   computer to execute.
 * 
 * ---------------------------------------------------------------------------------
 *                          1.1. Key Aspects of Programming
 * 
 *  A) Algorithm Design: Design a step-by-step procedures of the portions of a code.
 * 
 *  B) Coding: Writing the actual code of specific programming language.
 * 
 *  C) Testing: Running and executing the program to ensure it works and meet the
 *              requirements.
 * 
 *  D) Debugging: Identifying and fixing errors of a bugged code.
 * 
 *  E) Documentation: Writing explanations and commenting necessary parts of the
 *                    code which help others to understand.
 * 
 *  F) Maintenance: Updating and improving the code over time,
 * 
 * ---------------------------------------------------------------------------------
 *                      1.2. High-level vs. Low-level Language
 * 
 *  (High-level Language):
 * 
 *      A) A high-level language is a programming is a programming language with
 *         strong abstraction.
 * 
 *      B) Simplier and more understandable for human to intepret.
 * 
 *      C) More portable across platforms meaning that there are similarities
 *         between difference high-level languasge.
 * 
 *      D) Always require translator from human readable to computer format. Such as
 *         "Intepreters" or "Compilers". This makes running program slower than
 *         direct computer langage (Low-level).
 * 
 *  (Low-level Language):
 * 
 *      A) A low-level language for computers is a programming language without
 *         strong abstraction, meaning the language is straight-forward to the
 *         computer.
 * 
 *      B) Difficult for human to understand, and messy.
 * 
 *      C) Specific to computer hardware architecture (CPU).
 * 
 *      D) Because how low-language execute the program directly, without the need
 *         of a translator. It runs extremely fast.
 * 
 * ---------------------------------------------------------------------------------
 *                                1.3. Machine Code
 * 
 *  A) Assembly is one example of a machine language. A set of hardward instructions
 *     mainly configurating the memory adrress and etc.
 * 
 *  B) Machine code is a system of instuctions and data executed directly by a CPU.
 * 
 * 
 *  Example: of 3 stages in languages;
 * 
 *       Machine Language            Assembly Language          High Language
 * 
 *      001010101100101101   --->        MOV A, 10      --->    A = 10 + 20
 *      101011101010110110                 ADD 20
 * 
 * 
 * ---------------------------------------------------------------------------------
 *                       1.4. Fundamental Programming Concept
 * 
 *  A) Input: Receiving data from a keyboard, files, sensors, or other devices.
 * 
 *  B) Output: Display data through a screen, a file, or onto another devices.
 * 
 *  C) Math: Perform simple mathematical calculations or computations.
 * 
 *  D) Decision: Checking the conditions, the correct path of where you want you
 *               code to go through.
 * 
 *  E) Repetition: Executing the commands repeatedly.
 * 
 * ---------------------------------------------------------------------------------
 * =================================================================================
*/


/*
 * =================================================================================
 *                             2. Basic Java Revisited
 * 
 *  - Given the following code snippets, we will see how Java operates:
 * 
 *          public class Welcome {
 *              public static void main(String[] args) {
 *                  System.out.println("Welcome to Java!");
 *              }
 *          }
 * 
 * 
 *  - Now, let's see how the complier translate Java and intepret to the computer:
 * 
 *          Method Welcome()
 *              0   aload_0
 *              ...
 * 
 *          Method void main(java.lang.String[])
 *              0   getstatic       #2 ...
 *              3   ldc             #3 <String "Welcome to Java!">
 *              5   invokevirtual   #4 ...
 *              8   return
 * 
 *  - Display the output on the console:
 * 
 *          Welcome to Java!
 * 
 * ---------------------------------------------------------------------------------
 * =================================================================================
*/


/* 
 * =================================================================================
 *                           3. PA 1.1: Hello World!
 * 
 *  For this exercise, the java file is located at ./Exercises/W1/HelloWorld.java.
 * =================================================================================
*/


public class L1 {
    // 2.Basic Java Revisited.
    public static void main(String[] args) {
        System.out.println("Welcome to Java!");
    }
}
