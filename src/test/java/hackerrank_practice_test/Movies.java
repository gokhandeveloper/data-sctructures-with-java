package hackerrank_practice_test;

import org.junit.jupiter.api.Test;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import com.google.gson.*;
public class Movies {

    @Test
    public void nothing() {

       // System.out.println(result);
        String [][] array = new String[10][10];
        array[0][0]="harry";
        array[0][1]="imbd";
        System.out.println(Arrays.deepToString(array));
        List<String> imdbs = new ArrayList<>();
        List<List<String>> resultListOfLists = new ArrayList<>();



      //  List<String> result = new ArrayList<>();
     //   result.add("not sure");
      //  System.out.println(result);
      //  System.out.println(resultListOfLists);
    }

    @Test
    public void getMovies() {

        int year = 2000;
        String query= "harry*";
        List<List<String>> result = fetchResult(year, query);
        System.out.println(result);
    }
    private List<List<String>> fetchResult(int year, String query) {

        String response;
        String yearString = String.valueOf(year);
        int startPage = 1;
        int totalPages = Integer.MAX_VALUE;
        String startPageString = String.valueOf(startPage);

        List<List<String>> result = new ArrayList<>();
        while (startPage <= totalPages) {
            try {
                URL obj = new URL("https://jsonmock.hackerrank.com/api/movies?Year=" + yearString + "&title=" + query + "&page=" + startPage);
                HttpURLConnection con = (HttpURLConnection) obj.openConnection();
                con.setRequestMethod("GET");
                BufferedReader in = new BufferedReader(new InputStreamReader(con.getInputStream()));
                while ((response = in.readLine()) != null) {
                    JsonObject convertedObject = new Gson().fromJson(response, JsonObject.class);
                    totalPages = convertedObject.get("total_pages").getAsInt();
                    System.out.println(totalPages);
                    JsonArray data = convertedObject.getAsJsonArray("data");
                    for (int i = 0; i < data.size(); i++) {
                        String title = data.get(i).getAsJsonObject().get("Title").getAsString();
                        String imdb = data.get(i).getAsJsonObject().get("imdbID").getAsString();
                        if(title.startsWith("Harry")) {
                            List<String> titles = new ArrayList<>();
                            titles.add(title);
                            titles.add(imdb);
                            result.add(titles);
                        }
                    }
                }
                in.close();
                startPage++;
            } catch (Exception ex) {
                ex.printStackTrace();
            }

        }
       // result.get(0).add();
      //  result.add(titles);
        return result;

    }

    @Test
    public void titleMatcherTest() {
        System.out.println(titleMatcher("harry*", "Harry Saltzman: Showman"));
        System.out.println(titleMatcher("harry", "Harry"));
        System.out.println(titleMatcher("waterworld", "Waterworld"));
        System.out.println(titleMatcher("*grandma", "Spider and Grandma"));
        System.out.println(titleMatcher("harry*", "Wild About Harry"));
    }
    private Boolean titleMatcher(String query, String toTest) {
        if(toTest.toLowerCase()
                .matches("(.*^)"+query.toLowerCase().replace("*", "")+"(.*)")){
            return true;
        }
        return false;

    }
}
