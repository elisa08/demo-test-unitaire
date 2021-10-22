import static org.junit.Assert.*;

import org.junit.Test;



public class TestMaison {

	@Test(expected = MaisonException.class)
	public void ajouterPieceTest() throws MaisonException{
		
		Piece[] piece= new Piece[0];

		Maison maison= new Maison(piece);
		
		Piece[] pieces= maison.ajouterPiece(null);
		
	
	}
	
	@Test(expected = MaisonException.class)
	public void superficieTotaleTest() throws MaisonException{
		
		Piece[] piece= new Piece[0];

		Maison maison= new Maison(piece);
		
		Chambre chambre= new Chambre(-10, 0);
		
		Piece[] pieces= maison.ajouterPiece(chambre);
		
		Double suoerficieTotale= maison.superficieTotale();
		
	
	}
	
	@Test(expected = MaisonException.class)
	public void superficiePieceTest() throws MaisonException{
		
		Piece[] piece= new Piece[0];

		Maison maison= new Maison(piece);
		
		Chambre chambre= new Chambre(10, 0);
		
		Piece[] pieces= maison.ajouterPiece(chambre);
		
		Double superficiePiece= maison.superficieEtage(-1);
		
	
	}

}
