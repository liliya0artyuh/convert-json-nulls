package test;

import org.junit.Test;

import app.Driver;
import dto.CarDto;
import junit.framework.Assert;

public class CarTypeNullTest {

	@Test
	public void test() throws Exception {
		Driver d = new Driver();

		CarDto carDto = d.createDtoFromDomain();
		String carString = d.convertDtoToString(carDto);
		Assert.assertEquals(false, carString.contains("type"));
	}

}
