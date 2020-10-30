/*
 * Inverter (Three Phase)
 *
 * Include this model for three phase inverter monitoring
 *
 * 
 */
package edu.rit.gis.sunspec.models

import edu.rit.gis.sunspec.annotations.*

@SunSpecModel(id=103, len=50, name="inverter")
class Model_103 {
   @SunSpecPoint(id="A", label="Amps", offset=0, len=1, type="uint16",
                 description="AC Current",
                 notes="AC Current")
            
   var A: Int? = null

   @SunSpecPoint(id="AphA", label="Amps PhaseA", offset=1, len=1, type="uint16",
                 description="Phase A Current",
                 notes="Phase A Current")
            
   var AphA: Int? = null

   @SunSpecPoint(id="AphB", label="Amps PhaseB", offset=2, len=1, type="uint16",
                 description="Phase B Current",
                 notes="Phase B Current")
            
   var AphB: Int? = null

   @SunSpecPoint(id="AphC", label="Amps PhaseC", offset=3, len=1, type="uint16",
                 description="Phase C Current",
                 notes="Phase C Current")
            
   var AphC: Int? = null

   @SunSpecPoint(id="A_SF", label="", offset=4, len=1, type="sunssf",
                 description="",
                 notes="")
            
   var A_SF: Any? = null

   @SunSpecPoint(id="PPVphAB", label="Phase Voltage AB", offset=5, len=1, type="uint16",
                 description="Phase Voltage AB",
                 notes="Phase Voltage AB")
            
   var PPVphAB: Int? = null

   @SunSpecPoint(id="PPVphBC", label="Phase Voltage BC", offset=6, len=1, type="uint16",
                 description="Phase Voltage BC",
                 notes="Phase Voltage BC")
            
   var PPVphBC: Int? = null

   @SunSpecPoint(id="PPVphCA", label="Phase Voltage CA", offset=7, len=1, type="uint16",
                 description="Phase Voltage CA",
                 notes="Phase Voltage CA")
            
   var PPVphCA: Int? = null

   @SunSpecPoint(id="PhVphA", label="Phase Voltage AN", offset=8, len=1, type="uint16",
                 description="Phase Voltage AN",
                 notes="Phase Voltage AN")
            
   var PhVphA: Int? = null

   @SunSpecPoint(id="PhVphB", label="Phase Voltage BN", offset=9, len=1, type="uint16",
                 description="Phase Voltage BN",
                 notes="Phase Voltage BN")
            
   var PhVphB: Int? = null

   @SunSpecPoint(id="PhVphC", label="Phase Voltage CN", offset=10, len=1, type="uint16",
                 description="Phase Voltage CN",
                 notes="Phase Voltage CN")
            
   var PhVphC: Int? = null

   @SunSpecPoint(id="V_SF", label="", offset=11, len=1, type="sunssf",
                 description="",
                 notes="")
            
   var V_SF: Any? = null

   @SunSpecPoint(id="W", label="Watts", offset=12, len=1, type="int16",
                 description="AC Power",
                 notes="AC Power")
            
   var W: Short? = null

   @SunSpecPoint(id="W_SF", label="", offset=13, len=1, type="sunssf",
                 description="",
                 notes="")
            
   var W_SF: Any? = null

   @SunSpecPoint(id="Hz", label="Hz", offset=14, len=1, type="uint16",
                 description="Line Frequency",
                 notes="Line Frequency")
            
   var Hz: Int? = null

   @SunSpecPoint(id="Hz_SF", label="", offset=15, len=1, type="sunssf",
                 description="",
                 notes="")
            
   var Hz_SF: Any? = null

   @SunSpecPoint(id="VA", label="VA", offset=16, len=1, type="int16",
                 description="AC Apparent Power",
                 notes="AC Apparent Power")
            
   var VA: Short? = null

   @SunSpecPoint(id="VA_SF", label="", offset=17, len=1, type="sunssf",
                 description="",
                 notes="")
            
   var VA_SF: Any? = null

   @SunSpecPoint(id="VAr", label="VAr", offset=18, len=1, type="int16",
                 description="AC Reactive Power",
                 notes="AC Reactive Power")
            
   var VAr: Short? = null

   @SunSpecPoint(id="VAr_SF", label="", offset=19, len=1, type="sunssf",
                 description="",
                 notes="")
            
   var VAr_SF: Any? = null

   @SunSpecPoint(id="PF", label="PF", offset=20, len=1, type="int16",
                 description="AC Power Factor",
                 notes="AC Power Factor")
            
   var PF: Short? = null

   @SunSpecPoint(id="PF_SF", label="", offset=21, len=1, type="sunssf",
                 description="",
                 notes="")
            
   var PF_SF: Any? = null

   @SunSpecPoint(id="WH", label="WattHours", offset=22, len=2, type="acc32",
                 description="AC Energy",
                 notes="AC Energy")
            
   var WH: Long? = null

   @SunSpecPoint(id="WH_SF", label="", offset=24, len=1, type="sunssf",
                 description="",
                 notes="")
            
   var WH_SF: Any? = null

   @SunSpecPoint(id="DCA", label="DC Amps", offset=25, len=1, type="uint16",
                 description="DC Current",
                 notes="DC Current")
            
   var DCA: Int? = null

   @SunSpecPoint(id="DCA_SF", label="", offset=26, len=1, type="sunssf",
                 description="",
                 notes="")
            
   var DCA_SF: Any? = null

   @SunSpecPoint(id="DCV", label="DC Voltage", offset=27, len=1, type="uint16",
                 description="DC Voltage",
                 notes="DC Voltage")
            
   var DCV: Int? = null

   @SunSpecPoint(id="DCV_SF", label="", offset=28, len=1, type="sunssf",
                 description="",
                 notes="")
            
   var DCV_SF: Any? = null

   @SunSpecPoint(id="DCW", label="DC Watts", offset=29, len=1, type="int16",
                 description="DC Power",
                 notes="DC Power")
            
   var DCW: Short? = null

   @SunSpecPoint(id="DCW_SF", label="", offset=30, len=1, type="sunssf",
                 description="",
                 notes="")
            
   var DCW_SF: Any? = null

   @SunSpecPoint(id="TmpCab", label="Cabinet Temperature", offset=31, len=1, type="int16",
                 description="Cabinet Temperature",
                 notes="Cabinet Temperature")
            
   var TmpCab: Short? = null

   @SunSpecPoint(id="TmpSnk", label="Heat Sink Temperature", offset=32, len=1, type="int16",
                 description="Heat Sink Temperature",
                 notes="Heat Sink Temperature")
            
   var TmpSnk: Short? = null

   @SunSpecPoint(id="TmpTrns", label="Transformer Temperature", offset=33, len=1, type="int16",
                 description="Transformer Temperature",
                 notes="Transformer Temperature")
            
   var TmpTrns: Short? = null

   @SunSpecPoint(id="TmpOt", label="Other Temperature", offset=34, len=1, type="int16",
                 description="Other Temperature",
                 notes="Other Temperature")
            
   var TmpOt: Short? = null

   @SunSpecPoint(id="Tmp_SF", label="", offset=35, len=1, type="sunssf",
                 description="",
                 notes="")
            
   var Tmp_SF: Any? = null

   @SunSpecPoint(id="St", label="Operating State", offset=36, len=0, type="enum16",
                 description="Enumerated value.  Operating state",
                 notes="Enumerated value.  Operating state")
            
   var St: Any? = null

   @SunSpecPoint(id="StVnd", label="Vendor Operating State", offset=37, len=0, type="enum16",
                 description="Vendor specific operating state code",
                 notes="Vendor specific operating state code")
            
   var StVnd: Any? = null

   @SunSpecPoint(id="Evt1", label="Event1", offset=38, len=2, type="bitfield32",
                 description="Bitmask value. Event fields",
                 notes="Bitmask value. Event fields")
            
   var Evt1: Int? = null

   @SunSpecPoint(id="Evt2", label="Event Bitfield 2", offset=40, len=2, type="bitfield32",
                 description="Reserved for future use",
                 notes="Reserved for future use")
            
   var Evt2: Int? = null

   @SunSpecPoint(id="EvtVnd1", label="Vendor Event Bitfield 1", offset=42, len=2, type="bitfield32",
                 description="Vendor defined events",
                 notes="Vendor defined events")
            
   var EvtVnd1: Int? = null

   @SunSpecPoint(id="EvtVnd2", label="Vendor Event Bitfield 2", offset=44, len=2, type="bitfield32",
                 description="Vendor defined events",
                 notes="Vendor defined events")
            
   var EvtVnd2: Int? = null

   @SunSpecPoint(id="EvtVnd3", label="Vendor Event Bitfield 3", offset=46, len=2, type="bitfield32",
                 description="Vendor defined events",
                 notes="Vendor defined events")
            
   var EvtVnd3: Int? = null

   @SunSpecPoint(id="EvtVnd4", label="Vendor Event Bitfield 4", offset=48, len=2, type="bitfield32",
                 description="Vendor defined events",
                 notes="Vendor defined events")
            
   var EvtVnd4: Int? = null

}
