package Oops;
class Pokemon{
    int power;
    String type;
    Pokemon(String type, int power){  //setter
        this.power=power;
        this.type=type;
    }
    Pokemon(){

    }

    void print(){ //getter
        System.out.println(this.power+" "+this.type);
    }
}
class LegendaryPokemon extends Pokemon{  //chile class
    String ability;
}

class GodPokemon extends  LegendaryPokemon{
    char tag;
}

public class Inheritance {
    static void main(String[] args) {
    LegendaryPokemon mewtwo = new LegendaryPokemon();
    mewtwo.ability = "Pressure";
    Pokemon pikachu = new Pokemon();
    GodPokemon dialga = new GodPokemon();
    dialga.ability = "Hard";
    }
}
