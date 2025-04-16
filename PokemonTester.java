public class PokemonTester {
    public static void main(String[] args) {
        // Test the Pokemon class
        Pokemon p1 = new Pokemon("Charizard", 78, 84, 100);
        System.out.println("Pokemon 1 \nName: " + p1.getName());
        System.out.println("Health: " + p1.getHealth());
        System.out.println("Attack: " + p1.getAttack());
        System.out.println("Speed: " + p1.getSpeed());

        // Test default constructor
        Pokemon p2 = new Pokemon();
        System.out.println("\nPokemon 2 \nDefault Name: " + p2.getName());
        System.out.println("Default Health: " + p2.getHealth());
        System.out.println("Default Attack: " + p2.getAttack());
        System.out.println("Default Speed: " + p2.getSpeed());

        // Test file constructor (assuming the file exists and is formatted correctly)
        Pokemon p3 = new Pokemon("./Pokemon.txt");
        System.out.println("\nPokemon 3 \nFile Name: " + p3.getName());
        System.out.println("File Health: " + p3.getHealth());
        System.out.println("File Attack: " + p3.getAttack());
        System.out.println("File Speed: " + p3.getSpeed());

        // Test setters
        p1.setName("Blastoise");
        p1.setHealth(79);
        p1.setAttack(83);
        p1.setSpeed(78);
        System.out.println("\nPokemon 1 v2 \nUpdated Name: " + p1.getName());
        System.out.println("Updated Health: " + p1.getHealth());
        System.out.println("Updated Attack: " + p1.getAttack());
        System.out.println("Updated Speed: " + p1.getSpeed());
    }
}
