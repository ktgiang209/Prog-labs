package pokemons;

import moves.DefenseCurl;
import pokemons.Porygon;
public class Porygon2 extends Porygon{
    public Porygon2(String name, int level){
        super(name, level);
        setStats(85, 80, 90, 105, 95, 60);
        addMove(new DefenseCurl());
    }
}
