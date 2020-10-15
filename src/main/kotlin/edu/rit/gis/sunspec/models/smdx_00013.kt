/*
 * IPv6
 *
 * Include to support an IPv6 protocol stack on this interface
 *
 * 
 */
package edu.rit.gis.sunspec.models

import edu.rit.gis.sunspec.annotations.*

@SunSpecModel(id=13, len=174, name="model_13")
class Model_13 {
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
            
   var ChgSt: UShort? = null

   @SunSpecPoint(id="Cap", label="Config Capability", offset=6, len=1, type="bitfield16",
                 description="Bitmask value. Identify capable sources of configuration",
                 notes="Bitmask value. Identify capable sources of configuration")
            
   var Cap: UShort? = null

   @SunSpecPoint(id="Cfg", label="IPv6 Config", offset=7, len=0, type="enum16",
                 description="Enumerated value.  Configuration method used.",
                 notes="Enumerated value.  Configuration method used.")
            
   var Cfg: Any? = null

   @SunSpecPoint(id="Ctl", label="Control", offset=8, len=0, type="enum16",
                 description="Bitmask value.  Configure use of services",
                 notes="Bitmask value.  Configure use of services")
            
   var Ctl: Any? = null

   @SunSpecPoint(id="Addr", label="IP", offset=9, len=20, type="string",
                 description="IPv6 numeric address as a dotted string xxxx.xxxx.xxxx.xxxx",
                 notes="IPv6 numeric address as a dotted string xxxx.xxxx.xxxx.xxxx")
            
   var Addr: String? = null

   @SunSpecPoint(id="CIDR", label="CIDR", offset=29, len=20, type="string",
                 description="Classless Inter-Domain Routing Number",
                 notes="Classless Inter-Domain Routing Number")
            
   var CIDR: String? = null

   @SunSpecPoint(id="Gw", label="Gateway", offset=49, len=20, type="string",
                 description="IPv6 numeric address as a dotted string xxxx.xxxx.xxxx.xxxx",
                 notes="IPv6 numeric address as a dotted string xxxx.xxxx.xxxx.xxxx")
            
   var Gw: String? = null

   @SunSpecPoint(id="DNS1", label="DNS1", offset=69, len=20, type="string",
                 description="IPv6 numeric DNS address as a dotted string xxxx.xxxx.xxxx.xxxx",
                 notes="IPv6 numeric DNS address as a dotted string xxxx.xxxx.xxxx.xxxx")
            
   var DNS1: String? = null

   @SunSpecPoint(id="DNS2", label="DNS2", offset=89, len=20, type="string",
                 description="IPv6 numeric DNS address as a dotted string xxxx.xxxx.xxxx.xxxx",
                 notes="IPv6 numeric DNS address as a dotted string xxxx.xxxx.xxxx.xxxx")
            
   var DNS2: String? = null

   @SunSpecPoint(id="NTP1", label="NTP1", offset=109, len=20, type="string",
                 description="IPv6 numeric NTP address as a name or dotted string xxxx.xxxx.xxxx.xxxx",
                 notes="IPv6 numeric NTP address as a name or dotted string xxxx.xxxx.xxxx.xxxx")
            
   var NTP1: String? = null

   @SunSpecPoint(id="NTP2", label="NTP2", offset=129, len=20, type="string",
                 description="IPv6 numeric NTP address as a name or dotted string xxxx.xxxx.xxxx.xxxx",
                 notes="IPv6 numeric NTP address as a name or dotted string xxxx.xxxx.xxxx.xxxx")
            
   var NTP2: String? = null

   @SunSpecPoint(id="DomNam", label="Domain", offset=149, len=12, type="string",
                 description="Domain name (24 chars max)",
                 notes="Domain name (24 chars max)")
            
   var DomNam: String? = null

   @SunSpecPoint(id="HostNam", label="Host Name", offset=161, len=12, type="string",
                 description="Host name (24 chars max)",
                 notes="Host name (24 chars max)")
            
   var HostNam: String? = null

   @SunSpecPoint(id="Pad", label="", offset=173, len=1, type="pad",
                 description="",
                 notes="")
            
   var Pad: Any? = null

}
