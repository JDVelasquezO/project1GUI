package countries;

/**
 * Country
 */
public class Country {

    private int code;
    private String name;
    private int counter;
    private Location[] locations;
    private Location location;

    public Country(int code, String name, int index){
        setName(name); setCode(code);
        this.locations = new Location[index];
        for (int i = 0; i < locations.length; i++) {
            this.locations[i] = new Location();
        }
    }
    
    public Country() {
        this(0, "null", 0);
    }

    public void setName(String name) { this.name = name; }
    public String getName() { return name; }
    
    public void setCode(int code) { this.code = code; }
    public int getCode() { return code; }

    public void setLocation(Location[] location) { this.locations = location; }
    public Location[] getLocation() { return locations; }
    public void addLocations(Location location) {
        locations[counter] = location;
        counter++;
    }
    
    public String[] getLocations() {
        String[] str = new String[] {
            location.getName()
        };

        return str;
    }

    @Override
    public String toString() {
        String str = "";

        for (Object o : locations) {
            str += o + "\n";
        }

        return "En el pais " + name + ":\n" + str;
    }
}