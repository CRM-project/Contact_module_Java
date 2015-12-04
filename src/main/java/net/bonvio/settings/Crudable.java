package net.bonvio.settings;

/**
 * Created by mil on 04.12.15.
 */
public class Crudable {

    public Integer id;

    /**
     * create constructor
     */
    public Crudable() {

    }

    /**
     * create constructor
     * @param id
     */
    public Crudable(Integer id) {
        this.id = id;
    }

    public Integer getId() { return id; }

}
