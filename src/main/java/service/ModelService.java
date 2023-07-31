package service;

import entity.Model;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Service;

@Service
public class ModelService {
    public Model createModel(Long id, String name, String surname, int age){
        return new Model(id, name, surname, age);
    }
    public void printModel(Model model){
        System.out.println("ID: " + model.getId() + "Name: " + model.getName() +
                "Surname: " + model.getSurname() + "Age: " + model.getAge());
    }
    public Long getModelId(Model model){
        return model.getId();
    }
}
