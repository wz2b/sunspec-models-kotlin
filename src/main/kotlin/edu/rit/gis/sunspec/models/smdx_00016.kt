/*
 * Simple IP Network
 *
 * Include this model for a simple IPv4 network stack
 *
 * 
 */
package edu.rit.gis.sunspec.models

import edu.rit.gis.sunspec.annotations.*

@SunSpecModel(id=16, len=52, name="model_16")
class Model_16 {
   @SunSpecPoint(id="Nam", label="Name", offset=0, len=4, type="string",
                 description="Interface name.  (8 chars)",
                 notes="Interface name.  (8 chars)")
            
   var Nam: String? = null

   @SunSpecPoint(id="Cfg", label="Config", offset=4, len=0, type="enum16",
                 description="Enumerated value.  Force IPv4 configuration method",
                 notes="Enumerated value.  Force IPv4 configuration method")
            
   var Cfg: Any? = null

   @SunSpecPoint(id="Ctl", label="Control", offset=5, len=0, type="enum16",
                 description="Bitmask value Configure use of services",
                 notes="Bitmask value Configure use of services")
            
   var Ctl: Any? = null

   @SunSpecPoint(id="Addr", label="Address", offset=6, len=8, type="string",
                 description="IP address",
                 notes="IP address")
            
   var Addr: String? = null

   @SunSpecPoint(id="Msk", label="Netmask", offset=14, len=8, type="string",
                 description="Netmask",
                 notes="Netmask")
            
   var Msk: String? = null

   @SunSpecPoint(id="Gw", label="Gateway", offset=22, len=8, type="string",
                 description="Gateway IP address",
                 notes="Gateway IP address")
            
   var Gw: String? = null

   @SunSpecPoint(id="DNS1", label="DNS1", offset=30, len=8, type="string",
                 description="32 bit IP address of DNS server",
                 notes="32 bit IP address of DNS server")
            
   var DNS1: String? = null

   @SunSpecPoint(id="DNS2", label="DNS2", offset=38, len=8, type="string",
                 description="32 bit IP address of DNS server",
                 notes="32 bit IP address of DNS server")
            
   var DNS2: String? = null

   @SunSpecPoint(id="MAC", label="MAC", offset=46, len=3, type="eui48",
                 description="IEEE MAC address of this interface",
                 notes="IEEE MAC address of this interface")
            
   var MAC: ByteArray? = null

   @SunSpecPoint(id="LnkCtl", label="Link Control", offset=50, len=1, type="bitfield16",
                 description="Bitmask value.  Link control flags",
                 notes="Bitmask value.  Link control flags")
            
   var LnkCtl: UShort? = null

   @SunSpecPoint(id="Pad", label="", offset=51, len=1, type="pad",
                 description="",
                 notes="")
            
   var Pad: Any? = null

}
