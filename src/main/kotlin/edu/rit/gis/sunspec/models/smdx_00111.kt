/*
 * Inverter (Single Phase) FLOAT
 *
 * Include this model for single phase inverter monitoring using float values
 *
 * 
 */
package edu.rit.gis.sunspec.models

import edu.rit.gis.sunspec.annotations.*

@SunSpecModel(id=111, len=60, name="inverter")
class Model_111 {
   @SunSpecPoint(id="A", label="Amps", offset=0, len=2, type="float32",
                 description="AC Current",
                 notes="AC Current")
            
   var A: Float? = null

   @SunSpecPoint(id="AphA", label="Amps PhaseA", offset=2, len=2, type="float32",
                 description="Phase A Current",
                 notes="Phase A Current")
            
   var AphA: Float? = null

   @SunSpecPoint(id="AphB", label="Amps PhaseB", offset=4, len=2, type="float32",
                 description="Phase B Current",
                 notes="Phase B Current")
            
   var AphB: Float? = null

   @SunSpecPoint(id="AphC", label="Amps PhaseC", offset=6, len=2, type="float32",
                 description="Phase C Current",
                 notes="Phase C Current")
            
   var AphC: Float? = null

   @SunSpecPoint(id="PPVphAB", label="Phase Voltage AB", offset=8, len=2, type="float32",
                 description="Phase Voltage AB",
                 notes="Phase Voltage AB")
            
   var PPVphAB: Float? = null

   @SunSpecPoint(id="PPVphBC", label="Phase Voltage BC", offset=10, len=2, type="float32",
                 description="Phase Voltage BC",
                 notes="Phase Voltage BC")
            
   var PPVphBC: Float? = null

   @SunSpecPoint(id="PPVphCA", label="Phase Voltage CA", offset=12, len=2, type="float32",
                 description="Phase Voltage CA",
                 notes="Phase Voltage CA")
            
   var PPVphCA: Float? = null

   @SunSpecPoint(id="PhVphA", label="Phase Voltage AN", offset=14, len=2, type="float32",
                 description="Phase Voltage AN",
                 notes="Phase Voltage AN")
            
   var PhVphA: Float? = null

   @SunSpecPoint(id="PhVphB", label="Phase Voltage BN", offset=16, len=2, type="float32",
                 description="Phase Voltage BN",
                 notes="Phase Voltage BN")
            
   var PhVphB: Float? = null

   @SunSpecPoint(id="PhVphC", label="Phase Voltage CN", offset=18, len=2, type="float32",
                 description="Phase Voltage CN",
                 notes="Phase Voltage CN")
            
   var PhVphC: Float? = null

   @SunSpecPoint(id="W", label="Watts", offset=20, len=2, type="float32",
                 description="AC Power",
                 notes="AC Power")
            
   var W: Float? = null

   @SunSpecPoint(id="Hz", label="Hz", offset=22, len=2, type="float32",
                 description="Line Frequency",
                 notes="Line Frequency")
            
   var Hz: Float? = null

   @SunSpecPoint(id="VA", label="VA", offset=24, len=2, type="float32",
                 description="AC Apparent Power",
                 notes="AC Apparent Power")
            
   var VA: Float? = null

   @SunSpecPoint(id="VAr", label="VAr", offset=26, len=2, type="float32",
                 description="AC Reactive Power",
                 notes="AC Reactive Power")
            
   var VAr: Float? = null

   @SunSpecPoint(id="PF", label="PF", offset=28, len=2, type="float32",
                 description="AC Power Factor",
                 notes="AC Power Factor")
            
   var PF: Float? = null

   @SunSpecPoint(id="WH", label="WattHours", offset=30, len=2, type="float32",
                 description="AC Energy",
                 notes="AC Energy")
            
   var WH: Float? = null

   @SunSpecPoint(id="DCA", label="DC Amps", offset=32, len=2, type="float32",
                 description="DC Current",
                 notes="DC Current")
            
   var DCA: Float? = null

   @SunSpecPoint(id="DCV", label="DC Voltage", offset=34, len=2, type="float32",
                 description="DC Voltage",
                 notes="DC Voltage")
            
   var DCV: Float? = null

   @SunSpecPoint(id="DCW", label="DC Watts", offset=36, len=2, type="float32",
                 description="DC Power",
                 notes="DC Power")
            
   var DCW: Float? = null

   @SunSpecPoint(id="TmpCab", label="Cabinet Temperature", offset=38, len=2, type="float32",
                 description="Cabinet Temperature",
                 notes="Cabinet Temperature")
            
   var TmpCab: Float? = null

   @SunSpecPoint(id="TmpSnk", label="Heat Sink Temperature", offset=40, len=2, type="float32",
                 description="Heat Sink Temperature",
                 notes="Heat Sink Temperature")
            
   var TmpSnk: Float? = null

   @SunSpecPoint(id="TmpTrns", label="Transformer Temperature", offset=42, len=2, type="float32",
                 description="Transformer Temperature",
                 notes="Transformer Temperature")
            
   var TmpTrns: Float? = null

   @SunSpecPoint(id="TmpOt", label="Other Temperature", offset=44, len=2, type="float32",
                 description="Other Temperature",
                 notes="Other Temperature")
            
   var TmpOt: Float? = null

   @SunSpecPoint(id="St", label="Operating State", offset=46, len=0, type="enum16",
                 description="Enumerated value.  Operating state",
                 notes="Enumerated value.  Operating state")
            
   var St: Any? = null

   @SunSpecPoint(id="StVnd", label="Vendor Operating State", offset=47, len=0, type="enum16",
                 description="Vendor specific operating state code",
                 notes="Vendor specific operating state code")
            
   var StVnd: Any? = null

   @SunSpecPoint(id="Evt1", label="Event1", offset=48, len=2, type="bitfield32",
                 description="Bitmask value. Event fields",
                 notes="Bitmask value. Event fields")
            
   var Evt1: UInt? = null

   @SunSpecPoint(id="Evt2", label="Event Bitfield 2", offset=50, len=2, type="bitfield32",
                 description="Reserved for future use",
                 notes="Reserved for future use")
            
   var Evt2: UInt? = null

   @SunSpecPoint(id="EvtVnd1", label="Vendor Event Bitfield 1", offset=52, len=2, type="bitfield32",
                 description="Vendor defined events",
                 notes="Vendor defined events")
            
   var EvtVnd1: UInt? = null

   @SunSpecPoint(id="EvtVnd2", label="Vendor Event Bitfield 2", offset=54, len=2, type="bitfield32",
                 description="Vendor defined events",
                 notes="Vendor defined events")
            
   var EvtVnd2: UInt? = null

   @SunSpecPoint(id="EvtVnd3", label="Vendor Event Bitfield 3", offset=56, len=2, type="bitfield32",
                 description="Vendor defined events",
                 notes="Vendor defined events")
            
   var EvtVnd3: UInt? = null

   @SunSpecPoint(id="EvtVnd4", label="Vendor Event Bitfield 4", offset=58, len=2, type="bitfield32",
                 description="Vendor defined events",
                 notes="Vendor defined events")
            
   var EvtVnd4: UInt? = null

}
