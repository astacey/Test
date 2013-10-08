
package DBFullReportsClient;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DateReliability.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="DateReliability">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="actual"/>
 *     &lt;enumeration value="before"/>
 *     &lt;enumeration value="since"/>
 *     &lt;enumeration value="approximate"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "DateReliability")
@XmlEnum
public enum DateReliability {

    @XmlEnumValue("actual")
    ACTUAL("actual"),
    @XmlEnumValue("before")
    BEFORE("before"),
    @XmlEnumValue("since")
    SINCE("since"),
    @XmlEnumValue("approximate")
    APPROXIMATE("approximate");
    private final String value;

    DateReliability(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DateReliability fromValue(String v) {
        for (DateReliability c: DateReliability.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
