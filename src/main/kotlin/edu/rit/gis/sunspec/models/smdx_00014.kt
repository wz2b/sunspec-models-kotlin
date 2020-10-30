/*
 * Proxy Server
 *
 * Include this block to allow for a proxy server
 *
 * 
 */
package edu.rit.gis.sunspec.models

import edu.rit.gis.sunspec.annotations.*

@SunSpecModel(id=14, len=52, name="model_14")
class Model_14 {
   @SunSpecPoint(id="Nam", label="name", offset=0, len=4, type="string",
                 description="Interface name (8 chars)",
                 notes="Interface name (8 chars)")
            
   var Nam: String? = null

   @SunSpecPoint(id="Cap", label="Capabilities", offset=4, len=1, type="bitfield16",
                 description="Bitmask value.  Proxy configuration capabilities",
                 notes="Bitmask value.  Proxy configuration capabilities")
            
   var Cap: Short? = null

   @SunSpecPoint(id="Cfg", label="Config", offset=5, len=0, type="enum16",
                 description="Enumerated value.  Set proxy address type",
                 notes="Enumerated value.  Set proxy address type")
            
   var Cfg: Any? = null

   @SunSpecPoint(id="Typ", label="Type", offset=6, len=1, type="bitfield16",
                 description="Enumerate value.  Proxy server type",
                 notes="Enumerate value.  Proxy server type")
            
   var Typ: Short? = null

   @SunSpecPoint(id="Addr", label="Address", offset=7, len=20, type="string",
                 description="IPv4 or IPv6 proxy hostname or dotted address (40 chars)",
                 notes="IPv4 or IPv6 proxy hostname or dotted address (40 chars)")
            
   var Addr: String? = null

   @SunSpecPoint(id="Port", label="Port", offset=27, len=1, type="uint16",
                 description="Proxy port number",
                 notes="Proxy port number")
            
   var Port: Int? = null

   @SunSpecPoint(id="User", label="Username", offset=28, len=12, type="string",
                 description="Proxy user name",
                 notes="Proxy user name")
            
   var User: String? = null

   @SunSpecPoint(id="Pw", label="Password", offset=40, len=12, type="string",
                 description="Proxy password",
                 notes="Proxy password")
            
   var Pw: String? = null

}
