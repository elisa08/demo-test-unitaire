

import java.util.Arrays;

public class Maison {
	
	 private Piece[] piece;
	 
	 public Maison(Piece[] piece) {
		super();
		this.piece = piece;
	}

	public Piece[] ajouterPiece(Piece pieceAjout) throws MaisonException {
		
		if (pieceAjout != null) {

			piece = Arrays.copyOf(piece, piece.length + 1);

			piece[piece.length - 1] = pieceAjout;
			
		}else {
			
			throw new MaisonException("Valeur de l'objet incorrecte !");
			
			
		}
		
		return piece;
	}
	
	public double superficieTotale() throws MaisonException {
	

		double surfaceTotale=0;
	
		for (int i = 0; i < piece.length; i++) {
			
			double superficie = piece[i].getSuperficie();
			
			if(superficie<=0) {
				
				throw new MaisonException("Valeur de la superficie incorrecte !");
			
				
			}else {
				
				surfaceTotale= superficie + surfaceTotale;
				
			}
		}
		return surfaceTotale;
		
		
	}
	
	public double superficieEtage(int nbE) throws MaisonException {
		
		double surface = 0;
	
	
		for (int i = 0; i < piece.length; i++) {
			int nbEtage= piece[i].getNumeroEtage();
			

			double superficie = piece[i].getSuperficie();
			if(nbEtage == nbE && nbE >= 0) {
				
				surface = superficie + surface;
			}else {
				throw new MaisonException("Valeur de l'étage négative.");
			}
		}

		return surface;

	}
	
	public double superficieTypePiece(String pieceDonnee) {

		double surface = 0;

		for (int i = 0; i < piece.length; i++) {
			int nbEtage = piece[i].getNumeroEtage();

			double superficie = piece[i].getSuperficie();
			if (piece[i].getType() .equals(pieceDonnee)) {

				surface = superficie + surface;
			}
		}

		return surface;

	}
	
	public int nombrePiece(String pieceDonnee) {

		int p = 0;

		for (int i = 0; i < piece.length; i++) {
		
			if (pieceDonnee.equals( piece[i].getType())) {

				p++;
			}
		}

		return p;

	}
	
	

}
