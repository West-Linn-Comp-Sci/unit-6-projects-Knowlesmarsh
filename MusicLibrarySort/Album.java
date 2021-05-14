/**
 * Write a description of class Album here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Album
{
   private String name="none";
   private String artist="none";
   private int track=0;
   private double time=0.0;
   public Album(String nameT,String artistT,int trackT, double timeT){
    name = nameT;
    artist = artistT;
    track= trackT;
    time = timeT;
    }
    public String getName(){
        return this.name;
    }
    public String getArtist(){
        return this.artist;
    }
    public int getTrack(){
        return this.track;
    }
    public double getTime(){
        return this.time;
    }
}