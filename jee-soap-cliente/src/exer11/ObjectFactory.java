
package exer11;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the exer11 package. 
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

    private final static QName _Adicionar_QNAME = new QName("http://exer10/", "adicionar");
    private final static QName _Deletar_QNAME = new QName("http://exer10/", "deletar");
    private final static QName _GetContatosResponse_QNAME = new QName("http://exer10/", "getContatosResponse");
    private final static QName _GetContatos_QNAME = new QName("http://exer10/", "getContatos");
    private final static QName _AdicionarResponse_QNAME = new QName("http://exer10/", "adicionarResponse");
    private final static QName _DeletarResponse_QNAME = new QName("http://exer10/", "deletarResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: exer11
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Adicionar }
     * 
     */
    public Adicionar createAdicionar() {
        return new Adicionar();
    }

    /**
     * Create an instance of {@link Deletar }
     * 
     */
    public Deletar createDeletar() {
        return new Deletar();
    }

    /**
     * Create an instance of {@link GetContatosResponse }
     * 
     */
    public GetContatosResponse createGetContatosResponse() {
        return new GetContatosResponse();
    }

    /**
     * Create an instance of {@link GetContatos }
     * 
     */
    public GetContatos createGetContatos() {
        return new GetContatos();
    }

    /**
     * Create an instance of {@link AdicionarResponse }
     * 
     */
    public AdicionarResponse createAdicionarResponse() {
        return new AdicionarResponse();
    }

    /**
     * Create an instance of {@link DeletarResponse }
     * 
     */
    public DeletarResponse createDeletarResponse() {
        return new DeletarResponse();
    }

    /**
     * Create an instance of {@link Contato }
     * 
     */
    public Contato createContato() {
        return new Contato();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Adicionar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://exer10/", name = "adicionar")
    public JAXBElement<Adicionar> createAdicionar(Adicionar value) {
        return new JAXBElement<Adicionar>(_Adicionar_QNAME, Adicionar.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Deletar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://exer10/", name = "deletar")
    public JAXBElement<Deletar> createDeletar(Deletar value) {
        return new JAXBElement<Deletar>(_Deletar_QNAME, Deletar.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetContatosResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://exer10/", name = "getContatosResponse")
    public JAXBElement<GetContatosResponse> createGetContatosResponse(GetContatosResponse value) {
        return new JAXBElement<GetContatosResponse>(_GetContatosResponse_QNAME, GetContatosResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetContatos }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://exer10/", name = "getContatos")
    public JAXBElement<GetContatos> createGetContatos(GetContatos value) {
        return new JAXBElement<GetContatos>(_GetContatos_QNAME, GetContatos.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AdicionarResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://exer10/", name = "adicionarResponse")
    public JAXBElement<AdicionarResponse> createAdicionarResponse(AdicionarResponse value) {
        return new JAXBElement<AdicionarResponse>(_AdicionarResponse_QNAME, AdicionarResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeletarResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://exer10/", name = "deletarResponse")
    public JAXBElement<DeletarResponse> createDeletarResponse(DeletarResponse value) {
        return new JAXBElement<DeletarResponse>(_DeletarResponse_QNAME, DeletarResponse.class, null, value);
    }

}
