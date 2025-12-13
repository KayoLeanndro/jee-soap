
package exer3;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the exer3 package. 
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

    private final static QName _GetLivro_QNAME = new QName("http://exer3/", "getLivro");
    private final static QName _GetEstoque_QNAME = new QName("http://exer3/", "getEstoque");
    private final static QName _GetLivroResponse_QNAME = new QName("http://exer3/", "getLivroResponse");
    private final static QName _GetEstoqueResponse_QNAME = new QName("http://exer3/", "getEstoqueResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: exer3
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetLivro }
     * 
     */
    public GetLivro createGetLivro() {
        return new GetLivro();
    }

    /**
     * Create an instance of {@link GetEstoque }
     * 
     */
    public GetEstoque createGetEstoque() {
        return new GetEstoque();
    }

    /**
     * Create an instance of {@link GetEstoqueResponse }
     * 
     */
    public GetEstoqueResponse createGetEstoqueResponse() {
        return new GetEstoqueResponse();
    }

    /**
     * Create an instance of {@link GetLivroResponse }
     * 
     */
    public GetLivroResponse createGetLivroResponse() {
        return new GetLivroResponse();
    }

    /**
     * Create an instance of {@link Livro }
     * 
     */
    public Livro createLivro() {
        return new Livro();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetLivro }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://exer3/", name = "getLivro")
    public JAXBElement<GetLivro> createGetLivro(GetLivro value) {
        return new JAXBElement<GetLivro>(_GetLivro_QNAME, GetLivro.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetEstoque }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://exer3/", name = "getEstoque")
    public JAXBElement<GetEstoque> createGetEstoque(GetEstoque value) {
        return new JAXBElement<GetEstoque>(_GetEstoque_QNAME, GetEstoque.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetLivroResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://exer3/", name = "getLivroResponse")
    public JAXBElement<GetLivroResponse> createGetLivroResponse(GetLivroResponse value) {
        return new JAXBElement<GetLivroResponse>(_GetLivroResponse_QNAME, GetLivroResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetEstoqueResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://exer3/", name = "getEstoqueResponse")
    public JAXBElement<GetEstoqueResponse> createGetEstoqueResponse(GetEstoqueResponse value) {
        return new JAXBElement<GetEstoqueResponse>(_GetEstoqueResponse_QNAME, GetEstoqueResponse.class, null, value);
    }

}
