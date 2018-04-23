import java.util.Scanner;;

public class UnitConversion
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the number of meters");
		double meter = sc.nextDouble();
		double inches = ( meter * (100 / 2.54) );//(1 meter=10cms, 1 inch= 2.54cms)
		
		System.out.println( meter + " meters is equivalent to " + inches + " inches ");
		
		System.out.println("Enter the number of feet");
		double feet = sc.nextDouble();
		double meter2 = ( feet * 12 * 0.0254 );//(1 feet =12 inches, 1 inch=2.54cms)
		
		System.out.println( feet + " feet is equivaent to " + meter2 + " meters ");
		
		System.out.println("Enter the number of pounds");
		double kilo2 = sc.nextDouble();
		double grams = ( kilo2 * 453.6);//(1 pound =435.6 grams)
		
		System.out.println( kilo2 + " pounds is equivalent to " + grams + " grams ");
		
		System.out.println("Enter number of kilograms");
		double kilo1 = sc.nextDouble();
		double pounds1 = ( kilo1 * (1000 / 453.6));//(1kilogram=1000grams, 1 pound =435.6 grams)
		
		System.out.println( kilo1 + " kilograms is equivalent to " + pounds1 + " pounds ");
		
		System.out.println("Enter degrees in farenheit");
		double degrees = sc.nextDouble();
		double celsius = ( degrees - 32 ) * (5.0/9.0);
		
		System.out.println( + degrees + " degree Farenheit is equivalent to " + celsius + " Celsius ");
		
		System.out.println("Enter degree in celsius");
		double degrees2 = sc.nextDouble();
		double farenheit = ( degrees2 * (9.0/5.0) + 32);
	
		System.out.println( + degrees2 + " degree Celsius is equivalent to " + farenheit + " farenheit ");
		
		System.out.println("Enter number of days");
		double days = sc.nextDouble();
		double seconds = ( days * 24 * 60 * 60 );//(seconds=no of days*hrs*minutes*seconds)
		
		System.out.println("The number of seconds in a year is " + seconds);
	}
	
}
