
import java.util.ArrayList;

/**
 * @author  Silla Federico - Trebbi Francesco 
*/
public class Entity {

	private String name;
	private String group;
	private int cost;
	private ArrayList<Double> rentValues;
	private int position;
	private boolean mortgaged;
	private Player owner;
	private boolean canBePurchased;
	private int numberOfHouses;
	private int numberOfHotels;
	private boolean buldingPurchasedInCurrentTurn;
	private int buildingIndex;

	/**
	 * Constructor of Entity class, initialises all fields, which need to be
	 * initialised, when created which are assigned with passed parameters values: 
	 * 
	 * @param name
	 * @param group
	 * @param cost
	 * @param rentValues
	 * @param position
	 * @param canBePurchased
	 * @param buildingIndex
	 */
	public Entity(String name, String group, int cost,
			ArrayList<Double> rentValues, int position, boolean canBePurchased,
			int buildingIndex) {
		this.name = name;
		this.group = group;
		this.cost = cost;
		this.rentValues = rentValues;
		this.position = position;
		this.canBePurchased = canBePurchased;
		this.buildingIndex = buildingIndex;
	}

	/**
	 * @return nome dell'entità
	 */
	public String getName() {
		return name;
	}

	/**
	 * nome settato (per convenzione). non usato
	 * @param name passato
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return gruppo di intità
	 */
	public String getGroup() {
		return group;
	}

	/**
	 * gruppo settato. Non usato
	 * @param group passato
	 */
	public void setGroup(String group) {
		this.group = group;
	}

	/**
	 * @return costo dell'entità
	 */
	public int getCost() {
		return cost;
	}

	/**
	 * costo settato. non usato
	 * @param cost passato
	 */
	public void setCost(int cost) {
		this.cost = cost;
	}

	/**
	 * @return raccolta di rentValues dell'entità
	 */
	public ArrayList<Double> getRentValues() {
		return rentValues;
	}

	/**
	 * rentValues settato. non usato
	 * @param rentValues passato
	 */
	public void setRentValues(ArrayList<Double> rentValues) {
		this.rentValues = rentValues;
	}

	/**
	 * @return posizione dell'entità nel consiglio (0-39 inclusi)
	 */
	public int getPosition() {
		return position;
	}

	/**
	 * posizione settata. non usato
	 * @param position passato
	 */
	public void setPosition(int position) {
		this.position = position;
	}

	/**
	 * @return vero, se l'entità è ipotecata, falso altrimenti
	 */
	public boolean isMortgaged() {
		return mortgaged;
	}

	/**
	 * setter ipotecato
	 * @param mortgaged passato
	 */
	public void setMortgaged(boolean mortgaged) {
		this.mortgaged = mortgaged;
	}

	/**
	 * @return Rappresentazione di stringa della classe Entity.
	 */
	public String toString() {
		String rent = "\nRentValues: ";
		for (Double rentValue : rentValues) {
			rent += rentValue + " ";
		}
		return "\nName: " + name + "\nGroup: " + group + "\nCost: " + cost
				+ "\nPosition: " + position + "\nMortgaged: " + mortgaged
				+ rent;
	}

	/**
	 * @return titolare dell'entità
	 */
	public Player getOwner() {
		return owner;
	}

	/**
	 * setter titolare
	 * @param owner passato
	 */
	public void setOwner(Player owner) {
		this.owner = owner;
	}

	/**
	 * @return vero, se l'entità può essere acquistata, falso altrimenti
	 */
	public boolean canBePurchased() {
		return canBePurchased;
	}

	/**
	 * setter canBePurchased. non usato
	 * @param canBePurchased passato
	 */
	public void setCanBePurchased(boolean canBePurchased) {
		this.canBePurchased = canBePurchased;
	}

	/**
	 * @return numero di case costruite nelle entità
	 */
	public int getNumberOfHouses() {
		return numberOfHouses;
	}
	
	/**
	 * setter numberOfHouses 
	 * @param numberOfHouses passato
	 */
	public void setNumberOfHouses(int numberOfHouses) {
		this.numberOfHouses += numberOfHouses;
	}

	/**
	 * @return numero di hotel costruiti sulle entità (0 o 1)
	 */
	public int getNumberOfHotels() {
		return numberOfHotels;
	}

	/**
	 * setter numberOfHouses 
	 * @param numberOfHotels passato
	 */
	public void setNumberOfHotels(int numberOfHotels) {
		this.numberOfHotels += numberOfHotels;
	}

	/**
	 * @return true, se l'edificio è stato acquistato in corso
	 * girare, falso altrimenti
	 */
	public boolean isBuldingPurchasedInCurrentTurn() {
		return buldingPurchasedInCurrentTurn;
	}

	/**
	 * setter per buldingPurchasedInCurrentTurn
	 * @param buldingPurchasedInCurrentTurn passato
	 */
	public void setBuldingPurchasedInCurrentTurn(
			boolean buldingPurchasedInCurrentTurn) {
		this.buldingPurchasedInCurrentTurn = buldingPurchasedInCurrentTurn;
	}

	/**
	 * @return buildingIndex di una entità (0-21 incluse)
	 */
	public int getBuildingIndex() {
		return buildingIndex;
	}

	/**
	 * setter per buildingIndex (non usato)
	 * @param buildingIndex passato
	 */
	public void setBuildingIndex(int buildingIndex) {
		this.buildingIndex = buildingIndex;
	}
}
