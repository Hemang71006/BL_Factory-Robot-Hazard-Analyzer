# Factory Robot Hazard Analyzer

## Project Description

The **Factory Robot Hazard Analyzer** is a Java-based application that calculates the hazard risk score of an industrial robot based on its arm precision, worker density, and machinery condition.

The application validates user inputs, identifies machinery risk factors, handles invalid inputs using a custom exception, and calculates the final hazard risk score.

The project is developed incrementally using GitFlow, with separate feature branches for each use case.

## Project Objectives

- Accept robot hazard-related inputs from the user.
- Validate input values using conditional logic.
- Handle invalid inputs using a custom exception.
- Map machinery conditions to their corresponding risk factors.
- Calculate the final robot hazard risk score.
- Follow object-oriented programming principles through modular Java classes.
- Verify application functionality using automated JUnit tests.

## Technologies Used

- **Programming Language:** Java
- **IDE:** IntelliJ IDEA
- **Build Tool:** Apache Maven
- **Testing Framework:** JUnit 5
- **Version Control:** Git and GitHub

## Use Cases Implemented

| Use Case | Description |
|---|---|
| UC1 | Display Static Hazard Message |
| UC2 | Accept Robot Hazard Inputs |
| UC3 | Calculate Hazard Risk Score Without Validation |
| UC4 | Introduce Validation Using Conditional Logic |
| UC5 | Refactor Validation into a Separate Method |
| UC6 | Implement Custom Robot Safety Exception |
| UC7 | Implement Machinery State Risk Mapping |
| UC8 | Develop a Fully Modular and OOPS-Compliant Application |

## Input Parameters

The application accepts three inputs:

1. **Robot Arm Precision:** A decimal value between 0.0 and 1.0.
2. **Worker Density:** An integer between 1 and 20.
3. **Machinery State:** One of the supported conditions:
    - Worn
    - Faulty
    - Critical

## Input Validation

The application checks the following conditions:

- Arm precision must be between 0.0 and 1.0.
- Worker density must be between 1 and 20.
- Machinery state must be Worn, Faulty, or Critical.

Invalid inputs generate the corresponding custom error messages using `RobotSafetyException`.

## Machinery Risk Mapping

| Machinery State | Risk Factor |
|---|---:|
| Worn | 1.3 |
| Faulty | 2.0 |
| Critical | 3.0 |

## Risk Calculation Formula

The application calculates the robot hazard risk score using:

```text
Risk Score = ((1.0 - Arm Precision) * 15.0)
             + (Worker Density * Machine Risk Factor)
```

## Project Architecture

The application follows a modular object-oriented design. Each class has a specific responsibility.

| Class | Responsibility |
|---|---|
| `FactoryRobotHazardAnalyzer` | Main application and program execution |
| `RobotHazardInput` | Stores robot hazard input values |
| `HazardValidator` | Validates user input |
| `MachineryRiskMapper` | Maps machinery states to risk factors |
| `HazardRiskCalculator` | Calculates the final hazard risk score |
| `RobotSafetyException` | Handles custom validation errors |

## Project Structure

```text
BL_Factory-Robot-Hazard-Analyzer/
│
├── .gitignore
├── README.md
├── pom.xml
│
└── src/
    ├── main/
    │   └── java/
    │       └── factoryrobot/
    │           ├── FactoryRobotHazardAnalyzer.java
    │           ├── RobotHazardInput.java
    │           ├── HazardValidator.java
    │           ├── MachineryRiskMapper.java
    │           ├── HazardRiskCalculator.java
    │           └── RobotSafetyException.java
    │
    └── test/
        └── java/
            └── factoryrobot/
                ├── HazardValidatorTest.java
                ├── MachineryRiskMapperTest.java
                └── HazardRiskCalculatorTest.java
```

## How to Run the Project

### Prerequisites

- Java Development Kit (JDK 17 or compatible configured version)
- Apache Maven
- IntelliJ IDEA or another Java IDE

### Steps

1. Clone the repository.
2. Open the project in IntelliJ IDEA.
3. Load the Maven project.
4. Run `FactoryRobotHazardAnalyzer.java`.
5. Enter the requested robot hazard inputs.
6. View the calculated hazard risk score.

### Run Using Maven

To build the project:

```bash
mvn clean compile
```

To execute the automated tests:

```bash
mvn clean test
```

## Sample Execution

**Input:**

```text
Enter Robot Arm Precision (0.0-1.0): 0.5
Enter Worker Density (1-20): 10
Enter Machinery State (Worn/Faulty/Critical): Critical
```

**Output:**

```text
==========================================
     FACTORY ROBOT HAZARD ANALYZER
==========================================

Robot Hazard Risk Score: 37.5
```

## Automated Testing

JUnit 5 is used to verify the application's functionality.

The test cases cover:

- Valid and invalid robot arm precision.
- Valid and invalid worker density.
- Supported and unsupported machinery states.
- Machinery risk factor mapping.
- Null and case-sensitive machinery states.
- Hazard risk score calculations for all three machinery conditions.

Run all tests using:

```bash
mvn clean test
```

## Version Control Strategy

The project follows the GitFlow branching strategy:

- **main:** Contains project documentation.
- **develop:** Contains the integrated application source code and tests.
- **feature branches:** Each use case is developed independently in its own feature branch and merged into `develop`.

Feature branches are maintained to preserve the development history of individual use cases.

## Conclusion

The Factory Robot Hazard Analyzer demonstrates input handling, conditional validation, custom exception handling, machinery risk mapping, risk calculation, modular programming, object-oriented design, and automated testing using Java and JUnit 5.