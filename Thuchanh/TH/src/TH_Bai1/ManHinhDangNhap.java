package TH_Bai1;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ManHinhDangNhap extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textDangNhap;
	private JPasswordField MatKhau;

	/**
	 * Create the frame.
	 */
	public ManHinhDangNhap() {
		setTitle("ĐĂNG NHẬP");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 612, 447);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("TÊN ĐĂNG NHẬP");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel.setBounds(32, 30, 126, 46);
		contentPane.add(lblNewLabel);
		
		JLabel lblMtKhu = new JLabel("MẬT KHẨU");
		lblMtKhu.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblMtKhu.setBounds(32, 113, 126, 46);
		contentPane.add(lblMtKhu);
		
		textDangNhap = new JTextField();
		textDangNhap.setFont(new Font("Tahoma", Font.PLAIN, 16));
		textDangNhap.setBounds(175, 30, 392, 38);
		contentPane.add(textDangNhap);
		textDangNhap.setColumns(10);
		
		MatKhau = new JPasswordField();
		MatKhau.setFont(new Font("Tahoma", Font.PLAIN, 16));
		MatKhau.setBounds(175, 120, 392, 38);
		contentPane.add(MatKhau);
		
		JButton btnDangNhap = new JButton("ĐĂNG NHẬP");
		btnDangNhap.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//Xử lý đăng nhập
				DangNhap();
			}
		});
		btnDangNhap.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnDangNhap.setBounds(262, 233, 142, 38);
		contentPane.add(btnDangNhap);	
	}
	void DangNhap()
	{
		//Lấy tên đăng nhập và mật khẩu
		String tendangnhap = textDangNhap.getText();
		String matKhau = MatKhau.getText();
		
		//Xử lý đăng nhập
		if(tendangnhap.equals("63CNTT-2") && matKhau.equals("123"))
		{
			//Hiểu thị màn hình chính
			ManHinhChinh home = new ManHinhChinh();
			home.setVisible(true);
			this.setVisible(false);//ẩn form đăng nhập
		}
		else {
			//hopthoai.showMessageDialog(this, "Đăng nhập thất bại", "Thông báo");
			JOptionPane hopthoai = new JOptionPane();
		    hopthoai.showMessageDialog(this, "Đăng nhập thất bại");
		}
		
		
	}
}
