package model;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.TreeNode;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.deser.std.StdDeserializer;

import java.io.IOException;
import java.util.Iterator;

public class EmpJacksonDeserializer extends StdDeserializer<Employee> {
    private static final long serialVersionUID = 1l;

   public EmpJacksonDeserializer() {
       super(Employee.class);
   }


    public EmpJacksonDeserializer(StdDeserializer<?> src) {
        super(src);
    }

    @Override
    public Employee deserialize(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException, JsonProcessingException {

       JsonNode jsonNode = jsonParser.getCodec().readTree(jsonParser);

       Employee e = null;
       if (!jsonNode.has("consultancy")) {
            e = new Employee();
            e.setEmpId((Integer) jsonNode.get("empId").numberValue());
            e.setEmpName(jsonNode.get("empName").textValue());
           return e;
        } else
        {
            e = new ContractEmployee();
            e.setEmpId((Integer) jsonNode.get("empId").numberValue());

            return e;
        }

    }

}



