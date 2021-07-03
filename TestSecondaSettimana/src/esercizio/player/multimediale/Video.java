package esercizio.player.multimediale;

public class Video extends ElementoRiproducibile {
	private int luminosit�;

	public Video(String titolo, int durata, int volume, int luminosit�) {
		super(titolo, durata, volume);
		this.luminosit� = luminosit�;
	}

	public int getLuminosit�() {
		return luminosit�;
	}

	@Override
	public void play() {
		String v = "";
		String l = "";
		for (int i = 0; i < getVolume(); i++) {
			v = "!"+ v;
			l = "*"+ l;
		}
		for (int i = 0; i < getDurata(); i++) {
			System.out.println(getTitolo()+v+l);
		}
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
