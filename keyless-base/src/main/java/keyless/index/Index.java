package keyless.index;

import keyless.api.Procedure;

import java.util.Iterator;
import java.util.function.Function;

/**
 * Created by georg on 1/26/2016.
 */
public interface Index<T> {

    public int put(T value);

    public Object get(T key);

    public Object getFirst();

    public boolean foreach(Procedure proc);

    public <V> Index<V> transform(Function<T, V> f);

    public Iterator<T> iterator();
}
