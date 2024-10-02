
    import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

    public class TitanicGrouping {

        public Map<String, Long> groupByEmbarked(List<Passenger> passengers) {
            return passengers.stream()
                    .collect(Collectors.groupingBy(Passenger::getEmbarked, Collectors.counting()));
        }

        public Map<String, Double> groupBySex(List<Passenger> passengers) {
            return passengers.stream()
                    .collect(Collectors.groupingBy(Passenger::getSex, Collectors.averagingDouble(Passenger::getSurvived)));
        }

        // Add more grouping methods as needed...
    }


