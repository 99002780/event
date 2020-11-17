package com.event.commands;
import java.math.BigDecimal;

import org.springframework.data.annotation.Id;

public class EventForm {
	
	@Id
		private String id;
	    private String description;
	    private String location;
	    private Integer quantity;

		public String getLocation() {
			return location;
		}

		public void setLocation(String location) {
			this.location = location;
		}

		public Integer getQuantity() {
			return quantity;
		}

		public void setQuantity(Integer quantity) {
			this.quantity = quantity;
		}

		/*
		 * private BigDecimal price; private String imageUrl;
		 */
	    public String getId() {
	        return id;
	    }

	    public void setId(String id) {
	        this.id = id;
	    }

	    public String getDescription() {
	        return description;
	    }

	    public void setDescription(String description) {
	        this.description = description;
	    }

		/*
		 * public BigDecimal getPrice() { return price; }
		 * 
		 * public void setPrice(BigDecimal price) { this.price = price; }
		 * 
		 * public String getImageUrl() { return imageUrl; }
		 * 
		 * public void setImageUrl(String imageUrl) { this.imageUrl = imageUrl; }
		 */

}


