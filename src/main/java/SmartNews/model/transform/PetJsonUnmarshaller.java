/**
 * null
 */
package SmartNews.model.transform;

import java.math.*;

import javax.annotation.Generated;

import SmartNews.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * Pet JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class PetJsonUnmarshaller implements Unmarshaller<Pet, JsonUnmarshallerContext> {

    public Pet unmarshall(JsonUnmarshallerContext context) throws Exception {
        Pet pet = new Pet();

        int originalDepth = context.getCurrentDepth();
        String currentParentElement = context.getCurrentParentElement();
        int targetDepth = originalDepth + 1;

        JsonToken token = context.getCurrentToken();
        if (token == null)
            token = context.nextToken();
        if (token == VALUE_NULL) {
            return null;
        }

        while (true) {
            if (token == null)
                break;

            if (token == FIELD_NAME || token == START_OBJECT) {
                if (context.testExpression("id", targetDepth)) {
                    context.nextToken();
                    pet.setId(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("price", targetDepth)) {
                    context.nextToken();
                    pet.setPrice(context.getUnmarshaller(Double.class).unmarshall(context));
                }
                if (context.testExpression("type", targetDepth)) {
                    context.nextToken();
                    pet.setType(context.getUnmarshaller(String.class).unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return pet;
    }

    private static PetJsonUnmarshaller instance;

    public static PetJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new PetJsonUnmarshaller();
        return instance;
    }
}
