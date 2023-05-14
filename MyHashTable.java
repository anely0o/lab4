import java.util.ArrayList;
import java.util.List;
public class MyHashTable <K, V> {
    private class HashNode<K, V> {
        private K key;
        private V value;
        private HashNode<K, V> next;
}