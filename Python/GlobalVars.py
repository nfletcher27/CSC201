x = awesome

def myFunct():
  print("Python is " + x)

myFunct() # we use a global variable inside a function

x = "awesome"

def myFun():
  x = "fantastic"
  print("Python is " + x)

myFun()
print("Python is " + x) # First line will use fantastic, second will use awesome. A function will use the variable declared inside first

def myFun():
  global x
  x = "fantastic"
  
myFun()
print("Python is " + x) # we now have a global variable, in the next example see it's use

x = "awesome"

def myFun():
  global x
  x = "fantastic"
  
myFun()
print("Python is " + x)
# myFun is changing the value of a global variable, now the print statement will print Python is fantastic
