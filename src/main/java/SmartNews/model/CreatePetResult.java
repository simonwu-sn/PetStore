/**
 * null
 */
package SmartNews.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/hyc7galkd2-2020-10-27T09:06:20Z/CreatePet" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreatePetResult extends com.amazonaws.opensdk.BaseResult implements Serializable, Cloneable {

    private NewPetResponse newPetResponse;

    /**
     * @param newPetResponse
     */

    public void setNewPetResponse(NewPetResponse newPetResponse) {
        this.newPetResponse = newPetResponse;
    }

    /**
     * @return
     */

    public NewPetResponse getNewPetResponse() {
        return this.newPetResponse;
    }

    /**
     * @param newPetResponse
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreatePetResult newPetResponse(NewPetResponse newPetResponse) {
        setNewPetResponse(newPetResponse);
        return this;
    }

    /**
     * Returns a string representation of this object. This is useful for testing and debugging. Sensitive data will be
     * redacted from this string using a placeholder value.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getNewPetResponse() != null)
            sb.append("NewPetResponse: ").append(getNewPetResponse());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreatePetResult == false)
            return false;
        CreatePetResult other = (CreatePetResult) obj;
        if (other.getNewPetResponse() == null ^ this.getNewPetResponse() == null)
            return false;
        if (other.getNewPetResponse() != null && other.getNewPetResponse().equals(this.getNewPetResponse()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getNewPetResponse() == null) ? 0 : getNewPetResponse().hashCode());
        return hashCode;
    }

    @Override
    public CreatePetResult clone() {
        try {
            return (CreatePetResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
