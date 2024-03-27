package com.hexaware.exception;
import com.hexaware.model.Pet;


	public class NullReferenceException extends Exception {

		private static final long serialVersionUID = 1L;
		private String message;

		public NullReferenceException(String message) {
			this.message = message;
		}

		public String getMessage() {
			return message;
		}

	}

