package v0;

/**
 * Created by chandresh.pancholi on 24/07/16.
 */
public class HashMap {
    private static final int SIZE = 16;
    private Entry table[] = new Entry[SIZE];

    class Entry {
        final String key;
        String value;
        Entry next;

        Entry(String key, String value){
            this.key = key;
            this.value = value;
        }

        public String getValue() {
            return this.value;
        }
        public void setValue(String value){
            this.value = value;
        }

        public String getKey() {
            return this.key;
        }
    }

    public void put(String key, String value) {
        int hash = Math.abs(key.hashCode())%SIZE;

        Entry e = table[hash];

        if (e != null) {
            if (e.key.equals(key)){
                e.value = value;
            }else {
                while (e.next != null) {
                    e = e.next;
                }
                Entry oldBucket = new Entry(key ,value);
                e.next = oldBucket;
            }
        } else {
            Entry entry = new Entry(key, value);
            table[hash] = entry;
        }
    }

    public String get(String key) {
        int hash = Math.abs(key.hashCode()%SIZE);
        Entry e = table[hash];

        while (e != null) {
            if (e.key.equals(key)) {
                return e.value;
            }
            e = e.next;
        }
        return null;
    }
    public static void main(String []args) {
        HashMap hm = new HashMap();
        hm.put("chandresh" , "pancholi");
        hm.put("virat","kohli");
        hm.put("sachin", "tendulkar");
        hm.put("virat","sharma");

        System.out.println(hm.get("virat"));

    }
}
