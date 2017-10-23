/**
 * CustomerService.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.bcj.soapcrud.service;

public interface CustomerService extends java.rmi.Remote {
    public boolean addCustomer(com.bcj.soapcrud.entity.Customer cust) throws java.rmi.RemoteException;
    public com.bcj.soapcrud.entity.Customer getCustomerById(int id) throws java.rmi.RemoteException;
}
