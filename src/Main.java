import java.util.Scanner;
public class Main {
	int x;
	int y;
	int r;
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.println("Calculate the area of rectangle or a circle (r,c)");
		String init = in.nextLine();
		if (init.equals("r"))
		{
			System.out.println("Width?");
			String input = in.nextLine();
			int x = Integer.parseInt(input);
			System.out.println("Height?");
			input = in.nextLine();
			int y = Integer.parseInt(input);
			laskuri.laskePintaAla(x,y);
		}
		if (init.equals("c"))
		{
			System.out.println("Radius?");
			String input = in.nextLine();
			int r = Integer.parseInt(input);
			laskuri.laskePintaAla(r);
		}
		in.close();
		
	} // main end

} // main claas end

class laskuri
{
	static void laskePintaAla(int x, int y) //nelikulmion pinta-alan laskenta
	{
		System.out.println(x*y);
	}
	static void laskePintaAla(int r) // ympyrän pinta-alan laskenta säteen perusteella
	{
		System.out.printf("%.2f",r*r*Math.PI);
	}
}
