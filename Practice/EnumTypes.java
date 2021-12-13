// special data type enabling variables to be a set of predefined constants
// use enum keyword, such as days of the week
public enum Day {
  SUNDAY, MONDAY, TUESDAY, WEDNESDAY,
  THURSDAY, FRIDAY, SATURDAY }

// use enum types to represent fixed sets of constants
// example using enum
public class EnumTest {
  Day day;
  
  public EnumTest(Day day) {
    this.day = day;
  }
   public void tellItLikeItIs() {
     switch (day) {
       case MONDAY:
         System.out.println("Mondays are bad.");
         break;
         
       case FRIDAY:
         System.out.println("Fridays are better.");
         break ;
         
       case SATURDAY: case SUNDAY:
         System.out.println("Weekends are best.");
         break;
         
       default:
         System.out.println("Weekdays are so-so.");
         break:
     }
   }
  
  public static void main(String[] args) {
    EnumTest firstDay = new EnumTest(Day.MONDAY);
    firstDay.tellItLikeItIs();
    EnumTest thirdDay = new EnumTest(Day.WEDNESDAY);
    thirdDay.tellItLikeItIs();
    EnumTest fifthDay = new EnumTest(Day.FRIDAY);
    fifthDay.tellItLikeItIs();
    EnumTest sixthDay = new EnumTest(Day.SATURDAY);
    sixthDay.tellItLikeItIs();
    EnumTest seventhDay = new EnumTest(Day.SUNDAY);
    seventhDay.tellItLikeItIs();
  }
}

// the enum declaration defines a class (called enum type). enum class bodies can include methods and other fields
// it also includes some built in methods such as values()
for (Planet p : Planet.values()) {
  System.out.printf("Your weight on %s is %f%n", p, p.surfaceWeight(mass));
}

// each enum constant is declared with values for mass and radius below. These values are passed to the constructor when the constant is created
// Java requires constants be defined first, prior to any fields or methods
public enum Planet {
   MERCURY (3.303e+23, 2.4397e6),
   VENUS   (4.869e+24, 6.0518e6),
   EARTH   (5.976e+24, 6.37814e6),
   MARS    (6.421e+23, 3.3972e6),
   JUPITER (1.9e+27,   7.1492e7),
   SATURN  (5.688e+26, 6.0268e7),
   URANUS  (8.686e+25, 2.5559e7),
   NEPTUNE (1.024e+26, 2.4746e7);
  
  private final double mass;  // in kilograms
  private final double radius; // in meters
  Planet(double mass, double radius) {
    this.mass = mass;
    this.radius = radius;
  }
  private double mass() {
    return mass; }
  private double radius() {
    return radius; }
  
  // universal gravitational constant
  public static final double G = 6.67300E-11;
  
  double surfaceGravity() {
    return G*mass/(radius*radius);
  }
  double surfaceWeight(double otherMass) {
    return otherMass*surfaceGravity();
  }
  
  public static void main(String[] args) {
    if (args.length != 1) {
      System.err.println("Usage: java Planet <earth.weight>");
      System.exit(-1);
    }
    double earthWeight = Double.parseDouble(args[0]);
    double mass = earthWeight/EARTH.surfaceGravity();
    for (Planet p : Planet.values())
      System.out.printf("Your weight on %s is %f%n", p, p.surfaceWeight(mass));
  }
}
