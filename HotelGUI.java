import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import java.awt.Font;

public class HotelGUI {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JLabel lblNewLabel;
	private JLabel lblNewLabel_1;
	private JLabel lblNewLabel_2;
	private JTextField textField_7;
	private JTextField textField_8;
	private JTextField textField_9;
	private JLabel lblCity;
	private JLabel lblState;
	private JLabel lblZipCode;
	private JButton btnBook;
	private JTextField textField_10;
	private JTextField textField_11;
	private JTextField textField_12;
	private JTextField textField_13;
	private JTextField textField_14;
	private JLabel lblHouseKeeping;
	private JLabel lblExtraCharges;
	private JLabel lblPonyRide;
	private JLabel lblSkyDive;
	private JLabel lblRoomServide;
	private JTextField textField_15;
	private JLabel lblNewLabel_3;
	private JLabel lblNewLabel_4;
	private JLabel label;
	private JLabel lblRoomService;
	private JButton btnAdd;
	private JButton btnUpdate;
	private JTextField textField_16;
	private JLabel lblTip;
	private JButton btnCheckOut;
	private JLabel lblCheckIn;
	private JLabel lblRoomSearch;
	private JTextField textField_18;
	private JTextField textField_19;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					HotelGUI window = new HotelGUI();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public HotelGUI() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setFont(new Font("Tahoma", Font.BOLD, 14));
		frame.setBounds(100, 100, 451, 455);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JButton btnNewButton = new JButton("Select");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton.setBounds(352, 60, 72, 23);
		frame.getContentPane().add(btnNewButton);
		
		textField = new JTextField();
		textField.setBounds(10, 61, 86, 20);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(106, 61, 65, 20);
		frame.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBounds(277, 61, 65, 20);
		frame.getContentPane().add(textField_2);
		textField_2.setColumns(10);
		
		textField_3 = new JTextField();
		textField_3.setBounds(181, 61, 86, 20);
		frame.getContentPane().add(textField_3);
		textField_3.setColumns(10);
		
		JLabel lblRoom = new JLabel("Room");
		lblRoom.setBounds(20, 42, 28, 14);
		frame.getContentPane().add(lblRoom);
		
		JLabel lblBeds = new JLabel("Beds");
		lblBeds.setBounds(122, 42, 28, 14);
		frame.getContentPane().add(lblBeds);
		
		JLabel lblNights = new JLabel("Nights");
		lblNights.setBounds(284, 39, 36, 20);
		frame.getContentPane().add(lblNights);
		
		JLabel lblPricePerNight = new JLabel("Price Per Night");
		lblPricePerNight.setBounds(188, 42, 86, 14);
		frame.getContentPane().add(lblPricePerNight);
		
		textField_4 = new JTextField();
		textField_4.setBounds(10, 135, 86, 20);
		frame.getContentPane().add(textField_4);
		textField_4.setColumns(10);
		
		textField_5 = new JTextField();
		textField_5.setBounds(107, 135, 86, 20);
		frame.getContentPane().add(textField_5);
		textField_5.setColumns(10);
		
		textField_6 = new JTextField();
		textField_6.setBounds(203, 135, 189, 20);
		frame.getContentPane().add(textField_6);
		textField_6.setColumns(10);
		
		lblNewLabel = new JLabel("Last Name");
		lblNewLabel.setBounds(120, 117, 51, 14);
		frame.getContentPane().add(lblNewLabel);
		
		lblNewLabel_1 = new JLabel("First Name");
		lblNewLabel_1.setBounds(20, 117, 65, 14);
		frame.getContentPane().add(lblNewLabel_1);
		
		lblNewLabel_2 = new JLabel("Address");
		lblNewLabel_2.setBounds(213, 117, 46, 14);
		frame.getContentPane().add(lblNewLabel_2);
		
		textField_7 = new JTextField();
		textField_7.setBounds(10, 183, 86, 20);
		frame.getContentPane().add(textField_7);
		textField_7.setColumns(10);
		
		textField_8 = new JTextField();
		textField_8.setBounds(107, 183, 86, 20);
		frame.getContentPane().add(textField_8);
		textField_8.setColumns(10);
		
		textField_9 = new JTextField();
		textField_9.setBounds(203, 183, 86, 20);
		frame.getContentPane().add(textField_9);
		textField_9.setColumns(10);
		
		lblCity = new JLabel("City");
		lblCity.setBounds(20, 166, 46, 14);
		frame.getContentPane().add(lblCity);
		
		lblState = new JLabel("State");
		lblState.setBounds(122, 166, 46, 14);
		frame.getContentPane().add(lblState);
		
		lblZipCode = new JLabel("Zip Code");
		lblZipCode.setBounds(213, 166, 46, 14);
		frame.getContentPane().add(lblZipCode);
		
		btnBook = new JButton("Check In");
		btnBook.setBounds(349, 182, 75, 23);
		frame.getContentPane().add(btnBook);
		
		textField_10 = new JTextField();
		textField_10.setBounds(10, 264, 56, 20);
		frame.getContentPane().add(textField_10);
		textField_10.setColumns(10);
		
		textField_11 = new JTextField();
		textField_11.setBounds(76, 264, 56, 20);
		frame.getContentPane().add(textField_11);
		textField_11.setColumns(10);
		
		textField_12 = new JTextField();
		textField_12.setBounds(10, 337, 56, 20);
		frame.getContentPane().add(textField_12);
		textField_12.setColumns(10);
		
		textField_13 = new JTextField();
		textField_13.setBounds(106, 337, 51, 20);
		frame.getContentPane().add(textField_13);
		textField_13.setColumns(10);
		
		textField_14 = new JTextField();
		textField_14.setBounds(142, 264, 56, 20);
		frame.getContentPane().add(textField_14);
		textField_14.setColumns(10);
		
		lblHouseKeeping = new JLabel("House Keeping");
		lblHouseKeeping.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblHouseKeeping.setBounds(10, 214, 109, 32);
		frame.getContentPane().add(lblHouseKeeping);
		
		lblExtraCharges = new JLabel("Extra Charges");
		lblExtraCharges.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblExtraCharges.setBounds(10, 295, 99, 20);
		frame.getContentPane().add(lblExtraCharges);
		
		lblPonyRide = new JLabel("Pony Ride");
		lblPonyRide.setBounds(20, 320, 58, 14);
		frame.getContentPane().add(lblPonyRide);
		
		lblSkyDive = new JLabel("Sky Dive");
		lblSkyDive.setBounds(113, 320, 58, 14);
		frame.getContentPane().add(lblSkyDive);
		
		lblRoomServide = new JLabel("Room Serv.");
		lblRoomServide.setBounds(213, 259, 75, 14);
		frame.getContentPane().add(lblRoomService);
		
		textField_15 = new JTextField();
		textField_15.setBounds(213, 337, 64, 20);
		frame.getContentPane().add(textField_15);
		textField_15.setColumns(10);
		
		lblNewLabel_3 = new JLabel("Cleaning");
		lblNewLabel_3.setBounds(20, 245, 46, 14);
		frame.getContentPane().add(lblNewLabel_3);
		
		lblNewLabel_4 = new JLabel("Laundry");
		lblNewLabel_4.setBounds(86, 245, 46, 14);
		frame.getContentPane().add(lblNewLabel_4);
		
		label = new JLabel("");
		label.setBounds(213, 187, 46, 14);
		frame.getContentPane().add(label);
		
		lblRoomService = new JLabel("Room Serv.");
		lblRoomService.setBounds(213, 320, 65, 14);
		frame.getContentPane().add(lblRoomService);
		
		btnAdd = new JButton("Add");
		btnAdd.setBounds(352, 336, 72, 23);
		frame.getContentPane().add(btnAdd);
		
		btnUpdate = new JButton("Update");
		btnUpdate.setBounds(352, 263, 72, 23);
		frame.getContentPane().add(btnUpdate);
		
		textField_16 = new JTextField();
		textField_16.setBounds(291, 337, 51, 20);
		frame.getContentPane().add(textField_16);
		textField_16.setColumns(10);
		
		lblTip = new JLabel("Tip");
		lblTip.setBounds(296, 320, 46, 14);
		frame.getContentPane().add(lblTip);
		
		btnCheckOut = new JButton("Check Out");
		btnCheckOut.setBounds(160, 382, 89, 23);
		frame.getContentPane().add(btnCheckOut);
		
		lblCheckIn = new JLabel("Check In");
		lblCheckIn.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblCheckIn.setBounds(10, 92, 89, 14);
		frame.getContentPane().add(lblCheckIn);
		
		lblRoomSearch = new JLabel("Room Search");
		lblRoomSearch.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblRoomSearch.setBounds(10, 17, 109, 14);
		frame.getContentPane().add(lblRoomSearch);
		
		JLabel lblMarkReady = new JLabel("Mark Ready");
		lblMarkReady.setBounds(142, 245, 76, 14);
		frame.getContentPane().add(lblMarkReady);
		
		textField_18 = new JTextField();
		textField_18.setColumns(10);
		textField_18.setBounds(73, 337, 23, 20);
		frame.getContentPane().add(textField_18);
		
		textField_19 = new JTextField();
		textField_19.setColumns(10);
		textField_19.setBounds(170, 337, 23, 20);
		frame.getContentPane().add(textField_19);
		
		JLabel lblQty = new JLabel("Qty");
		lblQty.setBounds(73, 320, 23, 14);
		frame.getContentPane().add(lblQty);
		
		JLabel label_1 = new JLabel("Qty");
		label_1.setBounds(170, 320, 23, 14);
		frame.getContentPane().add(label_1);
	}
}
