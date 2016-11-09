
// Base class adds a character to a string

public class TextInput {
	
	String myText;
	
	TextInput(){
		myText = "x";
	}
	
	public void add(char c){
		myText += c;
	}

	public String getValue(){
		return myText;
	}
}

