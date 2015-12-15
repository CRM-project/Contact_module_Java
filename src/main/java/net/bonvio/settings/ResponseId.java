package net.bonvio.settings;

/**
 * Created by mil on 04.12.15.
 */
public class ResponseId implements Resp{
    public Integer id;
    public ResponseId() {

    }
    public ResponseId(Integer id) {
        this.id = id;
    }
    public Integer getId() { return id; }


    public Object responseId (){
        return new ResponseId(id);
    }



}
