public class Character{



    // Character Attributes
    private String characterName;
    private int age = 0;





    // Character Blueprint
    public Character(String characterName)
    {

        this.characterName = characterName;


    }

    public void ageUp()
    {
        System.out.println("Aging Started...");
        while (true) {
            this.age++;
            // System.out.println(this.age);
            try {
                Thread.sleep(1000);
            } catch (Exception e) {
                // TODO: handle exception
            }
            
        }
    }
    public int getAge()
    {
        return this.age;
    }



    // Getters and Setters

    public String getName()
    {
        return this.characterName;
    }

    public void setName(String newName)
    {
        this.characterName = newName;
    }

    



}
