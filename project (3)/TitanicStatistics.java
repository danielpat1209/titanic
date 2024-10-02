
    import java.io.FileWriter;
import java.io.IOException;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

    public class TitanicStatistics {

        public void generateStatisticsFle(List<Passenger> passengers, String filePath) {
            try (FileWriter writer = new FileWriter(filePath)) {
                writer.write("Survival statistics:\n");

                // Statistics by class
                Map<Integer, Double> survivalByClass = passengers.stream()
                        .collect(Collectors.groupingBy(Passenger::getPclass, Collectors.averagingDouble(Passenger::getSurvived)));
                writer.write("Survival by class:\n");
                survivalByClass.forEach((k, v) -> {
                    try {
                        writer.write("Class " + k + ": " + (v * 100) + "%\n");
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                });

                // Statistics by sex
                Map<String, Double> survivalBySex = passengers.stream()
                        .collect(Collectors.groupingBy(Passenger::getSex, Collectors.averagingDouble(Passenger::getSurvived)));
                writer.write("Survival by sex:\n");
                survivalBySex.forEach((k, v) -> {
                    try {
                        writer.write("Sex " + k + ": " + (v * 100) + "%\n");
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                });

                // Add more statistics as needed...

            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }


