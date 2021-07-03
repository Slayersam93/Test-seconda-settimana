package esercizio.player.multimediale;

public abstract class ElementoRiproducibile extends ElementoMultimediale {
	private int durata;
	private int volume;

	protected ElementoRiproducibile(String titolo, int durata, int volume) {
		super(titolo);
		this.durata = durata;
		this.volume = volume;
	}

	public int getVolume() {
		return this.volume;
	}

	public void alzaVolume() {
		this.volume++;
	}

	public void abbassaVolume() {
		this.volume--;
	}

	public abstract void play();

	@Override

	public void execute() {
		play();
	}

	protected int getDurata() {
		return durata;
	}

}
