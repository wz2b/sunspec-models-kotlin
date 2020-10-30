/*
 * PPP Link
 *
 * Include this model to configure a Point-to-Point Protocol link
 *
 * 
 */
package edu.rit.gis.sunspec.models

import edu.rit.gis.sunspec.annotations.*

@SunSpecModel(id=19, len=30, name="model_19")
class Model_19 {
   @SunSpecPoint(id="Nam", label="Name", offset=0, len=4, type="string",
                 description="Interface name",
                 notes="Interface name")
            
   var Nam: String? = null

   @SunSpecPoint(id="Rte", label="Rate", offset=4, len=2, type="uint32",
                 description="Interface baud rate in bits per second",
                 notes="Interface baud rate in bits per second")
            
   var Rte: Int? = null

   @SunSpecPoint(id="Bits", label="Bits", offset=6, len=1, type="uint16",
                 description="Number of data bits per character",
                 notes="Number of data bits per character")
            
   var Bits: Int? = null

   @SunSpecPoint(id="Pty", label="Parity", offset=7, len=0, type="enum16",
                 description="Bitmask value.  Parity setting",
                 notes="Bitmask value.  Parity setting")
            
   var Pty: Any? = null

   @SunSpecPoint(id="Dup", label="Duplex", offset=8, len=0, type="enum16",
                 description="Enumerated value.  Duplex mode",
                 notes="Enumerated value.  Duplex mode")
            
   var Dup: Any? = null

   @SunSpecPoint(id="Flw", label="Flow Control", offset=9, len=0, type="enum16",
                 description="Flow Control Method",
                 notes="Flow Control Method")
            
   var Flw: Any? = null

   @SunSpecPoint(id="Auth", label="Authentication", offset=10, len=0, type="enum16",
                 description="Enumerated value.  Authentication method",
                 notes="Enumerated value.  Authentication method")
            
   var Auth: Any? = null

   @SunSpecPoint(id="UsrNam", label="Username", offset=11, len=12, type="string",
                 description="Username for authentication",
                 notes="Username for authentication")
            
   var UsrNam: String? = null

   @SunSpecPoint(id="Pw", label="Password", offset=23, len=6, type="string",
                 description="Password for authentication",
                 notes="Password for authentication")
            
   var Pw: String? = null

   @SunSpecPoint(id="Pad", label="", offset=29, len=1, type="pad",
                 description="",
                 notes="")
            
   var Pad: Any? = null

}
