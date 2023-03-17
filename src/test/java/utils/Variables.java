package utils;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

import java.util.List;

public class Variables {

    public static final String user = "jason.lopez";
    public static String MainScreenPath = "src/test/resources/data/MainScreen.json";
    public static String PostDetailsPath = "src/test/resources/data/PostDetails.json";
    public static String CategoryDetailsPath = "src/test/resources/data/CategoryDetails.json";
    public static String SearchPath = "src/test/resources/data/Search.json";

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