import java.util.List;
import java.util.stream.Collectors;

 class PassengerFilter {

    // Filter passengers by class
    public static String filterByPclass(String passengers, int pclass) {
        if (pclass == 0) {
            return passengers; // No filter, return all classes
        }
        return passengers;
    }

    // Filter passengers by passenger ID range
    public static List<Passenger> filterByPassengerIdRange(List<Passenger> passengers, Integer minId, Integer maxId) {
        return passengers.stream()
                .filter(p -> (minId == null || p.getPassengerId() >= minId) &&
                        (maxId == null || p.getPassengerId() <= maxId))
                .collect(Collectors.toList());
    }

    // Filter passengers by name substring
    public static List<Passenger> filterByName(List<Passenger> passengers, String nameSubstring) {
        if (nameSubstring == null || nameSubstring.isEmpty()) {
            return passengers; // No filter, return all passengers
        }
        return passengers.stream()
                .filter(p -> p.getFormattedName().toLowerCase().contains(nameSubstring.toLowerCase()))
                .collect(Collectors.toList());
    }

    // Filter passengers by sex
    public static List<Passenger> filterBySex(List<Passenger> passengers, String sex) {
        if ("All".equalsIgnoreCase(sex)) {
            return passengers; // No filter, return all sexes
        }
        return passengers.stream()
                .filter(p -> p.getSex().equalsIgnoreCase(sex))
                .collect(Collectors.toList());
    }

    // Filter passengers by number of siblings/spouses aboard
    public static List<Passenger> filterBySibSp(List<Passenger> passengers, Integer sibSp) {
        return passengers.stream()
                .filter(p -> p.getSibSp() == sibSp)
                .collect(Collectors.toList());
    }

    // Filter passengers by number of parents/children aboard
    public static List<Passenger> filterByParch(List<Passenger> passengers, Integer parch) {
        return passengers.stream()
                .filter(p -> p.getParch() == parch)
                .collect(Collectors.toList());
    }

    // Filter passengers by ticket number
    public static List<Passenger> filterByTicket(List<Passenger> passengers, String ticket) {
        if (ticket == null || ticket.isEmpty()) {
            return passengers; // No filter, return all tickets
        }
        return passengers.stream()
                .filter(p -> p.getTicket().equalsIgnoreCase(ticket))
                .collect(Collectors.toList());
    }

    // Filter passengers by fare amount
    public static List<Passenger> filterByFare(List<Passenger> passengers, Double minFare, Double maxFare) {
        return passengers.stream()
                .filter(p -> (minFare == null || p.getFare() >= minFare) &&
                        (maxFare == null || p.getFare() <= maxFare))
                .collect(Collectors.toList());
    }

    // Filter passengers by cabin number
    public static List<Passenger> filterByCabin(List<Passenger> passengers, String cabin) {
        if (cabin == null || cabin.isEmpty()) {
            return passengers; // No filter, return all cabins
        }
        return passengers.stream()
                .filter(p -> p.getCabin().equalsIgnoreCase(cabin))
                .collect(Collectors.toList());
    }

    // Filter passengers by embarked location
    public static List<Passenger> filterByEmbarked(List<Passenger> passengers, String embarked) {
        if ("All".equalsIgnoreCase(embarked)) {
            return passengers; // No filter, return all embarkation points
        }
        return passengers.stream()
                .filter(p -> p.getEmbarked().equalsIgnoreCase(embarked))
                .collect(Collectors.toList());
    }
}



