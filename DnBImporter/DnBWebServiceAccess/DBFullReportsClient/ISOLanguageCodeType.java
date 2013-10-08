
package DBFullReportsClient;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ISOLanguageCodeType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ISOLanguageCodeType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="AB"/>
 *     &lt;enumeration value="AF"/>
 *     &lt;enumeration value="AM"/>
 *     &lt;enumeration value="AR"/>
 *     &lt;enumeration value="AS"/>
 *     &lt;enumeration value="AY"/>
 *     &lt;enumeration value="AZ"/>
 *     &lt;enumeration value="BA"/>
 *     &lt;enumeration value="BE"/>
 *     &lt;enumeration value="BG"/>
 *     &lt;enumeration value="BH"/>
 *     &lt;enumeration value="BI"/>
 *     &lt;enumeration value="BN"/>
 *     &lt;enumeration value="BO"/>
 *     &lt;enumeration value="BR"/>
 *     &lt;enumeration value="CA"/>
 *     &lt;enumeration value="CO"/>
 *     &lt;enumeration value="CS"/>
 *     &lt;enumeration value="CY"/>
 *     &lt;enumeration value="DA"/>
 *     &lt;enumeration value="DE"/>
 *     &lt;enumeration value="DZ"/>
 *     &lt;enumeration value="EL"/>
 *     &lt;enumeration value="EN"/>
 *     &lt;enumeration value="EO"/>
 *     &lt;enumeration value="ES"/>
 *     &lt;enumeration value="ET"/>
 *     &lt;enumeration value="EU"/>
 *     &lt;enumeration value="FA"/>
 *     &lt;enumeration value="FI"/>
 *     &lt;enumeration value="FJ"/>
 *     &lt;enumeration value="FO"/>
 *     &lt;enumeration value="FR"/>
 *     &lt;enumeration value="FY"/>
 *     &lt;enumeration value="GA"/>
 *     &lt;enumeration value="GD"/>
 *     &lt;enumeration value="GL"/>
 *     &lt;enumeration value="GN"/>
 *     &lt;enumeration value="GU"/>
 *     &lt;enumeration value="HA"/>
 *     &lt;enumeration value="HI"/>
 *     &lt;enumeration value="HR"/>
 *     &lt;enumeration value="HU"/>
 *     &lt;enumeration value="HY"/>
 *     &lt;enumeration value="IA"/>
 *     &lt;enumeration value="IE"/>
 *     &lt;enumeration value="IK"/>
 *     &lt;enumeration value="IN"/>
 *     &lt;enumeration value="IS"/>
 *     &lt;enumeration value="IT"/>
 *     &lt;enumeration value="IW"/>
 *     &lt;enumeration value="JA"/>
 *     &lt;enumeration value="JI"/>
 *     &lt;enumeration value="JW"/>
 *     &lt;enumeration value="KA"/>
 *     &lt;enumeration value="KK"/>
 *     &lt;enumeration value="KL"/>
 *     &lt;enumeration value="KM"/>
 *     &lt;enumeration value="KN"/>
 *     &lt;enumeration value="KO"/>
 *     &lt;enumeration value="KS"/>
 *     &lt;enumeration value="KU"/>
 *     &lt;enumeration value="KY"/>
 *     &lt;enumeration value="LA"/>
 *     &lt;enumeration value="LN"/>
 *     &lt;enumeration value="LO"/>
 *     &lt;enumeration value="LT"/>
 *     &lt;enumeration value="LV"/>
 *     &lt;enumeration value="MG"/>
 *     &lt;enumeration value="MI"/>
 *     &lt;enumeration value="MK"/>
 *     &lt;enumeration value="ML"/>
 *     &lt;enumeration value="MN"/>
 *     &lt;enumeration value="MO"/>
 *     &lt;enumeration value="MR"/>
 *     &lt;enumeration value="MS"/>
 *     &lt;enumeration value="MT"/>
 *     &lt;enumeration value="MY"/>
 *     &lt;enumeration value="NA"/>
 *     &lt;enumeration value="NE"/>
 *     &lt;enumeration value="NL"/>
 *     &lt;enumeration value="NO"/>
 *     &lt;enumeration value="OC"/>
 *     &lt;enumeration value="OM"/>
 *     &lt;enumeration value="OR"/>
 *     &lt;enumeration value="PA"/>
 *     &lt;enumeration value="PL"/>
 *     &lt;enumeration value="PS"/>
 *     &lt;enumeration value="PT"/>
 *     &lt;enumeration value="QU"/>
 *     &lt;enumeration value="RM"/>
 *     &lt;enumeration value="RN"/>
 *     &lt;enumeration value="RO"/>
 *     &lt;enumeration value="RU"/>
 *     &lt;enumeration value="RW"/>
 *     &lt;enumeration value="SA"/>
 *     &lt;enumeration value="SD"/>
 *     &lt;enumeration value="SG"/>
 *     &lt;enumeration value="SH"/>
 *     &lt;enumeration value="SI"/>
 *     &lt;enumeration value="SK"/>
 *     &lt;enumeration value="SL"/>
 *     &lt;enumeration value="SM"/>
 *     &lt;enumeration value="SN"/>
 *     &lt;enumeration value="SO"/>
 *     &lt;enumeration value="SQ"/>
 *     &lt;enumeration value="SR"/>
 *     &lt;enumeration value="SS"/>
 *     &lt;enumeration value="ST"/>
 *     &lt;enumeration value="SU"/>
 *     &lt;enumeration value="SV"/>
 *     &lt;enumeration value="SW"/>
 *     &lt;enumeration value="TA"/>
 *     &lt;enumeration value="TE"/>
 *     &lt;enumeration value="TG"/>
 *     &lt;enumeration value="TH"/>
 *     &lt;enumeration value="TI"/>
 *     &lt;enumeration value="TK"/>
 *     &lt;enumeration value="TL"/>
 *     &lt;enumeration value="TN"/>
 *     &lt;enumeration value="TO"/>
 *     &lt;enumeration value="TR"/>
 *     &lt;enumeration value="TS"/>
 *     &lt;enumeration value="TT"/>
 *     &lt;enumeration value="TW"/>
 *     &lt;enumeration value="UK"/>
 *     &lt;enumeration value="UR"/>
 *     &lt;enumeration value="UZ"/>
 *     &lt;enumeration value="VI"/>
 *     &lt;enumeration value="VO"/>
 *     &lt;enumeration value="WO"/>
 *     &lt;enumeration value="XH"/>
 *     &lt;enumeration value="YO"/>
 *     &lt;enumeration value="ZH"/>
 *     &lt;enumeration value="ZU"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ISOLanguageCodeType")
@XmlEnum
public enum ISOLanguageCodeType {

    AB,
    AF,
    AM,
    AR,
    AS,
    AY,
    AZ,
    BA,
    BE,
    BG,
    BH,
    BI,
    BN,
    BO,
    BR,
    CA,
    CO,
    CS,
    CY,
    DA,
    DE,
    DZ,
    EL,
    EN,
    EO,
    ES,
    ET,
    EU,
    FA,
    FI,
    FJ,
    FO,
    FR,
    FY,
    GA,
    GD,
    GL,
    GN,
    GU,
    HA,
    HI,
    HR,
    HU,
    HY,
    IA,
    IE,
    IK,
    IN,
    IS,
    IT,
    IW,
    JA,
    JI,
    JW,
    KA,
    KK,
    KL,
    KM,
    KN,
    KO,
    KS,
    KU,
    KY,
    LA,
    LN,
    LO,
    LT,
    LV,
    MG,
    MI,
    MK,
    ML,
    MN,
    MO,
    MR,
    MS,
    MT,
    MY,
    NA,
    NE,
    NL,
    NO,
    OC,
    OM,
    OR,
    PA,
    PL,
    PS,
    PT,
    QU,
    RM,
    RN,
    RO,
    RU,
    RW,
    SA,
    SD,
    SG,
    SH,
    SI,
    SK,
    SL,
    SM,
    SN,
    SO,
    SQ,
    SR,
    SS,
    ST,
    SU,
    SV,
    SW,
    TA,
    TE,
    TG,
    TH,
    TI,
    TK,
    TL,
    TN,
    TO,
    TR,
    TS,
    TT,
    TW,
    UK,
    UR,
    UZ,
    VI,
    VO,
    WO,
    XH,
    YO,
    ZH,
    ZU;

    public String value() {
        return name();
    }

    public static ISOLanguageCodeType fromValue(String v) {
        return valueOf(v);
    }

}
