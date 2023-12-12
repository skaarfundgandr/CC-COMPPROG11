import re

if __name__ == "__main__":
    puzzle_input = open("puzzle.txt", "r")
    lines = puzzle_input.readlines()
    add = 0
    for line in lines:
        array_of_ints = re.findall(r'\d', line)
        first_elem = array_of_ints[0]
        last_elem = array_of_ints[-1]
        num = int(first_elem + last_elem)
        add += num
    print(add)
