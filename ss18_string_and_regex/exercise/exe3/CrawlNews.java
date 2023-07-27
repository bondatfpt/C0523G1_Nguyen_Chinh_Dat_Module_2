package ss18_string_and_regex.exercise.exe3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CrawlNews {
    private static final String REGEX_NEWS_LIST = "<h3.*?</h3>";
    public static void main(String[] args) throws IOException {
        URL link = new URL("https://dantri.com.vn/the-gioi.htm");
        URLConnection connection = link.openConnection();
        BufferedReader reader = new BufferedReader(new InputStreamReader(connection.getInputStream()));
        StringBuilder dataLine = new StringBuilder();
        String line;
        while ((line = reader.readLine()) != null) {
            dataLine.append(line);
        }
        Pattern pattern = Pattern.compile(REGEX_NEWS_LIST);
        Matcher matcher = pattern.matcher(dataLine);
        ArrayList<String> newsList = new ArrayList<>();
        while (matcher.find()) {
            newsList.add(matcher.group());
        }
        String[] temp;
        List<String> resultList = new ArrayList<>();
        for (String str : newsList) {
            temp = str.split("htm\">");
            resultList.add(temp[1].substring(0, temp[1].length() - 9));
        }
        for (String str : resultList) {
            System.out.println(str.replaceAll("&quot;", "\"").trim());
        }
    }
}