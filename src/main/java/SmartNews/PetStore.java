/**
 * null
 */
package SmartNews;

import javax.annotation.Generated;

import com.amazonaws.*;
import com.amazonaws.opensdk.*;
import com.amazonaws.opensdk.model.*;
import com.amazonaws.regions.*;

import SmartNews.model.*;

/**
 * Interface for accessing PetStore.
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public interface PetStore {

    /**
     * @param createPetRequest
     * @return Result of the CreatePet operation returned by the service.
     * @sample PetStore.CreatePet
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/hyc7galkd2-2020-10-27T09:06:20Z/CreatePet" target="_top">AWS
     *      API Documentation</a>
     */
    CreatePetResult createPet(CreatePetRequest createPetRequest);

    /**
     * @param getApiRootRequest
     * @return Result of the GetApiRoot operation returned by the service.
     * @sample PetStore.GetApiRoot
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/hyc7galkd2-2020-10-27T09:06:20Z/GetApiRoot"
     *      target="_top">AWS API Documentation</a>
     */
    GetApiRootResult getApiRoot(GetApiRootRequest getApiRootRequest);

    /**
     * @param getPetRequest
     * @return Result of the GetPet operation returned by the service.
     * @sample PetStore.GetPet
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/hyc7galkd2-2020-10-27T09:06:20Z/GetPet" target="_top">AWS
     *      API Documentation</a>
     */
    GetPetResult getPet(GetPetRequest getPetRequest);

    /**
     * @param getPetsRequest
     * @return Result of the GetPets operation returned by the service.
     * @sample PetStore.GetPets
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/hyc7galkd2-2020-10-27T09:06:20Z/GetPets" target="_top">AWS
     *      API Documentation</a>
     */
    GetPetsResult getPets(GetPetsRequest getPetsRequest);

    /**
     * @return Create new instance of builder with all defaults set.
     */
    public static PetStoreClientBuilder builder() {
        return new PetStoreClientBuilder();
    }

    /**
     * Shuts down this client object, releasing any resources that might be held open. This is an optional method, and
     * callers are not expected to call it, but can if they want to explicitly release any open resources. Once a client
     * has been shutdown, it should not be used to make any more requests.
     */
    void shutdown();

}
