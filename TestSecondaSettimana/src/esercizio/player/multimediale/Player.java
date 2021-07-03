package esercizio.player.multimediale;

import java.util.Scanner;

public class Player {
	private ElementoMultimediale[] memoria = new ElementoMultimediale[5];
	private Scanner scanner = new Scanner(System.in);

	public void aggiungiMedia() {
		String insert = "";
		for (int i = 0; i < memoria.length; i++) {
			System.out.println("Scrivi audio per iserire un nuovo file audio");
			System.out.println("Scrivi video per iserire un nuovo file video");
			System.out.println("Scrivi immagine per iserire una nuova immagine");
			System.out.println("Scrivi fine se non vuoi iserire altro");
			insert = scanner.nextLine();
			if (insert.equalsIgnoreCase("audio")) {
				memoria[i] = aggiungiAudio();
			}
			else if (insert.equalsIgnoreCase("video")) {
				memoria[i] = aggiungiVideo();
			}
			else if (insert.equalsIgnoreCase("immagine")) {
				memoria[i] = aggiungiImmagine();
			}
			else if (insert.equalsIgnoreCase("fine")) {
				break;
			}
			scanner.nextLine();
		}
	}

	public void esegui() {
		int selettore = 0;
		do {
			System.out.println("Inserisci un numero tra 1 e 5 per selezionare il file da riprodurre,"
					+ " inserisci 0 per chiudere il programma");
			selettore = scanner.nextInt();
			switch (selettore) {
			case 1:
			case 2:
			case 3:
			case 4:
			case 5:
//				if(memoria[selettore - 1]==null) {
//				System.out.println("Slot vuoto selezionane un altro");
//				}
				memoria[selettore - 1].execute();
				break;
			case  0:
				System.out.println("Arrivederci e a presto ;D");
				break;
			default:
				System.out.println("Slot selezionato inesistente");
			}

		} while (selettore != 0);
		scanner.close();
	}

	private RegistrazioneAudio aggiungiAudio() {
		//scanner.nextLine();
		System.out.println("Inserisci titolo");
		String titolo = scanner.nextLine();
		System.out.println("Inserisci durata");
		int durata = scanner.nextInt();
		System.out.println("Inserisci volume");
		int volume = scanner.nextInt();
		return new RegistrazioneAudio(titolo, durata, volume);
	}

	private Video aggiungiVideo() {
		//scanner.nextLine();
		System.out.println("Inserisci titolo");
		String titolo = scanner.nextLine();
		System.out.println("Inserisci durata");
		int durata = scanner.nextInt();
		System.out.println("Inserisci volume");
		int volume = scanner.nextInt();
		System.out.println("Inserisci luminosità");
		int luminosità = scanner.nextInt();
		return new Video(titolo, durata, volume, luminosità);
	}

	private Immagine aggiungiImmagine() {
		//scanner.nextLine();
		System.out.println("Inserisci titolo");
		String titolo = scanner.nextLine();
		System.out.println("Inserisci luminosità");
		int luminosità = scanner.nextInt();
		return new Immagine(titolo, luminosità);
	}
}
