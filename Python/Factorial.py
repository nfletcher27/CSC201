# Recursive style
num = 5;
print("Factorial of", num, "is", factorial(num))

def factorial(n):
  
  return 1 if (n == 1 or n == 0) else n * factorial(n-1);

# Iterative style
num = 5;
print("Factorial of", num, "is", factorial(num))

def factorial(n):
  
  if n < 0:
    return 0
  elif n == 0 or n == 1:
    return 1
  else:
    fact = 1
    while(n > 1):
      fact *= n
      n -= 1
    return fact
  
# Single line solution
num = 5
print ("Factorial of",num,"is", factorial(num))

def factorial(n):

  return 1 if (n == 1 or n == 0) else n * factorial(n-1);
