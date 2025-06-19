import java.util.ArrayList;
import java.util.Random;

/**
 * @author Silla Federico - Trebbi Francesco
 */
public class DeckOfChanceAndCommunityChestCards {

	private ArrayList<ChanceCard> chanceCards;
	private ArrayList<ChanceCard> dealtChanceCards;
	private ChanceCard getOutOfJailChance;
	private ArrayList<CommunityChestCard> communityCards;
	private ArrayList<CommunityChestCard> dealtCommunityCards;
	private CommunityChestCard getOutOfJailCommunity;
	private Random random;

	/**
	 * costruttore della classe DeckOfChanceAndCommunityChestCards
	 * tutti i campi tranne getOutOfJail sono inizializzati e mazzi di
	 * Vengono create carte chance e community
	*/
	public DeckOfChanceAndCommunityChestCards() {
		chanceCards = new ArrayList<ChanceCard>();
		dealtChanceCards = new ArrayList<ChanceCard>();
		random = new Random();
		communityCards = new ArrayList<CommunityChestCard>();
		dealtCommunityCards = new ArrayList<CommunityChestCard>();
		chanceCards.add(new ChanceCard(0));
		chanceCards.add(new ChanceCard(1));
		chanceCards.add(new ChanceCard(2));
		chanceCards.add(new ChanceCard(3));
		chanceCards.add(new ChanceCard(4));
		chanceCards.add(new ChanceCard(5));
		chanceCards.add(new ChanceCard(6));
		chanceCards.add(new ChanceCard(7));
		chanceCards.add(new ChanceCard(8));
		chanceCards.add(new ChanceCard(9));
		chanceCards.add(new ChanceCard(10));
		chanceCards.add(new ChanceCard(11));
		chanceCards.add(new ChanceCard(12));
		chanceCards.add(new ChanceCard(13));
		chanceCards.add(new ChanceCard(14));
		chanceCards.add(new ChanceCard(15));
		
		communityCards.add(new CommunityChestCard(0));
		communityCards.add(new CommunityChestCard(1));
		communityCards.add(new CommunityChestCard(2));
		communityCards.add(new CommunityChestCard(3));
		communityCards.add(new CommunityChestCard(4));
		communityCards.add(new CommunityChestCard(5));
		communityCards.add(new CommunityChestCard(6));
		communityCards.add(new CommunityChestCard(7));
		communityCards.add(new CommunityChestCard(8));
		communityCards.add(new CommunityChestCard(9));
		communityCards.add(new CommunityChestCard(10));
		communityCards.add(new CommunityChestCard(11));
		communityCards.add(new CommunityChestCard(12));
		communityCards.add(new CommunityChestCard(13));
		communityCards.add(new CommunityChestCard(14));
		communityCards.add(new CommunityChestCard(15));
		communityCards.add(new CommunityChestCard(16));
	}

	/**
	 * @return id della carta chance distribuita. se l'ID della carta è 6 allora
	 * getOutOfJailChance è inizializzato
	*/
	public int dealChanceCard() {
		if (chanceCards.size() == 0) {
			chanceCards = dealtChanceCards;
			dealtChanceCards = new ArrayList<ChanceCard>();
		}
		int position = random.nextInt(chanceCards.size());
		int id = chanceCards.get(position).getId();
		if (id == 6) {
			setGetOutOfJailChance(chanceCards.get(position));
		} else {
			dealtChanceCards.add(chanceCards.get(position));
		}
		
		chanceCards.remove(position);
		return id;
	}
	
	/**
	 * @return id della carta del petto comune distribuita. se l'ID della carta è 6 allora
	 * getOutOfJailChance è inizializzato
	*/
	public int dealCommunityChestCard() {
		if (communityCards.size() == 0) {
			communityCards = dealtCommunityCards;
			dealtCommunityCards = new ArrayList<CommunityChestCard>();
		}
		int position = random.nextInt(communityCards.size());
		int id = communityCards.get(position).getId();
		if (id == 3) {
			setGetOutOfJailCommunity(communityCards.get(position));
		} else {
			dealtCommunityCards.add(communityCards.get(position));
		}
		communityCards.remove(position);
		return id;
	}
	
	/**
	 * se il giocatore decide di utilizzare la carta getOutOfJailChance trattenuta, questo metodo
	 * lo rimette nel mazzo delle carte distribuite e getOutOfJailChance è
	 * impostato su null
	*/
	public void returnOutOfJailCardChance() {
		dealtChanceCards.add(getOutOfJailChance);
		setGetOutOfJailChance(null);
	}

	/**
	 * @return carta getOutOfJailChance
	 */
	public ChanceCard getGetOutOfJailChance() {
		return getOutOfJailChance;
	}

	/**
	 * @param getOutOfJailChance è usato per settare la carta getOutOfJailChance
	 */
	public void setGetOutOfJailChance(ChanceCard getOutOfJailChance) {
		this.getOutOfJailChance = getOutOfJailChance;
	}
	
	/**
	 * @param id è passato e determina quale carta chance viene usata
	 * @return chanceCards con uno specifico ID, null altrimenti (non previsto
	 * da restituire)
	 */
	public ChanceCard getChanceCard(int id) {
		for (ChanceCard card: chanceCards) {
			if (card.getId() == id) {
				return card;
			}
		}
		return null;
	}
	
	/**
	 * if player decides to use held getOutOfJailCommunity card, this method
	 * returns it to the deck of dealt cards and getOutOfJailCommunity is 
	 * set to null
	 */
	public void returnOutOfJailCardCommunity() {
		dealtCommunityCards.add(getOutOfJailCommunity);
		setGetOutOfJailCommunity(null);
	}

	/**
	 * @return getOutOfJailCommunity card
	 */
	public CommunityChestCard getGetOutOfJailCommunity() {
		return getOutOfJailCommunity;
	}

	/**
	 * @param getOutOfJailCommunity is used to set getOutOfJailCommunity card
	 */
	public void setGetOutOfJailCommunity(CommunityChestCard getOutOfJailCommunity) {
		this.getOutOfJailCommunity = getOutOfJailCommunity;
	}
	
	/**
	 * @param id is passed to determine which community chest card to return
	 * @return communityCards with specified id, null otherwise(not expected
	 * to be returned)
	 */
	public CommunityChestCard getCommunityCard(int id) {
		for (CommunityChestCard card: communityCards) {
			if (card.getId() == id) {
				return card;
			}
		}
		return null;
	}
}
