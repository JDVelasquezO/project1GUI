package countries;

import installations.Airport;
import installations.Installation;

/**
 * Location
 */
public class Location {

    private Installation instalations[];
    private int counter = 0;
    private int code;

    public Location(int index){
        setCode(code);
        this.instalations = new Installation[index];
        for (int i = 0; i < instalations.length; i++) {
            this.instalations[i] = new Airport();
        }
    }

    public Location() {
        this(0);
    }

    public void setCode(int code) { this.code = code; }
    public int getCode() { return code; }

    public void setInstalations(Installation[] instalations) {
        this.instalations = instalations;
    }
    public Installation[] getInstalations() { return instalations; }

    public void addInstallation(Installation installation) {
        instalations[counter] = installation;
        counter++;
    }

    @Override
    public String toString() {
        String str = "";

        for (Object o : instalations) {
            str += o + "\n";
        }

        return str;
    }
}