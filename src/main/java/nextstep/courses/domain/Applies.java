package nextstep.courses.domain;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

public class Applies {

    private final List<Apply> applies;

    public Applies() {
        this(new ArrayList<>());
    }

    public Applies(List<Apply> applies) {
        this.applies = applies;
    }

    public void add(Apply apply) {
        this.applies.add(apply);
    }

    public boolean isApprovalCountLessThan(int count) {
        return approvals().size() < count;
    }

    private List<Apply> approvals() {
        return this.applies.stream()
            .filter(Apply::isApproval)
            .collect(Collectors.toList());
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Applies)) return false;
        Applies applies1 = (Applies) o;
        return Objects.equals(applies, applies1.applies);
    }

    @Override
    public int hashCode() {
        return Objects.hash(applies);
    }

    @Override
    public String toString() {
        return "Applies{" +
            "applies=" + applies +
            '}';
    }
}