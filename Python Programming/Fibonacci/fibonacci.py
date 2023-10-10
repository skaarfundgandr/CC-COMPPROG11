def fibonacci(n):
    if n in {0, 1}:
        return n
    return fibonacci(n-1) + fibonacci(n-2)


print("Enter the amount of terms: ")

terms = int(input())

for i in range(terms):
    terms -= 1
    print(fibonacci(terms+1))
