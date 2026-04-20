package model.cards;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

import allShared.ICardsCollection;


/**
 * Objet qui contient l'ensemble des cartes de la main d'un joueur
 * <p>
 * Il est capable d'exécuter les traitements communs à toutes
 * les collections de cartes (ajouter, supprimer, mélanger, trier, etc.)
 * et en plus révéler, cacher, jouer une carte
 *
 * @author francoise.perrin
 */
public class Hand implements ICardsCollection {

    private final List<Card> cards; /* ToChange Atelier2 */

    /*
     * TODO ToChange Atelier2
     */
    public Hand() {
        super();
        cards = new ArrayList<Card>();
    }

    /*
     * TODO ToChange Atelier2
     */
    public Hand(Collection<Card> collection) {
        super();
        cards = new ArrayList<Card>(collection);
    }

    /*
     * TODO ToChange Atelier2
     */
    public Hand(ICardsCollection iCardsCollection) {
        super();        // TODO - à supprimer Atelier 2
        cards = null;    // TODO - à supprimer Atelier 2
        //super(iCardsCollection); // TODO - à activer Atelier 2

    }

    @Override
    public final void addCard(Card pc) {
        if (pc != null && cards != null) {
            this.cards.add(pc);
        }
    }

    @Override
    public final Card removeTopCard() {
        if (cards == null || cards.isEmpty()) {
            return null;
        }
        return cards.removeLast();
    }

    @Override
    public final Card removeCard(int index) {
        if (cards == null || index < 0 || index >= cards.size()) {
            return null;
        }
        return cards.remove(index);
    }

    @Override
    public final boolean isEmpty() {
        if (this.cards != null) {
            return this.cards.isEmpty();
        }

        return false;
    }

    @Override
    public final void clear() {
        if (this.cards != null) {
            this.cards.clear();
        }
    }

    @Override
    public final int size() {
        if (this.cards != null) {
            return this.cards.size();
        }

        return 0;
    }

//	@Override
//	public String toString() {
//		return "[" + cards + "]";
//	}

    /**
     * @param index
     * @return la carte à jouer si elle existe
     * Supprime la carte de la liste
     */
    public final Card playCard(int index) {
        return this.removeCard(index);
    }

    /**
     * @param index
     * @return true si la carte existe
     */
    public final boolean revealCard(int index) {
        if (cards == null || cards.isEmpty() || cards.size() < index) {
            return false;
        }

        Card card = this.cards.get(index);
        card.reveal();
        return true;
    }

    /**
     * @param index
     * @return true si la carte existe
     */
    public final boolean hideCard(int index) {
        if (cards == null || cards.isEmpty() || cards.size() < index) {
            return false;
        }

        Card card = this.cards.get(index);
        card.hide();
        return true;
    }


    @Override
    public void sort() {
        /*
         * TODO Atelier2
         */
    }

    @Override
    public void sort(Comparator<Card> comparator) {
        /*
         * TODO Atelier2
         */
    }


    /**
     * Mélange les cartes de manière aléatoire
     * <p>
     * Ecrivez et testez cette méthode de 2 manières :
     * 1 - en utilisant la méthode native shuffle() de la classe Collections
     * 2 - en utilisant la méthode swap() et un nombre aléatoire (Random)
     */
    @Override
    public final void shuffle() {
        /*
         * TODO Atelier2
         */
    }

    @Override
    public final Card max() {
        Card card = null;
        /*
         * TODO Atelier2
         */
        return card;
    }

    @Override
    public final Card max(Comparator<Card> comparator) {
        Card card = null;
        /*
         * TODO Atelier2
         */
        return card;
    }

    /*
     * Illustration du Design Pattern Iterator
     * et des classes anonymes
     *
     * [ Cette partie du code sera utile à partir de l'atelier 2
     * Ce n'est pas grave si vous ne la comprenez pas ...]
     */
    @Override
    public final Iterator<Card> iterator() {

        return new Iterator<Card>() {
            Iterator<Card> it = cards.iterator();

            @Override
            public boolean hasNext() {
                return it.hasNext();
            }

            @Override
            public Card next() {
                return it.next();
            }

        };
    }


}