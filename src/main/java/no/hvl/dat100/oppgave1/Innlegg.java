package no.hvl.dat100.oppgave1;

import no.hvl.dat100.common.TODO;

public abstract class Innlegg {
	
	// TODO - deklarering av objektvariable
	
	public Innlegg() {

        public int id = 0000;
        public String bruker = "NAN";
        public String dato = "00-00";
        public int likes = 0000;

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
		throw new UnsupportedOperationException(TODO.method());
		
	}

	public void setDato(String dato) {
		throw new UnsupportedOperationException(TODO.method());
	}

	public int getId() {
		throw new UnsupportedOperationException(TODO.method());

	}

	public int getLikes() {
		throw new UnsupportedOperationException(TODO.method());

	}
	
	public void doLike () {
		throw new UnsupportedOperationException(TODO.method());
	}
	
	public boolean erLik(Innlegg innlegg) {
		throw new UnsupportedOperationException(TODO.method());

	}
	
	@Override
	public String toString() {
		
		throw new UnsupportedOperationException(TODO.method());
				
	}
	
	// Metoden nedenfor er kun for valgfri oppgave 6
	public String toHTML() {
		
		throw new UnsupportedOperationException(TODO.method());
				
	}
}
