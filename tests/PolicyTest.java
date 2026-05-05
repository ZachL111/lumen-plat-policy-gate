package io.portfolio;

public final class PolicyTest {
    public static void main(String[] args) {
        var signalcase_1 = new Policy.Signal(88, 96, 17, 14, 12);
        if (Policy.score(signalcase_1) != 164) throw new AssertionError("score mismatch");
        if (!Policy.classify(signalcase_1).equals("accept")) throw new AssertionError("decision mismatch");
        var signalcase_2 = new Policy.Signal(62, 97, 12, 9, 9);
        if (Policy.score(signalcase_2) != 152) throw new AssertionError("score mismatch");
        if (!Policy.classify(signalcase_2).equals("review")) throw new AssertionError("decision mismatch");
        var signalcase_3 = new Policy.Signal(93, 82, 13, 13, 13);
        if (Policy.score(signalcase_3) != 177) throw new AssertionError("score mismatch");
        if (!Policy.classify(signalcase_3).equals("accept")) throw new AssertionError("decision mismatch");
    }
}
