package neu.atp.domain;

import io.micronaut.core.annotation.Creator;
import io.micronaut.core.annotation.Introspected;

@Introspected
public class NameDTO {

    private final String name;

    @Creator
    public NameDTO(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
