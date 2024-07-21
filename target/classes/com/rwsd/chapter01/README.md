# Chap1
Keep It Short and Simple KISS Principle

“Don’t Repeat Yourself” (DRY) principle

Single Responsibility Principle (SRP)

principle of least surprise
- Use self-documenting method names so it is immediately obvious what they do (e.g., calculateTotalAmount())
- Do not change the state of parameters as other parts of code may depend on it

Cohesion
![alt text](images/image.png)

Coupling
![alt text](images/image-1.png)

Testing

Takeaways
- God Classes and code duplication lead to code that is hard to reason about and maintain.
- The Single Responsibility Principle helps you write code that is easier to manage and maintain.
- Cohesion is concerned with how how strongly related the responsibilities of a class or method are.
- Coupling is concerned with how dependent a class is on other parts of your code.
- High cohesion and low coupling are characteristics of maintainable code.
- A suite of automated tests increases confidence that your software is correct, makes it more robust forhanges, and helps program comprehension.
- JUnit is a Java testing framework that lets you specify unit tests that verify the behavior of your methods and classes.
- Given-When-Then is a pattern for setting up a test into three parts to help understand the tests you implement

# Chap2