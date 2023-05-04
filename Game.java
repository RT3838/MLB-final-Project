class Game {
    
    private String gameID;
    private String seasonType;
    private String away;
    private String gameTime;
    private String gameDate;
    private String teamIDHome;
    private String teamIDAway;
    private String home;
   
   
      
       public String getGameID() {
     
        return gameID;
    
    }

      
      public void setGameID(String gameID) {
         
         this.gameID = gameID;
    }

      
      public String getSeasonType() {
         
           return seasonType;
    
    
    }

    
    public void setSeasonType(String seasonType) {
      
          this.seasonType = seasonType;
    }

   
    public String getAway() {
   
        return away;
   
    }

       public void setAway(String away) {
   
        this.away = away;
    }

   
    public String getGameTime() {
   
        return gameTime;
       }

   
    public void setGameTime(String gameTime) {
           this.gameTime = gameTime;
   
    }

   
    public String getGameDate() {
           return gameDate;
    }

   
    public void setGameDate(String gameDate) {
           this.gameDate = gameDate;
    }

       public String getTeamIDHome() {
   
        return teamIDHome;
    }

    public void setTeamIDHome(String teamIDHome) {
   
        this.teamIDHome = teamIDHome;
    }

       public String getTeamIDAway() {
      
           return teamIDAway;
    
    }

      
      public void setTeamIDAway(String teamIDAway) {
      
        this.teamIDAway = teamIDAway;
    }

    public String getHome() {
    
        return home;
    
    }

    public void setHome(String home) {
    
        this.home = home;
      }

    @Override
    public String toString() {
        return "MLBGame{" +
                "gameID='" + gameID + '\'' +
                ", seasonType='" + seasonType + '\'' +
                ", away='" + away + '\'' +
                ", gameTime='" + gameTime + '\'' +
                ", gameDate='" + gameDate + '\'' +
                ", teamIDHome='" + teamIDHome + '\'' +
                ", teamIDAway='" + teamIDAway + '\'' +
                ", home='" + home + '\'' +
                '}';
    }


}