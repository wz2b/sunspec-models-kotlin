/*
 * Measurements_Status
 *
 * Inverter Controls Extended Measurements and Status 
 *
 * Ref 3: 8.14.3.2, Ref 4: 17
 */
package edu.rit.gis.sunspec.models

import edu.rit.gis.sunspec.annotations.*

@SunSpecModel(id=122, len=44, name="status")
class Model_122 {
   @SunSpecPoint(id="PVConn", label="PVConn", offset=0, len=1, type="bitfield16",
                 description="PV inverter present/available status. Enumerated value.",
                 notes="PV inverter present/available status. Enumerated value.")
            
   var PVConn: Short? = null

   @SunSpecPoint(id="StorConn", label="StorConn", offset=1, len=1, type="bitfield16",
                 description="Storage inverter present/available status. Enumerated value.",
                 notes="Storage inverter present/available status. Enumerated value.")
            
   var StorConn: Short? = null

   @SunSpecPoint(id="ECPConn", label="ECPConn", offset=2, len=1, type="bitfield16",
                 description="ECP connection status: disconnected=0  connected=1.",
                 notes="ECP connection status: disconnected=0  connected=1.")
            
   var ECPConn: Short? = null

   @SunSpecPoint(id="ActWh", label="ActWh", offset=3, len=4, type="acc64",
                 description="AC lifetime active (real) energy output.",
                 notes="AC lifetime active (real) energy output.")
            
   var ActWh: Any? = null

   @SunSpecPoint(id="ActVAh", label="ActVAh", offset=7, len=4, type="acc64",
                 description="AC lifetime apparent energy output.",
                 notes="AC lifetime apparent energy output.")
            
   var ActVAh: Any? = null

   @SunSpecPoint(id="ActVArhQ1", label="ActVArhQ1", offset=11, len=4, type="acc64",
                 description="AC lifetime reactive energy output in quadrant 1.",
                 notes="AC lifetime reactive energy output in quadrant 1.")
            
   var ActVArhQ1: Any? = null

   @SunSpecPoint(id="ActVArhQ2", label="ActVArhQ2", offset=15, len=4, type="acc64",
                 description="AC lifetime reactive energy output in quadrant 2.",
                 notes="AC lifetime reactive energy output in quadrant 2.")
            
   var ActVArhQ2: Any? = null

   @SunSpecPoint(id="ActVArhQ3", label="ActVArhQ3", offset=19, len=4, type="acc64",
                 description="AC lifetime negative energy output  in quadrant 3.",
                 notes="AC lifetime negative energy output  in quadrant 3.")
            
   var ActVArhQ3: Any? = null

   @SunSpecPoint(id="ActVArhQ4", label="ActVArhQ4", offset=23, len=4, type="acc64",
                 description="AC lifetime reactive energy output  in quadrant 4.",
                 notes="AC lifetime reactive energy output  in quadrant 4.")
            
   var ActVArhQ4: Any? = null

   @SunSpecPoint(id="VArAval", label="VArAval", offset=27, len=1, type="int16",
                 description="Amount of VARs available without impacting watts output.",
                 notes="Amount of VARs available without impacting watts output.")
            
   var VArAval: Short? = null

   @SunSpecPoint(id="VArAval_SF", label="VArAval_SF", offset=28, len=1, type="sunssf",
                 description="Scale factor for available VARs.",
                 notes="Scale factor for available VARs.")
            
   var VArAval_SF: Any? = null

   @SunSpecPoint(id="WAval", label="WAval", offset=29, len=1, type="uint16",
                 description="Amount of Watts available.",
                 notes="Amount of Watts available.")
            
   var WAval: Int? = null

   @SunSpecPoint(id="WAval_SF", label="WAval_SF", offset=30, len=1, type="sunssf",
                 description="Scale factor for available Watts.",
                 notes="Scale factor for available Watts.")
            
   var WAval_SF: Any? = null

   @SunSpecPoint(id="StSetLimMsk", label="StSetLimMsk", offset=31, len=2, type="bitfield32",
                 description="Bit Mask indicating setpoint limit(s) reached.",
                 notes="Bit Mask indicating setpoint limit(s) reached.")
            
   var StSetLimMsk: Int? = null

   @SunSpecPoint(id="StActCtl", label="StActCtl", offset=33, len=2, type="bitfield32",
                 description="Bit Mask indicating which inverter controls are currently active.",
                 notes="Bit Mask indicating which inverter controls are currently active.")
            
   var StActCtl: Int? = null

   @SunSpecPoint(id="TmSrc", label="TmSrc", offset=35, len=4, type="string",
                 description="Source of time synchronization.",
                 notes="Source of time synchronization.")
            
   var TmSrc: String? = null

   @SunSpecPoint(id="Tms", label="Tms", offset=39, len=2, type="uint32",
                 description="Seconds since 01-01-2000 00:00 UTC",
                 notes="Seconds since 01-01-2000 00:00 UTC")
            
   var Tms: Int? = null

   @SunSpecPoint(id="RtSt", label="RtSt", offset=41, len=1, type="bitfield16",
                 description="Bit Mask indicating active ride-through status.",
                 notes="Bit Mask indicating active ride-through status.")
            
   var RtSt: Short? = null

   @SunSpecPoint(id="Ris", label="Ris", offset=42, len=1, type="uint16",
                 description="Isolation resistance.",
                 notes="Isolation resistance.")
            
   var Ris: Int? = null

   @SunSpecPoint(id="Ris_SF", label="Ris_SF", offset=43, len=1, type="sunssf",
                 description="Scale factor for isolation resistance.",
                 notes="Scale factor for isolation resistance.")
            
   var Ris_SF: Any? = null

}
