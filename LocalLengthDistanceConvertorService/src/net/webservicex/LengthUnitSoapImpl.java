package net.webservicex;

import javax.jws.WebService;

@WebService(serviceName = "lengthUnit", targetNamespace = "http://www.webserviceX.NET/", portName = "lengthUnitSoap",
            endpointInterface = "net.webservicex.LengthUnitSoap", wsdlLocation = "/WEB-INF/wsdl/lengthUnit.wsdl")
public class LengthUnitSoapImpl {
    public LengthUnitSoapImpl() {
    }

    public double changeLengthUnit(double lengthValue, Lengths fromLengthUnit, Lengths toLengthUnit) {
        return lengthValue * 2;
    }
}
