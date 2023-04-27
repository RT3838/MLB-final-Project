class Game {
    
    private String gameTime;
    
    private String gameStatus;

          public String getGameTime() {
            
              return gameTime;
   
    }

          public void setGameTime(String gameTime) {
            
             this.gameTime = gameTime;
   
    }

    
      public String getGameStatus() {
        return gameStatus;
    }

    
    
    public void setGameStatus(String gameStatus) {
       
        this.gameStatus = gameStatus;
    }

          public String toString() {
            
            return "Time: " + gameTime + ", Status: " + gameStatus;
    
    }

}