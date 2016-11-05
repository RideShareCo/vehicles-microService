package io.mcore.ride.sharing.vehicle;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class RideSharingVehiclesApplication {

	public static void main(String[] args) {
		SpringApplication.run(RideSharingVehiclesApplication.class, args);
	}
}
