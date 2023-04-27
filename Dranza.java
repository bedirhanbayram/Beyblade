package BeybladeProgramı;

public class Dranza extends Beyblade{
	private String kutsalCanavar;

	public Dranza(String beybladeci, int donusHizi, int saldırıGucu,String kutsalCanavar) {
		super(beybladeci, donusHizi, saldırıGucu);
		// TODO Auto-generated constructor stub
		this.kutsalCanavar = kutsalCanavar;
	}

	@Override
	public void bilgileriGoster() {
		// TODO Auto-generated method stub
		super.bilgileriGoster();
		System.out.println("Kutsal canavarın adı:" + kutsalCanavar);
	}

	@Override
	public void kutsalCanavarOrtayaCıkar() {
		System.out.println(getBeybladeci() + " " + kutsalCanavar + "ı ortaya cıkarıyor");
		System.out.println(getBeybladeci() + "ın Saldırısı : alev kılıcı");
	}
	
	
}
