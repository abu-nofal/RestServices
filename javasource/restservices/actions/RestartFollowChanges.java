// This file was generated by Mendix Business Modeler 4.0.
//
// WARNING: Only the following code will be retained when actions are regenerated:
// - the import list
// - the code between BEGIN USER CODE and END USER CODE
// - the code between BEGIN EXTRA CODE and END EXTRA CODE
// Other code you write will be lost the next time you deploy the project.
// Special characters, e.g., é, ö, à, etc. are supported in comments.

package restservices.actions;

import com.mendix.systemwideinterfaces.core.UserAction;

/**
 * 
 */
public class RestartFollowChanges extends UserAction<Boolean>
{
	private String collectionUrl;

	public RestartFollowChanges(String collectionUrl)
	{
		super();
		this.collectionUrl = collectionUrl;
	}

	@Override
	public Boolean executeAction() throws Exception
	{
		// BEGIN USER CODE
		throw new com.mendix.systemwideinterfaces.MendixRuntimeException("Java action was not implemented");
		// END USER CODE
	}

	/**
	 * Returns a string representation of this action
	 */
	@Override
	public String toString()
	{
		return "RestartFollowChanges";
	}

	// BEGIN EXTRA CODE
	// END EXTRA CODE
}
