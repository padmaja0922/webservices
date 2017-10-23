/**
 * CustomerServiceServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.bcj.soapcrud.service;

public class CustomerServiceServiceLocator extends org.apache.axis.client.Service implements com.bcj.soapcrud.service.CustomerServiceService {

    public CustomerServiceServiceLocator() {
    }


    public CustomerServiceServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public CustomerServiceServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for CustomerService
    private java.lang.String CustomerService_address = "http://localhost:8080/SOAPCURDExample/services/CustomerService";

    public java.lang.String getCustomerServiceAddress() {
        return CustomerService_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String CustomerServiceWSDDServiceName = "CustomerService";

    public java.lang.String getCustomerServiceWSDDServiceName() {
        return CustomerServiceWSDDServiceName;
    }

    public void setCustomerServiceWSDDServiceName(java.lang.String name) {
        CustomerServiceWSDDServiceName = name;
    }

    public com.bcj.soapcrud.service.CustomerService getCustomerService() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(CustomerService_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getCustomerService(endpoint);
    }

    public com.bcj.soapcrud.service.CustomerService getCustomerService(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            com.bcj.soapcrud.service.CustomerServiceSoapBindingStub _stub = new com.bcj.soapcrud.service.CustomerServiceSoapBindingStub(portAddress, this);
            _stub.setPortName(getCustomerServiceWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setCustomerServiceEndpointAddress(java.lang.String address) {
        CustomerService_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (com.bcj.soapcrud.service.CustomerService.class.isAssignableFrom(serviceEndpointInterface)) {
                com.bcj.soapcrud.service.CustomerServiceSoapBindingStub _stub = new com.bcj.soapcrud.service.CustomerServiceSoapBindingStub(new java.net.URL(CustomerService_address), this);
                _stub.setPortName(getCustomerServiceWSDDServiceName());
                return _stub;
            }
        }
        catch (java.lang.Throwable t) {
            throw new javax.xml.rpc.ServiceException(t);
        }
        throw new javax.xml.rpc.ServiceException("There is no stub implementation for the interface:  " + (serviceEndpointInterface == null ? "null" : serviceEndpointInterface.getName()));
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(javax.xml.namespace.QName portName, Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        if (portName == null) {
            return getPort(serviceEndpointInterface);
        }
        java.lang.String inputPortName = portName.getLocalPart();
        if ("CustomerService".equals(inputPortName)) {
            return getCustomerService();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://service.soapcrud.bcj.com", "CustomerServiceService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://service.soapcrud.bcj.com", "CustomerService"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("CustomerService".equals(portName)) {
            setCustomerServiceEndpointAddress(address);
        }
        else 
{ // Unknown Port Name
            throw new javax.xml.rpc.ServiceException(" Cannot set Endpoint Address for Unknown Port" + portName);
        }
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(javax.xml.namespace.QName portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        setEndpointAddress(portName.getLocalPart(), address);
    }

}
