
package com.ftn.narodna_banka;

import javax.xml.ws.WebFault;


/**
 * This class was generated by Apache CXF 2.6.5
 * 2018-02-13T19:04:02.571+01:00
 * Generated source version: 2.6.5
 */

@WebFault(name = "odgovor-na-placanje", targetNamespace = "http://www.ftn.com/narodna_banka")
public class RTGSFault extends Exception {
    
    private boolean odgovorNaPlacanje;

    public RTGSFault() {
        super();
    }
    
    public RTGSFault(String message) {
        super(message);
    }
    
    public RTGSFault(String message, Throwable cause) {
        super(message, cause);
    }

    public RTGSFault(String message, boolean odgovorNaPlacanje) {
        super(message);
        this.odgovorNaPlacanje = odgovorNaPlacanje;
    }

    public RTGSFault(String message, boolean odgovorNaPlacanje, Throwable cause) {
        super(message, cause);
        this.odgovorNaPlacanje = odgovorNaPlacanje;
    }

    public boolean getFaultInfo() {
        return this.odgovorNaPlacanje;
    }
}
