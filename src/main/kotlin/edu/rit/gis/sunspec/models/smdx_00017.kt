/*
 * Serial Interface
 *
 * Include this model for serial interface configuration support
 *
 * 
 */
package edu.rit.gis.sunspec.models

import edu.rit.gis.sunspec.annotations.*

@SunSpecModel(id=17, len=12, name="model_17")
class Model_17 {
   @SunSpecPoint(id="Nam", label="Name", offset=0, len=4, type="string",
                 description="Interface name (8 chars)",
                 notes="Interface name (8 chars)")
            
   var Nam: String? = null

   @SunSpecPoint(id="Rte", label="Rate", offset=4, len=2, type="uint32",
                 description="Interface baud rate in bits per second",
                 notes="Interface baud rate in bits per second")
            
   var Rte: UInt? = null

   @SunSpecPoint(id="Bits", label="Bits", offset=6, len=1, type="uint16",
                 description="Number of data bits per character",
                 notes="Number of data bits per character")
            
   var Bits: UShort? = null

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

   @SunSpecPoint(id="Typ", label="Interface Type", offset=10, len=0, type="enum16",
                 description="Enumerated value.  Interface type",
                 notes="Enumerated value.  Interface type")
            
   var Typ: Any? = null

   @SunSpecPoint(id="Pcol", label="Protocol", offset=11, len=0, type="enum16",
                 description="Enumerated value. Serial protocol selection",
                 notes="Enumerated value. Serial protocol selection")
            
   var Pcol: Any? = null

}
