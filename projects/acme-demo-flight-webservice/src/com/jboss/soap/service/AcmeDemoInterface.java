package com.jboss.soap.service;

import java.util.List;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

/**
 * This class was generated by Apache CXF 2.6.6-redhat-3
 * 2014-06-17T09:42:22.939+01:00
 * Generated source version: 2.6.6-redhat-3
 * 
 */
@WebService(targetNamespace = "http://service.soap.jboss.com/AcmeDemo/", name = "AcmeDemoInterface")
@XmlSeeAlso({ObjectFactory.class})
public interface AcmeDemoInterface {

    @WebResult(name = "return", targetNamespace = "")
    @RequestWrapper(localName = "listAvailablePlanes", targetNamespace = "http://service.soap.jboss.com/AcmeDemo/", className = "com.jboss.soap.service.ListAvailablePlanes")
    @WebMethod(action = "http://service.soap.jboss.com/AcmeDemo/listAvailablePlanes")
    @ResponseWrapper(localName = "listAvailablePlanesResponse", targetNamespace = "http://service.soap.jboss.com/AcmeDemo/", className = "com.jboss.soap.service.ListAvailablePlanesResponse")
    public List<Flight> listAvailablePlanes(
        @WebParam(name = "in", targetNamespace = "")
        com.jboss.soap.service.FlightRequest in);
}
