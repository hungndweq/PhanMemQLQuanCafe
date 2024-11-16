/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Interface;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextArea;

/**
 *
 * @author Hyun
 */
public class QLBHUI {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Quản lý bán hàng");
        frame.setSize(600, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Panel chính
        JPanel panel = new JPanel();
        frame.add(panel);
        panel.setLayout(null);

        // Label và ComboBox cho danh sách món
        JLabel menuLabel = new JLabel("Chọn món:");
        menuLabel.setBounds(10, 20, 80, 25);
        panel.add(menuLabel);

        String[] menuItems = {"Cà phê đen", "Cà phê sữa", "Trà sữa", "Nước cam"};
        JComboBox<String> menuList = new JComboBox<>(menuItems);
        menuList.setBounds(100, 20, 160, 25);
        panel.add(menuList);

        // Bàn
        JLabel tableLabel = new JLabel("Chọn bàn:");
        tableLabel.setBounds(10, 60, 80, 25);
        panel.add(tableLabel);

        String[] tables = {"Bàn 1", "Bàn 2", "Bàn 3", "Bàn 4"};
        JComboBox<String> tableList = new JComboBox<>(tables);
        tableList.setBounds(100, 60, 160, 25);
        panel.add(tableList);

        // Nút thêm món
        JButton addItemButton = new JButton("Thêm món");
        addItemButton.setBounds(10, 100, 120, 25);
        panel.add(addItemButton);

        // Nút thanh toán
        JButton payButton = new JButton("Thanh toán");
        payButton.setBounds(150, 100, 120, 25);
        panel.add(payButton);

        // Hiển thị danh sách món đã chọn
        JTextArea orderDetails = new JTextArea();
        orderDetails.setBounds(10, 140, 560, 200);
        orderDetails.setEditable(false);
        panel.add(orderDetails);

        // Sự kiện
        addItemButton.addActionListener(e -> {
            String selectedItem = (String) menuList.getSelectedItem();
            String selectedTable = (String) tableList.getSelectedItem();
            orderDetails.append("Bàn " + selectedTable + ": " + selectedItem + "\n");
        });

        payButton.addActionListener(e -> {
            JOptionPane.showMessageDialog(frame, "Thanh toán thành công!");
            orderDetails.setText(""); // Xóa danh sách món
        });

        frame.setVisible(true);
    }
}
