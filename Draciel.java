package BeybladeProgramı;

public class Draciel extends Beyblade {
	private String kutsalCanavar;
	public Draciel(String beybladeci, int donusHizi, int saldırıGucu,String kutsalCanavar) {
		super(beybladeci, donusHizi, saldırıGucu);
		// TODO Auto-generated constructor stub
		this.kutsalCanavar=kutsalCanavar;
	}
	@Override
	public void kutsalCanavarOrtayaCıkar() {
		System.out.println(getBeybladeci() + " " + kutsalCanavar + "ı ortaya cıkarıyor");
		System.out.println(getBeybladeci() + "ın Saldırısı : kale savunması");
		}
	@Override
	public void bilgileriGoster() {
		super.bilgileriGoster();
		System.out.println("Kutsal canavarın adı:" + kutsalCanavar);
	}
	
	
}
