package hashTables;
import java.util.NoSuchElementException;

/**
 * this class extends FHhashQP class and takes on a second parameter KeyType
 * @param <KeyType>
 * @param <E>
 *
 * @author  Veronika Cabalova Joseph
 */

public class FHhashQPwFind<KeyType, E extends Comparable<KeyType> >
        extends FHhashQP<E>
{
    /**
     * paramenter taking constructor
     * @param tableSize of integer type
     */
    public FHhashQPwFind(int tableSize)
    {
        super(tableSize);
    }

    /**
     * this method returns the found object, if object is not found it
     * throws a java.util.NoSuchElementException
     * @param key of type KeyType for searching
     * @return found object or throws a java.util.NoSuchElementException
     */
    public E find(KeyType key)
    {
        int position = findPosKey(key);

        //check if state of array at specific position
        if (mArray[position].state != ACTIVE)
        {
            throw new NoSuchElementException();
        }
        return mArray[position].data;
    }

    /**
     * method called by findPosKey() which gets the hash value based on the key,
     * not on the object
     * @param key of type KeyType for searching
     * @return integer of hash key
     */
    protected int myHashKey(KeyType key)
    {
        int hashVal;

        hashVal = key.hashCode() % mTableSize;
        if(hashVal < 0)
            hashVal += mTableSize;

        return hashVal;
    }

    /**
     * method called by find() which finds the position based on the key,
     * not on the object
     * @param key of type KeyType for searching
     * @return integer of the position
     */
    protected int findPosKey(KeyType key)
    {
        int kthOddNum = 1;
        int index = myHashKey(key);

        while ( mArray[index].state != EMPTY
                && mArray[index].data.compareTo(key) != 0)
        {
            index += kthOddNum; // k squared = (k-1) squared + kth odd #
            kthOddNum += 2;     // compute next odd #
            if ( index >= mTableSize )
                index -= mTableSize;
        }
        return index;
    }
}
