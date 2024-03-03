package ModuleSynchronization.ThreadSafe;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ThreadSafeArrayListManager<T> {
    private final List<T> arrayList;

    public ThreadSafeArrayListManager() {
        arrayList = Collections.synchronizedList(new ArrayList<>());
    }

    public void addElement(T element) {
        synchronized (arrayList) {
            arrayList.add(element);
        }
    }

    public int getSize() {
        synchronized (arrayList) {
            return arrayList.size();
        }
    }

    public void removeElement(T element) {
        synchronized (arrayList) {
            arrayList.remove(element);
        }
    }
}
