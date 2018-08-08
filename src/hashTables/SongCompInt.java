package hashTables;
import cs1c.SongEntry;
/**
 * this is a wrapper class for SongEntry object used to compare
 * objects based on song int id field
 *
 * @author Veronika Cabalova Joseph
 */
public class SongCompInt implements Comparable<Integer>
{
    //a single SongEntry object as the attribute
    private SongEntry songEntryObject ;

    /**
     * class constructor
     * @param song of type SongEntry
     */
    public SongCompInt(SongEntry song)
    {
        songEntryObject = song;
    }

    /**
     * default constructor
     */
    public SongCompInt()
    {
        songEntryObject = null;

    }

    /**
     * this method overrides compareTo()
     * @param key integer
     * @return integer value
     */
    public int compareTo(Integer key)
    {
        return songEntryObject.getID() - key;
    }

    /**
     * this method overrides equals()
     * @param rhs
     * @return boolean value true or false
     */
    public boolean equals(SongCompInt rhs)
    {
        return songEntryObject.equals(rhs.songEntryObject);
    }

    /**
     * this method overrides hashCode()
     * @return integer value
     */
    public int hashCode()
    {
        return songEntryObject.getID();
    }

    /**
     * this method overrides toString()
     * @return string value
     */
    public String toString()
    {
        return songEntryObject.toString();
    }
}
