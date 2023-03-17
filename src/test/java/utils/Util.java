package utils;

import org.json.simple.parser.ParseException;
import org.json.simple.JSONObject;
import java.io.FileReader;
import java.io.IOException;
import org.json.simple.parser.JSONParser;

public class Util {

    public JSONObject extractFromJSONFile(String filePath) throws IOException, ParseException {
        Object file = new JSONParser().parse(new FileReader(filePath));
        return (JSONObject) file;
    }
}
