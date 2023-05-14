import java.util.ArrayList;
import java.util.List;
public class MyHashTable <K, V> {
    private static final int default_capacity = 16;
    private List<List<Entry<K, V>>> buckets;
    private int size;
    public MyHashTable() {
        buckets = new ArrayList<>(default_capacity);
        for (int i = 0; i < default_capacity; i++)
    }
}
