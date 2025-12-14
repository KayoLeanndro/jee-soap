
package exer6;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de operacaoDebitarSaldoResponse complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="operacaoDebitarSaldoResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="resultadoConsulta" type="{http://visa.eletron.consulta}consulta" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "operacaoDebitarSaldoResponse", propOrder = {
    "resultadoConsulta"
})
public class OperacaoDebitarSaldoResponse {

    protected Consulta resultadoConsulta;

    /**
     * Obtém o valor da propriedade resultadoConsulta.
     * 
     * @return
     *     possible object is
     *     {@link Consulta }
     *     
     */
    public Consulta getResultadoConsulta() {
        return resultadoConsulta;
    }

    /**
     * Define o valor da propriedade resultadoConsulta.
     * 
     * @param value
     *     allowed object is
     *     {@link Consulta }
     *     
     */
    public void setResultadoConsulta(Consulta value) {
        this.resultadoConsulta = value;
    }

}
