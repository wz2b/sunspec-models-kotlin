/*
 * wye-connect three phase (abcn) meter
 *
 * 
 *
 * Float
 */
package edu.rit.gis.sunspec.models

import edu.rit.gis.sunspec.annotations.*

@SunSpecModel(id=213, len=124, name="ac_meter")
class Model_213 {
   @SunSpecPoint(id="A", label="Amps", offset=0, len=2, type="float32",
                 description="Total AC Current",
                 notes="Total AC Current")
            
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

   @SunSpecPoint(id="PhV", label="Voltage LN", offset=8, len=2, type="float32",
                 description="Line to Neutral AC Voltage (average of active phases)",
                 notes="Line to Neutral AC Voltage (average of active phases)")
            
   var PhV: Float? = null

   @SunSpecPoint(id="PhVphA", label="Phase Voltage AN", offset=10, len=2, type="float32",
                 description="Phase Voltage AN",
                 notes="Phase Voltage AN")
            
   var PhVphA: Float? = null

   @SunSpecPoint(id="PhVphB", label="Phase Voltage BN", offset=12, len=2, type="float32",
                 description="Phase Voltage BN",
                 notes="Phase Voltage BN")
            
   var PhVphB: Float? = null

   @SunSpecPoint(id="PhVphC", label="Phase Voltage CN", offset=14, len=2, type="float32",
                 description="Phase Voltage CN",
                 notes="Phase Voltage CN")
            
   var PhVphC: Float? = null

   @SunSpecPoint(id="PPV", label="Voltage LL", offset=16, len=2, type="float32",
                 description="Line to Line AC Voltage (average of active phases)",
                 notes="Line to Line AC Voltage (average of active phases)")
            
   var PPV: Float? = null

   @SunSpecPoint(id="PPVphAB", label="Phase Voltage AB", offset=18, len=2, type="float32",
                 description="Phase Voltage AB",
                 notes="Phase Voltage AB")
            
   var PPVphAB: Float? = null

   @SunSpecPoint(id="PPVphBC", label="Phase Voltage BC", offset=20, len=2, type="float32",
                 description="Phase Voltage BC",
                 notes="Phase Voltage BC")
            
   var PPVphBC: Float? = null

   @SunSpecPoint(id="PPVphCA", label="Phase Voltage CA", offset=22, len=2, type="float32",
                 description="Phase Voltage CA",
                 notes="Phase Voltage CA")
            
   var PPVphCA: Float? = null

   @SunSpecPoint(id="Hz", label="Hz", offset=24, len=2, type="float32",
                 description="Frequency",
                 notes="Frequency")
            
   var Hz: Float? = null

   @SunSpecPoint(id="W", label="Watts", offset=26, len=2, type="float32",
                 description="Total Real Power",
                 notes="Total Real Power")
            
   var W: Float? = null

   @SunSpecPoint(id="WphA", label="Watts phase A", offset=28, len=2, type="float32",
                 description="",
                 notes="")
            
   var WphA: Float? = null

   @SunSpecPoint(id="WphB", label="Watts phase B", offset=30, len=2, type="float32",
                 description="",
                 notes="")
            
   var WphB: Float? = null

   @SunSpecPoint(id="WphC", label="Watts phase C", offset=32, len=2, type="float32",
                 description="",
                 notes="")
            
   var WphC: Float? = null

   @SunSpecPoint(id="VA", label="VA", offset=34, len=2, type="float32",
                 description="AC Apparent Power",
                 notes="AC Apparent Power")
            
   var VA: Float? = null

   @SunSpecPoint(id="VAphA", label="VA phase A", offset=36, len=2, type="float32",
                 description="",
                 notes="")
            
   var VAphA: Float? = null

   @SunSpecPoint(id="VAphB", label="VA phase B", offset=38, len=2, type="float32",
                 description="",
                 notes="")
            
   var VAphB: Float? = null

   @SunSpecPoint(id="VAphC", label="VA phase C", offset=40, len=2, type="float32",
                 description="",
                 notes="")
            
   var VAphC: Float? = null

   @SunSpecPoint(id="VAR", label="VAR", offset=42, len=2, type="float32",
                 description="Reactive Power",
                 notes="Reactive Power")
            
   var VAR: Float? = null

   @SunSpecPoint(id="VARphA", label="VAR phase A", offset=44, len=2, type="float32",
                 description="",
                 notes="")
            
   var VARphA: Float? = null

   @SunSpecPoint(id="VARphB", label="VAR phase B", offset=46, len=2, type="float32",
                 description="",
                 notes="")
            
   var VARphB: Float? = null

   @SunSpecPoint(id="VARphC", label="VAR phase C", offset=48, len=2, type="float32",
                 description="",
                 notes="")
            
   var VARphC: Float? = null

   @SunSpecPoint(id="PF", label="PF", offset=50, len=2, type="float32",
                 description="Power Factor",
                 notes="Power Factor")
            
   var PF: Float? = null

   @SunSpecPoint(id="PFphA", label="PF phase A", offset=52, len=2, type="float32",
                 description="",
                 notes="")
            
   var PFphA: Float? = null

   @SunSpecPoint(id="PFphB", label="PF phase B", offset=54, len=2, type="float32",
                 description="",
                 notes="")
            
   var PFphB: Float? = null

   @SunSpecPoint(id="PFphC", label="PF phase C", offset=56, len=2, type="float32",
                 description="",
                 notes="")
            
   var PFphC: Float? = null

   @SunSpecPoint(id="TotWhExp", label="Total Watt-hours Exported", offset=58, len=2, type="float32",
                 description="Total Real Energy Exported",
                 notes="Total Real Energy Exported")
            
   var TotWhExp: Float? = null

   @SunSpecPoint(id="TotWhExpPhA", label="Total Watt-hours Exported phase A", offset=60, len=2, type="float32",
                 description="",
                 notes="")
            
   var TotWhExpPhA: Float? = null

   @SunSpecPoint(id="TotWhExpPhB", label="Total Watt-hours Exported phase B", offset=62, len=2, type="float32",
                 description="",
                 notes="")
            
   var TotWhExpPhB: Float? = null

   @SunSpecPoint(id="TotWhExpPhC", label="Total Watt-hours Exported phase C", offset=64, len=2, type="float32",
                 description="",
                 notes="")
            
   var TotWhExpPhC: Float? = null

   @SunSpecPoint(id="TotWhImp", label="Total Watt-hours Imported", offset=66, len=2, type="float32",
                 description="Total Real Energy Imported",
                 notes="Total Real Energy Imported")
            
   var TotWhImp: Float? = null

   @SunSpecPoint(id="TotWhImpPhA", label="Total Watt-hours Imported phase A", offset=68, len=2, type="float32",
                 description="",
                 notes="")
            
   var TotWhImpPhA: Float? = null

   @SunSpecPoint(id="TotWhImpPhB", label="Total Watt-hours Imported phase B", offset=70, len=2, type="float32",
                 description="",
                 notes="")
            
   var TotWhImpPhB: Float? = null

   @SunSpecPoint(id="TotWhImpPhC", label="Total Watt-hours Imported phase C", offset=72, len=2, type="float32",
                 description="",
                 notes="")
            
   var TotWhImpPhC: Float? = null

   @SunSpecPoint(id="TotVAhExp", label="Total VA-hours Exported", offset=74, len=2, type="float32",
                 description="Total Apparent Energy Exported",
                 notes="Total Apparent Energy Exported")
            
   var TotVAhExp: Float? = null

   @SunSpecPoint(id="TotVAhExpPhA", label="Total VA-hours Exported phase A", offset=76, len=2, type="float32",
                 description="",
                 notes="")
            
   var TotVAhExpPhA: Float? = null

   @SunSpecPoint(id="TotVAhExpPhB", label="Total VA-hours Exported phase B", offset=78, len=2, type="float32",
                 description="",
                 notes="")
            
   var TotVAhExpPhB: Float? = null

   @SunSpecPoint(id="TotVAhExpPhC", label="Total VA-hours Exported phase C", offset=80, len=2, type="float32",
                 description="",
                 notes="")
            
   var TotVAhExpPhC: Float? = null

   @SunSpecPoint(id="TotVAhImp", label="Total VA-hours Imported", offset=82, len=2, type="float32",
                 description="Total Apparent Energy Imported",
                 notes="Total Apparent Energy Imported")
            
   var TotVAhImp: Float? = null

   @SunSpecPoint(id="TotVAhImpPhA", label="Total VA-hours Imported phase A", offset=84, len=2, type="float32",
                 description="",
                 notes="")
            
   var TotVAhImpPhA: Float? = null

   @SunSpecPoint(id="TotVAhImpPhB", label="Total VA-hours Imported phase B", offset=86, len=2, type="float32",
                 description="",
                 notes="")
            
   var TotVAhImpPhB: Float? = null

   @SunSpecPoint(id="TotVAhImpPhC", label="Total VA-hours Imported phase C", offset=88, len=2, type="float32",
                 description="",
                 notes="")
            
   var TotVAhImpPhC: Float? = null

   @SunSpecPoint(id="TotVArhImpQ1", label="Total VAR-hours Imported Q1", offset=90, len=2, type="float32",
                 description="Total Reactive Energy Imported Quadrant 1",
                 notes="Total Reactive Energy Imported Quadrant 1")
            
   var TotVArhImpQ1: Float? = null

   @SunSpecPoint(id="TotVArhImpQ1phA", label="Total VAr-hours Imported Q1 phase A", offset=92, len=2, type="float32",
                 description="",
                 notes="")
            
   var TotVArhImpQ1phA: Float? = null

   @SunSpecPoint(id="TotVArhImpQ1phB", label="Total VAr-hours Imported Q1 phase B", offset=94, len=2, type="float32",
                 description="",
                 notes="")
            
   var TotVArhImpQ1phB: Float? = null

   @SunSpecPoint(id="TotVArhImpQ1phC", label="Total VAr-hours Imported Q1 phase C", offset=96, len=2, type="float32",
                 description="",
                 notes="")
            
   var TotVArhImpQ1phC: Float? = null

   @SunSpecPoint(id="TotVArhImpQ2", label="Total VAr-hours Imported Q2", offset=98, len=2, type="float32",
                 description="Total Reactive Power Imported Quadrant 2",
                 notes="Total Reactive Power Imported Quadrant 2")
            
   var TotVArhImpQ2: Float? = null

   @SunSpecPoint(id="TotVArhImpQ2phA", label="Total VAr-hours Imported Q2 phase A", offset=100, len=2, type="float32",
                 description="",
                 notes="")
            
   var TotVArhImpQ2phA: Float? = null

   @SunSpecPoint(id="TotVArhImpQ2phB", label="Total VAr-hours Imported Q2 phase B", offset=102, len=2, type="float32",
                 description="",
                 notes="")
            
   var TotVArhImpQ2phB: Float? = null

   @SunSpecPoint(id="TotVArhImpQ2phC", label="Total VAr-hours Imported Q2 phase C", offset=104, len=2, type="float32",
                 description="",
                 notes="")
            
   var TotVArhImpQ2phC: Float? = null

   @SunSpecPoint(id="TotVArhExpQ3", label="Total VAr-hours Exported Q3", offset=106, len=2, type="float32",
                 description="Total Reactive Power Exported Quadrant 3",
                 notes="Total Reactive Power Exported Quadrant 3")
            
   var TotVArhExpQ3: Float? = null

   @SunSpecPoint(id="TotVArhExpQ3phA", label="Total VAr-hours Exported Q3 phase A", offset=108, len=2, type="float32",
                 description="",
                 notes="")
            
   var TotVArhExpQ3phA: Float? = null

   @SunSpecPoint(id="TotVArhExpQ3phB", label="Total VAr-hours Exported Q3 phase B", offset=110, len=2, type="float32",
                 description="",
                 notes="")
            
   var TotVArhExpQ3phB: Float? = null

   @SunSpecPoint(id="TotVArhExpQ3phC", label="Total VAr-hours Exported Q3 phase C", offset=112, len=2, type="float32",
                 description="",
                 notes="")
            
   var TotVArhExpQ3phC: Float? = null

   @SunSpecPoint(id="TotVArhExpQ4", label="Total VAr-hours Exported Q4", offset=114, len=2, type="float32",
                 description="Total Reactive Power Exported Quadrant 4",
                 notes="Total Reactive Power Exported Quadrant 4")
            
   var TotVArhExpQ4: Float? = null

   @SunSpecPoint(id="TotVArhExpQ4phA", label="Total VAr-hours Exported Q4 Imported phase A", offset=116, len=2, type="float32",
                 description="",
                 notes="")
            
   var TotVArhExpQ4phA: Float? = null

   @SunSpecPoint(id="TotVArhExpQ4phB", label="Total VAr-hours Exported Q4 Imported phase B", offset=118, len=2, type="float32",
                 description="",
                 notes="")
            
   var TotVArhExpQ4phB: Float? = null

   @SunSpecPoint(id="TotVArhExpQ4phC", label="Total VAr-hours Exported Q4 Imported phase C", offset=120, len=2, type="float32",
                 description="",
                 notes="")
            
   var TotVArhExpQ4phC: Float? = null

   @SunSpecPoint(id="Evt", label="Events", offset=122, len=2, type="bitfield32",
                 description="Meter Event Flags",
                 notes="Meter Event Flags")
            
   var Evt: UInt? = null

}
