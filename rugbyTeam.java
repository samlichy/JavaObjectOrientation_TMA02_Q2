
/**
 * rugbyTeam represents a rugby team such as England 
 * Rugby Club. Objects of the rugbyTeam class have 
 * attributes such as the name of the team and the 
 * number of active players.
 * 
 * In the context of the Player example, this is a 
 * component class.
 * 
 * @author Sam Lichy 
 * @version 24/01/18
 */
public class rugbyTeam
{
   private String nameOfTeam;
   private int numberOfActivePlayers; // Representing active players only, not substitutes.
   
   /**
    * Constructor for objects of class rugbyTeam
    * if we know the name, and number of active
    * players, of the rugby team.
    */
   public rugbyTeam(String name, int number)
   {
      this.nameOfTeam = name;
      this.numberOfActivePlayers = number;
   }

   /**
    * Constructor for objects of class rugbyTeam
    */
   public rugbyTeam()
   {
      this.nameOfTeam = null; //indicates the name of the rugby team is unknown.
      this.numberOfActivePlayers = 0; //sets the default value to 0.
   }

   /**
    * A setter method for the name of the rugby team.
    */
   public void setNameOfTeam(String name)
   {
      this.nameOfTeam = name;
   }

   /**
    * A setter method for the number of active players on a team.
    */
   public void setNumberOfActivePlayers(int players)
   {
      this.numberOfActivePlayers = players;
   }

   /**
   * A getter method for the name of the rugby team.
   */
   public String getNameOfTeam()
   {
      return this.nameOfTeam;
   }

   /**
   * A getter method for the number of active players on a team.
   */
   public int getNumberOfActivePlayers()
   {
      return this.numberOfActivePlayers;
   }

   /**
    * Returns a description of this object as a string.
    */
   public String toString()
   {
    return this.nameOfTeam + " has " + this.numberOfActivePlayers + " active players.";
   }
}
