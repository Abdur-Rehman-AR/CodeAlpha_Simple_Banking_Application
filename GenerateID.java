package codeAlpha;

public class GenerateID {

	String id = "bsf2300030";
	int i = -1;

	public String generateId() {
		i = i + 1;
		return id + i;
	}
}