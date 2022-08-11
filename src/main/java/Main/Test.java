package Main;

import java.util.Scanner;

import com.claygregory.api.google.places.GooglePlaces;
import com.claygregory.api.google.places.Place;
import com.claygregory.api.google.places.PlacesResult;


public class Test {

	public static void main(String[] args) {
		GooglePlaces places = new GooglePlaces("API_KEY");
		Scanner lee = new Scanner(System.in);
		String sitio="";
		String vigo ="Vigo";
		String asPontes = "As Pontes";
		String pontevedra =  "Pontevedra";
		String coruna = "A Coruña";
		for(int i=0;i<2;i++) {
			System.out.println("Escribe el sitio a buscar....");
		sitio=lee.nextLine();
		PlacesResult result = places.searchText(sitio);

		System.out.println( result.getStatus( ) );
		for ( Place place : result ) {
			System.out.println( place.getName( ) + ", " + place.getFormattedAddress( ) );
		System.out.println("Validación name Vigo "+place.getName().toLowerCase().trim().contains(vigo.trim().toLowerCase()));
		System.out.println("Validación name As Pontes "+place.getName().toLowerCase().trim().contains(asPontes.trim().toLowerCase()));
		System.out.println("Validación region Vigo "+place.getFormattedAddress().toLowerCase().contains(pontevedra.toLowerCase().trim()));
		System.out.println("Validación region Vigo "+place.getFormattedAddress().toLowerCase().contains(coruna.trim().toLowerCase()));
		}
		}

	}

}
