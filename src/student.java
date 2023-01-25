import java.util.ArrayList;

public class student {
    private String Name;
    private String lastName;
    private ArrayList activity;
    private int ID;
    public student(String Name, String lastName, int ID,ArrayList activity)
    {
        this.setActivity(activity);
        this.setlastName(lastName);
        this.setName(Name);
        this.setID(ID);
    }
    // Getter
    public String getName() {
        return Name;
    }
    // Setter
    public void setName(String name) {
        this.Name = name;
    }

    // Getter
    public String getlastName() {
        return Name;
    }
    // Setter
    public void setlastName(String lastName) {
        this.Name = lastName;
    }

    public ArrayList getActivity() {
        return activity;
    }

    public void setActivity(ArrayList activity) {
        this.activity = activity;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }
}