public class MusicLibrary
{
    private int counter=0;
    Album[] Library = new Album[10];
    Album[] Library2 = new Album[10];
    Album[] Library3 = new Album[10];
    public MusicLibrary(){
        for(int i=0;i<Library.length;i++){
            Library[i]=new Album("none","none",0,0.0);
        }
        for(int i=0;i<Library2.length;i++){
            Library2[i]=new Album("none","none",0,0.0);
        }
    }
    public void add(Album target){
        Library[counter]=target;
        counter++;
    }
    public void doubleSize(){
        
        for(int i=0;i<Library.length;i++){
            Library2[i]=Library[i];
        }
        Library = Library2;
    }
    public void remove(int target){
        Library[target]=new Album("none","none",0,0.0);
    }
    public String toString(){
        String output ="";
        for(int i=0; i<Library.length;i++){
            output+="\n"+this.Library[i].getName()+":"+this.Library[i].getArtist()+":"+this.Library[i].getTrack()+":"+this.Library[i].getTime();
        }
        return output;
    }
    public String findTitle1(String target){
        for(int i=0; i<Library.length; i++){
            if(Library[i].getName().equals(target)){
            return "The target album is in the "+i+" position";
            }
        }
        return "No album found";
    }
    public String findArtist1(String target){
        for(int i=0; i<Library.length; i++){
            if(Library[i].getArtist().equals(target)){
                return "The target album is in the "+i+" position";
            }
        }
        return "No album found";
    }
    public void sortTitle(String target){
        //create temp for the Album transfer later
        Album temp;
            for(int j=0; j<Library.length;j++){
                //j acts as a counter for which spot we're on and allows us to loop :) 
                //min value will store the index of the lowest value at the moment
                int min=j;
                //Get and assign the index of the smallest value to min
                for(int i=j; Library.length>i;i++){
                    if(Math.abs(Library[min].getName().compareTo(target))>Math.abs(Library[i].getName().compareTo(target))){
                        min=i;
                    }
                }          
                //switch
                temp=Library[j];
                Library[j]=Library[min];
                Library[min]=temp;
        }
    }
    public void sortArtist(String target){
        //create a holder to use for switching
        Album holder;
        //test the first value
        if(Math.abs(Library[0].getArtist().compareTo(target))>Math.abs(Library[1].getArtist().compareTo(target))){
            //switch them
            holder = Library[0];
            Library[0]=Library[1];
            Library[1]=holder;
        }
        //create repeat process for each values pickup/insertion
        for(int i=2; i<Library.length;i++){
            //grab the next Album and begin sort
            holder=Library[i];
            //create Loop for the checking
            for(int j=i; j>0;j--){
                if(Math.abs(Library[j-1].getArtist().compareTo(target))>Math.abs(Library[j].getArtist().compareTo(target))){
                    holder = Library[j-1];
                    Library[j-1]=Library[j];
                    Library[j]=holder;
                }else{
                    break;
                }
            }   
        }
    }
    public int binaryArtist(String target){
        sortArtist(target);
        int location;
        boolean found=false;
        int i=Library.length/2;
        for(int j=0; j<5; j++){
            int value = Library[i].getName().compareTo(target);
            if(value<0){
                i= (i/2)-1;
                if(i<0){
                    i=0;
                }
            }
            if(value>0){
                i=(i*3/2)+1;
                if(i>10){
                    i=10;
                }
            }
            if(value==0){
                break;
            }
        }
        return i;
    }
}