package GUI_Prototype;

import java.awt.Color;
import java.awt.Component;
import java.awt.EventQueue;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.Box;
import javax.swing.ButtonGroup;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JSlider;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.ToolTipManager;

public class GUI {

	private JFrame mainFrame;
	private JTextField txtRangeMin;
	private JTextField txtRangeMax;
	private JTextField textField_AmountTokens;
	private JTextField textField_AmountInUSD;
	private JTextField txtNrOfSteps;
	private JTextField txtBtc;
	private JTextField txtBitcoin;
	private JTextField txtXxxxxxx;
	private JTextField textfield_cut1_range;
	private JTextField textfield_cut2_percentPlusMinus;
	private JTextField textfield_cut3_plusFactor;
	private JTextField textfield_cut4_minusFactor;

	JSlider slider_cut1_range;

	JLabel lblBuy;
	JLabel lblSell;

	JLabel lblCutOutpInfotext_A;
	JLabel lblCutOutpInfotext_B;
	JLabel lblCutOutpInfotext_C;

	JRadioButton rdbtnBuy;
	JRadioButton rdbtnSell;
	JRadioButton rdbtnYesWithFactor;
	JRadioButton rdbtnNoWithFactor;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GUI window = new GUI();
					window.mainFrame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public GUI() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		mainFrame = new JFrame();
		mainFrame.setTitle("Buy/Sell Order Zones Variable Safe/Medium/Risk Distribution Range Steps Calculator");
		mainFrame.setBounds(100, 100, 1180, 750);
		mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		mainFrame.getContentPane().setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));

		Box verticalBox_ALL1 = Box.createVerticalBox();
		mainFrame.getContentPane().add(verticalBox_ALL1);
		ToolTipManager.sharedInstance().setDismissDelay(Integer.MAX_VALUE);

		Box horizontalBox_ALL2 = Box.createHorizontalBox();
		verticalBox_ALL1.add(horizontalBox_ALL2);

		Box verticalBox_LEFT = Box.createVerticalBox();
		horizontalBox_ALL2.add(verticalBox_LEFT);

		Box horizontalBox_Token = Box.createHorizontalBox();
		verticalBox_LEFT.add(horizontalBox_Token);

		Box verticalBox_2_1 = Box.createVerticalBox();
		horizontalBox_Token.add(verticalBox_2_1);

		JLabel lblToken = new JLabel("TOKEN");
		lblToken.setFont(new Font("Dialog", Font.BOLD, 13));
		lblToken.setAlignmentX(0.5f);
		verticalBox_2_1.add(lblToken);

		Box horizontalBox_1_2 = Box.createHorizontalBox();
		verticalBox_2_1.add(horizontalBox_1_2);

		JLabel lblSymbol = new JLabel("Symbol                  ");
		lblSymbol.setFont(new Font("Dialog", Font.BOLD, 10));
		horizontalBox_1_2.add(lblSymbol);

		txtBtc = new JTextField();
		txtBtc.setEnabled(false);
		txtBtc.setText("BTC");
		txtBtc.setColumns(5);
		horizontalBox_1_2.add(txtBtc);

		Box horizontalBox_2_2 = Box.createHorizontalBox();
		verticalBox_2_1.add(horizontalBox_2_2);

		JLabel lblName = new JLabel("Name                     ");
		lblName.setFont(new Font("Dialog", Font.BOLD, 10));
		horizontalBox_2_2.add(lblName);

		txtBitcoin = new JTextField();
		txtBitcoin.setEnabled(false);
		txtBitcoin.setText("Bitcoin");
		txtBitcoin.setColumns(5);
		horizontalBox_2_2.add(txtBitcoin);

		Box horizontalBox_2_2_1 = Box.createHorizontalBox();
		verticalBox_2_1.add(horizontalBox_2_2_1);

		JLabel lblusdValue = new JLabel("$USD value           ");
		lblusdValue.setFont(new Font("Dialog", Font.BOLD, 10));
		horizontalBox_2_2_1.add(lblusdValue);

		txtXxxxxxx = new JTextField();
		txtXxxxxxx.setText("XXX,XXX.XX");
		txtXxxxxxx.setEnabled(false);
		txtXxxxxxx.setColumns(5);
		horizontalBox_2_2_1.add(txtXxxxxxx);

		JButton btnGetCurrentUsd = new JButton("Get current USD value");
		btnGetCurrentUsd.setEnabled(false);
		btnGetCurrentUsd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("click USD value");
			}
		});
		btnGetCurrentUsd.setAlignmentX(Component.CENTER_ALIGNMENT);
		verticalBox_2_1.add(btnGetCurrentUsd);

		Box horizontalBox_Amount = Box.createHorizontalBox();
		verticalBox_LEFT.add(horizontalBox_Amount);

		Box verticalBox_1 = Box.createVerticalBox();
		horizontalBox_Amount.add(verticalBox_1);

		JLabel lblAmount = new JLabel("AMOUNT");
		lblAmount.setFont(new Font("Dialog", Font.BOLD, 13));
		lblAmount.setAlignmentX(Component.CENTER_ALIGNMENT);
		lblAmount.setToolTipText("AMOUNT (100% for Zone)");
		lblAmount.setHorizontalAlignment(SwingConstants.CENTER);
		verticalBox_1.add(lblAmount);

		Box horizontalBox_1_1 = Box.createHorizontalBox();
		verticalBox_1.add(horizontalBox_1_1);

		JLabel lblAmountTokens = new JLabel("Amount Tokens ");
		lblAmountTokens.setFont(new Font("Dialog", Font.BOLD, 12));
		lblAmountTokens.setIcon(new ImageIcon(GUI.class.getResource("/GUI_Prototype/AlertSmaller3.png")));
		horizontalBox_1_1.add(lblAmountTokens);

		textField_AmountTokens = new JTextField();
		textField_AmountTokens.setColumns(5);
		horizontalBox_1_1.add(textField_AmountTokens);

		Box horizontalBox_2_1 = Box.createHorizontalBox();
		verticalBox_1.add(horizontalBox_2_1);

		JLabel lblAmountTokensIn = new JLabel("$USD value           ");
		lblAmountTokensIn.setFont(new Font("Dialog", Font.BOLD, 10));
		horizontalBox_2_1.add(lblAmountTokensIn);

		textField_AmountInUSD = new JTextField();
		textField_AmountInUSD.setEnabled(false);
		textField_AmountInUSD.setColumns(5);
		horizontalBox_2_1.add(textField_AmountInUSD);

		Box horizontalBox_Range = Box.createHorizontalBox();
		verticalBox_LEFT.add(horizontalBox_Range);

		Box verticalBox_2 = Box.createVerticalBox();
		horizontalBox_Range.add(verticalBox_2);

		JLabel lblRange = new JLabel("RANGE");
		lblRange.setFont(new Font("Dialog", Font.BOLD, 13));
		lblRange.setAlignmentX(Component.CENTER_ALIGNMENT);
		verticalBox_2.add(lblRange);

		Box horizontalBox_1 = Box.createHorizontalBox();
		verticalBox_2.add(horizontalBox_1);

		JLabel lblRangeFrom = new JLabel("MIN                      ");
		lblRangeFrom.setFont(new Font("Dialog", Font.BOLD, 12));
		lblRangeFrom.setIcon(new ImageIcon(GUI.class.getResource("/GUI_Prototype/AlertSmaller3.png")));
		horizontalBox_1.add(lblRangeFrom);

		txtRangeMin = new JTextField();
		txtRangeMin.setText("10");
		horizontalBox_1.add(txtRangeMin);
		txtRangeMin.setColumns(5);

		Box horizontalBox_2 = Box.createHorizontalBox();
		verticalBox_2.add(horizontalBox_2);

		JLabel lblRangeTo = new JLabel("MAX                     ");
		lblRangeTo.setFont(new Font("Dialog", Font.BOLD, 12));
		lblRangeTo.setIcon(new ImageIcon(GUI.class.getResource("/GUI_Prototype/AlertSmaller3.png")));
		horizontalBox_2.add(lblRangeTo);

		txtRangeMax = new JTextField();
		txtRangeMax.setText("20");
		txtRangeMax.setColumns(5);
		horizontalBox_2.add(txtRangeMax);

		Box horizontalBox_SettingsSteps = Box.createHorizontalBox();
		verticalBox_LEFT.add(horizontalBox_SettingsSteps);

		Box verticalBox_3 = Box.createVerticalBox();
		horizontalBox_SettingsSteps.add(verticalBox_3);

		JLabel lblSettings = new JLabel("NR OF ORDERS");
		lblSettings.setFont(new Font("Dialog", Font.BOLD, 13));
		lblSettings.setAlignmentX(Component.CENTER_ALIGNMENT);
		verticalBox_3.add(lblSettings);

		Box horizontalBox = Box.createHorizontalBox();
		verticalBox_3.add(horizontalBox);

		JLabel lblNrOfSteps = new JLabel("Nr of orders to create in steps   ");
		lblNrOfSteps.setIcon(new ImageIcon(GUI.class.getResource("/GUI_Prototype/AlertSmaller3.png")));
		horizontalBox.add(lblNrOfSteps);

		txtNrOfSteps = new JTextField();
		txtNrOfSteps.setText("10");
		horizontalBox.add(txtNrOfSteps);
		txtNrOfSteps.setColumns(10);

		JLabel lblHoverinfo_1 = new JLabel("");
		lblHoverinfo_1.setIcon(new ImageIcon(GUI.class.getResource("/GUI_Prototype/infoSmaller3.png")));
		lblHoverinfo_1.setToolTipText(
				"<html>2 - 5......for most use cases<br>\n5 - 15.....for wider ranges<br>\n15+........too much for most use cases<br>\n100........good for distributed weighting overview but usually not use<br>\n<br>\n---------------------------------------------------------------------------------------------<br>\nin more detail:<br>\n<br>\nYou can enter any number from 2 - n<br>\nBut most useful practise is usually 4 to 5 in most cases<br>\nIf you want to spread over a wider range u can use 10 -15<br>\nI guess over 20 is a little bit too much focus on the detail in most use cases,<br>\nbut there might be reason for it. I would than try to go with 20 - 30, myabe even 50<br>\nTo have a good feel how the percentages are distributed in weighting in detail you can use 100<br>\nOver that I assume there's not much use case, but you're free to go.<br>\nThe absolut maximum amount nr of steps should be in theory restricted to 2147483647<br>\n(because of JAVA maximum size for Integer) <-- Test this out! :)<br></html>");
		horizontalBox.add(lblHoverinfo_1);

		Box horizontalBox_BuyOrSellZones = Box.createHorizontalBox();
		verticalBox_LEFT.add(horizontalBox_BuyOrSellZones);

		Box verticalBox_4 = Box.createVerticalBox();
		horizontalBox_BuyOrSellZones.add(verticalBox_4);

		JLabel lblBuyOrSell = new JLabel("BUY OR SELL ZONES?");
		lblBuyOrSell.setFont(new Font("Dialog", Font.BOLD, 13));
		verticalBox_4.add(lblBuyOrSell);

		ButtonGroup bg_buysell = new ButtonGroup();

		rdbtnBuy = new JRadioButton("BUY");
		bg_buysell.add(rdbtnBuy);
		verticalBox_4.add(rdbtnBuy);
		// add allow listener
		rdbtnBuy.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("TESTOMAT BUY");
				lblSell.setEnabled(false);
				lblBuy.setEnabled(true);
			}
		});

		rdbtnSell = new JRadioButton("SELL");
		bg_buysell.add(rdbtnSell);
		rdbtnSell.setSelected(true);
		verticalBox_4.add(rdbtnSell);
		rdbtnSell.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("TESTOMAT SELL");
				lblSell.setEnabled(true);
				lblBuy.setEnabled(false);
			}
		});

		Box horizontalBox_WeightDistrQuestion = Box.createHorizontalBox();
		verticalBox_LEFT.add(horizontalBox_WeightDistrQuestion);

		Box verticalBox_9 = Box.createVerticalBox();
		horizontalBox_WeightDistrQuestion.add(verticalBox_9);

		JLabel lblExponentialRiskZone = new JLabel("WEIGHT EXPONENTIALLY MORE IN RISKY ZONES & LESS IN SAFE?");
		verticalBox_9.add(lblExponentialRiskZone);
		lblExponentialRiskZone.setFont(new Font("Dialog", Font.BOLD, 13));
		lblExponentialRiskZone.setAlignmentX(Component.CENTER_ALIGNMENT);

		ButtonGroup bg_yesno = new ButtonGroup();

		rdbtnYesWithFactor = new JRadioButton("Yes");
		verticalBox_9.add(rdbtnYesWithFactor);
		rdbtnYesWithFactor.setSelected(true);
		bg_yesno.add(rdbtnYesWithFactor);
		rdbtnYesWithFactor.setAlignmentX(Component.CENTER_ALIGNMENT);
		rdbtnYesWithFactor.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("TESTOMAT factor_YES");

			}
		});

		rdbtnNoWithFactor = new JRadioButton("No, just equal spread");
		verticalBox_9.add(rdbtnNoWithFactor);
		bg_yesno.add(rdbtnNoWithFactor);
		rdbtnNoWithFactor.setAlignmentX(Component.CENTER_ALIGNMENT);
		rdbtnNoWithFactor.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("TESTOMAT factor_NO");

			}
		});

		Box horizontalBox_RangeDistribution = Box.createHorizontalBox();
		verticalBox_LEFT.add(horizontalBox_RangeDistribution);

		Box verticalBox_3_1 = Box.createVerticalBox();
		horizontalBox_RangeDistribution.add(verticalBox_3_1);

		JLabel lblRangesafe = new JLabel("\"the cut\" SETTING 1/4 WHERE? (RANGE (SAFE - RISK) DISTRIBUTION)");
		lblRangesafe.setFont(new Font("Dialog", Font.BOLD, 13));
		lblRangesafe.setAlignmentX(0.5f);
		verticalBox_3_1.add(lblRangesafe);

		Box horizontalBox_3 = Box.createHorizontalBox();
		verticalBox_3_1.add(horizontalBox_3);

		JLabel lblHoverinfo = new JLabel("");
		lblHoverinfo.setIcon(new ImageIcon(GUI.class.getResource("/GUI_Prototype/infoSmaller3.png")));
		lblHoverinfo.setToolTipText(
				"<html>for SELL Zones<br>\n0 = 100% in top(more potential SELL value,but 'more risky') & 0% in bottom(less potential SELL value,but 'more safe') part of range | RISK+++<br>\n15 = 85% in top(more potential SELL value,but 'more risky') & 15% in bottom(less potential SELL value,but 'more safe') part of range | RISK++<br>\n25 = 75% in top(more potential SELL value,but 'more risky') & 25% in bottom(less potential SELL value,but 'more safe') part of range | RISK+<br>\n33 = 66% in top(more potential SELL value,but 'more risky') & 33% in bottom(less potential SELL value,but 'more safe') part of range | MEDIUM(RISK)<br>\n50 = 50% in top(more potential SELL value,but 'more risky') & 50% in bottom(less potential SELL value,but 'more safe') part of range | MEDIUM(equal RISK/SAFE)<br>\n66 = 33% in top(more potential SELL value,but 'more risky') & 66% in bottom(less potential SELL value,but 'more safe') part of range | MEDIUM(SAFE)<br>\n75 = 25% in top(more potential SELL value,but 'more risky') & 75% in bottom(less potential SELL value,but 'more safe') part of range | SAFE+<br>\n85 = 15% in top(more potential SELL value,but 'more risky') & 85% in bottom(less potential SELL value,but 'more safe') part of range | SAFE++<br>\n100 = 0% in top(more potential SELL value,but 'more risky') & 100% in bottom(less potential SELL value,but 'more safe') part of range | SAFE+++<br>\n<br>\nfor BUY Zones<br>\n0 = 100% in top(more expensive to BUY,but 'more safe') & 0% in bottom(cheaper to BUY,but 'more risky') part of range | SAFE+++<br>\n15 = 85% in top(more expensive to BUY,but 'more safe') & 15% in bottom(cheaper to BUY,but 'more risky') part of range | SAFE++<br>\n25 = 75% in top(more expensive to BUY,but 'more safe') & 25% in bottom(cheaper to BUY,but 'more risky') part of range | SAFE+<br>\n33 = 66% in top(more expensive to BUY,but 'more safe') & 33% in bottom(cheaper to BUY,but 'more risky') part of range | MEDIUM(SAFE)<br>\n50 = 50% in top(more expensive to BUY,but 'more safe') & 50% in bottom(cheaper to BUY,but 'more risky') part of range | MEDIUM(equal SAFE/RISK)<br>\n66 = 33% in top(more expensive to BUY,but 'more safe') & 66% in bottom(cheaper to BUY,but 'more risky') part of range | MEDIUM(RISK)<br>\n75 = 25% in top(more expensive to BUY,but 'more safe') & 75% in bottom(cheaper to BUY,but 'more risky') part of range | RISK+<br>\n85 = 15% in top(more expensive to BUY,but 'more safe') & 85% in bottom(cheaper to BUY,but 'more risky') part of range | RISK++<br>\n100 = 0% in top(more expensive to BUY,but 'more safe') & 100% in bottom(cheaper to BUY,but 'more risky') part of range | RISK+++<br></html>");

		horizontalBox_3.add(lblHoverinfo);

		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] { "SAFE+++", "SAFE++", "SAFE+", "MEDIUM(RISK)",
				"MEDIUM(EQUAL)", "MEDIUM(SAFE)", "RISK+", "RISK++", "RISK+++" }));
		horizontalBox_3.add(comboBox);

		Box verticalBox_5 = Box.createVerticalBox();
		horizontalBox_3.add(verticalBox_5);

		lblSell = new JLabel("safe,less gains | medium,equal | risky,more gains");
		lblSell.setEnabled(true);
		lblSell.setForeground(Color.BLACK);
		lblSell.setBackground(new Color(255, 102, 102));
		lblSell.setOpaque(true);
		lblSell.setAlignmentX(0.5f);
		verticalBox_5.add(lblSell);

		slider_cut1_range = new JSlider();
		slider_cut1_range.setValue(70);
		slider_cut1_range.setMajorTickSpacing(10);
		slider_cut1_range.setMinimum(1);
		// slider_cut1_range.addChangeListener((ChangeListener) this);

		verticalBox_5.add(slider_cut1_range);

		lblBuy = new JLabel("risky,cheap | medium,equal | safe,expensive");
		lblBuy.setEnabled(false);
		lblBuy.setForeground(Color.BLACK);
		lblBuy.setBackground(new Color(51, 153, 102));
		lblBuy.setOpaque(true);
		lblBuy.setAlignmentX(Component.CENTER_ALIGNMENT);
		verticalBox_5.add(lblBuy);

		textfield_cut1_range = new JTextField();
		textfield_cut1_range.setText("70");
		textfield_cut1_range.setColumns(10);
		// textfield_cut1_range.addActionListener((ActionListener) this);
		horizontalBox_3.add(textfield_cut1_range);

		JPanel panel_ExponetialWeight = new JPanel();
		verticalBox_LEFT.add(panel_ExponetialWeight);

		Box verticalBox_8 = Box.createVerticalBox();
		panel_ExponetialWeight.add(verticalBox_8);

		JLabel lbltheCutSetting = new JLabel("\"the cut\" SETTING 2/4 HOW MUCH? (% FACTOR + & - FROM cut)");
		lbltheCutSetting.setFont(new Font("Dialog", Font.BOLD, 13));
		lbltheCutSetting.setAlignmentX(0.5f);
		verticalBox_8.add(lbltheCutSetting);

		Box horizontalBox_4 = Box.createHorizontalBox();
		verticalBox_8.add(horizontalBox_4);

		textfield_cut2_percentPlusMinus = new JTextField();
		textfield_cut2_percentPlusMinus.setText("40");
		horizontalBox_4.add(textfield_cut2_percentPlusMinus);
		textfield_cut2_percentPlusMinus.setColumns(4);

		JSlider slider_1 = new JSlider();
		slider_1.setValue(40);
		horizontalBox_4.add(slider_1);

		JLabel lblInfo = new JLabel("");
		lblInfo.setToolTipText("Create text here l8r!");
		lblInfo.setIcon(new ImageIcon(GUI.class.getResource("/GUI_Prototype/infoSmaller3.png")));
		horizontalBox_4.add(lblInfo);

		JPanel panel_StaerkeKruemmung = new JPanel();
		verticalBox_LEFT.add(panel_StaerkeKruemmung);

		Box verticalBox_11 = Box.createVerticalBox();
		panel_StaerkeKruemmung.add(verticalBox_11);

		JLabel lblTheCutSetting3 = new JLabel(
				"\"the cut\" SETTING 3/4 +++ CURVATURE INTENSITY FACTOR (10 WEAK - 50 MEDIUM - 90 STRONG)");
		lblTheCutSetting3.setAlignmentX(Component.CENTER_ALIGNMENT);
		verticalBox_11.add(lblTheCutSetting3);

		Box horizontalBox_5 = Box.createHorizontalBox();
		verticalBox_11.add(horizontalBox_5);

		textfield_cut3_plusFactor = new JTextField();
		horizontalBox_5.add(textfield_cut3_plusFactor);
		textfield_cut3_plusFactor.setText("33");
		textfield_cut3_plusFactor.setColumns(4);

		JSlider slider_1_1 = new JSlider();
		slider_1_1.setValue(33);
		horizontalBox_5.add(slider_1_1);

		Box verticalBox_RIGHT = Box.createVerticalBox();
		horizontalBox_ALL2.add(verticalBox_RIGHT);
		JPanel panel_OutputResultText = new JPanel();
		verticalBox_RIGHT.add(panel_OutputResultText);

		Box verticalBox = Box.createVerticalBox();
		panel_OutputResultText.add(verticalBox);

		JTextArea txtrResults = new JTextArea();
		txtrResults.setColumns(30);
		txtrResults.setRows(25);
		// Scrolbar Add START
		JScrollPane scrollIn = new JScrollPane(txtrResults);
		verticalBox.add(scrollIn);

		JPanel panel_StaerkeKruemmung_1 = new JPanel();
		verticalBox_LEFT.add(panel_StaerkeKruemmung_1);

		Box verticalBox_11_1 = Box.createVerticalBox();
		panel_StaerkeKruemmung_1.add(verticalBox_11_1);

		JLabel lbltheCutSetting_1 = new JLabel(
				"\"the cut\" SETTING 4/4 - - - CURVATURE INTENSITY FACTOR (10 WEAK - 50 MEDIUM - 90 STRONG)");
		lbltheCutSetting_1.setAlignmentX(0.5f);
		verticalBox_11_1.add(lbltheCutSetting_1);

		Box horizontalBox_5_1 = Box.createHorizontalBox();
		verticalBox_11_1.add(horizontalBox_5_1);

		textfield_cut4_minusFactor = new JTextField();
		textfield_cut4_minusFactor.setText("33");
		textfield_cut4_minusFactor.setColumns(4);
		horizontalBox_5_1.add(textfield_cut4_minusFactor);

		JSlider slider_1_1_1 = new JSlider();
		slider_1_1_1.setValue(33);
		horizontalBox_5_1.add(slider_1_1_1);

		JPanel panel_CutOutpInfoText = new JPanel();
		verticalBox_LEFT.add(panel_CutOutpInfoText);

		Box verticalBox_10 = Box.createVerticalBox();
		panel_CutOutpInfoText.add(verticalBox_10);

		lblCutOutpInfotext_A = new JLabel("You SELL at cut XX:");
		lblCutOutpInfotext_A.setAlignmentX(Component.CENTER_ALIGNMENT);
		verticalBox_10.add(lblCutOutpInfotext_A);

		lblCutOutpInfotext_B = new JLabel(">70 = +++40% in (30%of 10=__) Zones, factor 33");
		lblCutOutpInfotext_B.setAlignmentX(Component.CENTER_ALIGNMENT);
		verticalBox_10.add(lblCutOutpInfotext_B);

		lblCutOutpInfotext_C = new JLabel("<70 = - - - 40% in (70%of 10=__) Zones, factor 33");
		lblCutOutpInfotext_C.setAlignmentX(Component.CENTER_ALIGNMENT);
		verticalBox_10.add(lblCutOutpInfotext_C);

		JPanel panel_btnGo = new JPanel();
		verticalBox_LEFT.add(panel_btnGo);

		JButton btnGo = new JButton("GO");
		btnGo.setFont(new Font("Dialog", Font.BOLD, 20));
		panel_btnGo.add(btnGo);
		btnGo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				System.out.println("PRESS Button 'btnGo'");
				update_labelInfos_zoneCreationSettingsDetails__A_BuySellText();
				update_labelInfos_zoneCreationSettingsDetails__B_Zone1Info();
				update_labelInfos_zoneCreationSettingsDetails__C_Zone2Info();

				// create Variablen aus Text Inputs:
				System.out.println("---------------------------------");
				System.out.println("|1| create Variablen aus Text Inputs");
				System.out.println("---------------------------------");
				// textField_AmountTokens
				// txtRangeMin
				// txtRangeMax
				// txtNrOfSteps
				// textRangeDistrSet
				// txtExponentialZoneFactor

				double amountTokens = Double.parseDouble(textField_AmountTokens.getText());
				double rangeMin = Double.parseDouble(txtRangeMin.getText());
				double rangeMax = Double.parseDouble(txtRangeMax.getText());
				int numberOfSteps = Integer.parseInt(txtNrOfSteps.getText());
				int cut1_range = Integer.parseInt(textfield_cut1_range.getText());
				int cut2_percentPlusMinus = Integer.parseInt(textfield_cut2_percentPlusMinus.getText());
				int cut3_plusFactor = Integer.parseInt(textfield_cut3_plusFactor.getText());
				int cut4_minusFactor = Integer.parseInt(textfield_cut4_minusFactor.getText());

				// calculate the result
				System.out.println("---------------------------------");
				System.out.println("|2| calculate the result");
				System.out.println("---------------------------------");
				String theResultZonesOutput = calcTheResult(amountTokens, rangeMin, rangeMax, numberOfSteps, cut1_range,
						cut2_percentPlusMinus, cut3_plusFactor, cut4_minusFactor);

				// display results in text area
				System.out.println("---------------------------------");
				System.out.println("|3| display results in text area");
				System.out.println("---------------------------------");
				txtrResults.setText(theResultZonesOutput);
			}
		});
		btnGo.setAlignmentX(Component.CENTER_ALIGNMENT);

		JButton btnCopyTextTo = new JButton("Copy Results to Clipboard");
		btnCopyTextTo.setEnabled(false);
		btnCopyTextTo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnCopyTextTo.setAlignmentX(Component.CENTER_ALIGNMENT);
		verticalBox.add(btnCopyTextTo);

		// JScrollPane scrollIn = new JScrollPane((Component) null);
		// verticalBox.add(scrollIn);

		JPanel panel_PostCreatedResultOptions = new JPanel();
		verticalBox_RIGHT.add(panel_PostCreatedResultOptions);

		Box verticalBox_7 = Box.createVerticalBox();
		panel_PostCreatedResultOptions.add(verticalBox_7);

		JButton btnShowResultsIn = new JButton("Show Results In Graph");
		btnShowResultsIn.setEnabled(false);
		btnShowResultsIn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnShowResultsIn.setAlignmentX(Component.CENTER_ALIGNMENT);
		verticalBox_7.add(btnShowResultsIn);

		JButton btnTransferResultsWith = new JButton("Transfer Results to CEX");
		btnTransferResultsWith.setEnabled(false);
		btnTransferResultsWith.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnTransferResultsWith.setAlignmentX(Component.CENTER_ALIGNMENT);
		verticalBox_7.add(btnTransferResultsWith);

		JButton btnTransferResultsTo = new JButton("Transfer Results to DEX");
		btnTransferResultsTo.setEnabled(false);
		btnTransferResultsTo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnTransferResultsTo.setAlignmentX(Component.CENTER_ALIGNMENT);
		verticalBox_7.add(btnTransferResultsTo);

		JPanel panel_Footer = new JPanel();
		verticalBox_ALL1.add(panel_Footer);

		Box verticalBox_6 = Box.createVerticalBox();
		panel_Footer.add(verticalBox_6);

		JLabel lblPiclink = new JLabel(
				"<html><div>Icons created from <a href=\"https://www.freepik.com\" title=\"Freepik\">Freepik</a> & <a href=\"https://www.flaticon.com/de/autoren/yaicon\" title=\"yaicon\">yaicon</a> at <a href=\"https://www.flaticon.com/de/\" title=\"Flaticon\">www.flaticon.com</a></div></html>");
		lblPiclink.setFont(new Font("Dialog", Font.BOLD, 8));
		lblPiclink.setHorizontalAlignment(SwingConstants.CENTER);
		lblPiclink.setAlignmentX(Component.CENTER_ALIGNMENT);
		verticalBox_6.add(lblPiclink);

		JLabel lblToolfooterinfos = new JLabel(
				"<html>Find and use more valuable +EV Crypto Tools at <a href=\"https://www.LINK\" title=\"Tools For Crypto\">LINK</a></div></html>");
		lblToolfooterinfos.setFont(new Font("Dialog", Font.BOLD, 9));
		lblToolfooterinfos.setHorizontalAlignment(SwingConstants.CENTER);
		lblToolfooterinfos.setAlignmentX(Component.CENTER_ALIGNMENT);
		verticalBox_6.add(lblToolfooterinfos);

	}

	protected void update_labelInfos_zoneCreationSettingsDetails__A_BuySellText() {
		String nexTextToSet = "";
		// You SELL at cut XX:

		// CREATE THE TEXT start
		// fix parts
		String part_A = "You";
		String part_B = ", setting cut at";
		// variable parts
		String part_buyOrSell = "";
		String part_cut = "";

		if (rdbtnBuy.isSelected() == true && rdbtnSell.isSelected() == false) {
			part_buyOrSell = "BUY";
		} else if (rdbtnBuy.isSelected() == false && rdbtnSell.isSelected() == true) {
			part_buyOrSell = "SELL";
		} else {
			String errorMsg = "!!!! WEIRD ERROR at update_labelInfos_zoneCreationSettingsDetails__A_BuySellText() ifElse !!!!!!!";
			System.out.println(errorMsg);
			part_buyOrSell = errorMsg;
		}

		// include trim l8r in final
		part_cut = textfield_cut1_range.getText();

		nexTextToSet = part_A + " " + part_buyOrSell + "" + part_B + " " + part_cut;
		// CREATE THE TEXT end

		// SET THE LABEL TEXT start
		lblCutOutpInfotext_A.setText(nexTextToSet);
		// SET THE LABEL TEXT end

	}

	protected void update_labelInfos_zoneCreationSettingsDetails__B_Zone1Info() {
		// lblCutOutpInfotext_B.setText("TEST B");
		// >70 = +++40% in (30%of 10=__) Zones, factor 33
	}

	protected void update_labelInfos_zoneCreationSettingsDetails__C_Zone2Info() {
		// lblCutOutpInfotext_C.setText("TEST C");
		// <70 = - - - 40% in (70%of 10=__) Zones, factor 33
	}

	protected String calcTheResult(double amountTokens, double rangeMin, double rangeMax, int numberOfSteps,
			int cut1_range, int cut2_percentPlusMinus, int cut3_plusFactor, int cut4_minusFactor) {

		String outputResult = "";

		/**
		 * PRICES RANGE STEPS FROM ASSET CALCULATION start
		 */
		// calcs ...
		double rangeDifferenz = rangeMax - rangeMin;
		double tempToAddPricePerStep = rangeDifferenz / (numberOfSteps + 1);
		double[] priceRangeZoneOutputs = new double[numberOfSteps];

		// 1st ZONE
		priceRangeZoneOutputs[0] = rangeMax;

		// 2nd ZONE
		priceRangeZoneOutputs[1] = rangeMax - tempToAddPricePerStep;

		for (int i = 2; i < priceRangeZoneOutputs.length - 1; i++) {
			priceRangeZoneOutputs[i] = priceRangeZoneOutputs[i - 1] - tempToAddPricePerStep;
		}

		// last ZONE
		priceRangeZoneOutputs[priceRangeZoneOutputs.length - 1] = rangeMin;

		Helper hlp = new Helper();
		System.out.println("priceRangeZoneOutputs (final calc)");
		hlp.printOutArrList(priceRangeZoneOutputs);
		System.out.println("-------------------");

		/**
		 * PRICES RANGE STEPS FROM ASSET CALCULATION end
		 */

		/**
		 * ZONES AMOUNT CALCULATION start
		 */

		// EQUAL SPREAD
		double equalSpread = amountTokens / numberOfSteps;
		System.out.println("equalSpread = " + equalSpread);
		System.out.println();
		// outputResult = outputResult + "<html>";
		outputResult = outputResult + "amountTokens = " + amountTokens + "\n";
		outputResult = outputResult + "numberOfSteps = " + numberOfSteps + "\n";
		outputResult = outputResult + "equalSpread = " + equalSpread + "\n";
		// outputResult = outputResult + "</html>";
		outputResult = outputResult + "\n";

		for (int i = 0; i < numberOfSteps; i++) {
			System.out.println("#" + (i + 1) + ": " + equalSpread);
			outputResult = outputResult + "#" + (i + 1) + ": " + equalSpread + "\n";
		}

		// cut1_4 b
		// calc Number of steps for MINUS---
		int cut1_4b__anzStepsMinus = (int) (numberOfSteps * (cut1_range * 0.01));
		System.out.println("cut1_4b__anzStepsMinus = " + cut1_4b__anzStepsMinus);

		// cut1_4 a
		// calc Anzahl der Steps für PLUS+++
		int cut1_4a__anzStepsPlus = numberOfSteps - cut1_4b__anzStepsMinus;
		System.out.println("cut1_4a__anzStepsPlus = " + cut1_4a__anzStepsPlus);

		// [CCC]
		// createAndFillArrayForStepsPLUS+++
// double[] ...
		double[] arrayForStepsPLUS = simpleFillArrayWithEqualSpread(cut1_4a__anzStepsPlus, equalSpread);
		// Helper hlp = new Helper();
		System.out.println("arrayForStepsPLUS");
		hlp.printOutArrList(arrayForStepsPLUS);
		System.out.println("-------------------");

		// createAndFillArrayForStepsMINUS---
		// double[] ...
		double[] arrayForStepsMINUS = simpleFillArrayWithEqualSpread(cut1_4b__anzStepsMinus, equalSpread);
		System.out.println("arrayForStepsMINUS");
		hlp.printOutArrList(arrayForStepsMINUS);
		System.out.println("-------------------");

		// #1 FINAL CALC
		// Subtract from all MINUS--- values (e.g. -40% equally distributed on all
		// single zones)
		double FromLowerZoneDeductedPercentFromEachValueSingleSubtractedSummedSum = forSELLfromLowerZoneSubtractedPercentFromEachValueSubtractedSummedUpSum(
				arrayForStepsMINUS, cut2_percentPlusMinus);
		System.out.println("FromLowerZoneDeductedPercentFromEachValueSingleSubtractedSummedSum = "
				+ FromLowerZoneDeductedPercentFromEachValueSingleSubtractedSummedSum);
		// subtract from lower zone ---
		arrayForStepsMINUS = fromLowerZonesEQUALSubtract(arrayForStepsMINUS,
				(FromLowerZoneDeductedPercentFromEachValueSingleSubtractedSummedSum / arrayForStepsMINUS.length));

		// Add to all PLUS+++ values (e.g. +40% on all individual zones)
		// equally distributed)
		arrayForStepsPLUS = addToUpperZonesEQUALAdd(arrayForStepsPLUS,
				(FromLowerZoneDeductedPercentFromEachValueSingleSubtractedSummedSum / arrayForStepsPLUS.length));

		System.out.println("arrayForStepsPLUS");
		hlp.printOutArrList(arrayForStepsPLUS);
		System.out.println("-------------------");

		System.out.println("arrayForStepsMINUS");
		hlp.printOutArrList(arrayForStepsMINUS);
		System.out.println("-------------------");

		// #2 FINAL CALC
		// [DDD]
		// Calculate and redistribution of "how much % to subtract/add" from bottom to
		// top (for sell) at PLUS +++ with factor
		// TODO #2
		arrayForStepsPLUS = curveCalcAndRedistribution_forSELL(arrayForStepsPLUS, cut3_plusFactor);
		System.out.println("arrayForStepsPLUS (final calc)");
		hlp.printOutArrList(arrayForStepsPLUS);
		System.out.println("-------------------");

		// Calculate and redistribution of "how much % to subtract/add" from bottom to
		// top (for sell) at MINUS --- with factor
// TODO #1
		arrayForStepsMINUS = curveCalcAndRedistribution_forSELL(arrayForStepsMINUS, cut4_minusFactor);
		System.out.println("arrayForStepsMINUS (final calc)");
		hlp.printOutArrList(arrayForStepsMINUS);
		System.out.println("-------------------");

		outputResult = outputResult
				+ createOutputResult_forSELL(priceRangeZoneOutputs, arrayForStepsPLUS, arrayForStepsMINUS);

		// arrayForStepsPLUS = kruemmCalcUndUmverteilungPLUS(arrayForStepsPLUS,
		// cut3_plusFactor);

		//
		// ------------------------
		//
		// add in PLUS+++, based on kruemmPLUS+++
		// Factor
		// double[] ...
		// calculate how much % to subtract/add in MINUS---, based on kruemmMINUS---
		// Factor
		// double[] ...

		// Here simply distribute "half" from top to bottom OR vice versa (e.g. +33%)
		// upper half & -33% lower half)

		// End calculated values from [DDD] for [CCC] an
		// = results in new final values

		/**
		 * ZONES AMOUNT CALCULATION end
		 */

		return outputResult;

	}

	private String createOutputResult_forSELL(double[] priceRangeZoneOutputs, double[] arrayForStepsPLUS,
			double[] arrayForStepsMINUS) {
		String textOut = "\n";
		textOut = textOut + "for SELL:" + "\n";
		int priceRangeZoneOutputs_counter = 0;

		for (int i = 0; i < arrayForStepsPLUS.length; i++) {
			textOut = textOut + priceRangeZoneOutputs[priceRangeZoneOutputs_counter] + "\t" + arrayForStepsPLUS[i]
					+ "\n";

			priceRangeZoneOutputs_counter++;
		}

		textOut = textOut + "------------------------" + "\n";

		for (int i = 0; i < arrayForStepsMINUS.length; i++) {
			textOut = textOut + priceRangeZoneOutputs[priceRangeZoneOutputs_counter] + "\t" + arrayForStepsMINUS[i]
					+ "\n";

			priceRangeZoneOutputs_counter++;
		}

		return textOut;
	}

	private double[] curveCalcAndRedistribution_forSELL(double[] arrayForStepsMINUS, int cut4_minusFactor) {

		double tempAddSubValue = 0;
		double tempCut4_minusFactor = cut4_minusFactor;

		for (int i = 0; i < arrayForStepsMINUS.length / 2; i++) {

			tempAddSubValue = arrayForStepsMINUS[i] * (tempCut4_minusFactor / 100);

			arrayForStepsMINUS[i] = arrayForStepsMINUS[i] + tempAddSubValue;

			arrayForStepsMINUS[(arrayForStepsMINUS.length - 1
					- i)] = arrayForStepsMINUS[(arrayForStepsMINUS.length - 1 - i)] - tempAddSubValue;

			tempCut4_minusFactor = tempCut4_minusFactor * (tempCut4_minusFactor / 100);

		}

		return arrayForStepsMINUS;
	}

	private double[] addToUpperZonesEQUALAdd(double[] arrayForStepsPLUS, double valueToAdd) {
		for (int i = 0; i < arrayForStepsPLUS.length; i++) {
			arrayForStepsPLUS[i] = arrayForStepsPLUS[i] + valueToAdd;
		}
		return arrayForStepsPLUS;
	}

	private double[] fromLowerZonesEQUALSubtract(double[] arrayForStepsMINUS, double valueToSubract) {

		for (int i = 0; i < arrayForStepsMINUS.length; i++) {
			arrayForStepsMINUS[i] = arrayForStepsMINUS[i] - valueToSubract;
		}

		return arrayForStepsMINUS;
	}

	private double forSELLfromLowerZoneSubtractedPercentFromEachValueSubtractedSummedUpSum(double[] arrayForStepsMINUS,
			int cut2_percentPlusMinus) {
		double tempSumme = 0;

		for (int i = 0; i < arrayForStepsMINUS.length; i++) {

			tempSumme = tempSumme + (arrayForStepsMINUS[i] * ((double) cut2_percentPlusMinus / 100));
		}

		return tempSumme;
	}

	private double[] simpleFillArrayWithEqualSpread(int anzStepsForThisArray, double equalSpread) {

		double[] outputResult = new double[anzStepsForThisArray];

		for (int i = 0; i < anzStepsForThisArray; i++) {
			outputResult[i] = equalSpread;
		}

		return outputResult;
	}

	// @Override
//	public void stateChanged(ChangeEvent e) {
//		textfield_cut1_range.setText("R: " + slider_cut1_range.getValue());
//	}

	// @Override
//	public void actionPerformed(ActionEvent e) {
//		slider_cut1_range.setValue(Integer.parseInt(textfield_cut1_range.getText()));
//	}

}
