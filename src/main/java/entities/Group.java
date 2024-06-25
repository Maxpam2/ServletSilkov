package entities;

public class Group {
    private int id;
    private String name;

    public Group(int id, String group) {
        this.id = id;
        this.name = group;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
