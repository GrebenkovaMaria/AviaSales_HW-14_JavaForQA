package manager;

import domain.Offer;

import java.util.Comparator;

public class TicketByPriceAscComparator implements Comparator<Offer> {
    public int compare(Offer o1, Offer o2){
        return o1.getDuration() - o2.getDuration();
    }
}
