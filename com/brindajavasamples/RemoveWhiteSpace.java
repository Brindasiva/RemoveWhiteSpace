package com.brindajavasamples;

public class RemoveWhiteSpace {

	public static void main(String[] args) {
		
		String str = "  l ea r n ing  j a v a   ";
		String plainString = str.replaceAll("\\s", "");
		System.out.println(plainString);

	}

}
