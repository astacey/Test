
package ExperianBusinessTargetWS;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for YesNo.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="YesNo">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Y"/>
 *     &lt;enumeration value="N"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "YesNo", namespace = "http://schema.uk.experian.com/experian/bi/generic/smpl/v100/basetypes")
@XmlEnum
public enum YesNo {

    Y,
    N;

    public String value() {
        return name();
    }

    public static YesNo fromValue(String v) {
        return valueOf(v);
    }

}
