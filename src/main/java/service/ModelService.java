package service;

import entity.Model;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Service;
import repository.ModelRepository;

@Service
@AllArgsConstructor
public class ModelService {

    private final ModelRepository modelRepository;

    public String getNameById(Long id) {
        Model model = modelRepository.findModelById(id);
        return (model != null) ? model.getName() : null;
    }
}
