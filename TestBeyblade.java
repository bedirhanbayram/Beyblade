package BeybladeProgramı;
import java.util.Scanner;
public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Beyblade programına hosgeldiniz");
		System.out.println("cıkıs icin q ya basıın");
		
		Scanner scanner = new Scanner(System.in);
		
		while(true) {
			System.out.println("Hangi Beybladeı üretmek istiyorsunuz");
			String islem = scanner.nextLine();
			if (islem.equals("q")) {
				System.out.println("progrmdan cıkılıyor");
				break;
			}
			else {
				BeybladeFabrikası fabrika = new BeybladeFabrikası();
				Beyblade beyblade = fabrika.beybladeUret(islem);
				if(beyblade == null) {
					System.out.println("Lutfen gecerli bir beyblade ismi girin...");
				}
				else
				{
					beyblade.bilgileriGoster();
					beyblade.saldir();
					beyblade.kutsalCanavarOrtayaCıkar();
				}
			}
		}
	}

}
