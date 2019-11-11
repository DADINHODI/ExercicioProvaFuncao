import java.util.Scanner;
public class Exercicio2 {
	public static void main(String[] args) {
		int s,m;
		double tg,r,p;
		System.out.println("Digite o número da opção: ");
		System.out.println("1 = a vista");
		System.out.println("2 = parcelado em duas vezes");
		System.out.println("3 = parcelado de 3 até 10 vezes");
	
		menu();

}
	public static void menu() {
		Scanner ler= new Scanner(System.in);
		int s,m=0;
		
		double tg,p;

		s = ler.nextInt();
		
		switch(s) {
		
		case 1:
			
			{
				System.out.println("digite o total gasto pela cliente:");
				tg = ler.nextDouble();
				System.out.println(opção1(tg));
				break;
			}
			
		case 2:
			
			{
				
			System.out.println("digite o preço do produto:");
			p=ler.nextDouble();
			System.out.println(opção2(p));
			break;
			
			}
			
		case 3:
			
		{
			System.out.println("digite o total gasto pela cliente:");
			tg = ler.nextDouble();
			System.out.println("digite o numero de vezes da parcela:");
			m = ler.nextInt();
			if (m<=100) {
				menu();
			}
			System.out.println(opção3(tg,m));
			
		}
}
	}
	
	public static double opção1(double tg) {
		double n;
		n=tg-(tg*10/100);
		return n;
	}
	
	public static double opção2(double p) {
		double tg;
		tg=p/2;
		return tg;
	}
	
	public static double opção3(double in,int m) {
		double r=in;
		if (in>100 && m>=3 && m<=10) {
			for(int i=1;i<=m;i++) {
				r=r+r/100*3;
			}
		}else {
			System.out.println("o numero de parcelas precisa ser entre 3 e 10 ou o número gasto é menor ou igual a 100.");
		}
		return r;
	}
}