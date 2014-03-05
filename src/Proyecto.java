import java.util.Scanner;
public class Proyecto
{

	public static void main(String[] args)
	{
		int arreglo[]=new int[5];
		Scanner lol=new Scanner(System.in);
		for(int i=0;i<arreglo.length;i ++)
		{
			System.out.print("Ingrese numero"+i+": ");
			arreglo[i]=lol.nextInt();
		}
		for (int i=0;i<arreglo.length;i ++)
		{
			System.out.println("---");
			if(arreglo[i]%2==0)
			{
				System.out.println("No es igual a 0");
			}
			System.out.println(arreglo[i]);
			System.out.println("====");
		}

	}
	
}