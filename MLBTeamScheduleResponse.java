public class MLBTeamScheduleResponse {
         // i need a toString
         
            // public Game[] games;
            public MLBBody body;
         
   //to string to call mlbbody
   
@Override
   public String toString() {
      return body.toString() +
              '}';
   }

}