package guru.springframework.controllers;

import guru.springframework.domain.Category;
import guru.springframework.domain.Unit_of_Measure;
import guru.springframework.repositories.CategoryRepository;
import guru.springframework.repositories.UnitOfMeasureRepository;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Optional;

@Controller
public class IndexController {

    private CategoryRepository categoryRepository;
    private UnitOfMeasureRepository unitOfMeasureRepository;

    public IndexController(CategoryRepository categoryRepository, UnitOfMeasureRepository unitOfMeasureRepository) {
        this.categoryRepository = categoryRepository;
        this.unitOfMeasureRepository = unitOfMeasureRepository;
    }

    @RequestMapping({"","/","index"})
    public String getIndexPage()
    {
        Optional<Category> categoryOptional=categoryRepository.findByDescription("American");
        Optional<Unit_of_Measure> unitOfMeasureOptional=unitOfMeasureRepository.findByDescription("Teaspoon");

        System.out.println("Category Id is: "+categoryOptional.get().getId());
        System.out.println("Unit of Measure Id is: "+unitOfMeasureOptional.get().getId());
        return "index";
    }
}
