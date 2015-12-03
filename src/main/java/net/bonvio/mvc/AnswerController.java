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
     * @return hello
     */
    @RequestMapping(method = RequestMethod.GET)
    public ModelAndView getCustomerd(ModelAndView view) {
        view.setViewName("hello");
        return view;
    }

    /**
     * get answers list
     * @return answers list
     */
    @RequestMapping(value="answer", method = RequestMethod.GET)
    @ResponseBody
    public List<Answer> getanswers() {
        List<Answer> list = answerService.getAll();
        return list;
    }

    /**
     * get answer by id
     * @param id
     * @return answer by id
     */
    @RequestMapping(value = "answer/{id}", method = RequestMethod.GET)
    @ResponseBody
    public Object getanswer(@PathVariable Integer id) {
        return answerService.findById(id);
    }

    /**
     * create answer
     * @param answer
     * @return answer id (or answer, if uncommented "return answer")
     */
    @RequestMapping(value = "answer", method = RequestMethod.POST)
    @ResponseBody
    public Object addanswer(@RequestBody Answer answer) {
        System.err.println(answer);
        answerService.save(answer);
        return new Id(answer.getId());
        //return Answer;
    }

    /**
     * update answer
     * @param answer
     */
    @RequestMapping(value = "answer", method = RequestMethod.PUT)
    @ResponseBody
    @ResponseStatus(HttpStatus.OK)
    public void updateanswer(@RequestBody Answer answer) {
        System.out.println(answer);
        answerService.update(answer);
    }

    /**
     * delete answer by id
     * @param id
     */
    @RequestMapping(value = "answer/{id}", method = RequestMethod.DELETE)
    @ResponseStatus(HttpStatus.OK)
    public void deleteanswer(@PathVariable Integer id) {
        System.out.println("remove answer by id = " + id);
        answerService.deleteById(id);
    }
}
