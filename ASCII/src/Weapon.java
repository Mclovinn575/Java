public class Weapon{

    // Weapon Name
    private String weaponName;

    // Minimum and Maximum Damage
    public int minDMG;
    public int maxDMG;

    public Weapon(String weaponName, int minDMG, int maxDMG)
    {
        this.weaponName = weaponName;
        this.minDMG = minDMG;
        this.maxDMG = maxDMG;

    }
    public String getWeaponName()
    {return this.weaponName;}

    public static Weapon sword = new Weapon("Sword", 1, 5) ;










}