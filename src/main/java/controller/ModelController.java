package controller;

import entity.Model;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import service.ModelService;

@Controller
@RequiredArgsConstructor
public class ModelController {
    private final ModelService modelService;

    @GetMapping("/")
    public String getId(@RequestParam Long id) {
        return modelService.getNameById(id);
    }

}
