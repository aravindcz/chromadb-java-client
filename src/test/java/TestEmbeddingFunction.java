import io.github.cdimascio.dotenv.Dotenv;
import org.junit.Test;
import tech.amikos.chromadb.EmbeddingFunction;
import tech.amikos.chromadb.OpenAIEmbeddingFunction;

import java.util.Arrays;

public class TestEmbeddingFunction {

    @Test
    public void testEmbeddingFunction() {
        Dotenv dotenv = Dotenv.load();
        String apiKey = dotenv.get("OPENAI_API_KEY");
        EmbeddingFunction ef = new OpenAIEmbeddingFunction(apiKey);
        System.out.println(ef.createEmbedding(Arrays.asList("Hello, my name is John. I am a Data Scientist.")));
    }
}
