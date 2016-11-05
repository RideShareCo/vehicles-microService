package io.mcore.ride.sharing.vehicle;

import java.util.Arrays;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class VehiclesController {

	@Value("${blands}")
	String blands;

	@RequestMapping("/")
	public String brand() {
		String[] blandsArray = blands.split(",");
		int i = (int) Math.round(Math.random() * (blandsArray.length - 1));
		return blandsArray[i];
	}
	
	@RequestMapping("/brands")
	public String brands() {
		String[] blandsArray = blands.split(",");		
		return Arrays.toString(blandsArray);
	}

	@RequestMapping(value = "/brands/{id}", method = RequestMethod.GET)
	public @ResponseBody String generateReport(@PathVariable("id") int id, 
			HttpServletRequest request,			HttpServletResponse response) {
		String[] blandsArray = blands.split(",");
		return blandsArray[id];
	}
}
