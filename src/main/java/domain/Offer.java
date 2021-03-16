package domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor

public class Offer implements Comparable <Offer> {

    private int id;
    private int price;
    private String from;
    private String to;
    private int duration;

    @Override
    public int compareTo (Offer o) {
        return this.price - o.price;
    }

}
