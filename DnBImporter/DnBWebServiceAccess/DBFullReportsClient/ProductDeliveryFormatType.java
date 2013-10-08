
package DBFullReportsClient;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ProductDeliveryFormatType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ProductDeliveryFormatType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="HTML"/>
 *     &lt;enumeration value="PDF"/>
 *     &lt;enumeration value="XML"/>
 *     &lt;enumeration value="TXT"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ProductDeliveryFormatType")
@XmlEnum
public enum ProductDeliveryFormatType {

    HTML,
    PDF,
    XML,
    TXT;

    public String value() {
        return name();
    }

    public static ProductDeliveryFormatType fromValue(String v) {
        return valueOf(v);
    }

}
