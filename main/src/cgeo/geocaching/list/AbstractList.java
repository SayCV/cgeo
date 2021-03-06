package cgeo.geocaching.list;

import org.eclipse.jdt.annotation.Nullable;

import android.util.SparseArray;

public abstract class AbstractList {

    public final int id;
    public final String title;
    private final static SparseArray<AbstractList> LISTS = new SparseArray<>();

    public AbstractList(final int id, final String title) {
        this.id = id;
        this.title = title;
        LISTS.put(id, this);
    }

    public abstract String getTitleAndCount();

    public abstract boolean isConcrete();

    public abstract String getTitle();

    public abstract int getNumberOfCaches();

    @Nullable
    public static AbstractList getListById(int listId) {
        return LISTS.get(listId);
    }

}
