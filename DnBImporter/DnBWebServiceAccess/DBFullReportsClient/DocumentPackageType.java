
package DBFullReportsClient;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DocumentPackageType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="DocumentPackageType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="L5ARA"/>
 *     &lt;enumeration value="L10ARA"/>
 *     &lt;enumeration value="L5A"/>
 *     &lt;enumeration value="L10A"/>
 *     &lt;enumeration value="L5AR"/>
 *     &lt;enumeration value="L10AR"/>
 *     &lt;enumeration value="LARA"/>
 *     &lt;enumeration value="CIANC"/>
 *     &lt;enumeration value="DS"/>
 *     &lt;enumeration value="SS"/>
 *     &lt;enumeration value="FDS"/>
 *     &lt;enumeration value="KYCS"/>
 *     &lt;enumeration value="AMLS"/>
 *     &lt;enumeration value="ERCS"/>
 *     &lt;enumeration value="DDS"/>
 *     &lt;enumeration value="WUS"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "DocumentPackageType")
@XmlEnum
public enum DocumentPackageType {

    @XmlEnumValue("L5ARA")
    L_5_ARA("L5ARA"),
    @XmlEnumValue("L10ARA")
    L_10_ARA("L10ARA"),
    @XmlEnumValue("L5A")
    L_5_A("L5A"),
    @XmlEnumValue("L10A")
    L_10_A("L10A"),
    @XmlEnumValue("L5AR")
    L_5_AR("L5AR"),
    @XmlEnumValue("L10AR")
    L_10_AR("L10AR"),
    LARA("LARA"),
    CIANC("CIANC"),
    DS("DS"),
    SS("SS"),
    FDS("FDS"),
    KYCS("KYCS"),
    AMLS("AMLS"),
    ERCS("ERCS"),
    DDS("DDS"),
    WUS("WUS");
    private final String value;

    DocumentPackageType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DocumentPackageType fromValue(String v) {
        for (DocumentPackageType c: DocumentPackageType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
