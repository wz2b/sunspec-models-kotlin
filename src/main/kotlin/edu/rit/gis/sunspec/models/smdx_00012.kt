/*
 * IPv4
 *
 * Include to support an IPv4 protocol stack on this interface
 *
 * 
 */
package edu.rit.gis.sunspec.models

import edu.rit.gis.sunspec.annotations.*

@SunSpecModel(id=12, len=98, name="model_12")
class Model_12 {
   @SunSpecPoint(id="Nam", label="Name", offset=0, len=4, type="string",
                 description="Interface name",
                 notes="Interface name")
            
   var Nam: String? = null

   @SunSpecPoint(id="CfgSt", label="Config Status", offset=4, len=0, type="enum16",
                 description="Enumerated value.  Configuration status",
                 notes="Enumerated value.  Configuration status")
            
   var CfgSt: Any? = null

   @SunSpecPoint(id="ChgSt", label="Change Status", offset=5, len=1, type="bitfield16",
                 description="Bitmask value.  A configuration change is pending",
                 notes="Bitmask value.  A configuration change is pending")
            
   var ChgSt: Short? = null

   @SunSpecPoint(id="Cap", label="Config Capability", offset=6, len=1, type="bitfield16",
                 description="Bitmask value. Identify capable sources of configuration",
                 notes="Bitmask value. Identify capable sources of configuration")
            
   var Cap: Short? = null

   @SunSpecPoint(id="Cfg", label="IPv4 Config", offset=7, len=0, type="enum16",
                 description="Enumerated value.  Configuration method used.",
                 notes="Enumerated value.  Configuration method used.")
            
   var Cfg: Any? = null

   @SunSpecPoint(id="Ctl", label="Control", offset=8, len=0, type="enum16",
                 description="Configure use of services",
                 notes="Configure use of services")
            
   var Ctl: Any? = null

   @SunSpecPoint(id="Addr", label="IP", offset=9, len=8, type="string",
                 description="IPv4 numeric address as a dotted string xxx.xxx.xxx.xxx",
                 notes="IPv4 numeric address as a dotted string xxx.xxx.xxx.xxx")
            
   var Addr: String? = null

   @SunSpecPoint(id="Msk", label="Netmask", offset=17, len=8, type="string",
                 description="IPv4 numeric netmask as a dotted string xxx.xxx.xxx.xxx",
                 notes="IPv4 numeric netmask as a dotted string xxx.xxx.xxx.xxx")
            
   var Msk: String? = null

   @SunSpecPoint(id="Gw", label="Gateway", offset=25, len=8, type="string",
                 description="IPv4 numeric gateway address as a dotted string xxx.xxx.xxx.xxx",
                 notes="IPv4 numeric gateway address as a dotted string xxx.xxx.xxx.xxx")
            
   var Gw: String? = null

   @SunSpecPoint(id="DNS1", label="DNS1", offset=33, len=8, type="string",
                 description="IPv4 numeric DNS address as a dotted string xxx.xxx.xxx.xxx",
                 notes="IPv4 numeric DNS address as a dotted string xxx.xxx.xxx.xxx")
            
   var DNS1: String? = null

   @SunSpecPoint(id="DNS2", label="DNS2", offset=41, len=8, type="string",
                 description="IPv4 numeric DNS address as a dotted string xxx.xxx.xxx.xxx",
                 notes="IPv4 numeric DNS address as a dotted string xxx.xxx.xxx.xxx")
            
   var DNS2: String? = null

   @SunSpecPoint(id="NTP1", label="NTP1", offset=49, len=12, type="string",
                 description="IPv4 numeric NTP address as a dotted string xxx.xxx.xxx.xxx",
                 notes="IPv4 numeric NTP address as a dotted string xxx.xxx.xxx.xxx")
            
   var NTP1: String? = null

   @SunSpecPoint(id="NTP2", label="NTP2", offset=61, len=12, type="string",
                 description="IPv4 numeric NTP address as a dotted string xxx.xxx.xxx.xxx",
                 notes="IPv4 numeric NTP address as a dotted string xxx.xxx.xxx.xxx")
            
   var NTP2: String? = null

   @SunSpecPoint(id="DomNam", label="Domain", offset=73, len=12, type="string",
                 description="Domain name (24 chars max)",
                 notes="Domain name (24 chars max)")
            
   var DomNam: String? = null

   @SunSpecPoint(id="HostNam", label="Host Name", offset=85, len=12, type="string",
                 description="Host name (24 chars max)",
                 notes="Host name (24 chars max)")
            
   var HostNam: String? = null

   @SunSpecPoint(id="Pad", label="", offset=97, len=1, type="pad",
                 description="",
                 notes="")
            
   var Pad: Any? = null

}
