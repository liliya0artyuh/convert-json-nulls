package dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;

//@JsonInclude(Include.NON_NULL)
@JsonSerialize(include = JsonSerialize.Inclusion.NON_NULL)
public class CarDto {

	private String color;

	// @JsonSerialize(include=JsonSerialize.Inclusion.NON_NULL)
	private String type;

	public CarDto() {
		super();
		// TODO Auto-generated constructor stub
	}

	public CarDto(String color, String type) {
		super();
		this.color = color;
		this.type = type;
	}

	public CarDto(String color) {
		super();
		this.color = color;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	@Override
	public String toString() {
		return "CarDto [color=" + color + ", type=" + type + "]";
	}

}