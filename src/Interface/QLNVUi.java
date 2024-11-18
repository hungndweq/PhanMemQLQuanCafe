/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Interface;
import java.util.ArrayList;
import javax.swing.*;
/**
 *
 * @author Hyun
 */
public class QLNVUi {

    public static void main(String[] args) {
        JFrame frame = new JFrame("Quản lý nhân viên");
        frame.setSize(600, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel();
        frame.add(panel);
        panel.setLayout(null);

        JLabel nameLabel = new JLabel("Tên nhân viên:");
        nameLabel.setBounds(10, 20, 100, 25);
        panel.add(nameLabel);

        JTextField nameField = new JTextField();
        nameField.setBounds(120, 20, 160, 25);
        panel.add(nameField);

        JLabel ageLabel = new JLabel("Tuổi:");
        ageLabel.setBounds(10, 60, 100, 25);
        panel.add(ageLabel);

        JTextField ageField = new JTextField();
        ageField.setBounds(120, 60, 160, 25);
        panel.add(ageField);

        JButton addButton = new JButton("Thêm");
        addButton.setBounds(10, 100, 80, 25);
        panel.add(addButton);

        JButton deleteButton = new JButton("Xóa");
        deleteButton.setBounds(100, 100, 80, 25);
        panel.add(deleteButton);

        JTextArea staffList = new JTextArea();
        staffList.setBounds(10, 140, 560, 200);
        staffList.setEditable(false);
        panel.add(staffList);

        // Danh sách nhân viên
        ArrayList<String> staff = new ArrayList<>();

        // Sự kiện
        addButton.addActionListener(e -> {
            String name = nameField.getText();
            String age = ageField.getText();
            if (!name.isEmpty() && !age.isEmpty()) {
                staff.add(name + " - Tuổi: " + age);
                staffList.append(name + " - Tuổi: " + age + "\n");
                nameField.setText("");
                ageField.setText("");
            } else {
                JOptionPane.showMessageDialog(frame, "Vui lòng nhập đủ thông tin!");
            }
        });

        deleteButton.addActionListener(e -> {
            String name = nameField.getText();
            staff.removeIf(s -> s.contains(name));
            staffList.setText("");
            for (String s : staff) {
                staffList.append(s + "\n");
            }
            nameField.setText("");
        });

        frame.setVisible(true);
    }
}
