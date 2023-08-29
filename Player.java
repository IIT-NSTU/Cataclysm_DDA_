import java.util.ArrayList;

public class Player {
   private Room location;
   private Room moveFrom;
   private ArrayList<Thing> inventory;
   private int numberOfObjects;
   private int health;
   private int coins;
   public Player() {
      location = null;
      moveFrom = null;
      
      inventory = new ArrayList<Thing>();

      numberOfObjects = 0;

      health = 100;
      coins=0;
   }

   public Player(Room location, Room moveFrom, int numberOfObjects) {
      super();
      this.location = location;
      this.moveFrom = moveFrom;
      this.inventory = new ArrayList<Thing>();
      this.numberOfObjects = numberOfObjects;
      this.health = 100;
      this.coins=0;
   }

   
   public int getHealth() {
      return health;
  }

  public void setHealth(int health) {
      this.health = health;
  }

  public void decreaseHealth(int amount) {
      health -= amount;
      if (health < 0) {
          health = 0;
      }
  }

  public void increaseHealth(int amount) {
      health += amount;
      if (health > 100) {
          health = 100;
      }
  }

  public void viewHealth() {
      System.out.println("Player Health: " + health);
  }


   public void take(Thing item) {
      inventory.add(item);
   }

   public void drop(Thing item) {
      inventory.remove(item);
   }

   public Room getLocation() {
      return location;
   }

   public void setLocation(Room location) {
      this.location = location;
   }

   public Room getMoveFrom() {
      return moveFrom;
   }

   public void setMoveFrom(Room moveFrom) {
      this.moveFrom = moveFrom;
   }

   public ArrayList<Thing> getInventory() {
      return inventory;
   }

   public void setInventory(ArrayList<Thing> inventory) {
      this.inventory = inventory;
   }

   public int getNumberOfObjects() {
      return numberOfObjects;
   }

   public void setNumberOfObjects(int numberOfObjects) {
      this.numberOfObjects = numberOfObjects;
   }
   public void collectCoin(){
      coins++;
   }
   public int getCoins(){
      return coins;
   }
   public void viewPlayerInventory() {
      System.out.println("Adventur Inventory");
      System.out.println();
      if (inventory.size() == 0)
         System.out.println("No Item in Inventory");
      else {
         for (int i = 0; i < inventory.size(); i++)
            System.out.println(i + "  " + inventory.get(i));
      }
      
      System.out.println("You have "+coins+" coins");
      System.out.println();
   }

   public Thing getInventoryItem(int takeThing) {
      Thing t = inventory.get(takeThing);
      drop(t);
      return t;
   }

   public String toString() {
      return "Adventurer [location=" + location + ", moveFrom=" + moveFrom + ", inventory=" + inventory
            + ", numberOfObjects=" + numberOfObjects + "]";
   }

}