# Simple Calculator

Este es un proyecto de una calculadora simple desarrollada en Java utilizando Maven. La aplicación sigue los principios de SOLID y es extensible, permitiendo agregar fácilmente nuevas operaciones matemáticas.

## Características

- Operaciones soportadas: suma (`+`), resta (`-`), multiplicación (`*`), división (`/`).
- Manejo de excepciones para operaciones no soportadas y división por cero.
- Validación de entrada: se asegura que los valores ingresados sean numéricos.
- Fácilmente extensible para agregar más operaciones.
  
## Estructura del Proyecto
```
calculator/
│
├── pom.xml
└── src
    └── main
        └── java
            └── com
                └── example
                    └── calculator
                        ├── Calculator.java
                        └── Main.java
                    └── operations
                        ├── Addition.java
                        ├── Subtraction.java
                        ├── Multiplication.java
                        ├── Division.java
                        └── Operation.java
    └── test
        └── java
            └── com
                └── example
                    └── calculator
                        ├── CalculatorTest.java
                    └── operations
                        ├── AdditionTest.java
                        ├── SubtractionTest.java
                        ├── MultiplicationTest.java
                        ├── DivisionTest.java
```

## Requisitos

- [Java 21.0.4](https://www.oracle.com/java/technologies/javase/jdk21-archive-downloads.html) o superior.
- [Maven 3.6.3](https://maven.apache.org/) o superior.

## Instalación

1. Clona el repositorio:

    ```bash
    git clone https://github.com/tu-usuario/calculator.git
    cd calculator

2. Compila el proyecto con Maven:

    ```bash
    mvn clean install

3. Ejecuta la aplicación:

    ```bash
    mvn exec:java -Dexec.mainClass="com.example.calculator.Main"
    ```


    *Es útil cuando deseas probar tu aplicación rápidamente sin generar un archivo JAR ni crear un proceso de despliegue completo. En tu caso, ejecutará la clase Main de tu proyecto de calculadora en Java.*


## Uso

Cuando ejecutes la aplicación, la consola te pedirá ingresar dos números y un operador matemático:

    ```
    Simple Calculator
    Enter first number: 5
    Enter an operator (+, -, *, /): +
    Enter second number: 10
    The result is: 15.0

## Validación de entrada
Si introduces un valor que no es numérico, la aplicación te pedirá que ingreses un número válido:

    ```
    Enter first number: abc
    Invalid input. Please enter a valid number.
    Enter first number: 5


## Extender la aplicación 
### Agregar una Nueva Operación

1.- Crea una nueva clase en el paquete operations que implemente la interfaz Operation.

```java
public class Power implements Operation {
    @Override
    public double calculate(double a, double b) {
        return Math.pow(a, b);
    }
}
```


2.- Registra la nueva operación en Main.java:

```java
operations.put("^", new Power());
```


3.- Ahora podrás usar la nueva operación en la calculadora.

## Pruebas
Las pruebas unitarias se encuentran en el directorio *src/test/java*. Puedes ejecutar todas las pruebas utilizando el siguiente comando:

    mvn test


## Principios SOLID

Este proyecto sigue los principios de SOLID

- **Single Responsibility Principle (SRP)**: Cada clase tiene una única responsabilidad.
- **Open/Closed Principle (OCP)**: La calculadora es fácilmente extensible con nuevas operaciones sin modificar el código existente.
- **Liskov Substitution Principle (LSP)**: Las clases de operaciones implementan la misma interfaz, lo que garantiza su intercambiabilidad.
- **Interface Segregation Principle (ISP)**: La interfaz Operation es específica y no obliga a las clases a implementar métodos innecesarios.
- **Dependency Inversion Principle (DIP)**: Calculator depende de la abstracción (la interfaz Operation), no de implementaciones concretas.

## Licencia

Este proyecto está licenciado bajo la [MIT License](https://opensource.org/license/mit)








