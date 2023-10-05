package session15_equalsAndHashcodeAndGenerics.challenges.xml_to_json;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;

import java.io.File;
import java.io.IOException;
public class XmlToJson {
    public static void main(String[] args) {

        convertToJson("src/session15/challenges/xml_to_json/book.xml",
                "src/session15/challenges/xml_to_json/book.json");

    }

    private static void convertToJson(String xmlFilePath, String jsonFilePath){
        try {
            XmlMapper xmlMapper = new XmlMapper();
            JsonNode rootNode = xmlMapper.readTree(new File(xmlFilePath));
            ObjectMapper jsonMapper = new ObjectMapper();
            jsonMapper.writeValue(new File(jsonFilePath), rootNode);
        } catch (IOException exception) {
            exception.printStackTrace();
        }
    }

}



