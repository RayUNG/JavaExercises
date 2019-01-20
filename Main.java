/**
 * 
 */
package com.challenge;
/**
 * @author razva
 *
 */
public class Main {
	
	public static void main(String[] args) {
		
		Tennis HalepSimona = new Tennis("HalepSimona");
		Teams<Tennis> Romania = new Teams<>("Romania");
		Romania.addPlayer(HalepSimona);
		
		Tennis KerberAngelique = new Tennis("KerberAngelique");
		Teams<Tennis> Germany = new Teams<>("Germany");
		Germany.addPlayer(KerberAngelique);
		
		Tennis WozniackiCaroline = new Tennis("WozniackiCaroline");
		Teams<Tennis> Denmark = new Teams<>("Denmark");
		Denmark.addPlayer(WozniackiCaroline);
		
		Tennis OsakaNaomi = new Tennis("OsakaNaomi");
		Teams<Tennis> Japan = new Teams<>("Japan");
		Japan.addPlayer(OsakaNaomi);
		
		Tennis StephensSloane = new Tennis("StephensSloane");
		Teams<Tennis> USA = new Teams<>("USA");
		USA.addPlayer(StephensSloane);
		
		
		
		Football Alisson = new Football("Alisson");
		Teams<Football> Liverpool = new Teams<>("Liverpool");
		Liverpool.addPlayer(Alisson);
		
		Football Ederson = new Football("Ederson");
		Teams<Football> ManchesterCity = new Teams<>("ManchesterCity");
		ManchesterCity.addPlayer(Ederson);
		
		Football Paulo = new Football("Paulo");
		Teams<Football> Tottenham = new Teams<>("Tottenham");
		Tottenham.addPlayer(Paulo);
		
		Football David = new Football("David");
		Teams<Football> Chelsea = new Teams<>("Chelsea");
		Chelsea.addPlayer(David);
		
		Football Cech = new Football("Cech");
		Teams<Football> Arsenal = new Teams<>("Arsenal");
		Arsenal.addPlayer(Cech);
		
		
		Rugby Yeandle = new Rugby("Yeandle");
		Teams<Rugby> Exeter = new Teams<>("Exeter");
		Exeter.addPlayer(Yeandle);
		
		Rugby Barritt = new Rugby("Barritt");
		Teams<Rugby> Saracens = new Teams<>("Saracens");
		Saracens.addPlayer(Barritt);
		
		Rugby Robshaw = new Rugby("Robshaw");
		Teams<Rugby> Harlequins = new Teams<>("Harlequins");
		Harlequins.addPlayer(Robshaw);
		
		Rugby Heinz = new Rugby("Heinz");
		Teams<Rugby> Gloucester = new Teams<>("Gloucester");
		Gloucester.addPlayer(Heinz);
		
		Rugby Ross = new Rugby("Ross");
		Teams<Rugby> Sharks = new Teams<>("Sharks");
		Sharks.addPlayer(Ross);
		
		League<Teams<Football>> PremierLeague = new League<>("PremierLeague");
		PremierLeague.add(Arsenal);
		PremierLeague.add(Chelsea);
		PremierLeague.add(Tottenham);
		PremierLeague.add(ManchesterCity);
		PremierLeague.add(Liverpool);
		
		System.out.println("\n");
		PremierLeague.showLeagueTable();
		
			
		System.out.println(Chelsea.numPlayers());
		System.out.println(Romania.numPlayers());
		System.out.println(Sharks.numPlayers());
		
				
		ManchesterCity.matchResult(Liverpool, 2, 1);
		Liverpool.matchResult(ManchesterCity, 0, 0);
		ManchesterCity.matchResult(Liverpool, 1, 2);
		Tottenham.matchResult(Liverpool, 1, 2);
		Chelsea.matchResult(Liverpool, 1, 2);
		Liverpool.matchResult(Chelsea, 1, 2);
		Chelsea.matchResult(Liverpool, 1, 0);
		Liverpool.matchResult(Arsenal, 5, 1);
		Arsenal.matchResult(Liverpool, 1, 1);
		Tottenham.matchResult(ManchesterCity, 0, 1);
		Tottenham.matchResult(ManchesterCity, 1, 3);
		Chelsea.matchResult(ManchesterCity, 2, 0);
		Chelsea.matchResult(ManchesterCity, 0, 2);
		Arsenal.matchResult(ManchesterCity, 0, 2);
		Tottenham.matchResult(Chelsea, 1, 0);
		Tottenham.matchResult(Chelsea, 3, 1);
		Arsenal.matchResult(Tottenham, 0, 2);
		Arsenal.matchResult(Tottenham, 4, 2);
		Arsenal.matchResult(Chelsea, 2, 0);
		Chelsea.matchResult(Arsenal, 3, 2);
		Arsenal.matchResult(Chelsea, 2, 1);
		
		System.out.println("\n");
		PremierLeague.showLeagueTable();
		
		System.out.println("Rankings");
		System.out.println(Liverpool.getTeamName() + ": " + Liverpool.ranking());
		System.out.println(ManchesterCity.getTeamName() + ": " + ManchesterCity.ranking());
		System.out.println(Tottenham.getTeamName() + ": " + Tottenham.ranking());
		System.out.println(Chelsea.getTeamName() + ": " + Chelsea.ranking());
		System.out.println(Arsenal.getTeamName() + ": " + Arsenal.ranking());
		
		System.out.println(Liverpool.compareTo(ManchesterCity));
		System.out.println(Liverpool.compareTo(Tottenham));
		System.out.println(Liverpool.compareTo(Chelsea));
		System.out.println(Liverpool.compareTo(Arsenal));
		
	}

}
