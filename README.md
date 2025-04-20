# EMICalculator
EMICalculator

# 📊 EMI Calculator (Java)

This is a simple Java console application that calculates the **Equated Monthly Installment (EMI)** for a loan based on user input. The EMI is calculated using the standard financial formula used by banks and lenders.

The program:
- Prompts the user to enter the **loan amount** (Principal), **annual interest rate** (in %), and the **loan tenure** (in years).
- Converts the annual interest rate to a monthly rate and the tenure to months.
- Calculates the monthly EMI using the formula:  
  `EMI = [P × R × (1 + R)^N] / [(1 + R)^N – 1]`,  
  where:  
  `P` = loan amount,  
  `R` = monthly interest rate (annual rate ÷ 12 × 100),  
  `N` = number of monthly payments (years × 12).
- Displays the calculated EMI in USD.

### 🛠 How to Run
1. Copy the code from `EMICalculator.java` into your Java IDE (such as Eclipse, IntelliJ, or VS Code).
2. Compile and run the program.
3. Enter the required input values when prompted.

### ✅ Example
Enter loan amount in USD 10000 Enter annual interest rate (in %) 7.5 Enter loan tenure in years 3 Your monthly EMI is: 311.12

### 📁 File Structure
project-root/ └── src/ └── day4/ └── EMICalculator.java

### 📄 Requirements
- Java 8 or later
- Java IDE or command-line compiler

### 🧠 Notes
This project helps reinforce Java basics like:
- Reading user input with `Scanner`
- Using `Math.pow()` for calculations
- Writing clean, readable code
- Applying real-world financial formulas




