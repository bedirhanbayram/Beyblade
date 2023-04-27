package BeybladeProgramı;

public class Dragon extends Beyblade {
	private String kutsalCanavar;
	private String gizliYetenek;
	public Dragon(String beybladeci, int donusHizi, int saldırıGucu,String kutsalCanavar,String gizliYetenek) {
		super(beybladeci, donusHizi, saldırıGucu);
		// TODO Auto-generated constructor stub
		this.kutsalCanavar=kutsalCanavar;
		this.gizliYetenek=gizliYetenek;
	}
	public void kutsalCanavarOrtayaCıkar() {
		System.out.println(getBeybladeci() + " " + kutsalCanavar + "ı ortaya cıkarıyor");
		System.out.println(getBeybladeci() + "ın Saldırısı : hayalet kasırgası");
	}
	public void bilgileriGoster() {
		super.bilgileriGoster();
		System.out.println("Kutsal canavarın adı:" + kutsalCanavar);
		System.out.println("Gizli yetenek:"+gizliYetenek);
	}
}
