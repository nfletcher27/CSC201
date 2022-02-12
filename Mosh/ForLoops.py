numbers = [5, 2, 5, 2, 2]
i = 0
for items in numbers:
    word = ""
    for index in range(numbers[i]):
        word += "x"
    i += 1
    print(word)
