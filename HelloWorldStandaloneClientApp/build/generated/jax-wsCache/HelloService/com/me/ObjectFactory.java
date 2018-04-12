
package com.me;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.me package. 
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

    private final static QName _SayhelloResponse_QNAME = new QName("http://me.com/", "sayhelloResponse");
    private final static QName _Sayhello_QNAME = new QName("http://me.com/", "sayhello");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.me
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Sayhello }
     * 
     */
    public Sayhello createSayhello() {
        return new Sayhello();
    }

    /**
     * Create an instance of {@link SayhelloResponse }
     * 
     */
    public SayhelloResponse createSayhelloResponse() {
        return new SayhelloResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SayhelloResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://me.com/", name = "sayhelloResponse")
    public JAXBElement<SayhelloResponse> createSayhelloResponse(SayhelloResponse value) {
        return new JAXBElement<SayhelloResponse>(_SayhelloResponse_QNAME, SayhelloResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Sayhello }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://me.com/", name = "sayhello")
    public JAXBElement<Sayhello> createSayhello(Sayhello value) {
        return new JAXBElement<Sayhello>(_Sayhello_QNAME, Sayhello.class, null, value);
    }

}
