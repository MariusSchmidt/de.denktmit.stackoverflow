package de.denktmit.stackoverflow.jackson.polymorphic;


import com.fasterxml.jackson.databind.ObjectMapper;
import de.denktmit.stackoverflow.jackson.polymorphic.deductive.Animal;
import de.denktmit.stackoverflow.jackson.polymorphic.deductive.Bird;
import de.denktmit.stackoverflow.jackson.polymorphic.deductive.Fish;
import de.denktmit.stackoverflow.jackson.polymorphic.deductive.ZooPen;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class DeductivePolymorphicDeserializationTest {

    private static final String birdString = "{\n" +
            "      \"name\": \"Tweety\",\n" +
            "      \"age\": 79,\n" +
            "      \"wingspan\": 2.9\n" +
            "    }";

    private static final String fishString = "{\n" +
            "      \"name\": \"Nemo\",\n" +
            "      \"age\": 16,\n" +
            "      \"freshwater\": false\n" +
            "    }";

    private static final String zooPenString = "{\n" +
            "  \"type\": \"aquaviary\",\n" +
            "  \"animals\": [\n" +
            "    {\n" +
            "      \"name\": \"Tweety\",\n" +
            "      \"age\": 79,\n" +
            "      \"wingspan\": 2.9\n" +
            "    },\n" +
            "    {\n" +
            "      \"name\": \"Nemo\",\n" +
            "      \"age\": 16,\n" +
            "      \"freshwater\": false\n" +
            "    }\n" +
            "  ]\n" +
            "}";
    private final ObjectMapper mapper = new ObjectMapper();

    @Test
    void deserializeBird() throws Exception {
        Animal animal = mapper.readValue(birdString, Animal.class);
        assertThat(animal).isInstanceOf(Bird.class);
    }

    @Test
    void deserializeFish() throws Exception {
        Animal animal = mapper.readValue(fishString, Animal.class);
        assertThat(animal).isInstanceOf(Fish.class);
    }

    @Test
    void deserialize() throws Exception {
        ZooPen zooPen = mapper.readValue(zooPenString, ZooPen.class);
        assertThat(zooPen).isInstanceOf(ZooPen.class);
    }
}
