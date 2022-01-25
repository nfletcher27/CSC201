# A parent class is the base class
# A child class inherits from the parent class
class Person:
  def __init__(self, fname, lname):
    self.firstname = fname
    self.lastname = lname
    
  def printname(self):
    print(self.firstname, self.lastname)
    
# Create a class with functions and properties
class Student(Person):

x = Student("Mike", "Olsen")
x.printname()

# Making _init_ function
class Student(Person):
  def __init__(self, fname, lname):
    Student.__init__(self, fname, lname)

