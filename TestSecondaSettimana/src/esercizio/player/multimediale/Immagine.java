package esercizio.player.multimediale;

public class Immagine extends ElementoMultimediale {
	private int luminosit�;

	public Immagine(String titolo, int luminosit�) {
		super(titolo);
		this.luminosit� = luminosit�;
	}
	@Override
	public void execute () {
		show();
	}
	public void show() {
		String l = "";
		for (int i = 0; i <luminosit�; i++) {
			l = "*"+ l;
		}
			System.out.println(getTitolo()+l);
	}

	public int getLuminosit�() {
		return luminosit�;
	}

	protected int alzaLuminosit�() {
		luminosit�++;
		return luminosit�;
	}

	protected int abbassaLuminosit�() {
		luminosit�--;
		return luminosit�;
	}
}