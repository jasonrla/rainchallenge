package utils;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

import java.util.List;

public class Variables {

    public static final String user = "jason.lopez";
    public static String path = "src/test/resources/payloads/Articles.json";

    public static JSONObject jsonObject;
    public static String category;
    public static String description;
    public static String totalPosts;
    public static String visiblePosts;
    public static JSONArray postsList;

    public static List<String> extractedData;
    public static String author;
    public static String publicationDate;
    public static String readingTime;

}