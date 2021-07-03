package esercizio.player.multimediale;

public abstract class ElementoMultimediale {
	private String titolo;

	protected ElementoMultimediale(String titolo) {
		this.titolo = titolo;
	}
	protected String getTitolo() {
		return titolo;
	}
	public abstract void execute();
}
