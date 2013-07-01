package ApplicationUI;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

import javax.swing.JTextArea;
import javax.swing.JTabbedPane;
import javax.xml.soap.SOAPException;

import DnBXmlMappers.DnBDataMapper;
import Domain.DnBData;
import Domain.ExperianLegalStatus;
import ExperianAlertsRequestWS.*;
import ExperianBusinessTargetWS.BusinessTargetOutput;
import ExperianBusinessTargetWS.SearchResults;
import ExperianLtdCompanySearchWS.LtdCompanyData;
import ExperianNonLtdBusinessSearchWS.NonLtdBusinessData;
import WebServiceClients.AddRegistrationClient;
import WebServiceClients.ExperianAlertsAddRemoveClient;
import WebServiceClients.ExperianAlertsRequestClient;
import WebServiceClients.ExperianBusinessTargetClient;
import WebServiceClients.ExperianLtdCompanySearchClient;
import WebServiceClients.ExperianNonLtdBusinessSearch;
import WebServiceClients.GetCompanyDetailsClient;
import WebServiceClients.GetNotificationsClient;
import WebServiceClients.GetRegistrationActivityClient;
import WebServiceClients.GetRegistrationListClient;
import WebServiceClients.LookUpClient;
import javax.swing.JScrollPane;



public class DnBImportForm extends JFrame {

	// increment if breaking change to serializaion
	public static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtCompanyName;
	private JLabel lblPostCode;
	private JTextField txtPostCode;
	private JLabel lblDunsNumber;
	private JTextField txtDuns;
	private JButton btnGetData;
	private JPanel panel_1;
	private JLabel lblNewLabel;
	private JTextField txtRegDunsNo;
	private JButton btnAddRegistration;
	private JButton btnGetRegistrations;
	private JButton btnGetregistrationActivity;
	private JButton btnGetNotifications;
	private JTextField txtDateFrom;
	private JLabel lblFrom;
	private JLabel lblTo;
	private JTextField txtDateTo;
	private JPanel panel_2;
	private JLabel lblUserName;
	private JLabel lblPassword;
	private JTextField txtUserName;
	private JTextField txtPassword;
	private JTextField txtResultTicket;
	private JTextArea txtFormattedResults;
	private JPanel panel_5;
	private JLabel label;
	private JTextField txtExperianCompanyName;
	private JButton btnLookup;
	private JTextArea txtResults;
	private JTextField txtExperianRef;
	private JButton btnGetNonltd;
	private JButton btnAddReg;
	private JButton btnRemove;
	private JLabel lblLimited;
	private JLabel lblNonlimited;
	private JButton btnDelRegNonLtd;
	private JButton btnAddRegNonLtd;
	private JLabel label_1;
	private JTextField txtExperianFrom;
	private JLabel label_2;
	private JTextField txtExperianTo;
	private JButton btnGetAlerts;
	private JLabel lblPostCode_1;
	private JTextField txtExperianPostCode;
	
	/**
	 * Create the frame.
	 */
	public DnBImportForm() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 680, 568);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBounds(27, 12, 586, 238);
		contentPane.add(tabbedPane);
		
		panel_1 = new JPanel();
		tabbedPane.addTab("DnB Registrations", null, panel_1, null);
		panel_1.setLayout(null);
		
		lblNewLabel = new JLabel("DUNS No :");
		lblNewLabel.setBounds(12, 31, 122, 15);
		panel_1.add(lblNewLabel);
		
		txtRegDunsNo = new JTextField();
		txtRegDunsNo.setBounds(101, 29, 114, 19);
		panel_1.add(txtRegDunsNo);
		txtRegDunsNo.setColumns(10);
		
		btnAddRegistration = new JButton("Add Registration");
		btnAddRegistration.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				addRegistration();
			}
		});
		btnAddRegistration.setBounds(259, 26, 211, 25);
		panel_1.add(btnAddRegistration);
		
		btnGetRegistrations = new JButton("Get Registrations");
		btnGetRegistrations.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				getRegistrationsList();
			}
		});
		btnGetRegistrations.setBounds(259, 96, 211, 25);
		panel_1.add(btnGetRegistrations);
		
		btnGetregistrationActivity = new JButton("Get Registration Activity");
		btnGetregistrationActivity.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				getRegistrationsActivity();
			}
		});
		btnGetregistrationActivity.setBounds(259, 136, 211, 25);
		panel_1.add(btnGetregistrationActivity);
		
		btnGetNotifications = new JButton("Get Notifications");
		btnGetNotifications.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				getNotifications();
			}
		});
		btnGetNotifications.setBounds(259, 173, 211, 25);
		panel_1.add(btnGetNotifications);
		
		txtDateFrom = new JTextField();
		txtDateFrom.setText("04/05/2013");
		txtDateFrom.setBounds(101, 115, 114, 19);
		panel_1.add(txtDateFrom);
		txtDateFrom.setColumns(10);
		
		lblFrom = new JLabel("From");
		lblFrom.setBounds(13, 117, 70, 15);
		panel_1.add(lblFrom);
		
		lblTo = new JLabel("To");
		lblTo.setBounds(12, 144, 70, 15);
		panel_1.add(lblTo);
		
		txtDateTo = new JTextField();
		txtDateTo.setText("08/05/2013");
		txtDateTo.setBounds(101, 142, 114, 19);
		panel_1.add(txtDateTo);
		txtDateTo.setColumns(10);
		
		txtResultTicket = new JTextField();
		txtResultTicket.setBounds(101, 174, 114, 19);
		panel_1.add(txtResultTicket);
		txtResultTicket.setColumns(10);
		
		JLabel lblResultticket = new JLabel("ResultTicket");
		lblResultticket.setBounds(13, 176, 70, 15);
		panel_1.add(lblResultticket);
		
		JPanel panel = new JPanel();
		tabbedPane.addTab("DnB Simple", null, panel, null);
		panel.setLayout(null);
		
		lblDunsNumber = new JLabel("DUNS Number :");
		lblDunsNumber.setBounds(12, 123, 114, 15);
		panel.add(lblDunsNumber);
		
		txtDuns = new JTextField();
		txtDuns.setBounds(153, 121, 114, 19);
		panel.add(txtDuns);
		txtDuns.setColumns(10);
		
		btnGetData = new JButton("Get Data");
		btnGetData.setBounds(386, 118, 117, 25);
		panel.add(btnGetData);
		
		lblPostCode = new JLabel("Post Code :");
		lblPostCode.setBounds(12, 54, 101, 15);
		panel.add(lblPostCode);
		
		txtPostCode = new JTextField();
		txtPostCode.setBounds(153, 52, 114, 19);
		panel.add(txtPostCode);
		txtPostCode.setColumns(10);
		
		JLabel lblCompanyName = new JLabel("Company Name : ");
		lblCompanyName.setBounds(12, 17, 131, 15);
		panel.add(lblCompanyName);
		
		txtCompanyName = new JTextField();
		txtCompanyName.setBounds(153, 15, 203, 19);
		panel.add(txtCompanyName);
		txtCompanyName.setColumns(10);
		
		JButton btnRunLookup = new JButton("Run LookUp");
		btnRunLookup.setBounds(386, 12, 137, 25);
		panel.add(btnRunLookup);
		
		panel_2 = new JPanel();
		tabbedPane.addTab("DnB Account Details", null, panel_2, null);
		panel_2.setLayout(null);
		
		lblUserName = new JLabel("User Name :");
		lblUserName.setBounds(26, 24, 109, 15);
		panel_2.add(lblUserName);
		
		lblPassword = new JLabel("Password :");
		lblPassword.setBounds(26, 68, 87, 15);
		panel_2.add(lblPassword);
		
		txtUserName = new JTextField();
		txtUserName.setText("unit4test");
		txtUserName.setBounds(133, 22, 114, 19);
		panel_2.add(txtUserName);
		txtUserName.setColumns(10);
		
		txtPassword = new JTextField();
		txtPassword.setText("ed1r1ver");
		txtPassword.setBounds(133, 66, 114, 19);
		panel_2.add(txtPassword);
		txtPassword.setColumns(10);
		
		panel_5 = new JPanel();
		tabbedPane.addTab("Experian", null, panel_5, null);
		panel_5.setLayout(null);
		
		label = new JLabel("Company Name : ");
		label.setBounds(30, 10, 122, 15);
		panel_5.add(label);
		
		txtExperianCompanyName = new JTextField();
		txtExperianCompanyName.setBounds(153, 8, 177, 19);
		txtExperianCompanyName.setColumns(10);
		panel_5.add(txtExperianCompanyName);
		
		btnLookup = new JButton("LookUp");
		btnLookup.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				runExperianCompanyLookup();
			}
		});
		btnLookup.setBounds(340, 8, 100, 19);
		panel_5.add(btnLookup);
		
		JLabel lblExperianReference = new JLabel("Experian ref : ");
		lblExperianReference.setBounds(30, 80, 122, 15);
		panel_5.add(lblExperianReference);
		
		txtExperianRef = new JTextField();
		txtExperianRef.setColumns(10);
		txtExperianRef.setBounds(153, 78, 177, 19);
		panel_5.add(txtExperianRef);
		
		JButton btnGetDetails = new JButton("Get");
		btnGetDetails.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				getExperianLtdDetails();
			}
		});
		btnGetDetails.setBounds(340, 78, 100, 19);
		panel_5.add(btnGetDetails);
		
		btnGetNonltd = new JButton("Get");
		btnGetNonltd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				getExperianNonLtdDetails();
			}
		});
		btnGetNonltd.setBounds(450, 78, 100, 19);
		panel_5.add(btnGetNonltd);
		
		btnAddReg = new JButton("Add Reg");
		btnAddReg.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				experianRegistration(ExperianLegalStatus.LIMITED, "a");
			}
		});
		btnAddReg.setBounds(340, 99, 100, 19);
		panel_5.add(btnAddReg);
		
		btnRemove = new JButton("Del Reg");
		btnRemove.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				experianRegistration(ExperianLegalStatus.LIMITED, "r");
			}
		});
		btnRemove.setBounds(340, 121, 100, 19);
		panel_5.add(btnRemove);
		
		lblLimited = new JLabel("Limited");
		lblLimited.setBounds(340, 58, 70, 15);
		panel_5.add(lblLimited);
		
		lblNonlimited = new JLabel("NonLimited");
		lblNonlimited.setBounds(451, 58, 99, 15);
		panel_5.add(lblNonlimited);
		
		btnDelRegNonLtd = new JButton("Del Reg");
		btnDelRegNonLtd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				experianRegistration(ExperianLegalStatus.NONLIMITED, "r");
			}
		});
		btnDelRegNonLtd.setBounds(450, 121, 100, 19);
		panel_5.add(btnDelRegNonLtd);
		
		btnAddRegNonLtd = new JButton("Add Reg");
		btnAddRegNonLtd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				experianRegistration(ExperianLegalStatus.NONLIMITED, "a");
			}
		});
		btnAddRegNonLtd.setBounds(450, 99, 100, 19);
		panel_5.add(btnAddRegNonLtd);
		
		label_1 = new JLabel("From");
		label_1.setBounds(65, 151, 70, 15);
		panel_5.add(label_1);
		
		txtExperianFrom = new JTextField();
		txtExperianFrom.setText("01/06/2013");
		txtExperianFrom.setColumns(10);
		txtExperianFrom.setBounds(108, 149, 85, 19);
		panel_5.add(txtExperianFrom);
		
		label_2 = new JLabel("To");
		label_2.setBounds(208, 151, 32, 15);
		panel_5.add(label_2);
		
		txtExperianTo = new JTextField();
		txtExperianTo.setText("01/07/2013");
		txtExperianTo.setColumns(10);
		txtExperianTo.setBounds(245, 149, 85, 19);
		panel_5.add(txtExperianTo);
		
		btnGetAlerts = new JButton("Get Alerts");
		btnGetAlerts.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				getExperianAlerts();
			}
		});
		btnGetAlerts.setBounds(340, 149, 116, 19);
		panel_5.add(btnGetAlerts);
		
		lblPostCode_1 = new JLabel("Post Code :");
		lblPostCode_1.setBounds(30, 31, 122, 15);
		panel_5.add(lblPostCode_1);
		
		txtExperianPostCode = new JTextField();
		txtExperianPostCode.setColumns(10);
		txtExperianPostCode.setBounds(153, 29, 177, 19);
		panel_5.add(txtExperianPostCode);
		
		JTabbedPane tabbedPane_1 = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane_1.setBounds(24, 262, 642, 265);
		contentPane.add(tabbedPane_1);
		
		JPanel panel_3 = new JPanel();
		panel_3.setLayout(null);
		tabbedPane_1.addTab("Results", null, panel_3, null);
		
		txtFormattedResults = new JTextArea();
		txtFormattedResults.setLineWrap(true);
		
		JScrollPane scrollPane1 = new JScrollPane(txtFormattedResults);
		scrollPane1.setBounds(0, 0, 642, 250);
		panel_3.add(scrollPane1);
		
		JPanel panel_4 = new JPanel();
		panel_4.setLayout(null);
		tabbedPane_1.addTab("Xml", null, panel_4, null);
				
		txtResults = new JTextArea();
		txtResults.setLineWrap(true);

		JScrollPane scrollPane = new JScrollPane(txtResults);
		scrollPane.setBounds(0, 0, 642, 250);
		panel_4.add(scrollPane);
		
		btnRunLookup.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				runCompanyLookUp();
			}
		});
		btnGetData.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				getCompanyDetails();
			}
		});
	}
	
	private void getNotifications()
	{
		Date from = GetDateFromString(txtDateFrom.getText());
		Date to = GetDateFromString(txtDateTo.getText());
		
		GetNotificationsClient client = new GetNotificationsClient(txtUserName.getText(), txtPassword.getText());
		try
		{
			txtResults.setText(client.getNotifications(from, to, txtResultTicket.getText()));
		}
		catch(Exception e)
		{
			txtResults.setText(e.getMessage());
		}
	}
	
	private Date GetDateFromString(String dateString)
	{
		Date dt = new Date();
		try
		{
			dt = DateFormat.getDateInstance(DateFormat.SHORT, Locale.UK).parse(dateString);
		}
		catch(Exception e)
		{
			System.out.print(e.getMessage());
		}
		return dt;
	}
	
	private void getRegistrationsActivity()
	{
		Date from = GetDateFromString(txtDateFrom.getText());
		Date to = GetDateFromString(txtDateTo.getText());
		
		GetRegistrationActivityClient activityClient = new GetRegistrationActivityClient(txtUserName.getText(), txtPassword.getText());
		try
		{
			txtResults.setText(activityClient.getRegistrationActivity(from, to));
		}
		catch(Exception e)
		{
			txtResults.setText(e.getMessage());
		}
	}
	
	private void getRegistrationsList()
	{
		GetRegistrationListClient regsClient = new GetRegistrationListClient(txtUserName.getText(), txtPassword.getText());
		try
		{
			txtResults.setText(regsClient.getRegistrationList(txtResultTicket.getText()));
		}
		catch(Exception e)
		{
			txtResults.setText(e.getMessage());
		}
	}
	
	private void runCompanyLookUp()
	{
		String companyName = txtCompanyName.getText(); 
		String postCode = txtPostCode.getText();
		if( companyName.length() > 0)
		{
			LookUpClient lookUpRequest = new LookUpClient(txtUserName.getText(), txtPassword.getText());
			try
			{
				String res = lookUpRequest.performLookUp(companyName, postCode);
				txtResults.setText(res);
			}
			catch(Exception e)
			{
				txtResults.setText(e.getMessage());
			}
		}
	}
	
	private void runExperianCompanyLookup()
	{
		String companyName = txtExperianCompanyName.getText();
		String postCode = txtExperianPostCode.getText();
		if(companyName.length() > 0)
		{
			ExperianBusinessTargetClient client = new ExperianBusinessTargetClient();
			try
			{
				BusinessTargetOutput output = client.runBusinessTargetSearch(companyName, postCode);
				if(output.getError()!=null)
					txtResults.setText(output.getError().getMessage());
				else
				{
					String results = "";
					for(SearchResults res : output.getSearchResults())
					{
						results += "Business Ref : " + res.getBusinessRef()
								 + "\nName : " + res.getName()
								 + "\nLegal Status : " + res.getLegalStatus()
								 + "\nAddress 1 : " + res.getBusinessLocation().getLocationLine1()
								 + "\nPost Code : " + res.getBusinessLocation().getPostcode()
								 + "\n---------------------------------------------------\n";
					}
					txtFormattedResults.setText(results);
				}
			}
			catch(SOAPException soape)
			{
				txtResults.setText("SOAP EXCEPTION : " + soape.getMessage());
			}
		}
	}
	
	private void getExperianLtdDetails()
	{
		String ref = txtExperianRef.getText();
		if(ref.length()>0)
		{
			ExperianLtdCompanySearchClient client = new ExperianLtdCompanySearchClient();
			try 
			{
				LtdCompanyData lcd = client.getCompany(ref);
				if(lcd.getError()!=null)
				{
					txtFormattedResults.setText(lcd.getError().getErrorCode() + " : " +lcd.getError().getMessage());
				}
				else
				{
					String results = "";
					results += "Business Ref : " + lcd.getRegNumber()
							 + "\nName : " + lcd.getCommercialName()
							 + "\nDelphi Score : " + lcd.getCommercialDelphi().getCommDelphiScore()
							 + "\nAverage Days beyond Terms 3m : " + String.valueOf(lcd.getPaymentPerformance().getPaymentFull().getAvgDBT3Mnths())
							 + "\nIndustry Averge Days beyond terms 3m : " + String.valueOf(lcd.getPaymentPerformance().getPaymentFull().getIndAvgDBT3Mnths())
							 + "\n---------------------------------------------------\n";
					txtFormattedResults.setText(results);
					
					RawExperianLtdCompanyClient rawClient = new RawExperianLtdCompanyClient();
					txtResults.setText(rawClient.getXml(ref));
				}
			} 
			catch (SOAPException soape) 
			{
				txtFormattedResults.setText("SOAP EXCEPTION : " + soape.getMessage());
			}
		}
	}
	
	private void experianRegistration(ExperianLegalStatus status, String action)
	{
		String ref = txtExperianRef.getText();
		if(ref.length()>0)
		{
			ExperianAlertsAddRemoveClient client = new ExperianAlertsAddRemoveClient();
			try 
			{
				if(action.equalsIgnoreCase("a"))
				{
					if(client.addAlert(ref, status))
						txtFormattedResults.setText("registered - " + ref);
					else
						txtFormattedResults.setText("failed to register - " + ref);
				}
				else if(action.equalsIgnoreCase("r"))
				{
					if(client.removeAlert(ref, status))
						txtFormattedResults.setText("unregistered - " + ref);
					else
						txtFormattedResults.setText("failed to unregister - " + ref);
				}
			} 
			catch (SOAPException soape) 
			{
				txtFormattedResults.setText("SOAP EXCEPTION : " + soape.getMessage());
			}
			catch (Exception e) 
			{
				txtFormattedResults.setText("EXCEPTION : " + e.getMessage());
			}
		}
	}
	
	private void getExperianNonLtdDetails()
	{
		String ref = txtExperianRef.getText();
		if(ref.length()>0)
		{
			ExperianNonLtdBusinessSearch client = new ExperianNonLtdBusinessSearch();
			try 
			{
				NonLtdBusinessData lcd = client.getCompany(ref);
				if(lcd.getError()!=null)
				{
					txtFormattedResults.setText(lcd.getError().getErrorCode() + " : " +lcd.getError().getMessage());
				}
				else
				{
					String results = "";
					results += "Business Ref : " + lcd.getNonLimitedKey()
							 + "\nName : " + lcd.getBusinessName()
							 + "\nDelphi Score : " + lcd.getCommercialDelphi().getCommDelphiScore()
							 //+ "\nAverage Days beyond Terms 3m : " + String.valueOf(lcd.getPaymentPerformance().getPaymentFull().getAvgDBT3Mnths())
							 + "\n---------------------------------------------------\n";
					txtFormattedResults.setText(results);
	
					RawExperianNonLtdBusinessClient rawClient = new RawExperianNonLtdBusinessClient();
					txtResults.setText(rawClient.getXml(ref));
				}
			} 
			catch (SOAPException soape) 
			{
				txtFormattedResults.setText("SOAP EXCEPTION : " + soape.getMessage());
			}
		}
	}
	
	private void getExperianAlerts()
	{
		ExperianAlertsRequestClient client = new ExperianAlertsRequestClient();
		Date from = GetDateFromString(txtExperianFrom.getText());
		Date to = GetDateFromString(txtExperianTo.getText());
		try 
		{
			String result  = "";
			AlertsMessageOutput output = client.getAlerts(from, to);
			if(output.getAlertMessage().size()>0)
			{
				for(AlertMessage alert : output.getAlertMessage())
				{
					result += "REF : " + alert.getBusinessRef()
										+ "\nName : " + alert.getCommercialName()
										+ "\nEvent Group : " + alert.getEventGroup()
										+ "\nEvent Type : " + alert.getEventType()
										+ "\nDate Loaded : " + getDateStringFromCCYYMMDD(alert.getDateLoaded())
										+ "\nEvent Date : " + getDateStringFromCCYYMMDD(alert.getEventDate())
										+ "\n-------------------------------------------------------------------\n";
				}
			}
			else if(output.getError()!=null)
			{
				result = "Error - " + output.getError().getErrorCode() + " : " + output.getError().getMessage();
			}
			else
				result = "No results returned.";
			txtFormattedResults.setText(result);
			
		} 
		catch (SOAPException soape) 
		{
			txtFormattedResults.setText("SOAP EXCEPTION : " + soape.getMessage());
		}
	}
	
	private String getDateStringFromCCYYMMDD(CCYYMMDD date)
	{
		return date.getCCYY() + "-" + date.getMM() + "-" + date.getDD();
	}
	
	private void getCompanyDetails()
	{
		String dunsNo = txtDuns.getText();
		if( dunsNo.length() > 0)
		{
			GetCompanyDetailsClient request = new GetCompanyDetailsClient(txtUserName.getText(), txtPassword.getText());
			try
			{
				String res = request.getCompanyDetails(dunsNo);
				txtResults.setText(res);

				DnBDataMapper mapper = new DnBDataMapper();
				DnBData companyData = mapper.getDnBDataFromXml(res);
				txtFormattedResults.setText(companyData.toString());
			}
			catch ( Exception e)
			{
				txtResults.setText(e.getMessage());				
			}
		}
	}
	
	private void addRegistration()
	{
		String dunsNo = txtRegDunsNo.getText();
		if( dunsNo.length() > 0)
		{
			AddRegistrationClient request = new AddRegistrationClient(txtUserName.getText(), txtPassword.getText());
			try
			{
				txtResults.setText(request.addRegistration(dunsNo));
			}
			catch ( Exception e)
			{
				txtResults.setText(e.getMessage());				
			}
		}
	}
}