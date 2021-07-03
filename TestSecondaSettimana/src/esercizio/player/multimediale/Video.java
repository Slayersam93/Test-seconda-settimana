package esercizio.player.multimediale;

public class Video extends ElementoRiproducibile {
	private int luminosità;

	public Video(String titolo, int durata, int volume, int luminosità) {
		super(titolo, durata, volume);
		this.luminosità = luminosità;
	}

	public int getLuminosità() {
		return luminosità;
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

	protected int alzaLuminosità() {
		luminosità++;
		return luminosità;
	}

	protected int abbassaLuminosità() {
		luminosità--;
		return luminosità;
	}
}
