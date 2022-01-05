// Main

public class Main {
  public static void main(String[] args) {
    
    Student s = new Student();
    
    s.setName("Suzie");
    s.setAge(24);
    
    System.out.println(s.getName());
    System.out.println(s.getAge());
  }
}

// Encapsulated 

public class Student {
  
  private String name;
  private int age;
  
  public void setName(String newName) {
    name = newName;
  }
  
  public String getName() {
    return name;
  }
  
  public void setAge(int newAge) {
    age = newAge;
  }

  public int getAge() {
    return age;
  }
}

  
