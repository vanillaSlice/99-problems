package problems;

import java.util.List;
import java.util.Random;

import static java.util.Objects.requireNonNull;
import static java.util.stream.Collectors.toList;

class P23 {

    static <T> List<T> randomSelect(final List<T> list, final int n) {
        requireNonNull(list, "list cannot be null");

        return new Random().ints(n, 0, list.size()).mapToObj(list::get).collect(toList());
    }

}
