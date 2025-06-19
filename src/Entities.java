

import java.util.ArrayList;

/**
 * @author Silla Federico - Trebbi Francesco
 */
public class Entities {

	private ArrayList <Entity> entities;
	private ArrayList <Double> rentValues;
	private ArrayList <Double> noRent;
	
	/**
	 * Costruttore della classe Entities, che crea tutte le entità utilizzate nel gioco 
	 */
	public Entities() {
		entities = new ArrayList<Entity>();
		noRent = new ArrayList<Double>();
		noRent.add(0.0);
		rentValues = new ArrayList<Double>();
		rentValues.add(2.0);
		rentValues.add(10.0);
		rentValues.add(30.0);
		rentValues.add(90.0);
		rentValues.add(160.0);
		rentValues.add(250.0);
		entities.add(new Entity("Start", null, 0, noRent, 0, false, -1));
		entities.add(new Entity("Corviale", "brown", 6000, rentValues, 1, true, 0));
		entities.add(new Entity("Probabilità (1)", null, 0, noRent, 2, false, -1));
		rentValues = new ArrayList<Double>();
		rentValues.add(4.0);
		rentValues.add(20.0);
		rentValues.add(60.0);
		rentValues.add(180.0);
		rentValues.add(320.0);
		rentValues.add(450.0);
		entities.add(new Entity("Tor Bella Monaca", "brown", 6000, rentValues, 3, true, 1));
		entities.add(new Entity("Tassa Patrimoniale", null, 20000, noRent, 4, false, -1));
		rentValues = new ArrayList<Double>();
		rentValues.add(25.0);
		entities.add(new Entity("Stazione Termini", "railroads", 20000, rentValues, 5, true, -1));
		rentValues = new ArrayList<Double>();
		rentValues.add(6.0);
		rentValues.add(30.0);
		rentValues.add(90.0);
		rentValues.add(270.0);
		rentValues.add(400.0);
		rentValues.add(550.0);
		entities.add(new Entity("San Giovanni", "lightblue", 10000, rentValues, 6,true, 2));
		entities.add(new Entity("Imprevisto (1)", null, 0, noRent, 7, false, -1));
		entities.add(new Entity("Quadraro", "lightblue", 10000, rentValues, 8,true, 3));
		rentValues = new ArrayList<Double>();
		rentValues.add(8.0);
		rentValues.add(40.0);
		rentValues.add(100.0);
		rentValues.add(300.0);
		rentValues.add(450.0);
		rentValues.add(600.0);
		entities.add(new Entity("Re Di Roma", "lightblue", 12000, rentValues, 9, true, 4));
		rentValues = new ArrayList<Double>();
		rentValues.add(10.0);
		rentValues.add(50.0);
		rentValues.add(150.0);
		rentValues.add(450.0);
		rentValues.add(625.0);
		rentValues.add(750.0);
		entities.add(new Entity("Rebibbia", null, 0, noRent, 10, false, -1));
		entities.add(new Entity("Rione Celio", "purple", 14000, rentValues, 11, true, 5));
		entities.add(new Entity("Enel", "utilities", 15000, rentValues, 12, true, -1));
		entities.add(new Entity("San Saba", "purple", 14000, rentValues, 13, true, 6));
		rentValues = new ArrayList<Double>();
		rentValues.add(12.0);
		rentValues.add(60.0);
		rentValues.add(180.0);
		rentValues.add(500.0);
		rentValues.add(700.0);
		rentValues.add(900.0);
		entities.add(new Entity("Testaccio", "purple", 16000, rentValues, 14, true, 7));
		rentValues = new ArrayList<Double>();
		rentValues.add(25.0);
		entities.add(new Entity("Aeroporto di Ciampino", "railroads", 20000, rentValues, 15, true, -1));
		rentValues = new ArrayList<Double>();
		rentValues.add(14.0);
		rentValues.add(70.0);
		rentValues.add(200.0);
		rentValues.add(550.0);
		rentValues.add(750.0);
		rentValues.add(950.0);
		entities.add(new Entity("Casal Bertone", "orange", 18000, rentValues, 16, true, 8));
		entities.add(new Entity("Probabilità (2)", null, 0, noRent, 17, false, -1));
		entities.add(new Entity("Rione Esquilino", "orange", 18000, rentValues, 18, true, 9));
		rentValues = new ArrayList<Double>();
		rentValues.add(16.0);
		rentValues.add(80.0);
		rentValues.add(220.0);
		rentValues.add(600.0);
		rentValues.add(800.0);
		rentValues.add(1000.0);
		entities.add(new Entity("San Lorenzo", "orange", 20000, rentValues, 19, true, 10));
		entities.add(new Entity("Parcheggio Stadio Olimpico", null, 0, noRent, 20, false, -1));
		rentValues = new ArrayList<Double>();
		rentValues.add(18.0);
		rentValues.add(90.0);
		rentValues.add(250.0);
		rentValues.add(700.0);
		rentValues.add(875.0);
		rentValues.add(1050.0);
		entities.add(new Entity("Pigneto", "red", 22000, rentValues, 21, true, 11));
		entities.add(new Entity("Imprevisto (2)", null, 0, noRent, 22, false, -1));
		entities.add(new Entity("Tiburtino", "red", 22000, rentValues, 23, true, 12));
		rentValues = new ArrayList<Double>();
		rentValues.add(20.0);
		rentValues.add(100.0);
		rentValues.add(300.0);
		rentValues.add(750.0);
		rentValues.add(925.0);
		rentValues.add(1100.0);
		entities.add(new Entity("Quartiere Trieste", "red", 24000, rentValues, 24, true, 13));
		rentValues = new ArrayList<Double>();
		rentValues.add(25.0);
		entities.add(new Entity("Stazione Laurentina", "railroads", 2000, rentValues, 25, true, -1));
		rentValues = new ArrayList<Double>();
		rentValues.add(22.0);
		rentValues.add(110.0);
		rentValues.add(330.0);
		rentValues.add(800.0);
		rentValues.add(975.0);
		rentValues.add(1150.0);
		entities.add(new Entity("Casal Palocco", "yellow", 26000, rentValues, 26, true, 14));
		entities.add(new Entity("Roma Axe", "yellow", 26000, rentValues, 27, true, 15));
		entities.add(new Entity("Acea", "utilities", 15000, rentValues, 28, true, -1));
		rentValues = new ArrayList<Double>();
		rentValues.add(24.0);
		rentValues.add(120.0);
		rentValues.add(360.0);
		rentValues.add(850.0);
		rentValues.add(1025.0);
		rentValues.add(1200.0);
		entities.add(new Entity("Eur", "yellow", 280, rentValues, 29, true, 16));
		entities.add(new Entity("In prigione", null, 0, noRent, 30, false, -1));
		rentValues = new ArrayList<Double>();
		rentValues.add(26.0);
		rentValues.add(130.0);
		rentValues.add(390.0);
		rentValues.add(900.0);
		rentValues.add(1100.0);
		rentValues.add(1275.0);
		entities.add(new Entity("Trastevere", "green", 30000, rentValues, 31, true, 17));
		entities.add(new Entity("Monteverde", "green", 30000, rentValues, 32, true, 18));
		entities.add(new Entity("Probabilità (3)", null, 0, noRent, 33, false, -1));
		rentValues = new ArrayList<Double>();
		rentValues.add(28.0);
		rentValues.add(150.0);
		rentValues.add(450.0);
		rentValues.add(1000.0);
		rentValues.add(1200.0);
		rentValues.add(1400.0);
		entities.add(new Entity("Giannicolense", "green", 32000, rentValues, 34, true, 19));
		rentValues = new ArrayList<Double>();
		rentValues.add(25.0);
		entities.add(new Entity("Aeroporto di Ciampino", "railroads", 20000, rentValues, 35, true, -1));
		entities.add(new Entity("Imprevisto (3)", null, 0, noRent, 36, false, -1));
		rentValues = new ArrayList<Double>();
		rentValues.add(35.0);
		rentValues.add(175.0);
		rentValues.add(500.0);
		rentValues.add(1100.0);
		rentValues.add(1300.0);
		rentValues.add(1500.0);
		entities.add(new Entity("Parioli", "blue", 35000, rentValues, 37, true, 20));
		entities.add(new Entity("Tassa di Lusso", null, 10000, noRent, 38, false, -1));
		rentValues = new ArrayList<Double>();
		rentValues.add(50.0);
		rentValues.add(200.0);
		rentValues.add(600.0);
		rentValues.add(1400.0);
		rentValues.add(1700.0);
		rentValues.add(2000.0);
		entities.add(new Entity("Villa Borghese", "blue", 40000, rentValues, 39, true, 21));
	}
	
	/**
	 * getter di entità
	 * @return ArrayList di entità
	 */
	public ArrayList<Entity> getEntities() {
		return entities;
	}
}
