import java.util.Random;

public class Character {
    
    // Creates a character object to be used by the player

    // Character Class

    // Character Name
    private String name;

    // Setting HP values
    public int maxHP;
    public int currentHP;

    // Current Weapon
    Weapon weapon;

    public Character(String name, Weapon weapon)
    {
        this.name = name;
        this.maxHP = 10;
        this.currentHP = this.maxHP;
        this.weapon = weapon;


    }


    public void Attack(Character target)
    {
        int damage = new Random().nextInt(this.weapon.minDMG, this.weapon.maxDMG);
        target.currentHP-=damage;
        System.out.println(this.name+" has attacked "+target.name+" for "+damage+" damage!");

        if (target.currentHP <= 0) {
            System.out.println("You've defeated "+target.getName());
            
        }
        // Wait to allow the text to display
        System.console().readLine();



    }

    public String getName()
    {
        return this.name;
    }


}
