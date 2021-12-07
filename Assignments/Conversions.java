import java.util.Scanner;

public class Conversions {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		final double FLUID_OUNCE_TO_LITER = 0.029586;
		
		final double GALLON_TO_LITER = 3.758;
		
		final double OUNCE_TO_GRAM = 28.3495;
		
		final double POUND_TO_GRAM = 453.6;
		
		final double INCH_TO_METER = 0.00254;
		
		final double FOOT_TO_METER = 0.305;
		
		final double MILE_TO_METER = 1609.0;
		
		System.out.print("Convert from (fl.oz, gal, oz, lb, in, ft, mi): ");
		
		String convert_from = input.next();
		
		System.out.print("Convert to (ml, l, g, kg, mm, cm, m, km): ");
		
		String convert_to = input.next();
		
		System.out.print("Enter value: ");
		
		double value = input.nextDouble();
		
		input.close();
		
		double convert = 0.0;
		
		if (convert_from.equals("fl.oz")) {
		    if (convert_to.equals("ml")) {
			convert = FLUID_OUNCE_TO_LITER * 1000;
		    }
		    else if (convert_to.equals("l")) {
			convert = FLUID_OUNCE_TO_LITER;
		    }
		}
		else if (convert_from.equals("gal")) {
		    if (convert_to.equals("ml")) {
			convert = GALLON_TO_LITER * 1000;
		    }
		    else if (convert_to.equals("l")) {
			convert = GALLON_TO_LITER;
		    }
		}
		else if (convert_from.equals("oz")) {
		    if (convert_to.equals("g")) {
			convert = OUNCE_TO_GRAM;
		    }
		    else if (convert_to.equals("kg")) {
			convert = OUNCE_TO_GRAM / 1000;
		    }
		}
		else if (convert_from.equals("lb")) {
		    if (convert_to.equals("g")) {
			convert = POUND_TO_GRAM;
		    }
		    else if (convert_to.equals("kg")){
			convert = POUND_TO_GRAM / 1000;
		    }
		}
		else if (convert_from.equals("in")) {
		    if (convert_to.equals("mm")) {
			convert = INCH_TO_METER * 1000;
		    }
		    else if (convert_to.equals("cm")) {
		    convert = INCH_TO_METER * 100;
		    }
		    else if (convert_to.equals("m")) {
		    convert = INCH_TO_METER;
		    }
		    else if (convert_to.equals("km")) {
			convert = INCH_TO_METER / 1000;
		    }
		}
		else if (convert_from.equals("ft")) {
		    if (convert_to.equals("mm")) {
			convert = FOOT_TO_METER * 1000;
		    }
		    else if (convert_to.equals("cm")) {
			convert = FOOT_TO_METER * 100;
		    }
		    else if (convert_to.equals("m")) {
			convert = FOOT_TO_METER;
		    }
		    else if (convert_to.equals("km")) {
			convert = FOOT_TO_METER / 1000;
		    }
		}
		else if (convert_from.equals("ml")) {
		    if (convert_to.equals("mm")) {
			convert = MILE_TO_METER * 1000;
		    }
		    else if (convert_to.equals("cm")) {
			convert = MILE_TO_METER * 100;
		    }
		    else if (convert_to.equals("m")) {
			convert = MILE_TO_METER;
		    }
		    else if (convert_to.equals("km")) {
			convert = MILE_TO_METER / 1000;
		    }
		}
		
		if (convert == 0.0) {
		    System.out.println("Conversion is unavailable.");
		}
		else {
		    double converted = value * convert;
		    System.out.printf("%.4f %s = %.4f %s", value, convert_from, converted, convert_to);
		}

	}

}
