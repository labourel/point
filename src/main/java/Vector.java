import java.util.Arrays;

/**
 * La classe <code>Vector</code> implémente un tableau d'entiers
 * de taille dynamique. Les éléments du vecteur sont stockés dans un tableau.
 * La taille de ce tableau est au minimum doublée à chaque fois qu'il est
 * nécessaire de le faire grossir.
 */
public class Vector {

    /**
     * Tableau permettant de stocker les éléments du vecteur.
     * Seuls les <code>size</code> premiers éléments font partie du vecteur.
     * La taille de ce tableau est égale à la capacité du vecteur, c'est-à-dire,
     * au nombre d'éléments maximum que le vecteur peut contenir sans
     * avoir besoin d'allouer un nouveau tableau.
     */
    private int[] elements;

    /**
     * Nombre d'éléments présents dans le vecteur.
     */
    private int size;

    /**
     * Construit un vecteur de capacité initiale <code>initialCapacity</code>.
     *
     * @param initialCapacity Capacité initiale du vecteur
     */
    public Vector(int initialCapacity) {
        this.elements = new int[initialCapacity];
        this.size = 0;
    }
    /**
     * Construit un vecteur de capacité initiale <code>10</code>.
     */
    public Vector() {
        this(10);
    }

    /**
     * Augmente la capacité du vecteur si nécessaire de façon
     * à permettre le stockage d'au moins <code>minCapacity</code>
     * éléments. S'il est nécessaire d'augmenter la capacité du vecteur,
     * elle est au minimum doublée.
     *
     * @param minCapacity Capacité minimale à assurer
     */
    public void ensureCapacity(int minCapacity) {
        int oldCapacity = elements.length;
        if (oldCapacity >= minCapacity) return;
        int newCapacity = Math.max(oldCapacity * 2, minCapacity);
        elements = Arrays.copyOf(elements, newCapacity);
    }

    public void resize(int newSize) {
        ensureCapacity(newSize);
        this.size = newSize;
        for (int index = size; index <capacity(); index++){
            elements[index] = 0;
        }
    }

    /**
     * Retourne la capacité du vecteur.
     *
     * @return Capacité du vecteur.
     */
    public int capacity() {
        return elements.length;
    }

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public void add(int element) {
        size += 1;
        if (size > capacity()){
            ensureCapacity(size);
        }
        set(size-1, element);
    }

    public void set(int index, int element) {
        if (! indexIsInBounds(index))
            return;
        elements[index] = element;
    }

    public int get(int index) {
        if (!indexIsInBounds(index))
            return 0;
        return elements[index];
    }

    private boolean indexIsInBounds(int index){
        return index >= 0 && index < this.size;
    }

}
