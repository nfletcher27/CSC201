# Mosh Car Game
# >help will return start, stop, or quit
# >anything else, return don't know

exit = True
carStarted = False
status = input("Type 'help' to get control menu.")
stopCount = 0
startCount = 0

if status == 'help':
    print("start - to start car")
    print("stop - to stop car")
    print("exit - to exit program")
else:
    print("I don't understand that...")

while exit:
    status = input()
    if status == "start":
        print("The car has started.")
        startCount += 1
    elif status == "stop":
        print("The car has stopped.")
        stopCount += 1
    elif status == "exit":
        exit = False
    else:
        print("I don't understand that...")
else:
    print("The program has ended")
    print("You stopped " + str(stopCount) + " times, and started " + str(startCount) + " times.")
