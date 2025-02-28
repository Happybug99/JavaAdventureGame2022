/*
Item (11 tasks)
 dibs AJ - private instance vars for name, strength, description, int magicType, Random rng
 dibs AJ + NoArgsConstructor
 dibs AJ + Item(String _name, String _description)
 dibs AJ + int getMagicType()
 dibs EW + String getName()
 dibs EW + int getStrength()
 dibs EW + void setDescription(String d)
 dibs EW + void setName(String _name)
 dibs WB + isBroken()
 dibs WB + toString() // returns the description
 dibs WB + void weaken()
 */
import java.util.Random;

public class Item
{
  // instance variables go here
  // private instance vars for name, strength, description, int magicType, Random rng

  
  public Item()
  {
    // set magicType to a random number 1-3 (inclusive)
  }


  public Item(String _name, String _description)
  {
    // set magicType to 1
  }
  public String toString(){
    return description.toString();
  }


  public int getMagicType()
  {
    return 0;
  }

  public String getName()
  {
    return "x";
  }

  public void setName(String _name)
  {

  }

  public int getStrength()
  {
    return 0;
  }

  public void setDescription(String _string)
  {

  }

  // sets strength to be strength divided by two
  public void weaken()
  {
    strength = strength / 2;
  }

  // returns true if the strength is zero or less, otherwise returns true
  public boolean isBroken()
  {
   if(strength<=0){
    
    return true;
   }else{
    return false;
   }
  }

}

