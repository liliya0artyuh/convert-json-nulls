package app;

import com.fasterxml.jackson.databind.ObjectMapper;

import domain.Car;
import dto.CarDto;

public class Driver {
	static ObjectMapper objectMapper = null;

	public static void main(String[] args) throws Exception {
		CarDto carDto = createDtoFromDomain();

		convertDtoToString(carDto);

		// String carString = "{\r\n\"color\": \"blue\"\r\n}";
		// CarDto car = objectMapper.readValue(carString, CarDto.class);
		// System.out.println(car.getColor() + " " + car.getType());

		// JSONObject jsonObjCar = objectMapper.readValue(carString, JSONObject.class);
		// jsonInString = objectMapper.writeValueAsString(jsonObjCar);
		// System.out.println(jsonInString);

	}

	public static CarDto createDtoFromDomain() {
		Car car = new Car("yellow");
		CarDto carDto = new CarDto();
		carDto.setColor(car.getColor());
		System.out.println("values in Dto after mapping from domain: " + carDto.toString());
		return carDto;
	}

	public static String convertDtoToString(CarDto dto) throws Exception {
		objectMapper = new ObjectMapper();

		String jsonInString = objectMapper.writeValueAsString(dto);
		System.out.println("after converting dto to string: " + jsonInString);
		System.out.println("string response contains TYPE? " + jsonInString.contains("type"));
		return jsonInString;
	}

}
