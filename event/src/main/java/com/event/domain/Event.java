package com.event.domain;

//import java.math.BigDecimal;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Event {
    @Id
    private ObjectId _id;
    private String description;
    private String location;
    private Integer quantity;
    //private String imageUrl;

    //private BigDecimal price;
   
    public ObjectId getId() {
        return _id;
    }

    public void setId(ObjectId id) {
        this._id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
    

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
	 * public BigDecimal getPrice() { return price; }
	 */

	/*
	 * public void setPrice(BigDecimal price) { this.price = price; }
	 */

	/*
	 * public String getImageUrl() { return imageUrl; }
	 */

	/*
	 * public void setImageUrl(String imageUrl) { this.imageUrl = imageUrl; }
	 */
}