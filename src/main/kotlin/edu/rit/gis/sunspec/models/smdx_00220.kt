/*
 * Secure AC Meter Selected Readings
 *
 * Include this model for secure metering
 *
 * 
 */
package edu.rit.gis.sunspec.models

import edu.rit.gis.sunspec.annotations.*

@SunSpecModel(id=220, len=43, name="ac_meter")
class Model_220 {
   @SunSpecPoint(id="A", label="Amps", offset=0, len=1, type="int16",
                 description="Total AC Current",
                 notes="Total AC Current")
            
   var A: Short? = null

   @SunSpecPoint(id="A_SF", label="", offset=1, len=1, type="sunssf",
                 description="Current scale factor",
                 notes="Current scale factor")
            
   var A_SF: Any? = null

   @SunSpecPoint(id="PhV", label="Voltage", offset=2, len=1, type="int16",
                 description="Average phase or line voltage",
                 notes="Average phase or line voltage")
            
   var PhV: Short? = null

   @SunSpecPoint(id="V_SF", label="", offset=3, len=1, type="sunssf",
                 description="Voltage scale factor",
                 notes="Voltage scale factor")
            
   var V_SF: Any? = null

   @SunSpecPoint(id="Hz", label="Hz", offset=4, len=1, type="int16",
                 description="Frequency",
                 notes="Frequency")
            
   var Hz: Short? = null

   @SunSpecPoint(id="Hz_SF", label="", offset=5, len=1, type="sunssf",
                 description="Frequency scale factor",
                 notes="Frequency scale factor")
            
   var Hz_SF: Any? = null

   @SunSpecPoint(id="W", label="Watts", offset=6, len=1, type="int16",
                 description="Total Real Power",
                 notes="Total Real Power")
            
   var W: Short? = null

   @SunSpecPoint(id="W_SF", label="", offset=7, len=1, type="sunssf",
                 description="Real Power scale factor",
                 notes="Real Power scale factor")
            
   var W_SF: Any? = null

   @SunSpecPoint(id="VA", label="VA", offset=8, len=1, type="int16",
                 description="AC Apparent Power",
                 notes="AC Apparent Power")
            
   var VA: Short? = null

   @SunSpecPoint(id="VA_SF", label="", offset=9, len=1, type="sunssf",
                 description="Apparent Power scale factor",
                 notes="Apparent Power scale factor")
            
   var VA_SF: Any? = null

   @SunSpecPoint(id="VAR", label="VAR", offset=10, len=1, type="int16",
                 description="Reactive Power",
                 notes="Reactive Power")
            
   var VAR: Short? = null

   @SunSpecPoint(id="VAR_SF", label="", offset=11, len=1, type="sunssf",
                 description="Reactive Power scale factor",
                 notes="Reactive Power scale factor")
            
   var VAR_SF: Any? = null

   @SunSpecPoint(id="PF", label="PF", offset=12, len=1, type="int16",
                 description="Power Factor",
                 notes="Power Factor")
            
   var PF: Short? = null

   @SunSpecPoint(id="PF_SF", label="", offset=13, len=1, type="sunssf",
                 description="Power Factor scale factor",
                 notes="Power Factor scale factor")
            
   var PF_SF: Any? = null

   @SunSpecPoint(id="TotWhExp", label="Total Watt-hours Exported", offset=14, len=2, type="acc32",
                 description="Total Real Energy Exported",
                 notes="Total Real Energy Exported")
            
   var TotWhExp: Long? = null

   @SunSpecPoint(id="TotWhImp", label="Total Watt-hours Imported", offset=16, len=2, type="acc32",
                 description="Total Real Energy Imported",
                 notes="Total Real Energy Imported")
            
   var TotWhImp: Long? = null

   @SunSpecPoint(id="TotWh_SF", label="", offset=18, len=1, type="sunssf",
                 description="Real Energy scale factor",
                 notes="Real Energy scale factor")
            
   var TotWh_SF: Any? = null

   @SunSpecPoint(id="TotVAhExp", label="Total VA-hours Exported", offset=19, len=2, type="acc32",
                 description="Total Apparent Energy Exported",
                 notes="Total Apparent Energy Exported")
            
   var TotVAhExp: Long? = null

   @SunSpecPoint(id="TotVAhImp", label="Total VA-hours Imported", offset=21, len=2, type="acc32",
                 description="Total Apparent Energy Imported",
                 notes="Total Apparent Energy Imported")
            
   var TotVAhImp: Long? = null

   @SunSpecPoint(id="TotVAh_SF", label="", offset=23, len=1, type="sunssf",
                 description="Apparent Energy scale factor",
                 notes="Apparent Energy scale factor")
            
   var TotVAh_SF: Any? = null

   @SunSpecPoint(id="TotVArhImpQ1", label="Total VAR-hours Imported Q1", offset=24, len=2, type="acc32",
                 description="Total Reactive Energy Imported Quadrant 1",
                 notes="Total Reactive Energy Imported Quadrant 1")
            
   var TotVArhImpQ1: Long? = null

   @SunSpecPoint(id="TotVArhImpQ2", label="Total VAr-hours Imported Q2", offset=26, len=2, type="acc32",
                 description="Total Reactive Power Imported Quadrant 2",
                 notes="Total Reactive Power Imported Quadrant 2")
            
   var TotVArhImpQ2: Long? = null

   @SunSpecPoint(id="TotVArhExpQ3", label="Total VAr-hours Exported Q3", offset=28, len=2, type="acc32",
                 description="Total Reactive Power Exported Quadrant 3",
                 notes="Total Reactive Power Exported Quadrant 3")
            
   var TotVArhExpQ3: Long? = null

   @SunSpecPoint(id="TotVArhExpQ4", label="Total VAr-hours Exported Q4", offset=30, len=2, type="acc32",
                 description="Total Reactive Power Exported Quadrant 4",
                 notes="Total Reactive Power Exported Quadrant 4")
            
   var TotVArhExpQ4: Long? = null

   @SunSpecPoint(id="TotVArh_SF", label="", offset=32, len=1, type="sunssf",
                 description="Reactive Energy scale factor",
                 notes="Reactive Energy scale factor")
            
   var TotVArh_SF: Any? = null

   @SunSpecPoint(id="Evt", label="Events", offset=33, len=2, type="bitfield32",
                 description="Meter Event Flags",
                 notes="Meter Event Flags")
            
   var Evt: Int? = null

   @SunSpecPoint(id="Rsrvd", label="", offset=35, len=1, type="pad",
                 description="",
                 notes="")
            
   var Rsrvd: Any? = null

   @SunSpecPoint(id="Ts", label="Timestamp", offset=36, len=2, type="uint32",
                 description="Timestamp value is the number of seconds since January 1, 2000",
                 notes="Timestamp value is the number of seconds since January 1, 2000")
            
   var Ts: Int? = null

   @SunSpecPoint(id="Ms", label="Milliseconds", offset=38, len=1, type="uint16",
                 description="Millisecond counter 0-999",
                 notes="Millisecond counter 0-999")
            
   var Ms: Int? = null

   @SunSpecPoint(id="Seq", label="Sequence", offset=39, len=1, type="uint16",
                 description="Sequence number of request",
                 notes="Sequence number of request")
            
   var Seq: Int? = null

   @SunSpecPoint(id="Alg", label="Algorithm", offset=40, len=0, type="enum16",
                 description="Algorithm used to compute the digital signature",
                 notes="Algorithm used to compute the digital signature")
            
   var Alg: Any? = null

   @SunSpecPoint(id="N", label="N", offset=41, len=1, type="uint16",
                 description="Number of registers comprising the digital signature.",
                 notes="Number of registers comprising the digital signature.")
            
   var N: Int? = null

}
