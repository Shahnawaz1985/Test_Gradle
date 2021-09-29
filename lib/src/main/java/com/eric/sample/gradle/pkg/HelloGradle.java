package com.eric.sample.gradle.pkg;

import com.github.javafaker.Faker;

/**
 * Faker test added.
 * @author Shahnawaz
 *
 */
public class HelloGradle {
	
	public static void main(String[] args) {
		System.out.println("Hello From Gradle!");
		
		Faker faker = new Faker();
		String name = faker.name().fullName();
		String firstName = faker.name().firstName();
		String lastName = faker.name().lastName();
		String address = faker.address().fullAddress();
		System.out.println();
		System.out.printf("Generated full name, firstName and lastName %s, %s, %s", name, firstName, lastName);
		System.out.println();
		System.out.printf("Generated full address %s ", address);
		System.out.println();
	}

}
