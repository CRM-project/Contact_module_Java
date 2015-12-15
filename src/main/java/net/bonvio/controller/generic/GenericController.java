package net.bonvio.controller.generic;

import net.bonvio.service.generic.GenericService;
import net.bonvio.settings.ResponseId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.ParameterizedType;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by mil on 04.12.15.
 */

public class GenericController<T> {

    @Autowired
    private GenericService<T> tGenericService;


    private Class<T> tClass;

    @SuppressWarnings("unchecked")
    public GenericController() {
        tClass = (Class<T>) ((ParameterizedType) getClass().getGenericSuperclass()).getActualTypeArguments()[0];
    }


    @RequestMapping(
            value = "",
            method = RequestMethod.GET,
            produces = MediaType.APPLICATION_JSON_VALUE
    )
    @ResponseBody
    public ResponseEntity<List<T>> getList() {
        List<T> tList = null;
        try {
            tList = tGenericService.getList();
            if (tList == null) {
                tList = new ArrayList<>();
            }
        } catch (Exception e) {
            return new ResponseEntity<List<T>>(tList, HttpStatus.INTERNAL_SERVER_ERROR);
        }
        return new ResponseEntity<List<T>>(tGenericService.getList(), HttpStatus.OK);
    }

/*    @RequestMapping(
            value = "",
            method = RequestMethod.GET,
            produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseBody
    public List<T> getList() {
        return tGenericService.getList();
    }*/

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    @ResponseBody
    public Object getById(@PathVariable Integer id) {
        return tGenericService.getById(id);
    }

    @RequestMapping(value = "", method = RequestMethod.POST)
    @ResponseBody
    public Object save(@RequestBody T t) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        tGenericService.save(t);
        Method[] allMethods = tClass.getDeclaredMethods();
        for (Method m : allMethods) {
            if (m.getName().equals("getId")) {
                return tClass.getDeclaredMethod("getId", new Class[]{}).invoke(t, null);
            }
        }
        return new ResponseId((Integer) tClass.getSuperclass().getDeclaredMethod("getId", new Class[]{}).invoke(t, null));
    }

    @RequestMapping(value = "", method = RequestMethod.PUT)
    @ResponseStatus(HttpStatus.OK)
    public void update(@RequestBody T t) {
        tGenericService.update(t);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    @ResponseStatus(HttpStatus.OK)
    public void deleteById(@PathVariable Integer id) {
        tGenericService.deleteById(id);
    }

}
