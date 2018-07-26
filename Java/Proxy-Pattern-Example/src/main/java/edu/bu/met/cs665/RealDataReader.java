package edu.bu.met.cs665;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger;

/**
 * This class is the main data loader. 
 * As an example we load the customer data from CSV file. 
 * @author Kia Teymourian
 *
 */
public class RealDataReader implements DataAccess {
	

	private static Logger logger = Logger.getLogger(RealDataReader.class);

	String fileName;

	public RealDataReader(String fileName) {
		this.fileName = fileName;
	}

	@Override
	public List<Customer> getCustomerData() {

		List<Customer> customerData = new ArrayList<Customer>();

		try {

			// we read the data from a CSV file and test the calculation methods with it.
			URL url = this.getClass().getResource("/" + fileName);
			File file = new File(url.getFile());

			FileReader fileReader = new FileReader(file);
			BufferedReader bufferedReader = new BufferedReader(fileReader);

			// Read the data line by line and create customer objects
			String line;
			while ((line = bufferedReader.readLine()) != null) {

				String[] data = line.split(",");

				// Each line is includes data about a single customer.
				// Create customer objects 
				Customer customer = new Customer(Long.parseLong(data[0]), data[1], data[2], Integer.parseInt(data[3]),
						Integer.parseInt(data[4]));
				// then add the customer objects to the customers list.
				customerData.add(customer);
			}

			fileReader.close();

		} catch (IOException e) {
			logger.error("Can not read the Customer data", e);
		}

		return customerData;
	}

}
