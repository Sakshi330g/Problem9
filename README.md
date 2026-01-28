# Password Strength Checker (Java)

## Overview
This project is a Java console application that checks the strength of multiple passwords entered by the user. Each password is validated based on predefined rules and the results are displayed in a properly formatted table.

---

## Password Rules
A password is considered **PASS** if it satisfies **all** of the following:
- Minimum length of **8 characters**
- Contains **at least one digit**
- Contains **at least one special character**

Allowed special characters:
! @ # $ % ^ & * ( ) - +


If any rule fails, the password is marked **FAIL**.

---

## How I Thought (Approach)
- Took user input using `Scanner`
- Stored passwords in an `ArrayList`
- Created separate methods for each validation rule
- Combined validations in a single method for clarity
- Used `System.out.printf()` with fixed-width formatting to print a clean table

---

## Challenges Faced
- Table output was distorted when using `\t`
- Solved by using formatted output (`printf`)
- Scanner newline issue after `nextInt()`
- Fixed using an extra `nextLine()`

---

## Screenshots
![Screenshot](https://drive.google.com/file/d/1mjQzClngj0XfKkTTF1d4or5VkMNBCQp4/view?usp=drivesdk)


## Sample Output
