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
 * GetPetsResult JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetPetsResultJsonUnmarshaller implements Unmarshaller<GetPetsResult, JsonUnmarshallerContext> {

    public GetPetsResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        GetPetsResult getPetsResult = new GetPetsResult();

        int originalDepth = context.getCurrentDepth();
        String currentParentElement = context.getCurrentParentElement();
        int targetDepth = originalDepth + 1;

        JsonToken token = context.getCurrentToken();
        if (token == null)
            token = context.nextToken();
        if (token == VALUE_NULL) {
            return getPetsResult;
        }

        while (true) {
            if (token == null)
                break;

            getPetsResult.setPets(new ListUnmarshaller<Pet>(PetJsonUnmarshaller.getInstance()).unmarshall(context));
            token = context.nextToken();
        }

        return getPetsResult;
    }

    private static GetPetsResultJsonUnmarshaller instance;

    public static GetPetsResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new GetPetsResultJsonUnmarshaller();
        return instance;
    }
}
