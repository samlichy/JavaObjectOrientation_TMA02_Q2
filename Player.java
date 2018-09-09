
/**
 * Objects of the Player class model real-world players that have attributes
 * representing their name, age, position (on the team) and whether or not the 
 * player is young.
 * 
 * Player is an example of a composite class.
 * 
 * An object of the Player class has-an object of the rugbyTeam class,
 * which represents the rugby team which the player plays for.
 *
 * The value of isPlayerYoung is computed and true is returned 
 * if the player is less than 27 years old. 
 * isPlayerYoung is not represented by an instance variable.
 * 
 * @author Sam Lichy   
 * @version 24/01/18
 */
public class Player
{
   private String nameOfPlayer; //a player has-a name, e.g. "Owen Farrel"
   private String playerPosition; //a player has-a position e.g. "Full-back"
   private int ageOfPlayer; //the age of the player, e.g. 27
   private rugbyTeam rugbyTeam; //a player has-a rugby team of type rugbyTeam

   /**
    * Constructor for objects of class Player
    * allowing the specification of all the
    * required attributes of the rugby player.
    */
   public Player(String aName, String aPosition, int anAge, rugbyTeam aTeam)
   {
      this.nameOfPlayer = aName;
      this.playerPosition = aPosition;
      this.ageOfPlayer = anAge;
      this.rugbyTeam = aTeam;
   }
   
   /**
    * Constructor for objects of class Player
    * where the user only knows the name of
    * the rugby player.
    */
   public Player(String aName)
   {
      this.nameOfPlayer = aName;
      this.playerPosition = null; //inicates the position of the player is unknown.
      this.ageOfPlayer = 0;  //sets the default value to 0.
      this.rugbyTeam = new rugbyTeam();
   }
   
   /**
    * A setter method for the name of the rugby team.
    * The name of the rugby team is an attribute of
    * the component rugbyTeam object, so we forward the
    * message to the component object.
    */
   public void setTeamName(String name)
   {
      this.rugbyTeam.setNameOfTeam(name);
   }
   
   /**
    * A setter method for the name of the player.
    */
   public void setNameOfPlayer(String name)
   {
      this.nameOfPlayer = name;
   }
   
   /**
    * A setter method for the position of the player.
    */
   public void setPlayerPosition(String position)
   {
      this.playerPosition = position;
   }

   /**
    * A setter method for the age of the player.
    */
   public void setPlayerAge(int age)
   {
      this.ageOfPlayer = age;
   }

   /**
   * A getter method for the name of the player.
   */
   public String getNameOfPlayer()
   {
      return this.nameOfPlayer;
   }

   /**
   * A getter method for the position of the player.
   */
   public String getPlayerPosition()
   {
      return this.playerPosition;
   }

   /**
   * A getter method for the age of the player.
   */
   public int getPlayerAge()
   {
      return this.ageOfPlayer;
   }
   
   /**
   * A getter method for the team name of the 
   * team that the player plays for.
   */
   public String getTeamName()
   {
      return this.rugbyTeam.getNameOfTeam();
   }

   /**
   * A method that returns the type of rugby of the
   * rugby team. The method returns String "League" if
   * the rugby team has 13 active players and String
   * "Union" if the rugby team has 15 active players.
   * Active players does not include substitutions.
   * The name of the rugby team is an attribute of the
   * component rugbyTeam object, so we forward the
   * message to the component object.
   */
   public String typeOfRugby()
   {
      String type = null;
     
      if (this.rugbyTeam.getNumberOfActivePlayers() == 13)
      {
         type = "League";
      }
      else if (this.rugbyTeam.getNumberOfActivePlayers() == 15)
      {
         type = "Union";
      }
      else
      {
         type = "Unknown";
      }

      return type;
   }

   /**
   * A method that computes whether the player is young.
   * The average age of a rugby player is 27, so the
   * method will return True if the player is less
   * than 27. Otherwise, if the player is 27 or above,
   * the method will return False.
   */
   public boolean isPlayerYoung()
   {     
      return this.getPlayerAge() < 27;
   }

   /**
    * Returns a description of this object as a string.
    */
   public String toString()
   {
    return this.nameOfPlayer + ", aged " + this.ageOfPlayer + " years old, plays as " + this.getPlayerPosition() + " for a rugby " + this.typeOfRugby() + " team called " + this.rugbyTeam.getNameOfTeam() + ". ";
   }
}