public class Character{



    // Character Attributes
    private String characterName;
    private int age = 0;





    // Character Blueprint
    public Character()
    {

        this.characterName = "None";


    }

    public void ageUp(int maxAge)
    {
        
        System.out.println("Aging Started...");
        while (this.getAge() < maxAge) {
            this.age++;
            // System.out.println(this.age);
            try {
                Thread.sleep(1000);
            } catch (Exception e) {
                // TODO: handle exception
            }
            
        }
        System.out.println("Aging Stopped at "+maxAge);
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
