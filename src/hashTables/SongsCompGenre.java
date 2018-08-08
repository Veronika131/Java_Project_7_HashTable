package hashTables;
import cs1c.SongEntry;
import java.util.ArrayList;

/**
 * this is a wrapper class for a SongEntry object used to compare objects
 * based on the songs String genre field.
 *
 * @author Veronika Cabalova Joseph
 */
public class SongsCompGenre implements Comparable<String>
{
    //name of the genre
    private String songGenre;

    //attribute for all the songs in specified genre
    private ArrayList<SongEntry> songEntryObject;

    /**
     * class default constructor
     */
    public SongsCompGenre()
    {
        songGenre = "unknown";
        songEntryObject = new ArrayList<SongEntry>();
    }

    /**
     * class constructor
     * @param genre of type String
     * @param song of type SongEntry
     */
    public SongsCompGenre(String genre, SongEntry song)
    {
        this();
        this.songGenre = genre;
        addSong(song);
    }

    /**
     * this method overrides compareTo()
     * @param compareString
     * @return integer value
     */
    public int compareTo(String compareString)
    {
        return songGenre.compareTo(compareString);
    }

    /**
     * this method overrides equals()
     * @param rhs of type SongsCompGenre
     * @return boolean value true or false
     */
    public boolean equals(SongsCompGenre rhs)
    {
        return songEntryObject.equals(rhs.songEntryObject);
    }

    /**
     * this method overrides hashCode()
     * @return integer value
     */
    public int hashCode()
    {
        return songGenre.hashCode();
    }

    /**
     * this method overrides toString()
     * @return string value
     */
    public String toString()
    {
        return songEntryObject.toString();
    }

    /**
     * this method adds a song to the list of songs
     * @param songToAdd SongEntry type
     */
    void addSong(SongEntry songToAdd)
    {
        songEntryObject.add(songToAdd);
    }

    /**
     * getter method for songGenre attribute
     * @return songGenre of type String
     */
    public String getName()
    {
        return songGenre;
    }

    /**
     * getter method for songEntryObject
     * @return songEntryObject of type ArrayList
     */
    public ArrayList<SongEntry> getData()
    {
        return songEntryObject;
    }
}
