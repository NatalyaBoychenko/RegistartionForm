package com.virtualpairprogrammers.thymeleafform;

import java.util.Map;
import java.util.TreeMap;


public class AddUserModel {
    private String userName;
    private String password;
    private String repeatPassword;
    private String title;
    private String firstName;
    private String lastName;
    private String address1;
    private String address2;
    private String address3;
    private String address4;
    private String zip;
    private String country;

    public AddUserModel() {
    }

    public AddUserModel(String userName, String password, String repeatPassword, String title, String firstName, String lastName, String address1, String address2, String address3, String address4, String zip, String country) {
        this.userName = userName;
        this.password = password;
        this.repeatPassword = repeatPassword;
        this.title = title;
        this.firstName = firstName;
        this.lastName = lastName;
        this.address1 = address1;
        this.address2 = address2;
        this.address3 = address3;
        this.address4 = address4;
        this.zip = zip;
        this.country = country;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getRepeatPassword() {
        return repeatPassword;
    }

    public void setRepeatPassword(String repeatPassword) {
        this.repeatPassword = repeatPassword;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getAddress1() {
        return address1;
    }

    public void setAddress1(String address1) {
        this.address1 = address1;
    }

    public String getAddress2() {
        return address2;
    }

    public void setAddress2(String address2) {
        this.address2 = address2;
    }

    public String getAddress3() {
        return address3;
    }

    public void setAddress3(String address3) {
        this.address3 = address3;
    }

    public String getAddress4() {
        return address4;
    }

    public void setAddress4(String address4) {
        this.address4 = address4;
    }

    public String getZip() {
        return zip;
    }

    public void setZip(String zip) {
        this.zip = zip;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public Map<String, String> getCountries() {
        Map<String, String> countries = new TreeMap<String, String>();
        countries.put("AFG", "Afghanistan");
        countries.put("ALA", "AlandIslands");
        countries.put("ALB", "Albania");
        countries.put("DZA", "Algeria");
        countries.put("ASM", "AmericanSamoa");
        countries.put("AND", "Andorra");
        countries.put("AGO", "Angola");
        countries.put("AIA", "Anguilla");
        countries.put("ATA", "Antarctica");
        countries.put("ATG", "Antigua and Barbuda");
        countries.put("ARG", "Argentina");
        countries.put("ARM", "Armenia");
        countries.put("ABW", "Aruba");
        countries.put("AUS", "Australia");
        countries.put("AUT", "Austria");
        countries.put("AZE", "Azerbaijan");
        countries.put("BHS", "Bahamas");
        countries.put("BHR", "Bahrain");
        countries.put("BGD", "Bangladesh");
        countries.put("BRB", "Barbados");
        countries.put("BLR", "Belarus");
        countries.put("BEL", "Belgium");
        countries.put("BLZ", "Belize");
        countries.put("BEN", "Benin");
        countries.put("BMU", "Bermuda");
        countries.put("BTN", "Bhutan");
        countries.put("BOL", "Bolivia");
        countries.put("BIH", "Bosnia and Herzegovina");
        countries.put("BWA", "Botswana");
        countries.put("BVT", "Bouvet Island");
        countries.put("BRA", "Brazil");
        countries.put("VGB", "British Virgin Islands");
        countries.put("IOT", "British Indian Ocean Territory");
        countries.put("BRN", "Brunei Darussalam");
        countries.put("BGR", "Bulgaria");
        countries.put("BFA", "BurkinaFaso");
        countries.put("BDI", "Burundi");
        countries.put("KHM", "Cambodia");
        countries.put("CMR", "Cameroon");
        countries.put("CAN", "Canada");
        countries.put("CPV", "CapeVerde");
        countries.put("CYM", "Cayman Islands");
        countries.put("CAF", "Central African Republic");
        countries.put("TCD", "Chad");
        countries.put("CHL", "Chile");
        countries.put("CHN", "China");
        countries.put("HKG", "Hong Kong,SAR China");
        countries.put("MAC", "Macao,SAR China");
        countries.put("CXR", "Christmas Island");
        countries.put("CCK", "Cocos (Keeling) Islands");
        countries.put("COL", "Colombia");
        countries.put("COM", "Comoros");
        countries.put("COG", "Congo (Brazzaville)");
        countries.put("COD", "Congo,(Kinshasa)");
        countries.put("COK", "CookIslands");
        countries.put("CRI", "Costa Rica");
        countries.put("CIV", "Cфted'Ivoire");
        countries.put("HRV", "Croatia");
        countries.put("CUB", "Cuba");
        countries.put("CYP", "Cyprus");
        countries.put("CZE", "Czech Republic");
        countries.put("DNK", "Denmark");
        countries.put("DJI", "Djibouti");
        countries.put("DMA", "Dominica");
        countries.put("DOM", "Dominican Republic");
        countries.put("ECU", "Ecuador");
        countries.put("EGY", "Egypt");
        countries.put("SLV", "ElSalvador");
        countries.put("GNQ", "Equatorial Guinea");
        countries.put("ERI", "Eritrea");
        countries.put("EST", "Estonia");
        countries.put("ETH", "Ethiopia");
        countries.put("FLK", "Falkland Islands (Malvinas)");
        countries.put("FRO", "Faroe Islands");
        countries.put("FJI", "Fiji");
        countries.put("FIN", "Finland");
        countries.put("FRA", "France");
        countries.put("GUF", "French Guiana");
        countries.put("PYF", "French Polynesia");
        countries.put("ATF", "French Southern Territories");
        countries.put("GAB", "Gabon");
        countries.put("GMB", "Gambia");
        countries.put("GEO", "Georgia");
        countries.put("DEU", "Germany");
        countries.put("GHA", "Ghana");
        countries.put("GIB", "Gibraltar");
        countries.put("GRC", "Greece");
        countries.put("GRL", "Greenland");
        countries.put("GRD", "Grenada");
        countries.put("GLP", "Guadeloupe");
        countries.put("GUM", "Guam");
        countries.put("GTM", "Guatemala");
        countries.put("GGY", "Guernsey");
        countries.put("GIN", "Guinea");
        countries.put("GNB", "Guinea-Bissau");
        countries.put("GUY", "Guyana");
        countries.put("HTI", "Haiti");
        countries.put("HMD", "Heard and Mcdonald Islands");
        countries.put("VAT", "Holy See (Vatican City State)");
        countries.put("HND", "Honduras");
        countries.put("HUN", "Hungary");
        countries.put("ISL", "Iceland");
        countries.put("IND", "India");
        countries.put("IDN", "Indonesia");
        countries.put("IRN", "Iran,Islamic Republic of");
        countries.put("IRQ", "Iraq");
        countries.put("IRL", "Ireland");
        countries.put("IMN", "IsleofMan");
        countries.put("ISR", "Israel");
        countries.put("ITA", "Italy");
        countries.put("JAM", "Jamaica");
        countries.put("JPN", "Japan");
        countries.put("JEY", "Jersey");
        countries.put("JOR", "Jordan");
        countries.put("KAZ", "Kazakhstan");
        countries.put("KEN", "Kenya");
        countries.put("KIR", "Kiribati");
        countries.put("PRK", "Korea (North)");
        countries.put("KOR", "Korea (South)");
        countries.put("KWT", "Kuwait");
        countries.put("KGZ", "Kyrgyzstan");
        countries.put("LAO", "LaoPDR");
        countries.put("LVA", "Latvia");
        countries.put("LBN", "Lebanon");
        countries.put("LSO", "Lesotho");
        countries.put("LBR", "Liberia");
        countries.put("LBY", "Libya");
        countries.put("LIE", "Liechtenstein");
        countries.put("LTU", "Lithuania");
        countries.put("LUX", "Luxembourg");
        countries.put("MKD", "Macedonia, Republic of");
        countries.put("MDG", "Madagascar");
        countries.put("MWI", "Malawi");
        countries.put("MYS", "Malaysia");
        countries.put("MDV", "Maldives");
        countries.put("MLI", "Mali");
        countries.put("MLT", "Malta");
        countries.put("MHL", "Marshall Islands");
        countries.put("MTQ", "Martinique");
        countries.put("MRT", "Mauritania");
        countries.put("MUS", "Mauritius");
        countries.put("MYT", "Mayotte");
        countries.put("MEX", "Mexico");
        countries.put("FSM", "Micronesia, Federated States of");
        countries.put("MDA", "Moldova");
        countries.put("MCO", "Monaco");
        countries.put("MNG", "Mongolia");
        countries.put("MNE", "Montenegro");
        countries.put("MSR", "Montserrat");
        countries.put("MAR", "Morocco");
        countries.put("MOZ", "Mozambique");
        countries.put("MMR", "Myanmar");
        countries.put("NAM", "Namibia");
        countries.put("NRU", "Nauru");
        countries.put("NPL", "Nepal");
        countries.put("NLD", "Netherlands");
        countries.put("ANT", "Netherlands Antilles");
        countries.put("NCL", "New Caledonia");
        countries.put("NZL", "New Zealand");
        countries.put("NIC", "Nicaragua");
        countries.put("NER", "Niger");
        countries.put("NGA", "Nigeria");
        countries.put("NIU", "Niue");
        countries.put("NFK", "Norfolk Island");
        countries.put("MNP", "Northern Mariana Islands");
        countries.put("NOR", "Norway");
        countries.put("OMN", "Oman");
        countries.put("PAK", "Pakistan");
        countries.put("PLW", "Palau");
        countries.put("PSE", "Palestinian Territory");
        countries.put("PAN", "Panama");
        countries.put("PNG", "Papua New Guinea");
        countries.put("PRY", "Paraguay");
        countries.put("PER", "Peru");
        countries.put("PHL", "Philippines");
        countries.put("PCN", "Pitcairn");
        countries.put("POL", "Poland");
        countries.put("PRT", "Portugal");
        countries.put("PRI", "PuertoRico");
        countries.put("QAT", "Qatar");
        countries.put("REU", "Rйunion");
        countries.put("ROU", "Romania");
        countries.put("RUS", "Russian Federation");
        countries.put("RWA", "Rwanda");
        countries.put("BLM", "Saint-Barthйlemy");
        countries.put("SHN", "Saint Helena");
        countries.put("KNA", "Saint Kitts and Nevis");
        countries.put("LCA", "Saint Lucia");
        countries.put("MAF", "Saint-Martin(Frenchpart)");
        countries.put("SPM", "Saint Pierre and Miquelon");
        countries.put("VCT", "Saint Vincent and Grenadines");
        countries.put("WSM", "Samoa");
        countries.put("SMR", "San Marino");
        countries.put("STP", "Sao Tome and Principe");
        countries.put("SAU", "Saudi Arabia");
        countries.put("SEN", "Senegal");
        countries.put("SRB", "Serbia");
        countries.put("SYC", "Seychelles");
        countries.put("SLE", "Sierra Leone");
        countries.put("SGP", "Singapore");
        countries.put("SVK", "Slovakia");
        countries.put("SVN", "Slovenia");
        countries.put("SLB", "Solomon Islands");
        countries.put("SOM", "Somalia");
        countries.put("ZAF", "South Africa");
        countries.put("SGS", "South Georgia and the South Sandwich Islands");
        countries.put("SSD", "South Sudan");
        countries.put("ESP", "Spain");
        countries.put("LKA", "SriLanka");
        countries.put("SDN", "Sudan");
        countries.put("SUR", "Suriname");
        countries.put("SJM", "Svalbard and Jan Mayen Islands");
        countries.put("SWZ", "Swaziland");
        countries.put("SWE", "Sweden");
        countries.put("CHE", "Switzerland");
        countries.put("SYR", "Syrian Arab Republic (Syria)");
        countries.put("TWN", "Taiwan, Republic of China");
        countries.put("TJK", "Tajikistan");
        countries.put("TZA", "Tanzania,United Republic of");
        countries.put("THA", "Thailand");
        countries.put("TLS", "Timor-Leste");
        countries.put("TGO", "Togo");
        countries.put("TKL", "Tokelau");
        countries.put("TON", "Tonga");
        countries.put("TTO", "Trinidad and Tobago");
        countries.put("TUN", "Tunisia");
        countries.put("TUR", "Turkey");
        countries.put("TKM", "Turkmenistan");
        countries.put("TCA", "Turks and Caicos Islands");
        countries.put("TUV", "Tuvalu");
        countries.put("UGA", "Uganda");
        countries.put("UKR", "Ukraine");
        countries.put("ARE", "United Arab Emirates");
        countries.put("GBR", "United Kingdom");
        countries.put("USA", "United States of America");
        countries.put("UMI", "US Minor Outlying Islands");
        countries.put("URY", "Uruguay");
        countries.put("UZB", "Uzbekistan");
        countries.put("VUT", "Vanuatu");
        countries.put("VEN", "Venezuela (Bolivarian Republic)");
        countries.put("VNM", "Vietnam");
        countries.put("VIR", "Virgin Islands,US");
        countries.put("WLF", "Wallis and Futuna Islands");
        countries.put("ESH", "Western Sahara");
        countries.put("YEM", "Yemen");
        countries.put("ZMB", "Zambia");
        countries.put("ZWE", "Zimbabwe");

        return countries;
    }

}
