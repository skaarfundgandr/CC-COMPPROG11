import math


a = float(input("Enter the value for a: "))
b = float(input("Enter the value for b: "))
c = float(input("Enter the value for c: "))

discriminantFormula = (b**2) - (4 * a * c)

if discriminantFormula > 0:
    root1 = -b + (math.sqrt(discriminantFormula) / (2 * a))
    root2 = -b - (math.sqrt(discriminantFormula) / (2 * a))
    print(f"There are two roots these are {root1} and {root2}.")

elif discriminantFormula < 0:
    discriminantFormula = abs(discriminantFormula)
    root1 = -b + (math.sqrt(discriminantFormula) / (2 * a))
    root2 = -b - (math.sqrt(discriminantFormula) / (2 * a))
    print(f"The roots are imaginary!\nThese are {root1}i and {root2}i.")

else:
    root = -b + (math.sqrt(discriminantFormula) / (2 * a))
    print(f"There is only one root which is {root}")
