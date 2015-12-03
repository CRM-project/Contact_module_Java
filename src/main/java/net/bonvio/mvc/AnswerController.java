package net.bonvio.mvc;

import net.bonvio.model.Answer;
import net.bonvio.service.entity.AnswerService;
import net.bonvio.settings.Id;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

/**
 * Created by mil on 27.11.15.
 */

@Controller
@RequestMapping("/answer")

public class AnswerController {

    /**
     * Autowired
     */
    @Autowired
    AnswerService answerService;

    /**
     *
     * @param view
     * @return index
     */
    @RequestMapping(method = RequestMethod.GET)
    public ModelAndView getView(ModelAndView view) {
        view.setViewName("index");
        return view;
    }

    /**
     * get list
     * @return list
     */
    @RequestMapping(value="answer", method = RequestMethod.GET)
    @ResponseBody
    public List<Answer> getList() {
        List<Answer> list = answerService.getList();
        return list;
    }

    /**
     * get answer by id
     * @param id
     * @return answer by id
     */
    @RequestMapping(value = "answer/{id}", method = RequestMethod.GET)
    @ResponseBody
    public Object getById(@PathVariable Integer id) {
        return answerService.getById(id);
    }

    /**
     * create answer
     * @param answer
     * @return answer id
     */
    @RequestMapping(value = "answer", method = RequestMethod.POST)
    @ResponseBody
    public Object save(@RequestBody Answer answer) {
        answerService.save(answer);
        return new Id(answer.getId());
    }

    /**
     * update answer
     * @param answer
     */
    @RequestMapping(value = "answer", method = RequestMethod.PUT)
    @ResponseBody
    @ResponseStatus(HttpStatus.OK)
    public void update(@RequestBody Answer answer) {
        answerService.update(answer);
    }

    /**
     * delete answer by id
     * @param id
     */
    @RequestMapping(value = "answer/{id}", method = RequestMethod.DELETE)
    @ResponseStatus(HttpStatus.OK)
    public void deleteById(@PathVariable Integer id) {
        answerService.deleteById(id);
    }

    /**
     * delete answer
     * @param answer
     */
    @RequestMapping(value = "answer", method = RequestMethod.DELETE)
    @ResponseStatus(HttpStatus.OK)
    public void delete(@RequestBody Answer answer) {
        answerService.delete(answer);
    }

}
