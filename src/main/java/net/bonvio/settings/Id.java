package net.bonvio.settings;

/**
 * Created by mil on 27.11.15.
 * Class Id for return Id param in post methods
 */
public class Id {

    public int id;

    /**
     * create constructor
     */
    public Id() {
        System.out.println("Was created Id Class");
    }

    /**
     * create constructor
     * @param id
     */
    public Id(int id) {
        this.id = id;
    }

}
