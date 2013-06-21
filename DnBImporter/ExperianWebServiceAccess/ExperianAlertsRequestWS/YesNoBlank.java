
package ExperianAlertsRequestWS;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for YesNoBlank.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="YesNoBlank">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Y"/>
 *     &lt;enumeration value="N"/>
 *     &lt;enumeration value="B"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "YesNoBlank", namespace = "http://schema.uk.experian.com/experian/bi/generic/smpl/v100/basetypes")
@XmlEnum
public enum YesNoBlank {

    Y,
    N,
    B;

    public String value() {
        return name();
    }

    public static YesNoBlank fromValue(String v) {
        return valueOf(v);
    }

}
