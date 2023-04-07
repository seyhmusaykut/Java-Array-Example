import java.util.Scanner;
public class odevim {
	public static void main(String[] args) {
		int stcount,nop,nol;
		nop = nol = 0;
		double sort;
		sort=0;
		Scanner read = new Scanner(System.in);
		System.out.print("öğrenci sayısı:");
		stcount=read.nextInt();
		double vize[]=new double[stcount];
		double fiinal[]=new double[stcount];
		double ort[]=new double[stcount];
		String name[]=new String[stcount];
		String situation[]=new String[stcount];
		for(int s=0;s<stcount;s++)
		{
			System.out.print((s+1)+". öğrencinin adı:");
			name[s]=read.next();
			System.out.print(name[s]+"'nin vizesi:");
			vize[s]=read.nextDouble();
			System.out.print(name[s]+"'nin finali:");
			fiinal[s]=read.nextDouble();
			ort[s]=vize[s]*0.4+fiinal[s]*0.6;
			sort=sort+ort[s];
			if(ort[s]>=50)
			{
				situation[s]="geçti";
				nop++;
			}
			else
			{
				situation[s]="kaldı";
				nol++;
			}
			System.out.println(name[s]+"'nin durumu: "+situation[s]);
		}
		System.out.println("**************");
		for(int s=0;s<stcount;s++)
		{
			System.out.println(name[s]+"'nin vizesi: "+vize[s]);
			System.out.println(name[s]+"'nin finali: "+fiinal[s]);
			System.out.println(name[s]+"'nin ortalaması: "+ort[s]);
			System.out.println(name[s]+"'nin durumu: "+situation[s]);
			System.out.println("**************");
		}
		double gano=sort/stcount;
		System.out.println("Dersi Geçenlerin Sayısı: "+nop);
		System.out.println("Dersi Kalanların Sayısı: "+nol);
		System.out.println("GANO: "+gano);
	}
}
