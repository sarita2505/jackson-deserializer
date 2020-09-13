package utils;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.Module;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.module.SimpleModule;

import java.io.IOException;
import java.io.InputStream;
import java.io.Reader;
import java.util.Objects;

public class EmpObjectMapper {
    private static final ObjectMapper mapper = new ObjectMapper();

    static {

    }
    public static String toJson(Object o) {
        String s = null;
        try {
            s = mapper.writeValueAsString(o);
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }
        return s;
    }

    public static <T> T toObject(Reader reader, Class<T> cls) {
        try {
            return mapper.readValue(reader, cls);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static <T> T toObject(InputStream stream, Class<T> cls) {
        try {
            return mapper.readValue(stream, cls);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static <T> T toObject(String stream, Class<T> cls) {
        try {
            return mapper.readValue(stream, cls);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
