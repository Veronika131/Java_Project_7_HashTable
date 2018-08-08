project folder:
Veronika131-cs1c-project07/


Brief description of submitted files:


docs/
    -   JavaDocs folder based on source code

lib/
    -   library folder with json-simple-1.1.1.jar file that's used for parsing JSON file.



src/cs1c/MillionSongDataSubset.java
    -   Parses a JSON data set and stores each entry in an array.

src/cs1c/SongEntry.java
    -   Stores a simplified version of the genre data set from the Million Song Dataset.

src/cs1c/TimeConverter.java
    -   Converts duration into a string representation.



src/hashTables/FHhashQP.java
    -   Hash table class based on quadratic probing.

src/hashTables/FHhashQPwFind.java
    -   This class extends FHhashQP class and takes on a second parameter KeyType.

src/hashTables/HashEntry.java
    -   New data type that acts as the underlying type for the array and it includes a state member.

src/hashTables/MyTunes.java
    -   Tests the functionality of FHhashQPwFind.java.

src/hashTables/SongCompInt.java
    -   Wrapper class for SongEntry object used to compare objects based on song int id field.

src/hashTables/SongCompGenre.java
    -   Wrapper class for a SongEntry object used to compare objects based on the songs String genre field.

src/hashTables/TableGenerator.java
    -   Class that creates and populates two hash tables of type FHhashQPwFind.



resources/findEmptyGenres.txt
    -   Testing file for hashing based on genres names with empty genre.

resources/findEmptyIDs.txt
    -   Testing file for hashing based on IDs with empty ID.

resources/findGenres.txt
    -   Test file for hashing based on genres names.

resources/findIDs.txt
    -   Test file for hashing based on IDs.

resources/findNonexistentGenres.txt
    -   Test file for hashing based on nonexistent genres names.

resources/findNonexistentIDs.txt
    -   Test file for hashing based on nonexistent IDs.

resources/findRepeatedGenres.txt
    -   Test file for hashing based on repeated genres names.

resources/findRepeatedIDs.txt
    -   Test file for hashing based on repeated IDs.

resources/music_genre_subset.json
    -   Input data file that holds over 59600 songs used by FoothillTunesStore.java.

resources/RUN.txt
    -   Various test outputs of MyTunes class that tests functionality of FHhashQPwFind.java.



.gitignore
    -   .gitignore content tells git to ignore specified things.

README.txt
    -   Description of submitted files.