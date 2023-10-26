import java.util.Scanner;
import java.util.*;
import java.io.IOException;

public class Controladora{
    public static void main(String[] args){
        new Thread(new Reloj()).start();
        new	Thread(new	Ejecutor("calc",	0)).start();
		Ejecutor e = new	Ejecutor("calc",	1);
		Scanner	leer = new Scanner (System.in);
		System.out.println("Escribe	un	commando	para	ejecutar");
		e.comando =	leer.next();
		if	(e.necesitaEjecucion())	{
            e.ejecutarTarea();
		}
    } 
}
