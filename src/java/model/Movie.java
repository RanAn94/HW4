
package model;

public class Movie 
{
    private String movieName;
    private String directorName;
    private int publishYear;
    private String movieType;
    private String mainActor;
    private int code;

    public Movie() {
        this.movieName = "";
        this.directorName = "";
        this.publishYear = 0;
        this.movieType = "";
        this.mainActor = "";
        this.code = 0;
    }   
    
    public Movie(String movieName, String directorName, int publishYear, String movieType, String mainActor, int code) {
        this.movieName = movieName;
        this.directorName = directorName;
        this.publishYear = publishYear;
        this.movieType = movieType;
        this.mainActor = mainActor;
        this.code = code;
    }

    public String getMovieName() {
        return movieName;
    }

    public void setMovieName(String movieName) {
        this.movieName = movieName;
    }

    public String getDirectorName() {
        return directorName;
    }

    public void setDirectorName(String directorName) {
        this.directorName = directorName;
    }

    public int getPublishYear() {
        return publishYear;
    }

    public void setPublishYear(int publishYear) {
        this.publishYear = publishYear;
    }

    public String getMovieType() {
        return movieType;
    }

    public void setMovieType(String movieType) {
        this.movieType = movieType;
    }

    public String getMainActor() {
        return mainActor;
    }

    public void setMainActor(String mainActor) {
        this.mainActor = mainActor;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    @Override
    public String toString() {
        return "Movie{" + "movieName=" + movieName + ", directorName=" + directorName + ", publishYear=" + publishYear + ", movieType=" + movieType + ", mainActor=" + mainActor + ", code=" + code + '}';
    }
      
}
    

