package io.portfolio;

public final class DomainReviewTest {
    public static void main(String[] args) {
        var item = new DomainReview.Item(44, 21, 10, 92);
        if (DomainReview.score(item) != 171) throw new AssertionError("domain score mismatch");
        if (!DomainReview.lane(item).equals("ship")) throw new AssertionError("domain lane mismatch");
    }
}
