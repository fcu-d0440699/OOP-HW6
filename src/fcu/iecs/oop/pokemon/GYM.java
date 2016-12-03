package fcu.iecs.oop.pokemon;

public class GYM {
	public static void fight(Player...players){
		//Player winner = null;
		int i=0,j=0,k=0;
		Pokemon[] p1 = players[0].getPokemons();
		Pokemon[] p2 = players[1].getPokemons();
		
		while(i!=2 || j!=2){
			if(p1[k].getType() != p2[k].getType()){
				if(p1[k].getType()==PokemonType.FIRE && p2[k].getType()==PokemonType.GRASS) i++;
				else if((p1[k].getType()==PokemonType.FIRE && p2[k].getType()==PokemonType.WATER)) j++;
				else if((p1[k].getType()==PokemonType.GRASS && p2[k].getType()==PokemonType.WATER)) i++;
				else if((p1[k].getType()==PokemonType.GRASS && p2[k].getType()==PokemonType.FIRE)) j++;
				else if((p1[k].getType()==PokemonType.WATER && p2[k].getType()==PokemonType.FIRE)) i++;
				else if((p1[k].getType()==PokemonType.WATER && p2[k].getType()==PokemonType.GRASS)) j++;
			}
			else{
				if(p1[k].getCp() > p2[k].getCp()) i++;
				else if(p1[k].getCp() < p2[k].getCp()) j++;
				else{
					int ran = (int)(Math.random()*2);
					if(ran==0) i++;
					else j++;
				}
			}
			if(i==2) {
				players[0].setLevel(players[0].getLevel()+1);
				System.out.println("Winner is "+players[0].getPlayerName()+", and his/her level becomes "+players[0].getLevel()+".");
			}
			else if(j==2) {
				players[1].setLevel(players[1].getLevel()+1);
				System.out.println("Winner is "+players[1].getPlayerName()+", and his/her level becomes "+players[1].getLevel()+".");
			}
			k++;
		}
		
	}
}
