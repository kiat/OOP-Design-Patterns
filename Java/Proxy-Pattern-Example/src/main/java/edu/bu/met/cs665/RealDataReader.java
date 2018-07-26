package edu.bu.met.cs665;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;



public class RealDataReader implements DataAccess {

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

      String line;
      while ((line = bufferedReader.readLine()) != null) {

        String[] data = line.split(",");

        Customer customer = new Customer(Long.parseLong(data[0]), data[1],
            data[2], Integer.parseInt(data[3]), Integer.parseInt(data[4]));

        customerData.add(customer);
      }

      fileReader.close();

    } catch (IOException e) {
      e.printStackTrace();
    }



    return customerData;
  }

}
