import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		//Değişkenler oluşturuluyor
		int a,b,c;
		double u,alan;
		
		//Scanner sınıfı tanımlanıyor
		Scanner in= new Scanner(System.in);
		
		//Kullanıcıdan üçgenin kenar uzunlukları alınıyor
		System.out.print("Üçgenin birinci kenar uzunluğunu giriniz : ");
		a = in.nextInt();
		
		System.out.print("Üçgenin ikinci kenar uzunluğunu giriniz : ");
		b = in.nextInt();
		
		System.out.print("Üçgenin üçüncü kenar uzunluğunu giriniz : ");
		c = in.nextInt();
		
		u=(a+b+c)/2;
		alan=Math.sqrt(u*(u-a)*(u-b)*(u-c));

		System.out.println("\n Girdiğiniz kenarlara göre üçgenin alanı: " + alan);
	}

}
