package br.com.springBoot.awesome.error;

import javax.annotation.Generated;

/**
 * Definindo o próprio menssagem de exception, para apresentar no postman quando digitar um id incorreto.
 * @author elenj
 *
 */
public class ResourceNotFoundDetails extends ErrorDetails{


	public static final class Builder {
		private String title;
		private int status;
		private String details;
		private long timestamp;
		private String developerMessage;

		private Builder() {
		}

		/**
		 * Creates builder to build {@link ResourceNotFoundDetails}.
		 * 
		 * @return created builder
		 */

		@Generated("SparkTools")
		public static Builder newBuilder() {
			return new Builder();
		}

		public Builder title(String title) {
			this.title = title;
			return this;
		}

		public Builder status(int status) {
			this.status = status;
			return this;
		}

		public Builder details(String details) {
			this.details = details;
			return this;
		}

		public Builder timestamp(long timestamp) {
			this.timestamp = timestamp;
			return this;
		}

		public Builder developerMessage(String developerMessage) {
			this.developerMessage = developerMessage;
			return this;
		}

		public ResourceNotFoundDetails build() {
			ResourceNotFoundDetails resourceNotFoundDetails = new ResourceNotFoundDetails();
			resourceNotFoundDetails.setDeveloperMessage(developerMessage);
			resourceNotFoundDetails.setTitle(title);
			resourceNotFoundDetails.setDetails(details);
			resourceNotFoundDetails.setTimestamp(timestamp);
			resourceNotFoundDetails.setStatus(status);
			return resourceNotFoundDetails;			
		}
	}

}
