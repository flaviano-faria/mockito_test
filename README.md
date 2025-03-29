# Mockito Test Project

This project demonstrates the usage of Mockito, a popular mocking framework for Java unit testing. It provides examples of how to use Mockito for creating mock objects, verifying interactions, and testing behavior in Java applications.

## Project Structure

```
mockito_test/
├── src/
│   ├── main/
│   │   └── java/        # Main source code
│   └── test/
│       └── java/        # Test source code
├── pom.xml              # Maven configuration
└── README.md            # Project documentation
```

## Prerequisites

- Java 21 or higher
- Maven 3.x
- IDE (recommended: IntelliJ IDEA, Eclipse, or VS Code)

## Dependencies

The project uses the following main dependencies:
- Mockito Core (v5.14.2) - For creating mock objects and verifying interactions
- JUnit Jupiter (v5.6.2) - For running unit tests

## Setup

1. Clone the repository:
```bash
git clone [your-repository-url]
cd mockito_test
```

2. Build the project:
```bash
mvn clean install
```

## Running Tests

To run the tests, execute:
```bash
mvn test
```

## Features

- Mock object creation
- Method behavior stubbing
- Interaction verification
- Exception handling in mocks
- Mocking static methods
- Mocking final classes and methods

## Contributing

Feel free to contribute to this project by:
1. Forking the repository
2. Creating a feature branch
3. Committing your changes
4. Pushing to the branch
5. Creating a Pull Request

## Contact

For any questions or suggestions, please open an issue in the repository.

-com.service: <br/> 
    OrderServicetest: <br/> 
      Demonstrates Junit 5 + Mockito unit tests; <br/> 
      createSucessOrderTest(), createFraudOrderTest() methods: <br/> 
        Demonstrates org.mockito.Mockito.spy() method; <br/> 
      sendOrderTest() method: <br/> 
        Demonstrates how mock void method; <br/> 
      sendStaticOrderTest(): <br/> 
        Demonstrates how mock static methods call;

