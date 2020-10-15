/*
 * Ethernet Link Layer
 *
 * Include to support a wired ethernet port
 *
 * 
 */
package edu.rit.gis.sunspec.models

import edu.rit.gis.sunspec.annotations.*

@SunSpecModel(id=11, len=13, name="model_11")
class Model_11 {
   @SunSpecPoint(id="Spd", label="Ethernet Link Speed", offset=0, len=1, type="uint16",
                 description="Interface speed in Mb/s",
                 notes="Interface speed in Mb/s")
            
   var Spd: UShort? = null

   @SunSpecPoint(id="CfgSt", label="Interface Status Flags", offset=1, len=1, type="bitfield16",
                 description="Bitmask values Interface flags.",
                 notes="Bitmask values Interface flags.")
            
   var CfgSt: UShort? = null

   @SunSpecPoint(id="St", label="Link State", offset=2, len=0, type="enum16",
                 description="Enumerated value. State information for this interface",
                 notes="Enumerated value. State information for this interface")
            
   var St: Any? = null

   @SunSpecPoint(id="MAC", label="MAC", offset=3, len=3, type="eui48",
                 description="IEEE MAC address of this interface",
                 notes="IEEE MAC address of this interface")
            
   var MAC: ByteArray? = null

   @SunSpecPoint(id="Nam", label="Name", offset=7, len=4, type="string",
                 description="Interface name (8 chars)",
                 notes="Interface name (8 chars)")
            
   var Nam: String? = null

   @SunSpecPoint(id="Ctl", label="Control", offset=11, len=1, type="bitfield16",
                 description="Control flags",
                 notes="Control flags")
            
   var Ctl: UShort? = null

   @SunSpecPoint(id="FrcSpd", label="Forced Speed", offset=12, len=1, type="uint16",
                 description="Forced interface speed in Mb/s when AUTO is disabled",
                 notes="Forced interface speed in Mb/s when AUTO is disabled")
            
   var FrcSpd: UShort? = null

}
