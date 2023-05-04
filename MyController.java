import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class MyController {
    @FXML
    private Label teamName;
    
    @FXML
    private Label currentDate;
    
    @FXML
    private Label startTime;
    
    
    
    public void initialize() {
      
        MLBTeamScheduleResponse response = MLBTeamSchedule.getResponse();
        
        teamName.setText(response.getBody().getTeam());
       
        
        Game[] schedule = response.getBody().getSchedule();
        
       
      if (schedule.length > 0) {
            currentDate.setText(schedule[0].getGameDate());
      
        }
        
       
        if (schedule.length > 1) {
       
       
            firstDate.setText(schedule[1].getGameDate());
     
        }
        
        if (schedule.length > 5) {
      
          
            sixthDate.setText(schedule[5].getGameDate());
    
 
  }
   
 }
}