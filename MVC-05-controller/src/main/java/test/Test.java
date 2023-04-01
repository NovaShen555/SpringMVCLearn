package test;

import com.fasterxml.jackson.databind.ObjectMapper;
import top.novashen.dao.User;

public class Test {

    public static void main(String[] args) {
        User syh = new User("SYH", " LOVE HLT");

        // syh.setName("SYH");
        // syh.setPassword(" LOVE HLT");

        System.out.println(syh);
    }
}
