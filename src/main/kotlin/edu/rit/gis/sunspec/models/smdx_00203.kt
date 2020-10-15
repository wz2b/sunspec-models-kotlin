/*
 * wye-connect three phase (abcn) meter
 *
 * 
 *
 * 
 */
package edu.rit.gis.sunspec.models

import edu.rit.gis.sunspec.annotations.*

@SunSpecModel(id=203, len=105, name="ac_meter")
class Model_203 {
   @SunSpecPoint(id="A", label="Amps", offset=0, len=1, type="int16",
                 description="Total AC Current",
                 notes="Total AC Current")
            
   var A: Short? = null

   @SunSpecPoint(id="AphA", label="Amps PhaseA", offset=1, len=1, type="int16",
                 description="Phase A Current",
                 notes="Phase A Current")
            
   var AphA: Short? = null

   @SunSpecPoint(id="AphB", label="Amps PhaseB", offset=2, len=1, type="int16",
                 description="Phase B Current",
                 notes="Phase B Current")
            
   var AphB: Short? = null

   @SunSpecPoint(id="AphC", label="Amps PhaseC", offset=3, len=1, type="int16",
                 description="Phase C Current",
                 notes="Phase C Current")
            
   var AphC: Short? = null

   @SunSpecPoint(id="A_SF", label="", offset=4, len=1, type="sunssf",
                 description="Current scale factor",
                 notes="Current scale factor")
            
   var A_SF: Any? = null

   @SunSpecPoint(id="PhV", label="Voltage LN", offset=5, len=1, type="int16",
                 description="Line to Neutral AC Voltage (average of active phases)",
                 notes="Line to Neutral AC Voltage (average of active phases)")
            
   var PhV: Short? = null

   @SunSpecPoint(id="PhVphA", label="Phase Voltage AN", offset=6, len=1, type="int16",
                 description="Phase Voltage AN",
                 notes="Phase Voltage AN")
            
   var PhVphA: Short? = null

   @SunSpecPoint(id="PhVphB", label="Phase Voltage BN", offset=7, len=1, type="int16",
                 description="Phase Voltage BN",
                 notes="Phase Voltage BN")
            
   var PhVphB: Short? = null

   @SunSpecPoint(id="PhVphC", label="Phase Voltage CN", offset=8, len=1, type="int16",
                 description="Phase Voltage CN",
                 notes="Phase Voltage CN")
            
   var PhVphC: Short? = null

   @SunSpecPoint(id="PPV", label="Voltage LL", offset=9, len=1, type="int16",
                 description="Line to Line AC Voltage (average of active phases)",
                 notes="Line to Line AC Voltage (average of active phases)")
            
   var PPV: Short? = null

   @SunSpecPoint(id="PhVphAB", label="Phase Voltage AB", offset=10, len=1, type="int16",
                 description="Phase Voltage AB",
                 notes="Phase Voltage AB")
            
   var PhVphAB: Short? = null

   @SunSpecPoint(id="PhVphBC", label="Phase Voltage BC", offset=11, len=1, type="int16",
                 description="Phase Voltage BC",
                 notes="Phase Voltage BC")
            
   var PhVphBC: Short? = null

   @SunSpecPoint(id="PhVphCA", label="Phase Voltage CA", offset=12, len=1, type="int16",
                 description="Phase Voltage CA",
                 notes="Phase Voltage CA")
            
   var PhVphCA: Short? = null

   @SunSpecPoint(id="V_SF", label="", offset=13, len=1, type="sunssf",
                 description="Voltage scale factor",
                 notes="Voltage scale factor")
            
   var V_SF: Any? = null

   @SunSpecPoint(id="Hz", label="Hz", offset=14, len=1, type="int16",
                 description="Frequency",
                 notes="Frequency")
            
   var Hz: Short? = null

   @SunSpecPoint(id="Hz_SF", label="", offset=15, len=1, type="sunssf",
                 description="Frequency scale factor",
                 notes="Frequency scale factor")
            
   var Hz_SF: Any? = null

   @SunSpecPoint(id="W", label="Watts", offset=16, len=1, type="int16",
                 description="Total Real Power",
                 notes="Total Real Power")
            
   var W: Short? = null

   @SunSpecPoint(id="WphA", label="Watts phase A", offset=17, len=1, type="int16",
                 description="",
                 notes="")
            
   var WphA: Short? = null

   @SunSpecPoint(id="WphB", label="Watts phase B", offset=18, len=1, type="int16",
                 description="",
                 notes="")
            
   var WphB: Short? = null

   @SunSpecPoint(id="WphC", label="Watts phase C", offset=19, len=1, type="int16",
                 description="",
                 notes="")
            
   var WphC: Short? = null

   @SunSpecPoint(id="W_SF", label="", offset=20, len=1, type="sunssf",
                 description="Real Power scale factor",
                 notes="Real Power scale factor")
            
   var W_SF: Any? = null

   @SunSpecPoint(id="VA", label="VA", offset=21, len=1, type="int16",
                 description="AC Apparent Power",
                 notes="AC Apparent Power")
            
   var VA: Short? = null

   @SunSpecPoint(id="VAphA", label="VA phase A", offset=22, len=1, type="int16",
                 description="",
                 notes="")
            
   var VAphA: Short? = null

   @SunSpecPoint(id="VAphB", label="VA phase B", offset=23, len=1, type="int16",
                 description="",
                 notes="")
            
   var VAphB: Short? = null

   @SunSpecPoint(id="VAphC", label="VA phase C", offset=24, len=1, type="int16",
                 description="",
                 notes="")
            
   var VAphC: Short? = null

   @SunSpecPoint(id="VA_SF", label="", offset=25, len=1, type="sunssf",
                 description="Apparent Power scale factor",
                 notes="Apparent Power scale factor")
            
   var VA_SF: Any? = null

   @SunSpecPoint(id="VAR", label="VAR", offset=26, len=1, type="int16",
                 description="Reactive Power",
                 notes="Reactive Power")
            
   var VAR: Short? = null

   @SunSpecPoint(id="VARphA", label="VAR phase A", offset=27, len=1, type="int16",
                 description="",
                 notes="")
            
   var VARphA: Short? = null

   @SunSpecPoint(id="VARphB", label="VAR phase B", offset=28, len=1, type="int16",
                 description="",
                 notes="")
            
   var VARphB: Short? = null

   @SunSpecPoint(id="VARphC", label="VAR phase C", offset=29, len=1, type="int16",
                 description="",
                 notes="")
            
   var VARphC: Short? = null

   @SunSpecPoint(id="VAR_SF", label="", offset=30, len=1, type="sunssf",
                 description="Reactive Power scale factor",
                 notes="Reactive Power scale factor")
            
   var VAR_SF: Any? = null

   @SunSpecPoint(id="PF", label="PF", offset=31, len=1, type="int16",
                 description="Power Factor",
                 notes="Power Factor")
            
   var PF: Short? = null

   @SunSpecPoint(id="PFphA", label="PF phase A", offset=32, len=1, type="int16",
                 description="",
                 notes="")
            
   var PFphA: Short? = null

   @SunSpecPoint(id="PFphB", label="PF phase B", offset=33, len=1, type="int16",
                 description="",
                 notes="")
            
   var PFphB: Short? = null

   @SunSpecPoint(id="PFphC", label="PF phase C", offset=34, len=1, type="int16",
                 description="",
                 notes="")
            
   var PFphC: Short? = null

   @SunSpecPoint(id="PF_SF", label="", offset=35, len=1, type="sunssf",
                 description="Power Factor scale factor",
                 notes="Power Factor scale factor")
            
   var PF_SF: Any? = null

   @SunSpecPoint(id="TotWhExp", label="Total Watt-hours Exported", offset=36, len=2, type="acc32",
                 description="Total Real Energy Exported",
                 notes="Total Real Energy Exported")
            
   var TotWhExp: UInt? = null

   @SunSpecPoint(id="TotWhExpPhA", label="Total Watt-hours Exported phase A", offset=38, len=2, type="acc32",
                 description="",
                 notes="")
            
   var TotWhExpPhA: UInt? = null

   @SunSpecPoint(id="TotWhExpPhB", label="Total Watt-hours Exported phase B", offset=40, len=2, type="acc32",
                 description="",
                 notes="")
            
   var TotWhExpPhB: UInt? = null

   @SunSpecPoint(id="TotWhExpPhC", label="Total Watt-hours Exported phase C", offset=42, len=2, type="acc32",
                 description="",
                 notes="")
            
   var TotWhExpPhC: UInt? = null

   @SunSpecPoint(id="TotWhImp", label="Total Watt-hours Imported", offset=44, len=2, type="acc32",
                 description="Total Real Energy Imported",
                 notes="Total Real Energy Imported")
            
   var TotWhImp: UInt? = null

   @SunSpecPoint(id="TotWhImpPhA", label="Total Watt-hours Imported phase A", offset=46, len=2, type="acc32",
                 description="",
                 notes="")
            
   var TotWhImpPhA: UInt? = null

   @SunSpecPoint(id="TotWhImpPhB", label="Total Watt-hours Imported phase B", offset=48, len=2, type="acc32",
                 description="",
                 notes="")
            
   var TotWhImpPhB: UInt? = null

   @SunSpecPoint(id="TotWhImpPhC", label="Total Watt-hours Imported phase C", offset=50, len=2, type="acc32",
                 description="",
                 notes="")
            
   var TotWhImpPhC: UInt? = null

   @SunSpecPoint(id="TotWh_SF", label="", offset=52, len=1, type="sunssf",
                 description="Real Energy scale factor",
                 notes="Real Energy scale factor")
            
   var TotWh_SF: Any? = null

   @SunSpecPoint(id="TotVAhExp", label="Total VA-hours Exported", offset=53, len=2, type="acc32",
                 description="Total Apparent Energy Exported",
                 notes="Total Apparent Energy Exported")
            
   var TotVAhExp: UInt? = null

   @SunSpecPoint(id="TotVAhExpPhA", label="Total VA-hours Exported phase A", offset=55, len=2, type="acc32",
                 description="",
                 notes="")
            
   var TotVAhExpPhA: UInt? = null

   @SunSpecPoint(id="TotVAhExpPhB", label="Total VA-hours Exported phase B", offset=57, len=2, type="acc32",
                 description="",
                 notes="")
            
   var TotVAhExpPhB: UInt? = null

   @SunSpecPoint(id="TotVAhExpPhC", label="Total VA-hours Exported phase C", offset=59, len=2, type="acc32",
                 description="",
                 notes="")
            
   var TotVAhExpPhC: UInt? = null

   @SunSpecPoint(id="TotVAhImp", label="Total VA-hours Imported", offset=61, len=2, type="acc32",
                 description="Total Apparent Energy Imported",
                 notes="Total Apparent Energy Imported")
            
   var TotVAhImp: UInt? = null

   @SunSpecPoint(id="TotVAhImpPhA", label="Total VA-hours Imported phase A", offset=63, len=2, type="acc32",
                 description="",
                 notes="")
            
   var TotVAhImpPhA: UInt? = null

   @SunSpecPoint(id="TotVAhImpPhB", label="Total VA-hours Imported phase B", offset=65, len=2, type="acc32",
                 description="",
                 notes="")
            
   var TotVAhImpPhB: UInt? = null

   @SunSpecPoint(id="TotVAhImpPhC", label="Total VA-hours Imported phase C", offset=67, len=2, type="acc32",
                 description="",
                 notes="")
            
   var TotVAhImpPhC: UInt? = null

   @SunSpecPoint(id="TotVAh_SF", label="", offset=69, len=1, type="sunssf",
                 description="Apparent Energy scale factor",
                 notes="Apparent Energy scale factor")
            
   var TotVAh_SF: Any? = null

   @SunSpecPoint(id="TotVArhImpQ1", label="Total VAR-hours Imported Q1", offset=70, len=2, type="acc32",
                 description="Total Reactive Energy Imported Quadrant 1",
                 notes="Total Reactive Energy Imported Quadrant 1")
            
   var TotVArhImpQ1: UInt? = null

   @SunSpecPoint(id="TotVArhImpQ1PhA", label="Total VAr-hours Imported Q1 phase A", offset=72, len=2, type="acc32",
                 description="",
                 notes="")
            
   var TotVArhImpQ1PhA: UInt? = null

   @SunSpecPoint(id="TotVArhImpQ1PhB", label="Total VAr-hours Imported Q1 phase B", offset=74, len=2, type="acc32",
                 description="",
                 notes="")
            
   var TotVArhImpQ1PhB: UInt? = null

   @SunSpecPoint(id="TotVArhImpQ1PhC", label="Total VAr-hours Imported Q1 phase C", offset=76, len=2, type="acc32",
                 description="",
                 notes="")
            
   var TotVArhImpQ1PhC: UInt? = null

   @SunSpecPoint(id="TotVArhImpQ2", label="Total VAr-hours Imported Q2", offset=78, len=2, type="acc32",
                 description="Total Reactive Power Imported Quadrant 2",
                 notes="Total Reactive Power Imported Quadrant 2")
            
   var TotVArhImpQ2: UInt? = null

   @SunSpecPoint(id="TotVArhImpQ2PhA", label="Total VAr-hours Imported Q2 phase A", offset=80, len=2, type="acc32",
                 description="",
                 notes="")
            
   var TotVArhImpQ2PhA: UInt? = null

   @SunSpecPoint(id="TotVArhImpQ2PhB", label="Total VAr-hours Imported Q2 phase B", offset=82, len=2, type="acc32",
                 description="",
                 notes="")
            
   var TotVArhImpQ2PhB: UInt? = null

   @SunSpecPoint(id="TotVArhImpQ2PhC", label="Total VAr-hours Imported Q2 phase C", offset=84, len=2, type="acc32",
                 description="",
                 notes="")
            
   var TotVArhImpQ2PhC: UInt? = null

   @SunSpecPoint(id="TotVArhExpQ3", label="Total VAr-hours Exported Q3", offset=86, len=2, type="acc32",
                 description="Total Reactive Power Exported Quadrant 3",
                 notes="Total Reactive Power Exported Quadrant 3")
            
   var TotVArhExpQ3: UInt? = null

   @SunSpecPoint(id="TotVArhExpQ3PhA", label="Total VAr-hours Exported Q3 phase A", offset=88, len=2, type="acc32",
                 description="",
                 notes="")
            
   var TotVArhExpQ3PhA: UInt? = null

   @SunSpecPoint(id="TotVArhExpQ3PhB", label="Total VAr-hours Exported Q3 phase B", offset=90, len=2, type="acc32",
                 description="",
                 notes="")
            
   var TotVArhExpQ3PhB: UInt? = null

   @SunSpecPoint(id="TotVArhExpQ3PhC", label="Total VAr-hours Exported Q3 phase C", offset=92, len=2, type="acc32",
                 description="",
                 notes="")
            
   var TotVArhExpQ3PhC: UInt? = null

   @SunSpecPoint(id="TotVArhExpQ4", label="Total VAr-hours Exported Q4", offset=94, len=2, type="acc32",
                 description="Total Reactive Power Exported Quadrant 4",
                 notes="Total Reactive Power Exported Quadrant 4")
            
   var TotVArhExpQ4: UInt? = null

   @SunSpecPoint(id="TotVArhExpQ4PhA", label="Total VAr-hours Exported Q4 Imported phase A", offset=96, len=2, type="acc32",
                 description="",
                 notes="")
            
   var TotVArhExpQ4PhA: UInt? = null

   @SunSpecPoint(id="TotVArhExpQ4PhB", label="Total VAr-hours Exported Q4 Imported phase B", offset=98, len=2, type="acc32",
                 description="",
                 notes="")
            
   var TotVArhExpQ4PhB: UInt? = null

   @SunSpecPoint(id="TotVArhExpQ4PhC", label="Total VAr-hours Exported Q4 Imported phase C", offset=100, len=2, type="acc32",
                 description="",
                 notes="")
            
   var TotVArhExpQ4PhC: UInt? = null

   @SunSpecPoint(id="TotVArh_SF", label="", offset=102, len=1, type="sunssf",
                 description="Reactive Energy scale factor",
                 notes="Reactive Energy scale factor")
            
   var TotVArh_SF: Any? = null

   @SunSpecPoint(id="Evt", label="Events", offset=103, len=2, type="bitfield32",
                 description="Meter Event Flags",
                 notes="Meter Event Flags")
            
   var Evt: UInt? = null

}
