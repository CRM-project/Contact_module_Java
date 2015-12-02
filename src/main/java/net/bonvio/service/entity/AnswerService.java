package net.bonvio.service.entity;

import net.bonvio.model.Answer;

import java.util.List;

/**
 * Created by mil on 23.11.2015.
 */
public interface AnswerService {

    void save(Answer answer);
    List<Answer> getAll();
    void delete(Answer answer);
    void deleteById(Integer id);
    Answer findById(Integer id);
    void update(Answer answer);
}

