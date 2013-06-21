
package ExperianAlertsRequestWS;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MsgType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="MsgType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="U"/>
 *     &lt;enumeration value="P"/>
 *     &lt;enumeration value="S"/>
 *     &lt;enumeration value="A"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "MsgType", namespace = "http://schema.uk.experian.com/experian/bi/generic/smpl/v100/basetypes")
@XmlEnum
public enum MsgType {

    U,
    P,
    S,
    A;

    public String value() {
        return name();
    }

    public static MsgType fromValue(String v) {
        return valueOf(v);
    }

}
