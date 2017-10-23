
package com.bcj.soap;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.bcj.soap package. 
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

    private final static QName _Testing_QNAME = new QName("http://service.soap.bcj.com/", "testing");
    private final static QName _TestingResponse_QNAME = new QName("http://service.soap.bcj.com/", "testingResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.bcj.soap
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Address }
     * 
     */
    public Address createAddress() {
        return new Address();
    }

    /**
     * Create an instance of {@link TestingResponse }
     * 
     */
    public TestingResponse createTestingResponse() {
        return new TestingResponse();
    }

    /**
     * Create an instance of {@link Testing }
     * 
     */
    public Testing createTesting() {
        return new Testing();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Testing }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.soap.bcj.com/", name = "testing")
    public JAXBElement<Testing> createTesting(Testing value) {
        return new JAXBElement<Testing>(_Testing_QNAME, Testing.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TestingResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.soap.bcj.com/", name = "testingResponse")
    public JAXBElement<TestingResponse> createTestingResponse(TestingResponse value) {
        return new JAXBElement<TestingResponse>(_TestingResponse_QNAME, TestingResponse.class, null, value);
    }

}
