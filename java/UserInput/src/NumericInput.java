
// Subclass overrides add method to just add numbers

public class NumericInput extends TextInput{
	
	public void add(char c){
		if (Character.isDigit(c)){
			myText += c;
		}	
	}

	public static void main(String[] args) {
		// Character to add
		char c1 = 'q';
		char c2 = '3';
		
		TextInput t = new TextInput();
		t.add(c1);
		t.add(c2);
		System.out.println(t.getValue());
		
		NumericInput n = new NumericInput();
		n.add(c1);
		n.add(c2);
		System.out.println(n.getValue());
	}

}
