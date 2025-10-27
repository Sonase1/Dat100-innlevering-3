package no.hvl.dat100.oppgave1;

import no.hvl.dat100.common.TODO;

public abstract class Innlegg {

    private int id = 0000;
    private String bruker = "NAN";
    private String dato = "00-00";
    private int likes = 0000;
	
	public Innlegg() {

	}
	
	public Innlegg(int id, String bruker, String dato) {

        this.id = id;
        this.bruker = bruker;
        this.dato = dato;

	}

	public Innlegg(int id, String bruker, String dato, int likes) {

        this.id = id;
        this.bruker = bruker;
        this.dato = dato;
        this.likes= likes;

    }
	
	public String getBruker() {
		
		return this.bruker;

	}

	public void setBruker(String bruker) {

		this.bruker = bruker;

	}

	public String getDato() {
		return this.dato;
		
	}

	public void setDato(String dato) {

        this.dato = dato;

	}

	public int getId() {

        return this.id;

	}

	public int getLikes() {

        return this.likes;

	}
	
	public void doLike () {

        this.likes += 1;

	}
	
	public boolean erLik(Innlegg innlegg) {

        return this.id == innlegg.getId();
	}
	
	@Override
	public String toString() {

        return id + "\n" + bruker + "\n" + dato + "\n" + likes + "\n";
	}
	
	/* Metoden nedenfor er kun for valgfri oppgave 6
	public String toHTML() {
		
		throw new UnsupportedOperationException(TODO.method());
				
	} */
}
