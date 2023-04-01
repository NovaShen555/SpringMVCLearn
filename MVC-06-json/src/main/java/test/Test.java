package test;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import top.novashen.dao.User;

public class Test {
    public static void main(String[] args) throws JsonProcessingException {
        User syh = new User("SYH", " LOVE HLT");

        ObjectMapper objectMapper = new ObjectMapper();

        String s = objectMapper.writeValueAsString(syh);

        syh.setName("SYH");
        syh.setPassword(" LOVE HLT");

        System.out.println(s);
        System.out.println(syh);
    }
}
