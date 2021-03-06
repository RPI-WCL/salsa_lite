package salsa_lite.runtime.language.exceptions;

public class ConstructorNotFoundException extends Exception {

	String[] argTypes;
	String[] argValues;
	int constructorId;

	public ConstructorNotFoundException(int constructorId, Object[] arguments) {
		this.constructorId = constructorId;
		argTypes = new String[arguments.length];
		argValues = new String[arguments.length];
		for (int i = 0; i < argTypes.length; i++) {
			argTypes[i] = arguments[i].getClass().getName();
			argValues[i] = arguments[i].toString();
		}
	}

	public String toString() {
		String description = "ConstructorNotFoundException: could not find constructor: " + constructorId + "\n";
		description += "\targument types: ";
		for (int i = 0; i < argTypes.length; i++) description += argTypes[i] + " ";
		description += "\n\targument values: ";
		for (int i = 0; i < argValues.length; i++) description += argValues[i] + " ";
		return description;
	}
}
