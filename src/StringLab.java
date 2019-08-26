public class StringLab {
	private String hello;

	public StringLab(String hello) {
		super();
		this.hello = hello;
	}

	public StringLab() {
		super();
		this.hello = "hello";
	}

	public String getHello() {
		return hello;
	}

	public void setHello(String hello) {
		this.hello = hello;
	}

	public void addStringToItself(String hello) {
		System.out.println(hello + hello);
	}

	public void replaceOdd(String hello) {
		char[] ch = hello.toCharArray();
		for (int i = 0; i < ch.length; i = i + 2) {
			ch[i] = '#';
		}
		System.out.println(String.valueOf(ch));
	}

	public void replaceOddV2(String hello) {
		String output = new String();
		for (int i = 0; i < hello.length(); i++) {
			if (i % 2 == 0) {
				output = output + "#";
			} else {
				output = output + hello.charAt(i);
			}
		}
		System.out.println(output);
	}

	public void removeDuplicate(String input) {
		String output = "";

		for (int i = 0; i < input.length(); i++) {
			if (!output.contains(String.valueOf(input.charAt(i)))) {
				output += input.charAt(i);
			}
		}
		System.out.println(output);
	}

	// --------------------------------------edit----------------------------------------------------
	public void removeDuplicateV2(String input) {
		char ch[] = input.toCharArray();
		char op[] = new char[ch.length];
		for (int i = 0; i < ch.length; i++) {
			for (int j = 0; j < op.length; j++) {
				if (ch[i] != ch[j]) {
					op[j] = ch[i];
				}
			}
		}
		System.out.println(String.valueOf(ch));
	}

	public void oddCharUpper(String input) {
		String output = "";
		for (int i = 0; i < input.length(); i++) {
			if (i % 2 == 0) {
				output += String.valueOf(input.charAt(i)).toUpperCase();
			} else {
				output += String.valueOf(input.charAt(i));
			}
		}
		System.out.println(output);
	}

	public void choice(String input, int choice) {
		switch (choice) {
		case 1:
			addStringToItself(input);
			break;
		case 2:
			replaceOdd(input);
			break;
		case 3:
			removeDuplicate(input);
			break;
		case 4:
			oddCharUpper(input);
			break;
		default:
			System.out.println("Illegal choice");

		}
	}
}
