package TestMain;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.module.SimpleModule;
import model.Address;
import model.ContractEmployee;
import model.EmpJacksonDeserializer;
import model.Employee;
import utils.EmpObjectMapper;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class TestApp {
    public static void main(String[] args) throws IOException {

        InputStream is = TestApp.class.getClassLoader().getResourceAsStream("data.json");

        Employee e = EmpObjectMapper.toObject(is, Employee.class);

        //ObjectMapper mapper = new ObjectMapper();
       //SimpleModule module=new SimpleModule();
        //module.addDeserializer(Employee.class, new EmpJacksonDeserializer());
        //mapper.readValue(is, Employee.class);
        //is.close();
        System.out.println(e);
        System.out.println(e.getClass());


    }

    private static void m1() {
        Address address = new Address("s1", "c1");
        Employee employee = new Employee("e1", 1, address);
        String json = EmpObjectMapper.toJson(employee);
        System.out.println(json);
        InputStream is = new ByteArrayInputStream(json.getBytes());
        Employee employee1 = EmpObjectMapper.toObject(is, Employee.class);
        System.out.println(employee1);
    }

}
