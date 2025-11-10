package no.hvl.dat100.oppgave4;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

import no.hvl.dat100.common.TODO;
import no.hvl.dat100.oppgave3.*;

public class SkrivBlogg {
    private static int antall = 0;


	public static boolean skriv(Blogg samling, String mappe, String filnavn) {
        boolean skriv = false;
        PrintWriter writer = null;
        try{
            writer = new PrintWriter(mappe + filnavn);
            writer.println(samling.toString());
            skriv = true;
        }catch ( FileNotFoundException e){
            System.out.println("Filen finst ikke, eller er skrevet feil.");
        }finally{
            if(writer != null){
                writer.close();
            }
        }
        if (skriv){
            antall++;
        }
        return skriv;
	}
}
