import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import com.google.gson.Gson;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
     
     
      public class MLBTeamSchedule {
         
         
          public static void main(String[] args) throws Exception {
       
        HttpRequest request = HttpRequest.newBuilder()
                
                .uri(URI.create("https://tank01-mlb-live-in-game-real-time-statistics.p.rapidapi.com/getMLBTeamSchedule?teamAbv=CHW"))
               
                .header("X-RapidAPI-Key", "948121a9b1mshe3f3de56ea683cap17e72djsncf4dc795506f")
               
                .header("X-RapidAPI-Host", "tank01-mlb-live-in-game-real-time-statistics.p.rapidapi.com")
               
                .method("GET", HttpRequest.BodyPublishers.noBody())
               
               
                .build();


        HttpResponse<String> response = HttpClient.newHttpClient().send(request, HttpResponse.BodyHandlers.ofString());

       
        String responseBody = response.body();

       
      
        Gson gson = new Gson();
       
        MLBTeamScheduleResponse mlbTeamScheduleResponse = gson.fromJson(responseBody, MLBTeamScheduleResponse.class);

        
       
        System.out.println(mlbTeamScheduleResponse);
        
       
}
}
    
