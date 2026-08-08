# Java Reverse Number

A simple Java program that reverses the digits of a given number.

## 📌 Overview

The program accepts a number from the user and reverses its digits using arithmetic operations.

### Examples

```text id="x3e7fg"
12345 → 54321
9876  → 6789
1200  → 21
```

## 📂 Project Structure

```text id="b8q1kc"
java-reverse-number/
├── .gitignore
├── ReverseNumber.java
└── README.md
```

## 💻 Program

The program uses the modulus `%` operator to extract the last digit of the number.

The extracted digit is then added to the reversed number.

### Algorithm

```text id="d8q7pk"
1. Read a number from the user.
2. Store the original number.
3. Set reversed number to 0.
4. Extract the last digit using % 10.
5. Add the digit to the reversed number.
6. Remove the last digit using / 10.
7. Repeat until the number becomes 0.
8. Display the reversed number.
```

## ▶️ How to Run

### Step 1: Check Java

```bash id="0x4gqv"
java --version
```

### Step 2: Check Java Compiler

```bash id="o9y0zh"
javac --version
```

### Step 3: Compile

```bash id="3j8cpg"
javac ReverseNumber.java
```

### Step 4: Run

```bash id="p42g6y"
java ReverseNumber
```

## 📊 Sample Output

### Example 1

```text id="qv7mxm"
Enter a number: 12345
Original Number: 12345
Reversed Number: 54321
```

### Example 2

```text id="6h9ycs"
Enter a number: 9876
Original Number: 9876
Reversed Number: 6789
```

### Example 3

```text id="q51k0f"
Enter a number: 1200
Original Number: 1200
Reversed Number: 21
```

## 🧠 Concepts Used

* Java
* Scanner
* User input
* Variables
* While loop
* Arithmetic operators
* Modulus operator `%`
* Integer division `/`

## ⏱️ Complexity

**Time Complexity:** `O(n)`

**Space Complexity:** `O(1)`

where `n` is the number of digits.

## 🚀 Future Improvements

* Reverse negative numbers
* Reverse a number using a method
* Reverse a number using String
* Check whether a number is a palindrome
* Reverse multiple numbers

## 🛠️ Technologies

* Java
* Git
* GitHub

## 👨‍💻 Author

**Your Name**

GitHub: `https://github.com/your-username`

---

⭐ If you found this project useful, consider giving the repository a star!
