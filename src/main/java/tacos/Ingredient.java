package tacos;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Entity
@RequiredArgsConstructor
@NoArgsConstructor(access = AccessLevel.PRIVATE, force = true)
@Document(collection = "ingredients")
public class Ingredient {

    @Id
    private final String id;
    private final String name;
    private final Type type;

}
