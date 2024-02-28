package TH_Bai0;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextPane;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JTextField;
import javax.swing.JButton;

public class ManHinhTinhToan extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textFieldA;
	private JButton btnButton_Nhan;
	private JButton btnButton_Cong;
	private JButton btnButton_Tru;
	private JButton btnButton_Chia;
	private JLabel lblKtQua;
	private JLabel lblNewLabel_KQ;
	private JTextField textFieldB;
	
	public ManHinhTinhToan() {
		setTitle("Chương trình tính toán");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 572, 400);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Nhập số a");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel.setBounds(10, 10, 122, 33);
		contentPane.add(lblNewLabel);
		
		JLabel lblNhpSB = new JLabel("Nhập số b");
		lblNhpSB.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNhpSB.setBounds(10, 63, 122, 33);
		contentPane.add(lblNhpSB);
		
		textFieldA = new JTextField();
		textFieldA.setColumns(10);
		textFieldA.setBounds(142, 10, 332, 33);
		contentPane.add(textFieldA);
		
		btnButton_Nhan = new JButton("*");
		btnButton_Nhan.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnButton_Nhan.setBounds(303, 159, 77, 38);
		contentPane.add(btnButton_Nhan);
		
		btnButton_Nhan.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				//Hàm thực hiện phép nhân
				Nhan();
				
			}
		});
		
		btnButton_Cong = new JButton("+");
		btnButton_Cong.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnButton_Cong.setBounds(10, 159, 77, 38);
		contentPane.add(btnButton_Cong);
		
		btnButton_Cong.addActionListener(new ActionListener() { // Hàm Xử lý tự động
			
			@Override
			public void actionPerformed(ActionEvent e) {
				//Hàm thực hiện phép cộng
				Cong();
				
			}
		});
		
		
		btnButton_Tru = new JButton("-");
		btnButton_Tru.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnButton_Tru.setBounds(152, 159, 77, 38);
		contentPane.add(btnButton_Tru);
		
		btnButton_Tru.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				//Hàm thực hiện phép trừ
				Tru();
			}
		});
		
		btnButton_Chia = new JButton("/");
		btnButton_Chia.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnButton_Chia.setBounds(443, 159, 77, 38);
		contentPane.add(btnButton_Chia);
		
		btnButton_Chia.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				//Hàm thực hiện phép chia
				Chia();
				
			}
		});
		
		lblKtQua = new JLabel("Kết quả");
		lblKtQua.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblKtQua.setBounds(10, 227, 122, 33);
		contentPane.add(lblKtQua);
		
		lblNewLabel_KQ = new JLabel("");
		lblNewLabel_KQ.setBounds(80, 227, 178, 33);
		contentPane.add(lblNewLabel_KQ);
		
		textFieldB = new JTextField();
		textFieldB.setColumns(10);
		textFieldB.setBounds(142, 65, 332, 33);
		contentPane.add(textFieldB);
	}
	void Cong()
	{
	//Lấy dữ liệu từ điều khiển	
		String SoA = textFieldA.getText();
		String SoB = textFieldB.getText();
		//Chuyển kiểu
		double A = Double.parseDouble(SoA);
		double B = Double.parseDouble(SoB);
		//Tính tổng
		double Tong = A + B;
		
		//Hiểu thị kết quả lên điều khiển
		// Cách 1:
		
		//String KQ = String.valueOf(Tong);
		//lblNewLabel_KQ.setText(KQ);
		
		//Cách 2:
		lblNewLabel_KQ.setText(""+Tong);
	}
	
	void Tru()
	{
	//Lấy dữ liệu từ điều khiển	
		String SoA = textFieldA.getText();
		String SoB = textFieldB.getText();
		//Chuyển kiểu
		double A = Double.parseDouble(SoA);
		double B = Double.parseDouble(SoB);
		//Tính Trừ
		double Tru = A - B;
		
		//Hiểu thị kết quả lên điều khiển
		// Cách 1:
		
		String KQ = String.valueOf(Tru);
		lblNewLabel_KQ.setText(KQ);
		
		//Cách 2:
		//lblNewLabel_KQ.setText(""+Tru);
	}
	
	void Nhan()
	{
	//Lấy dữ liệu từ điều khiển	
		String SoA = textFieldA.getText();
		String SoB = textFieldB.getText();
		//Chuyển kiểu
		double A = Double.parseDouble(SoA);
		double B = Double.parseDouble(SoB);
		//Tính Nhan
		double Nhan = A * B;
		
		//Hiểu thị kết quả lên điều khiển
		// Cách 1:
		
		//String KQ = String.valueOf(Nhan);
		//lblNewLabel_KQ.setText(KQ);
		
		//Cách 2:
		lblNewLabel_KQ.setText(""+Nhan);
	}
	
	
	void Chia()
	{
	//Lấy dữ liệu từ điều khiển	
		String SoA = textFieldA.getText();
		String SoB = textFieldB.getText();
		//Chuyển kiểu
		double A = Double.parseDouble(SoA);
		double B = Double.parseDouble(SoB);
		//Tính Chia
		double Chia = A / B;
		
		//Hiểu thị kết quả lên điều khiển
		// Cách 1:
		
		//String KQ = String.valueOf(Chia);
		//lblNewLabel_KQ.setText(KQ);
		
		//Cách 2:
		lblNewLabel_KQ.setText(""+Chia);
	}
	
	
	
	
}
