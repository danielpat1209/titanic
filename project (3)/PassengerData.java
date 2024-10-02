
    import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

    public class PassengerData {
        public static List<Passenger> readPassengersFromCSV(String fileName) {
            List<Passenger> passengers = new ArrayList<>();
            String line;

            try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
                // לדלג על שורת הכותרת
                br.readLine();

                while ((line = br.readLine()) != null) {
                    String[] data = line.split(",");

                    // בדוק אם שורת הנתונים מכילה את מספר העמודות הנכון
                    if (data.length < 12) {
                        // שורת הנתונים חסרה עמודות, דלג עליה
                        continue;
                    }

                    try {
                        // צור אובייקט Passenger חדש על פי הנתונים
                        Passenger passenger = new Passenger(
                                Integer.parseInt(data[0].trim()), // PassengerId
                                Integer.parseInt(data[1].trim()), // Survived
                                Integer.parseInt(data[2].trim()), // Pclass
                                data[3].trim(),                   // Name
                                data[4].trim(),                   // Sex
                                data[5].trim().isEmpty() ? -1 : Integer.parseInt(data[5].trim()), // Age
                                Integer.parseInt(data[6].trim()), // SibSp
                                Integer.parseInt(data[7].trim()), // Parch
                                data[8].trim(),                   // Ticket
                                Double.parseDouble(data[9].trim()), // Fare
                                data.length > 10 ? data[10].trim() : "", // Cabin
                                data.length > 11 ? data[11].trim() : ""  // Embarked
                        );
                        passengers.add(passenger);
                    } catch (NumberFormatException e) {
                        // טיפול בשגיאות הקשורות להמרת מספרים
                        System.err.println("Error parsing data: " + e.getMessage());
                    }
                }
            } catch (IOException e) {
                // טיפול בשגיאות קריאה מהקובץ
                e.printStackTrace();
            }
            return passengers;
        }
    }


