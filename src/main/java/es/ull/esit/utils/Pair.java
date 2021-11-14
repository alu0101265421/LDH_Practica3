package es.ull.esit.utils;
import java.util.Objects;

/**
 *
 * @class Pair
 * @brief Class to represent a generic pair of objects
 *
 */
public class Pair<F, S> {
    public final F first;
    public final S second;

    /**
     * @brief Constructor
     */
    public Pair(F first, S second) {
        this.first = first;
        this.second = second;
    }

    /**
     * @brief Check is a pair is equal to another
     * @return boolean
     */
    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Pair)) {
            return false;
        }
        Pair<?, ?> p = (Pair<?, ?>) o;
        return Objects.equals(p.first, first) && Objects.equals(p.second, second);
    }

    /**
     * @brief HashCode of the pair
     * @return int
     */
    @Override
    public int hashCode() {
        return (first == null ? 0 : first.hashCode()) ^ (second == null ? 0 : second.hashCode());
    }

    /**
     * @brief Creates a new pair
     * @return Pair
     */
    public static <A, B> Pair <A, B> create(A a, B b) {
        return new Pair<A, B>(a, b);
    }
}
