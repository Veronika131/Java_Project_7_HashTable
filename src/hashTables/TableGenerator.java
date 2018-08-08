package hashTables;
import cs1c.SongEntry;
import java.util.ArrayList;

/**
 * this class creates and populates two hash tables of type
 * FHhashQPwFind class
 *
 * @author Veronika Cabalova Joseph
 */
public class TableGenerator
{
    //hash table based on SongCompInt
    private FHhashQPwFind<Integer, SongCompInt> tableOfSongIDs;


    //hash table based on SongsCompGenre
    private FHhashQPwFind<String, SongsCompGenre> tableOfSongGenres;


    private ArrayList<String> genreNames = new ArrayList<>();

    /**
     * this method populates the tableOfIDs for comparing songs
     * based on their SongCompInt value
     * @param allSongs of type SongEntry
     * @return object FHhashQPwFind
     */
    public FHhashQPwFind<Integer, SongCompInt> populateIDtable(SongEntry[] allSongs)
    {
        tableOfSongIDs = new FHhashQPwFind<>(allSongs.length);

        for(int i = 0; i < allSongs.length; i++)
        {
            SongCompInt songToPopulate = new SongCompInt(allSongs[i]);
            tableOfSongIDs.insert(songToPopulate);
        }
        return tableOfSongIDs;
    }

    /**
     * this method populates the tableOfGenres hash table and ArrayList of genre names
     * @param allSongs of type SongEntry
     * @return object FHhashQPwFind
     */
    public FHhashQPwFind<String, SongsCompGenre> populateGenreTable(SongEntry[] allSongs)
    {
        tableOfSongGenres = new FHhashQPwFind<>(allSongs.length);

        for(int i = 0; i < allSongs.length; i++)
        {
            try
            {
                SongsCompGenre genre = tableOfSongGenres.find(allSongs[i].getGenre());
                genre.addSong(allSongs[i]);
            }
            catch (Exception e)
            {
                SongsCompGenre song = new SongsCompGenre(allSongs[i].getGenre(),allSongs[i]);
                tableOfSongGenres.insert(song);
                genreNames.add(allSongs[i].getGenre());
            }
        }
        return tableOfSongGenres;
    }

    /**
     * getter for list of genre name
     * @return genreNames ArrayList
     */
    public ArrayList<String> getGenreNames()
    {
        return genreNames;
    }
}
