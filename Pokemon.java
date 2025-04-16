import java.io.FileReader;
import java.io.IOException;

public class Pokemon {
    private String name = "Pikachu";
    private int health;
    private int attack;
    private int speed;
    
    // Constructor with parameters
    public Pokemon(String name_, int health_, int attack_, int speed_) {
        name = name_;
        health = health_;
        attack = attack_;
        speed = speed_;
    }

    // Default constructor
    public Pokemon() {
       setDefault();
    }

    //Default value set
    public void setDefault() {
        name = "Pikachu"; 
        health = 35; 
        attack = 55;        ; 
        speed = 90; 
    }

    // Extra Credit: Read File 
    public Pokemon(String filePath) {
        try {
            // Read the file and parse the values
            FileReader fr = new FileReader(filePath);
            char[] buffer = new char[1024]; 
            int charsRead = fr.read(buffer);
            fr.close();
            
            //convert char array to string and split into lines
            String content = new String(buffer, 0, charsRead);
            String[] lines = content.split("\n");

            // Parse the values from the lines
            name = lines[0].trim();
            health = Integer.parseInt(lines[1].trim());
            attack = Integer.parseInt(lines[2].trim());
            speed = Integer.parseInt(lines[3].trim());
        } catch (IOException | NumberFormatException | ArrayIndexOutOfBoundsException e) {
            System.out.println("Error reading file: " + e.getMessage());
            setDefault(); 
        }
    }

    // Setters
    public void setName(String name_) {
        name = name_;
    }
    public void setHealth(int health_) {
        health = health_;
    }
    public void setAttack(int attack_) {
        attack = attack_;
    }
    public void setSpeed(int speed_) {
        speed = speed_;
    }

    // Getters
    public String getName() {
        return name;
    }
    public int getHealth() {
        return health;
    }
    public int getAttack() {
        return attack;
    }
    public int getSpeed() {
        return speed;
    }
}
