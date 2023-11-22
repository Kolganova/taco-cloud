package tacos.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import tacos.Ingredient;

import org.springframework.core.convert.converter.Converter;
import tacos.data.IngredientRepository;

@Component
public class IngredientByIdConverter implements Converter<String, Ingredient> {

    private IngredientRepository ingredientRepository;

    @Autowired
    public IngredientByIdConverter(IngredientRepository ingredientRepository) {
        this.ingredientRepository = ingredientRepository;
    }

    @Override
    public Ingredient convert(String source) {
        return ingredientRepository.findById(source).orElse(null);
    }
}
