package model.player;

import java.util.Iterator;

import allShared.CardsCollectionType;
import allShared.IPlayer;
import controller.CardsCollectionFactory;
import model.cards.Card;
import model.cards.Hand;

/**
 * Classe qui définit le comportement des Joueurs
 * 
 * Discussion Carnet de Bord : pertinence isStillActive() + isHandEmpty() ?
 * 
 * @author francoise.perrin
 */

public class Player implements IPlayer{
	private final String name;
	private final Hand hand;
	private final Hand trickPile;
	private boolean isTrickWinner;
	private boolean isGameWinner;
	
	public Player(String name) {
		this.name = name;
		this.hand = (Hand) CardsCollectionFactory.getCardsCollection(CardsCollectionType.HAND);
		this.trickPile = (Hand) CardsCollectionFactory.getCardsCollection(CardsCollectionType.HAND);
		this.isTrickWinner = false;
		this.isGameWinner = false;
	}
	
	public final void addCardToHand(Card pc) {
		this.hand.addCard(pc);
	}
	
	public final void addCardToTrickPile(Card pc) {
		this.trickPile.addCard(pc);
	}
	
	public final Card playCard(int index) {
		return this.hand.playCard(index);
	}
	
	public final Card removeCardFromHand(int index) {
		return this.hand.removeCard(index);
	}
	
	public final Card removeCardFromTrickPile(int index) {
		return this.trickPile.removeCard(index);
	}
	
	public final boolean revealCard(int index) {
		return this.hand.revealCard(index);
	}
	
	public final boolean hideCard(int index) {
		return this.hand.hideCard(index);
	}
	
	@Override
	public final String getName() {
		return this.name;
	}
	
	public final boolean isHandEmpty() {
		return this.hand.isEmpty();
	}
	
	public final boolean isTrickPileEmpty() {
		return this.trickPile.isEmpty();
	}
	
	/**
	 * return true si la main du joueur n'est pas vide
	 */
	@Override
	public final boolean isStillActive() {
		return !isHandEmpty();
	}

	
	/**
	 * retourne true si le joueur possède toutes les cartes 
	 * du deck initial 
	 */
	public final boolean hasWonAllCards(int deckSize) {
		return this.hand.size() == deckSize;
	}
	
	@Override
	public final boolean isTrickWinner() {
		return this.isTrickWinner;
	}

	public final void setTrickWinner(boolean isTrickWinner) {
		this.isTrickWinner = isTrickWinner;
	}

	public final boolean isGameWinner() {
		return this.isGameWinner;
	}

	public final void setGameWinner(boolean isGameWinner) {
		this.isGameWinner = isGameWinner;
	}

	@Override
	public String toString() {
		return "["+ name + " ** Hand" + hand + " ** trickPile" + trickPile + "]";
	}

	/*
	La comparaison s'effectue
	selon l'ordre alphabétique des noms de joueurs
	 */
	@Override
	public int compareTo(IPlayer other) {
		return this.getName().compareTo(other.getName());
	}

	/**
	 * Toutes les cartes gagnées retournent dans la main du joueur
	 * après avoir été mélangées
	 * * Ecrivez et testez cette méthode de 2 manières :
	 *  1 - en utilisant l'itérator de manière implicite
	 *  2 - en utilisant l'Iterator de manière explicite  
	 */
	public void addWonCardsBackToHand() {

		/*
		 * TODO Atelier2
		 */
		  
	}

}
