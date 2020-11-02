package SmartNews;

import SmartNews.model.GetPetRequest;
import SmartNews.model.GetPetResult;
import com.amazonaws.auth.BasicAWSCredentials;
import com.amazonaws.internal.StaticCredentialsProvider;

public class Entry {
    public static void main(String[] args) {
        // change
        BasicAWSCredentials credentials = new BasicAWSCredentials("access key", "secret");

        PetStore client = PetStore.builder()
            .iamCredentials(new StaticCredentialsProvider(credentials))
            .build();
        GetPetRequest request = new GetPetRequest();
        request.setPetId("1");
        GetPetResult result = client.getPet(request);
        System.out.println(result.getPet().getPrice());
    }
}
