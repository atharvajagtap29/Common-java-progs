// class, objects and constructors demo

class Pokemon{  // class is a blueprint of an object
  
  String pokemonName;
  int pokemonLevel;
  
  Pokemon(){  // constructor. same name as class and no return type
    pokemonLevel = 1;   // all pokemons[objects] created will have 1 as default level when created   
  }
  
  //Pokemon(String pname, int plevel){  // parameterized constructor
    //pokemonName = pname;
    //pokemonLevel = plevel;
  //}
  
  Pokemon(String pokemonName, int pokemonLevel){  // this keyword
    this.pokemonName = pokemonName;
    this.pokemonLevel = pokemonLevel;
  }
}

public class Exg1{
  public static void main(String[] args){
    //Pokemon p1 = new Pokemon();
    //p1.pokemonName = "Pikachu";
    //p1.pokemonLevel = 1;
    //System.out.println(p1.pokemonName);
    //System.out.println(p1.pokemonLevel);
    
    //constructor
    //Pokemon p2 = new Pokemon();
    //System.out.println(p2.pokemonLevel);
    
    //parameterized Constructor
    //Pokemon p3 = new Pokemon("Snorlax", 3);
    //String n = p3.pokemonName;
    //int l = p3.pokemonLevel;
    //System.out.println(n);
    //System.out.println(l);
    
    Pokemon p4 = new Pokemon("Mewtwo", 5);
    System.out.println(p4.pokemonName);
    System.out.println(p4.pokemonLevel);
  }
}
