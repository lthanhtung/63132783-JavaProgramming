package TH_Bai2;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class GiaiPTbac2 extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textA;
	private JTextField textB;
	private JTextField textC;
	private JButton btnTinhNghiem;
	private JTextField textKQ;
	/**
	 * Create the frame.
	 */
	public GiaiPTbac2() {
		setTitle("Giải Phương trình Bậc 2");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 681, 449);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("a:");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel.setBounds(10, 20, 31, 29);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("b:");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel_1.setBounds(236, 24, 31, 20);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("c:");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel_2.setBounds(425, 23, 52, 19);
		contentPane.add(lblNewLabel_2);
		
		textA = new JTextField();
		textA.setFont(new Font("Tahoma", Font.PLAIN, 16));
		textA.setBounds(42, 20, 70, 28);
		contentPane.add(textA);
		textA.setColumns(10);
		
		textB = new JTextField();
		textB.setFont(new Font("Tahoma", Font.PLAIN, 16));
		textB.setColumns(10);
		textB.setBounds(260, 20, 70, 28);
		contentPane.add(textB);
		
		textC = new JTextField();
		textC.setFont(new Font("Tahoma", Font.PLAIN, 16));
		textC.setColumns(10);
		textC.setBounds(449, 20, 62, 28);
		contentPane.add(textC);
		
		JLabel lblNewLabel_3 = new JLabel("Kết quả:");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_3.setBounds(42, 192, 106, 59);
		contentPane.add(lblNewLabel_3);
		
		btnTinhNghiem = new JButton("Tính toán");
		btnTinhNghiem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				GiaiPT();
			}
		});
		btnTinhNghiem.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnTinhNghiem.setBounds(222, 104, 155, 44);
		contentPane.add(btnTinhNghiem);
		
		textKQ = new JTextField();
		textKQ.setFont(new Font("Tahoma", Font.PLAIN, 16));
		textKQ.setBounds(127, 198, 530, 44);
		contentPane.add(textKQ);
		textKQ.setColumns(10);
	}
	void GiaiPT()
	{
	String Seta = textA.getText();
	String Setb = textB.getText();
	String Setc = textC.getText();
	
	//chuyển kiểu
	double a = Double.parseDouble(Seta);
	double b = Double.parseDouble(Setb);
	double c = Double.parseDouble(Setc);
	

	double delta =b*b -(4*a*c);
	//Xử lý tính toán
	if(delta <0) { 
		textKQ.setText("Phương trình vô nghiệm");
	}

	if(delta == 0) {
		double x = -b/2*a;
		 textKQ.setText("x=" + x);
	}
	else {
		double x1 =(-b + Math.sqrt(delta))/(2*a);
		double x2 =(-b - Math.sqrt(delta))/(2*a);
		textKQ.setText("x1="+x1 + ";x2=" + x2);
		
	}
	}
}
