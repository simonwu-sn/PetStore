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
 * GetPetResult JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetPetResultJsonUnmarshaller implements Unmarshaller<GetPetResult, JsonUnmarshallerContext> {

    public GetPetResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        GetPetResult getPetResult = new GetPetResult();

        int originalDepth = context.getCurrentDepth();
        String currentParentElement = context.getCurrentParentElement();
        int targetDepth = originalDepth + 1;

        JsonToken token = context.getCurrentToken();
        if (token == null)
            token = context.nextToken();
        if (token == VALUE_NULL) {
            return getPetResult;
        }

        while (true) {
            if (token == null)
                break;

            getPetResult.setPet(PetJsonUnmarshaller.getInstance().unmarshall(context));
            token = context.nextToken();
        }

        return getPetResult;
    }

    private static GetPetResultJsonUnmarshaller instance;

    public static GetPetResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new GetPetResultJsonUnmarshaller();
        return instance;
    }
}
