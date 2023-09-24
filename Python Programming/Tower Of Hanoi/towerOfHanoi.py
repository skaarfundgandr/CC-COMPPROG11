# Tower of Hanoi solution using a recursive function in Python3
def TowerOfHanoi(n, from_rod, to_rod, aux_rod):
    if n == 0:
        return
    TowerOfHanoi(n-1, from_rod, aux_rod, to_rod)
    print("Move disk", n, "from rod", from_rod, "to rod", to_rod)
    TowerOfHanoi(n-1, aux_rod, to_rod, from_rod)


# Input prompt for the user to enter the number of disks
print("Enter the number of disks: ")
disks = int(input())

# Function call
TowerOfHanoi(disks, 'A', 'C', 'B')
