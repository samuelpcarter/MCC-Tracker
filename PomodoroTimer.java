public class PomodoroTimer {
    private int workDuration; 
    private int breakDuration; 
    private int remainingTime; 
    private int sessionCount;
    private int volume;
    
    private boolean isRunning;
    private boolean workSession;
    
    private double progress;

    private String alarmSound;

    //working on pomodoro branch
    
    /**
     * Methods: 
     *  public void start() //starts the countdown. Uses the running variable sets it to true and can probably outprint a
     * message to tell user that the timer has started. 
     * public void pause() //stops countdown and sets running to false. Also outprints a message to tell user the timer has 
     * stopped.    
     * public void reset() //resets the timer meaning remainingTime and progress are both reset as well. running is changed to
     * false. Outprints message telling user the timer is reset. 
     * public void tick() //uses if statements to check whether timer is running and time left. Then decreases remainingTime and
     * updates progress. A second if statement is used to check if the timer has reached zero, if so it calls the switchSession
     * method to begin next session.
     *  
     */

}
