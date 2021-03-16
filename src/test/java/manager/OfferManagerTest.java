package manager;

import domain.Offer;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.*;

class OfferManagerTest {
    OfferManager manager = new OfferManager();
    Offer offerFirst = new Offer(1, 30000, "DME", "ACD", 12);
    Offer offerSecond = new Offer(2,10000, "DME", "AGP", 4);
    Offer offerThird = new Offer(3, 15000, "AGP", "DME", 5);
    Offer offerForth = new Offer(4, 50000, "AWN", "DME", 20);
    Offer offerFifth = new Offer(5, 44000, "DME", "AWN", 20);
    Offer offerSixth = new Offer(6, 99000, "DME", "AWN", 20);
    Offer offerSeventh = new Offer(7, 36000, "DME", "DJB", 12);
    Offer offerEighth = new Offer(8, 15000, "DJB", "AWN", 6);
    Offer offerNineth = new Offer(9, 55001, "DME", "AWN", 20);
    Offer offerTenth = new Offer(10, 12000, "DME", "ACD", 12);
    Offer offerEleventh = new Offer(11, 13300, "DME", "DJB", 12);


    @BeforeEach
    public void setUp() {
        manager.add(offerFirst);
        manager.add(offerSecond);
        manager.add(offerThird);
        manager.add(offerForth);
        manager.add(offerFifth);
        manager.add(offerSixth);
        manager.add(offerSeventh);
        manager.add(offerEighth);
        manager.add(offerNineth);
        manager.add(offerTenth);
        manager.add(offerEleventh);
    }

    @Test
    public void shouldFindbyToAndFromAndSortByPrice() {
        Offer[] expected = {offerFifth, offerNineth, offerSixth};
        Offer[] actual = manager.findByAirport("AWN", "DME");
        assertArrayEquals(expected, actual);
    }
}