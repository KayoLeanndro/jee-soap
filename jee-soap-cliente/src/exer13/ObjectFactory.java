
package exer13;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the exer12 package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _DowloadResponse_QNAME = new QName("http://exer12/", "dowloadResponse");
    private final static QName _Dowload_QNAME = new QName("http://exer12/", "dowload");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: exer12
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link DowloadResponse }
     * 
     */
    public DowloadResponse createDowloadResponse() {
        return new DowloadResponse();
    }

    /**
     * Create an instance of {@link Dowload }
     * 
     */
    public Dowload createDowload() {
        return new Dowload();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DowloadResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://exer12/", name = "dowloadResponse")
    public JAXBElement<DowloadResponse> createDowloadResponse(DowloadResponse value) {
        return new JAXBElement<DowloadResponse>(_DowloadResponse_QNAME, DowloadResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Dowload }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://exer12/", name = "dowload")
    public JAXBElement<Dowload> createDowload(Dowload value) {
        return new JAXBElement<Dowload>(_Dowload_QNAME, Dowload.class, null, value);
    }

}
