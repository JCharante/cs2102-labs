public class EventGuests {
    ______ guests;



    EventGuests(_____ guests) {

        this.guests = guests;

    }



    // record a new guest as coming (add the guest to the set)

    void addGuest(String newGuestName) {

        this.guests = ....;

    }



    // check whether a guest is coming (use hasElt() to see if
    // the guest is in the set)

    boolean isComing(String name) {

        return ...;

    }

    // return the number of guests in the guest list
    int numGuests(){

        return ...;

    }
}
