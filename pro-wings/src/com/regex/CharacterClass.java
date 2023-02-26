package com.regex;

import java.util.regex.Pattern;

public class CharacterClass {
	public static void main(String[] args) {
		System.out.println(Pattern.matches("[amn]", "m")); //true if a/m/n or if other than a,m,n then false
		System.out.println(Pattern.matches("[amn]", "abc")); // false other than amn is there.
		System.out.println(Pattern.matches("[aammnnaam]", "aammnnaam")); //false a/m/n comes more than one..
		System.out.println(Pattern.matches("[amn]", "aammnnaam")); ////false a/m/n comes more than amn actual..
	}

}
