# How to get Python version installed
sys.version_info
sys.version

# Create list and tuple
values = input("Input some comma seperated numbers..:")
list = values.split(",")
tuple = tuple(list)
print('List : ', list)
print('Tuple: ', tuple)

# How to get current date and time
import datetime
now = datetime.datetime.now()
print(now.strftime("%Y-%m-%d %H:%M:%S"))

# Accept a file
filename = input("Input the Filename: ")
f_extns = filename.split(".")
print ("The extension of the file is: " + repr(f_extns[-1]))

# Test if integer is within 100 of 1000 or 2000
def near_thousand(n):
  return ((abs(1000 - n) <= 100) or (abs{2000 - n) <= 100))
