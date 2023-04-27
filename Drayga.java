package BeybladeProgramı;

public class Drayga extends Beyblade {
	private String kutsalCanavar;
	public Drayga(String beybladeci, int donusHizi, int saldırıGucu,String kutsalCanavar) {
		super(beybladeci, donusHizi, saldırıGucu);
		// TODO Auto-generated constructor stub
		this.kutsalCanavar=kutsalCanavar;
	}
	@Override
	public void kutsalCanavarOrtayaCıkar() {
		System.out.println(getBeybladeci() + " " + kutsalCanavar + "ı ortaya cıkarıyor");
		System.out.println(getBeybladeci() + "ın Saldırısı : kaplan pencesi");
	}
	@Override
	public void bilgileriGoster() {
		// TODO Auto-generated method stub
		super.bilgileriGoster();
		System.out.println("kutsal canavar adı:" + kutsalCanavar);
	}
	
	
}
