package nextstep.ladder.domain;

import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;

public class Participants implements Iterable<Participant> {
    private List<Participant> participantList;

    public Participants(List<String> names) {
        this.participantList = names.stream()
                .map(Participant::new)
                .collect(Collectors.toList());
    }

    public int size() {
        return participantList.size();
    }

    @Override public Iterator<Participant> iterator() {
        return participantList.iterator();
    }
}