import java.util.Scanner;
public class Exercicio1 {
	public static void main(String[] args) {
		Scanner ler= new Scanner(System.in);
		double m,d,in,r;
		
		System.out.println("digite a quantidade de meses que serão investidos::");
		m = ler.nextDouble();
		System.out.println("digite o seu investimento:");
		in = ler.nextDouble();
		r= investimento(m,in);
		System.out.println("Investiemnto atual: "+r);	
		}
			public static double investimento (double m,double in) {
				double r=in;
				for(int i=1;i<=m;i++) {
					r=r+r/100*1;
				}
				return  r;
	}
}
