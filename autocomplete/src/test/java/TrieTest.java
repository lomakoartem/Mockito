/**
 * Created by Artem_Lomako on 3/18/2016.
 */

import org.junit.Test;

import static org.junit.Assert.*;

public class TrieTest {


    @Test
    public void testContains() {

        Trie trie = new RWayTrie();
        trie.add(new Tuple("test", "test".length()));
        assertTrue(trie.contains("test"));
    }

    @Test
    public void testSize() {

        Trie trie = new RWayTrie();
        trie.add(new Tuple("test", "test".length()));
        assertEquals(trie.size(), 1);
    }

    @Test
    public void testDelete() {

        Trie trie = new RWayTrie();
        trie.add(new Tuple("test", "test".length()));
        trie.delete("test");
        assertFalse(trie.contains("test"));
    }

    @Test
    public void testDelete_IsDeleteDecrementSize() {

        Trie trie = new RWayTrie();
        trie.add(new Tuple("test", "test".length()));
        trie.delete("test");
        assertFalse(trie.contains("test"));
    }

    @Test
    public void checkThatTrieContainsWordInRWAyTrie() {

        RWayTrie rWayTrie = new RWayTrie();
        rWayTrie.add(new Tuple("test", 4));
        rWayTrie.add(new Tuple("testt", 5));
        assertTrue(rWayTrie.contains("testt"));
    }

    @Test
    public void checkThatTrieDoesntContainsWordInRWayTrie() {
        RWayTrie rWayTrie = new RWayTrie();
        rWayTrie.add(new Tuple("test", 4));
        rWayTrie.add(new Tuple("testt", 5));
        assertFalse(rWayTrie.contains("noTest"));
    }

}