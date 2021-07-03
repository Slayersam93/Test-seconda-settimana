package esercizio.player.multimediale;

public class Immagine extends ElementoMultimediale {
	private int luminosità;

	public Immagine(String titolo, int luminosità) {
		super(titolo);
		this.luminosità = luminosità;
	}
	@Override
	public void execute () {
		show();
	}
	public void show() {
		String l = "";
		for (int i = 0; i <luminosità; i++) {
			l = "*"+ l;
		}
			System.out.println(getTitolo()+l);
	}

	public int getLuminosità() {
		return luminosità;
	}

	protected int alzaLuminosità() {
		luminosità++;
		return luminosità;
	}

	protected int abbassaLuminosità() {
		luminosità--;
		return luminosità;
	}
}