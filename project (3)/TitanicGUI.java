

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

public class TitanicGUI {

    private JFrame frame;
    private JComboBox<String> classComboBox;
    private JTextField nameTextField;
    private JButton filterButton;
    private JLabel resultLabel;

    public TitanicGUI(String passengers) {
        frame = new JFrame("Titanic Passenger Search");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 300);
        frame.setLayout(new GridLayout(5, 2));

        frame.add(new JLabel("Class:"));
        classComboBox = new JComboBox<>(new String[]{"All", "1st", "2nd", "3rd"});
        frame.add(classComboBox);

        frame.add(new JLabel("Name contains:"));
        nameTextField = new JTextField();
        frame.add(nameTextField);

        filterButton = new JButton("Filter");
        frame.add(filterButton);

        resultLabel = new JLabel("Results: ");
        frame.add(resultLabel);

        filterButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                filterPassengers(passengers);
            }
        });

        frame.setVisible(true);
    }

    private void filterPassengers(String passengers) {
        PassengerFilter filter = new PassengerFilter();
        String filtered = passengers;

        if (!classComboBox.getSelectedItem().equals("All")) {
            filtered = String.valueOf(filter.filterByPclass(filtered, classComboBox.getSelectedIndex())).toString();
        }




        resultLabel.setText("Results: " + filtered.lines());
        // You can add more code here to display detailed results if needed
    }

    public static void main(String[] args) {
        // Load passenger data from the CSV file

        String passengers = ("src/resources/titanic.csv");

        // Initialize the GUI with the passenger data
        new TitanicGUI(passengers);
    }
}



