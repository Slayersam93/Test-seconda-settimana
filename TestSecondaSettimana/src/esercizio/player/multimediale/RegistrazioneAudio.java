package esercizio.player.multimediale;

public class RegistrazioneAudio extends ElementoRiproducibile {

	public RegistrazioneAudio(String titolo, int durata, int volume) {
		super(titolo, durata, volume);

	}

	@Override
	public void play() {
		String v = "";
		for (int i = 0; i < getVolume(); i++) {
			v = "!" + v;
		}
		for (int i = 0; i < getDurata(); i++) {
			System.out.println(getTitolo() + v);
		}
	}

}
