package tacos;

import jakarta.validation.constraints.Size;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Table;

import java.util.Date;
import java.util.List;

@NoArgsConstructor
@Data
@Table
public class Taco {

    @Id
    private Long id;
    private Date createdAt = new Date();
    @NonNull
    @Size(min = 5, message = "Name must be at least 5 characters long")
    private String name;
    @NonNull
    @Size(min = 1, message = "You must choose at least 1 ingredient")
    private List<IngredientRef> ingredients;
}
