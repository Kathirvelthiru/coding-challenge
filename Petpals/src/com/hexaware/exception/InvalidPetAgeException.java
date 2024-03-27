package com.hexaware.exception;
import java.util.Scanner;



	public class InvalidPetAgeException extends Exception {

		private static final long serialVersionUID = 1L;
		private String message;

		public InvalidPetAgeException(String message) {
			this.message = message;
		}

		public String getMessage() {
			return message;
		}

	}


