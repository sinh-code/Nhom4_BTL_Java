/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package anh;

/**
 *
 * @author Alex
 */
import javax.swing.*;
import java.awt.*;

public class ResizeIcon {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Resize Icon Example");
        frame.setSize(400, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Tải icon từ file
        ImageIcon originalIcon = new ImageIcon("audit.png");

        // Resize icon
        Image image = originalIcon.getImage(); // Lấy đối tượng Image từ ImageIcon
        Image resizedImage = image.getScaledInstance(25, 25, Image.SCALE_SMOOTH); // Resize kích thước (width=100, height=100)
        ImageIcon resizedIcon = new ImageIcon(resizedImage); // Chuyển đổi lại thành ImageIcon

        // Thêm icon vào JLabel
        JLabel label = new JLabel(resizedIcon);
        frame.add(label);

        frame.setVisible(true);
    }
}
