package com.bcj.soapcrud.service;

public class CustomerServiceProxy implements com.bcj.soapcrud.service.CustomerService {
  private String _endpoint = null;
  private com.bcj.soapcrud.service.CustomerService customerService = null;
  
  public CustomerServiceProxy() {
    _initCustomerServiceProxy();
  }
  
  public CustomerServiceProxy(String endpoint) {
    _endpoint = endpoint;
    _initCustomerServiceProxy();
  }
  
  private void _initCustomerServiceProxy() {
    try {
      customerService = (new com.bcj.soapcrud.service.CustomerServiceServiceLocator()).getCustomerService();
      if (customerService != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)customerService)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)customerService)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (customerService != null)
      ((javax.xml.rpc.Stub)customerService)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public com.bcj.soapcrud.service.CustomerService getCustomerService() {
    if (customerService == null)
      _initCustomerServiceProxy();
    return customerService;
  }
  
  public boolean addCustomer(com.bcj.soapcrud.entity.Customer cust) throws java.rmi.RemoteException{
    if (customerService == null)
      _initCustomerServiceProxy();
    return customerService.addCustomer(cust);
  }
  
  public com.bcj.soapcrud.entity.Customer getCustomerById(int id) throws java.rmi.RemoteException{
    if (customerService == null)
      _initCustomerServiceProxy();
    return customerService.getCustomerById(id);
  }
  
  
}