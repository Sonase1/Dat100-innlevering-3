package no.hvl.dat100.oppgave3;

import no.hvl.dat100.common.TODO;
import no.hvl.dat100.oppgave1.*;

public class Blogg {

	private Innlegg[] innleggtabell;
    private int nesteledig;


	public Blogg() {
        this.innleggtabell = new Innlegg[20];
        this.nesteledig = 0;


	}

	public Blogg(int lengde) {

        this.innleggtabell = new Innlegg[lengde];
        this.nesteledig = 0;

	}

	public int getAntall() {

        return nesteledig;

	}
	
	public Innlegg[] getSamling() {

		return innleggtabell;

	}
	
	public int finnInnlegg(Innlegg innlegg) {

		for (int i = 0; i<nesteledig; i++){
            if (innleggtabell[i].erLik(innlegg)){
                return innleggtabell[i].getId();
            }
        }
        return -1;
	}

	public boolean finnes(Innlegg innlegg) {
        boolean finnes = false;
        for (int i = 0; i<nesteledig; i++){
            if (innleggtabell[i].erLik(innlegg)){
                finnes = true;
                return finnes;
            }
        }
        return finnes;

        /*
        return finnInnlegg(innlegg) != -1;
         */
	}

	public boolean ledigPlass() {
		boolean ledigPlass = false;
        if (nesteledig<innleggtabell.length){
            ledigPlass = true;
        }
        return ledigPlass;
	}
	
	public boolean leggTil(Innlegg innlegg) {
        boolean lagtTil = false;
        if (this.ledigPlass() && !finnes(innlegg)){
            innleggtabell[nesteledig] = innlegg;
            nesteledig++;
            lagtTil = true;
        }

        return lagtTil;
	}
	
	public String toString() {
        String TS = nesteledig + "\n";
        for( int i = 0; i<nesteledig; i++){
            TS += innleggtabell[i].toString();
        }

        return TS;

        /* StringBuilder TS = new StringBuilder();
            TS.append(nesteledig).append("\n");

            for (int i = 0; i < nesteledig; i++) {
                TS.append(innleggtabell[i].toString());
               }

            return TS.toString();
        */

	}

	// valgfrie oppgaver nedenfor
	
	public void utvid() {

        throw new UnsupportedOperationException(TODO.method());
	}
	
	public boolean leggTilUtvid(Innlegg innlegg) {

		throw new UnsupportedOperationException(TODO.method());
		
	}
	
	public boolean slett(Innlegg innlegg) {
		
		throw new UnsupportedOperationException(TODO.method());
	}
	
	public int[] search(String keyword) {
		
		throw new UnsupportedOperationException(TODO.method());

	}
}