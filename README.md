### 🏛️ Roman Numeral Converter (Java)

# A simple and reliable Roman numeral to integer converter implemented in Java, featuring full JUnit 5 test coverage.

## ✅ Features

# Converts Roman numerals to integers

# Supports subtractive notation (IV, IX, XL, etc.)

# Validates input for:

# Invalid characters

# Invalid repetition (VV, LL, DD)

# Invalid subtractive pairs (IL, IC, XM, etc.)

# Includes comprehensive JUnit test cases

# Maven project structure for easy building and testing

## 📁 Project Structure
# src/
# ├─ main/java/com/example/RomanNumeral.java
# └─ test/java/com/example/RomanNumeralTest.java
# pom.xml

## 🧪 Running Tests

# To run all JUnit tests:

# mvn test

## 🚀 How It Works

# The converter uses:

# A HashMap<Character, Integer> for Roman numeral values

# A left-to-right scan to detect subtractive notation



## 📌 Requirements

# Java 8+

# Maven 3+