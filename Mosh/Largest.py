numbers = [3, 6, 2, 8, 22, 19, 200, 1]
max = numbers[0]

for number in numbers: # for each value of each index in our numbers list
    if number > max:   # if that value is greater than our current max
        max = number   # replace our original larger number with the new number which is now the largest we've seen

print(max)
