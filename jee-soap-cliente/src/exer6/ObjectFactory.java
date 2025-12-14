
package exer6;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the exer6 package. 
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

    private final static QName _OperacaoDebitarSaldoResponse_QNAME = new QName("http://visa.eletron.consulta", "operacaoDebitarSaldoResponse");
    private final static QName _OperacaoCreditarSaldo_QNAME = new QName("http://visa.eletron.consulta", "operacaoCreditarSaldo");
    private final static QName _OperacaoDebitarSaldo_QNAME = new QName("http://visa.eletron.consulta", "operacaoDebitarSaldo");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: exer6
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link OperacaoDebitarSaldoResponse }
     * 
     */
    public OperacaoDebitarSaldoResponse createOperacaoDebitarSaldoResponse() {
        return new OperacaoDebitarSaldoResponse();
    }

    /**
     * Create an instance of {@link OperacaoDebitarSaldo }
     * 
     */
    public OperacaoDebitarSaldo createOperacaoDebitarSaldo() {
        return new OperacaoDebitarSaldo();
    }

    /**
     * Create an instance of {@link OperacaoCreditarSaldo }
     * 
     */
    public OperacaoCreditarSaldo createOperacaoCreditarSaldo() {
        return new OperacaoCreditarSaldo();
    }

    /**
     * Create an instance of {@link Consulta }
     * 
     */
    public Consulta createConsulta() {
        return new Consulta();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OperacaoDebitarSaldoResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://visa.eletron.consulta", name = "operacaoDebitarSaldoResponse")
    public JAXBElement<OperacaoDebitarSaldoResponse> createOperacaoDebitarSaldoResponse(OperacaoDebitarSaldoResponse value) {
        return new JAXBElement<OperacaoDebitarSaldoResponse>(_OperacaoDebitarSaldoResponse_QNAME, OperacaoDebitarSaldoResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OperacaoCreditarSaldo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://visa.eletron.consulta", name = "operacaoCreditarSaldo")
    public JAXBElement<OperacaoCreditarSaldo> createOperacaoCreditarSaldo(OperacaoCreditarSaldo value) {
        return new JAXBElement<OperacaoCreditarSaldo>(_OperacaoCreditarSaldo_QNAME, OperacaoCreditarSaldo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OperacaoDebitarSaldo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://visa.eletron.consulta", name = "operacaoDebitarSaldo")
    public JAXBElement<OperacaoDebitarSaldo> createOperacaoDebitarSaldo(OperacaoDebitarSaldo value) {
        return new JAXBElement<OperacaoDebitarSaldo>(_OperacaoDebitarSaldo_QNAME, OperacaoDebitarSaldo.class, null, value);
    }

}
