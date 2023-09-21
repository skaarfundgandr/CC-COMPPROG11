def add(x, y):
    result = x + y
    return result


def subtract(x, y):
    result = x - y
    return result


def multiply(x, y):
    result = x * y
    return result


def divide(x, y):
    result = x / y
    return result


print("Enter the number of instances: ")
instances = int(input())

while instances > 0:
    instances -= 1
    print("Select an operation: ")
    operation = input()
    if operation == "add":
        print("Input two numbers: ")
        num1 = int(input())
        num2 = int(input())
        sum = add(num1, num2)
        print(f"The sum is {sum}.")
    elif operation == "subtract":
        print("Input two numbers: ")
        num1 = int(input())
        num2 = int(input())
        difference = subtract(num1, num2)
        print(f"The difference is {difference}.")
    elif operation == "multiply":
        print("Input two numbers: ")
        num1 = int(input())
        num2 = int(input())
        product = multiply(num1, num2)
        print(f"The product is {product}.")
    elif operation == "divide":
        print("Input two numbers: ")
        num1 = int(input())
        num2 = int(input())
        quotient = divide(num1, num2)
        print(f"The quotient is {quotient}.")
    else:
        print("Invalid operation!")
    pass
