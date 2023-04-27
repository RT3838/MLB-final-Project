      
      public class MLBTeamScheduleResponse {
         // i need a toString
         
            public Game[] games;
          @Override
   
   
    public String toString() {
        
        StringBuilder sb = new StringBuilder();
      
        sb.append("Games: ");
        
          for (Game game : games) {
           
            sb.append(game.toString());
       
       
        }
        
        return sb.toString();
    
    }

}
    



   
  