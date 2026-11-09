# Strategy Calculator

## Overview

A Java 17 console calculator that uses the Strategy pattern. The same calculator instance switches between addition, subtraction, and multiplication at runtime.

## Build and Run

Run these commands from the project root with JDK 17:

```bash
javac -d out src/*.java
java -cp out Main
```

Expected output:

```text
12 + 4 = 16
12 - 4 = 8
12 * 4 = 48
```

## Adding a Strategy

To add an operation, create a class that implements `OperationStrategy` and define its `execute` method. For example, a `ModuloStrategy` can compute the remainder using `left % right`. Select the new operation in `Main` with `calculator.setStrategy(new ModuloStrategy())`. The `Calculator` class requires no changes.