import java.util.ArrayList;

public class Room extends Location
 {
    private String name;

    private String desc;

    private String weather;


       private ArrayList<Thing> contents;


    private int numberOfThings;

        private int roomNumb;



    public Room() 
    {
        contents = new ArrayList<>();
        setType("Room");
    }
    
    public Room(int roomnum,String name, String desc,String weather) {
        this.roomNumb=roomnum;
        this.name = name;
        this.desc = desc;
        this.weather = weather;
        contents = new ArrayList<>();
        setType("Room");
    }
    private Room parent;
    public Room getParent() {
        return parent;
    }

    public void setParent(Room parent) {
        this.parent = parent;
    }
    public int getRoomNumber(){
        return roomNumb;
    }
    public ArrayList<Thing> getContents() {
        return contents;
    }
    public boolean hasZombie() {
        for (Thing thing : contents) {
            if (thing.getName().equalsIgnoreCase("Zombie")) {
                return true;
            }
        }
        return false;
    }
    public void addObject(Thing item) {
        contents.add(item);
    }

    public void dropObject(Thing item) {
        removeThing(item);
    }
    

    public void setContents(ArrayList<Thing> contents) {
        this.contents = contents;
    }

    public int getNumberOfThings() {
        numberOfThings = contents.size();
        return numberOfThings;
    }

    public String getName() {
        return name;
    }
    public String getWeather(){
        return weather;
    }
    public void setWeather(String weather){
        this.weather = weather;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public String setLocationType() {
        return "Room";
    }

    public void viewRoomContent() {
        System.out.println("Room Contents");
        System.out.println();
        if (contents.size() == 0)
            System.out.println("No Item in Room");
        else {
            for (int i = 0; i < contents.size(); i++)
                System.out.println(i + "  " + contents.get(i));
        }
        System.out.println();
    }

    public String toString() {
        return "Room [name=" + name + ", desc=" + desc + ", contents=" + contents
                + ", numberOfThings=" + getNumberOfThings() +"]" + "\nWether="+getWeather();
    }

    public Thing getRoomItem(int takeThing)
     {

        Thing t = contents.get(takeThing);


        dropObject(t);


        return t;
    }
    public void removeThing(Thing thing)
    
    {
        contents.remove(thing);
    }
    public Thing getThingByName(String itemName) {


        for (Thing item : contents) {

            if (item.getName().equalsIgnoreCase(itemName))
             {
                return item;
            }
        }
        return null; 
    }

    public String getRoomItems() {
        return null;
    }    
}
