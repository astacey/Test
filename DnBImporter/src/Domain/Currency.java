package Domain;

public enum Currency 
{
	ADP("ADP","Andorran Peseta"),AED("AED","UAE Dirham"),AFA("AFA","Afghani"),ALL("ALL","Lek"),AMS("AMS","Armenian Dram"),ANG("ANG","Netherlands Antillian Guilder"),AON("AON","New Kwanza"),ARS("ARS","Argentine Peso"),ATS("ATS","Schilling"),
	AUD("AUD","Australian Dollar"),AWG("AWG","Aruban Guilder"),AZM("AZM","Azerbaijanian Manat"),BBD("BBD","Barbados Dollar"),BDT("BDT","Taka"),BEF("BEF","Belgian Franc"),BGL("BGL","Lev"),BHD("BHD","Bahraini Dinar"),BIF("BIF","Burundi Franc"),
	BMD("BMD","Bermudian Dollar"),BND("BND","Brunei Dollar"),BOB("BOB","Boliviano"),BOP("BOP","Bolivian Peso (Historical currency)"),BOV("BOV","Mvdol"),BRC("BRC","Cruzado (Historical currency),"),BRE("BRE","Cruzeiro (Historical currency)"),
	BRL("BRL","Brazilan Real"),BRN("BRN","New Cruzado (Historical currency),"),BRR("BRR","Cruzeiro Real (Historical currency)"),BSD("BSD","Bahamian Dollar"),BTN("BTN","Ngultrum"),BYB("BYB","Belarussian Ruble"),BZD("BZD","Belize Dollar"),CAD("CAD","Canadian Dollar"),
	CHF("CHF","Swiss Franc"),CLF("CLF","Unidades de Formento"),CLP("CLP","Chilean Peso"),CNY("CNY","Yuan Renminbi"),COP("COP","Colombian Peso"),CRC("CRC","Costa Rican Colon"),CSK("CSK","Czechoslovakia Koruna (Historical currency)"),CUP("CUP","Cuban Peso"),
	CVE("CVE","Cape Verde Escudo"),CYP("CYP","Cyprus Pound"),CZK("CZK","Czech Koruna"),DEM("DEM","Deutsche Mark"),DJF("DJF","Djibouti Franc"),DKK("DKK","Danish Krone"),DOP("DOP","Dominican Peso"),DZD("DZD","Algerian Dinar"),ECS("ECS","Sucre"),
	ECV("ECV","Unidad de Valor Constante (UVC)"),EEK("EEK","Kroon"),EGP("EGP","Egyptian Pound"),EQE("EQE","Equatorial Guinean Ekuele (Historical currency),"),ESP("ESP","Spanish Peseta"),ETB("ETB","Ethiopian Birr"),EUR("EUR","Euro"),FIM("FIM","Markka"),
	FJD("FJD","Fiji Dollar"),FKP("FKP","Falkland Islands Pound"),FRF("FRF","French Franc"),GBP("GBP","Pound Sterling"),GEL("GEL","Georgian Lari"),GEP("GEP","Georgia Kupon (Historical currency),"),GHC("GHC","Cedi"),GIP("GIP","Gibralter Pound"),
	GMD("GMD","Dalasi"),GNF("GNF","Guinea Franc"),GNS("GNS","Guinea Sily (Historical currency),"),GQE("GQE","Equatorial Guinea Ekwele (Historical currency),"),GRD("GRD","Drachma"),GTQ("GTQ","Quetzal"),GWP("GWP","Guinea-Bissau Peso"),
	GYD("GYD","Guyana Dollar"),HKD("HKD","Hong Kong Dollar"),HNL("HNL","Lempira"),HRD("HRD","Croatian Dinar (Historical currency),"),HRK("HRK","Croatian Kuna"),HTG("HTG","Gourde"),HUF("HUF","Forint"),IDR("IDR","Rupiah"),IEP("IEP","Irish Pound"),ILS("ILS","Shekel"),
	INR("INR","Indian Rupee"),IQD("IQD","Iraqi Dinar"),IRR("IRR","Iranian Rial"),ISK("ISK","Iceland Krona"),ITL("ITL","Italian Lira"),JMD("JMD","Jamaican Dollar"),JOD("JOD","Jordanian Dinar"),JPY("JPY","Yen"),KES("KES","Kenyan Shilling"),KGS("KGS","Som"),KHR("KHR","Riel"),
	KMF("KMF","Comoro Franc"),KPW("KPW","North Korean Won"),KRW("KRW","Won"),KWD("KWD","Kuwaiti Dinar"),KYD("KYD","Cayman Islands Dollar"),KZT("KZT","Tenge"),LAK("LAK","Kip"),LBP("LBP","Lebanese Pound"),LKR("LKR","Sri Lanka Rupee"),LRD("LRD","Liberian Dollar"),LSL("LSL","Loti"),
	LSM("LSM","Lesotho Maloti (Historical currency),"),LTL("LTL","Lithuanian Litus"),LUF("LUF","Luxembourg Franc"),LVL("LVL","Latvian Lats"),LYD("LYD","Libyan Dinar"),MAD("MAD","Moroccan Dirham"),MDL("MDL","Moldovan Leu"),MGF("MGF","Malagasy Franc"),MKD("MKD","Denar"),MLF("MLF","Mali Franc (Historical currency)"),
	MMK("MMK","Kyat"),MNT("MNT","Tugrik"),MOP("MOP","Pataca"),MRO("MRO","Ouguiya"),MTL("MTL","Maltese Lira"),MTP("MTP","Maltese Pound (Historical currency),"),MUR("MUR","Mauritius Rupee"),MVR("MVR","Rufiyaa"),MWK("MWK","Kwacha"),MXN("MXN","Mexican Nuevo Peso"),MXP("MXP","Mexican Peso"),MYR("MYR","Malaysian Ringgit"),
	MZM("MZM","Metical"),NAD("NAD","Namibia Dollar"),NGN("NGN","Naira"),NIO("NIO","Cordoba Oro"),NLG("NLG","Netherlands Guilder"),NOK("NOK","Norwegian Krone"),NPR("NPR","Nepalese Rupee"),NZD("NZD","New Zealand Dollar"),OMR("OMR","Rial Omani"),PAB("PAB","Balboa"),PGK("PGK","Kina"),PHP("PHP","Philippine Peso"),PKR("PKR","Pakistan Rupee"),
	PLN("PLN","Zloty"),PLZ("PLZ","Zloty"),PTE("PTE","Portuguese Escudo"),PYG("PYG","Guarani"),QAR("QAR","Qatari Rial"),ROL("ROL","Leu"),RUR("RUR","Russian Ruble"),RWF("RWF","Rwanda Franc"),SAR("SAR","Saudi Riyal"),SBD("SBD","Solomon Islands Dollar"),SCR("SCR","Seychelles Rupee"),SDD("SDD","Sudanese Dinar"),SDP("SDP","Sudanese Pound"),
	SEK("SEK","Swedish Krone"),SGD("SGD","Singapore Dollar"),SHP("SHP","Saint Helena Pound"),SIT("SIT","Tolar"),SKK("SKK","Slovak Koruna"),SLL("SLL","Leone"),SOS("SOS","Somali Shilling"),SRG("SRG","Suriname Guilder"),STD("STD","Dobra"),SUR("SUR","Rouble (Historical currency)"),SVC("SVC","El Salvador Colon"),SYP("SYP","Syrian Pound"),
	SZL("SZL","Lilangeni"),THB("THB","Baht"),TJR("TJR","Tajik Ruble"),TMM("TMM","Manat"),TND("TND","Tunisian Dinar"),TOP("TOP","Pa'anga"),TPE("TPE","Timor Escudo"),TRL("TRL","Turkish Lira"),TTD("TTD","Trinidad and Tobago Dollar"),TWD("TWD","New Taiwan Dollar"),TZS("TZS","Tanzanian Shilling"),UAK("UAK","Karbovanet"),
	UGX("UGX","Uganda Shilling"),USD("USD","US Dollar"),UYP("UYP","Uruguayan Peso"),UYU("UYU","Peso Uruguayo"),UZS("UZS","Uzbekistan Sum"),VEB("VEB","Bolivar"),VND("VND","Dong"),VUV("VUV","Vatu"),WST("WST","Tala"),XAF("XAF","CFA Franc BEAC"),XCD("XCD","East Caribbean Dollar"),XDR("XDR","SDR"),XEU("XEU","European Currency Unit"),
	XOF("XOF","CFA Franc BCEAO"),XPF("XPF","CFP Franc"),YDD("YDD","Yemeni Dinar"),YER("YER","Yemeni Rial"),YUN("YUN","Yugoslavian Dinar"),ZAL("ZAL","Financial Rand"),ZAR("ZAR","Rand"),ZMK("ZMK","Kwacha"),ZRN("ZRN","New Zaire"),ZWD("ZWD","Zimbabwe Dollar");
	
	private String description;
	private String code;
	
	private Currency(String code, String description)
	{
		this.code=code;
		this.description=description;
	}
	
	public String getDescription()
	{
		return description;
	}

	public String getCode()
	{
		return code;
	}
	
	public static Currency getCurrencyFromCode(String code)
	{
		for(Currency c : Currency.values())
		{
			if(c.getCode().equalsIgnoreCase(code))
				return c;
		}
		return null;
	}
}
