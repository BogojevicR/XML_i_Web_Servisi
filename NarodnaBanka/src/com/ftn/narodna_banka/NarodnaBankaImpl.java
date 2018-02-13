
/**
 * Please modify this class to meet your needs
 * This class is not complete
 */

package com.ftn.narodna_banka;

import java.util.UUID;
import java.util.logging.Logger;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.bind.annotation.XmlSeeAlso;

import com.ftn.schema.mt900.Mt900;
import com.ftn.schema.mt900.TBanka;
import com.ftn.schema.mt910.Mt910;

/**
 * This class was generated by Apache CXF 2.6.5
 * 2018-02-13T19:04:02.589+01:00
 * Generated source version: 2.6.5
 * 
 */

@javax.jws.WebService(
                      serviceName = "NarodnaBankaService",
                      portName = "NarodnaBanka",
                      targetNamespace = "http://www.ftn.com/narodna_banka",
                      wsdlLocation = "file:/C:/Users/Nikola Gajic/Documents/Github/XML_i_Web_Servisi/NarodnaBanka/WEB-INF/wsdl/narodna_banka.wsdl",
                      endpointInterface = "com.ftn.narodna_banka.NarodnaBanka")
                      
public class NarodnaBankaImpl implements NarodnaBanka {

    private static final Logger LOG = Logger.getLogger(NarodnaBankaImpl.class.getName());

    /* (non-Javadoc)
     * @see com.ftn.narodna_banka.NarodnaBanka#mt103ReceiveCB(com.ftn.schema.mt103.Mt103  mt103 )*
     */
    public com.ftn.schema.mt900.Mt900 mt103ReceiveCB(com.ftn.schema.mt103.Mt103 mt103) throws RTGSFault    { 
       Mt900 mt900=new Mt900();
       mt900.setIdPoruke(UUID.randomUUID().toString().replaceAll("-", ""));
       TBanka duznik=new TBanka();
       duznik.setSWIFT(mt103.getBanke().getBankaDuznika().getSWIFT());
       duznik.setBankAccountNumber(mt103.getBanke().getBankaDuznika().getBankAccountNumber());
       mt900.setIdPorukeNaloga("mt103");
       mt900.setDatumValute(mt103.getUplata().getDatumNaloga());
       mt900.setIznos(mt103.getUplata().getIznos());
       mt900.setSifraValute(mt103.getUplata().getSifraValute());
      
       mt900.setBankaDuznik(duznik);
       
       Mt910 mt910=new Mt910();
       com.ftn.schema.mt910.TBanka asd=new com.ftn.schema.mt910.TBanka();
       
       
       return mt900;
    }

    /* (non-Javadoc)
     * @see com.ftn.narodna_banka.NarodnaBanka#mt102ReceiveCB(com.ftn.schema.mt102.Mt102  mt102 )*
     */
    public com.ftn.schema.mt900.Mt900 mt102ReceiveCB(com.ftn.schema.mt102.Mt102 mt102) throws ClearingFault    { 
        LOG.info("Executing operation mt102ReceiveCB");
        System.out.println(mt102);
        try {
            com.ftn.schema.mt900.Mt900 _return = null;
            return _return;
        } catch (java.lang.Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
        //throw new ClearingFault("ClearingFault...");
    }

}