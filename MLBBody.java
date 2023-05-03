public class MLBBody {
   
   public String team;
   
   public Game[] schedule;
   // to string to call game tostring
   @Override
   public String toString() {
      StringBuilder sb = new StringBuilder();
      sb.append("MLBBody{");
      sb.append("team='").append(team).append('\'');
      sb.append(", schedule=[");
      for (int i = 0; i < schedule.length; i++) {
         sb.append(schedule[i].toString());
         if (i < schedule.length - 1) {
            sb.append(", ");
         }
      }
      sb.append("]}");
      return sb.toString();
   }
    }