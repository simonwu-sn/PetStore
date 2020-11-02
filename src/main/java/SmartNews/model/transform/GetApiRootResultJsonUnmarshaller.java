/**
 * null
 */
package SmartNews.model.transform;

import java.math.*;

import javax.annotation.Generated;

import SmartNews.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * GetApiRootResult JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetApiRootResultJsonUnmarshaller implements Unmarshaller<GetApiRootResult, JsonUnmarshallerContext> {

    public GetApiRootResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        GetApiRootResult getApiRootResult = new GetApiRootResult();

        return getApiRootResult;
    }

    private static GetApiRootResultJsonUnmarshaller instance;

    public static GetApiRootResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new GetApiRootResultJsonUnmarshaller();
        return instance;
    }
}
