/*
 * Basic Settings
 *
 * Inverter Controls Basic Settings 
 *
 * Ref 3: 8.4.2.1, Ref 4: 17
 */
package edu.rit.gis.sunspec.models

import edu.rit.gis.sunspec.annotations.*

@SunSpecModel(id=121, len=30, name="settings")
class Model_121 {
   @SunSpecPoint(id="WMax", label="WMax", offset=0, len=1, type="uint16",
                 description="Setting for maximum power output. Default to WRtg.",
                 notes="Setting for maximum power output. Default to WRtg.")
            
   var WMax: Int? = null

   @SunSpecPoint(id="VRef", label="VRef", offset=1, len=1, type="uint16",
                 description="Voltage at the PCC.",
                 notes="Voltage at the PCC.")
            
   var VRef: Int? = null

   @SunSpecPoint(id="VRefOfs", label="VRefOfs", offset=2, len=1, type="int16",
                 description="Offset  from PCC to inverter.",
                 notes="Offset  from PCC to inverter.")
            
   var VRefOfs: Short? = null

   @SunSpecPoint(id="VMax", label="VMax", offset=3, len=1, type="uint16",
                 description="Setpoint for maximum voltage.",
                 notes="Setpoint for maximum voltage.")
            
   var VMax: Int? = null

   @SunSpecPoint(id="VMin", label="VMin", offset=4, len=1, type="uint16",
                 description="Setpoint for minimum voltage.",
                 notes="Setpoint for minimum voltage.")
            
   var VMin: Int? = null

   @SunSpecPoint(id="VAMax", label="VAMax", offset=5, len=1, type="uint16",
                 description="Setpoint for maximum apparent power. Default to VARtg.",
                 notes="Setpoint for maximum apparent power. Default to VARtg.")
            
   var VAMax: Int? = null

   @SunSpecPoint(id="VArMaxQ1", label="VArMaxQ1", offset=6, len=1, type="int16",
                 description="Setting for maximum reactive power in quadrant 1. Default to VArRtgQ1.",
                 notes="Setting for maximum reactive power in quadrant 1. Default to VArRtgQ1.")
            
   var VArMaxQ1: Short? = null

   @SunSpecPoint(id="VArMaxQ2", label="VArMaxQ2", offset=7, len=1, type="int16",
                 description="Setting for maximum reactive power in quadrant 2. Default to VArRtgQ2.",
                 notes="Setting for maximum reactive power in quadrant 2. Default to VArRtgQ2.")
            
   var VArMaxQ2: Short? = null

   @SunSpecPoint(id="VArMaxQ3", label="VArMaxQ3", offset=8, len=1, type="int16",
                 description="Setting for maximum reactive power in quadrant 3. Default to VArRtgQ3.",
                 notes="Setting for maximum reactive power in quadrant 3. Default to VArRtgQ3.")
            
   var VArMaxQ3: Short? = null

   @SunSpecPoint(id="VArMaxQ4", label="VArMaxQ4", offset=9, len=1, type="int16",
                 description="Setting for maximum reactive power in quadrant 4. Default to VArRtgQ4.",
                 notes="Setting for maximum reactive power in quadrant 4. Default to VArRtgQ4.")
            
   var VArMaxQ4: Short? = null

   @SunSpecPoint(id="WGra", label="WGra", offset=10, len=1, type="uint16",
                 description="Default ramp rate of change of active power due to command or internal action.",
                 notes="Default ramp rate of change of active power due to command or internal action.")
            
   var WGra: Int? = null

   @SunSpecPoint(id="PFMinQ1", label="PFMinQ1", offset=11, len=1, type="int16",
                 description="Setpoint for minimum power factor value in quadrant 1. Default to PFRtgQ1.",
                 notes="Setpoint for minimum power factor value in quadrant 1. Default to PFRtgQ1.")
            
   var PFMinQ1: Short? = null

   @SunSpecPoint(id="PFMinQ2", label="PFMinQ2", offset=12, len=1, type="int16",
                 description="Setpoint for minimum power factor value in quadrant 2. Default to PFRtgQ2.",
                 notes="Setpoint for minimum power factor value in quadrant 2. Default to PFRtgQ2.")
            
   var PFMinQ2: Short? = null

   @SunSpecPoint(id="PFMinQ3", label="PFMinQ3", offset=13, len=1, type="int16",
                 description="Setpoint for minimum power factor value in quadrant 3. Default to PFRtgQ3.",
                 notes="Setpoint for minimum power factor value in quadrant 3. Default to PFRtgQ3.")
            
   var PFMinQ3: Short? = null

   @SunSpecPoint(id="PFMinQ4", label="PFMinQ4", offset=14, len=1, type="int16",
                 description="Setpoint for minimum power factor value in quadrant 4. Default to PFRtgQ4.",
                 notes="Setpoint for minimum power factor value in quadrant 4. Default to PFRtgQ4.")
            
   var PFMinQ4: Short? = null

   @SunSpecPoint(id="VArAct", label="VArAct", offset=15, len=1, type="enum16",
                 description="VAR action on change between charging and discharging: 1=switch 2=maintain VAR characterization.",
                 notes="VAR action on change between charging and discharging: 1=switch 2=maintain VAR characterization.")
            
   var VArAct: Any? = null

   @SunSpecPoint(id="ClcTotVA", label="ClcTotVA", offset=16, len=1, type="enum16",
                 description="Calculation method for total apparent power. 1=vector 2=arithmetic.",
                 notes="Calculation method for total apparent power. 1=vector 2=arithmetic.")
            
   var ClcTotVA: Any? = null

   @SunSpecPoint(id="MaxRmpRte", label="MaxRmpRte", offset=17, len=1, type="uint16",
                 description="Setpoint for maximum ramp rate as percentage of nominal maximum ramp rate. This setting will limit the rate that watts delivery to the grid can increase or decrease in response to intermittent PV generation.",
                 notes="Setpoint for maximum ramp rate as percentage of nominal maximum ramp rate. This setting will limit the rate that watts delivery to the grid can increase or decrease in response to intermittent PV generation.")
            
   var MaxRmpRte: Int? = null

   @SunSpecPoint(id="ECPNomHz", label="ECPNomHz", offset=18, len=1, type="uint16",
                 description="Setpoint for nominal frequency at the ECP.",
                 notes="Setpoint for nominal frequency at the ECP.")
            
   var ECPNomHz: Int? = null

   @SunSpecPoint(id="ConnPh", label="ConnPh", offset=19, len=1, type="enum16",
                 description="Identity of connected phase for single phase inverters. A=1 B=2 C=3.",
                 notes="Identity of connected phase for single phase inverters. A=1 B=2 C=3.")
            
   var ConnPh: Any? = null

   @SunSpecPoint(id="WMax_SF", label="WMax_SF", offset=20, len=1, type="sunssf",
                 description="Scale factor for real power.",
                 notes="Scale factor for real power.")
            
   var WMax_SF: Any? = null

   @SunSpecPoint(id="VRef_SF", label="VRef_SF", offset=21, len=1, type="sunssf",
                 description="Scale factor for voltage at the PCC.",
                 notes="Scale factor for voltage at the PCC.")
            
   var VRef_SF: Any? = null

   @SunSpecPoint(id="VRefOfs_SF", label="VRefOfs_SF", offset=22, len=1, type="sunssf",
                 description="Scale factor for offset voltage.",
                 notes="Scale factor for offset voltage.")
            
   var VRefOfs_SF: Any? = null

   @SunSpecPoint(id="VMinMax_SF", label="VMinMax_SF", offset=23, len=1, type="sunssf",
                 description="Scale factor for min/max voltages.",
                 notes="Scale factor for min/max voltages.")
            
   var VMinMax_SF: Any? = null

   @SunSpecPoint(id="VAMax_SF", label="VAMax_SF", offset=24, len=1, type="sunssf",
                 description="Scale factor for apparent power.",
                 notes="Scale factor for apparent power.")
            
   var VAMax_SF: Any? = null

   @SunSpecPoint(id="VArMax_SF", label="VArMax_SF", offset=25, len=1, type="sunssf",
                 description="Scale factor for reactive power.",
                 notes="Scale factor for reactive power.")
            
   var VArMax_SF: Any? = null

   @SunSpecPoint(id="WGra_SF", label="WGra_SF", offset=26, len=1, type="sunssf",
                 description="Scale factor for default ramp rate.",
                 notes="Scale factor for default ramp rate.")
            
   var WGra_SF: Any? = null

   @SunSpecPoint(id="PFMin_SF", label="PFMin_SF", offset=27, len=1, type="sunssf",
                 description="Scale factor for minimum power factor.",
                 notes="Scale factor for minimum power factor.")
            
   var PFMin_SF: Any? = null

   @SunSpecPoint(id="MaxRmpRte_SF", label="MaxRmpRte_SF", offset=28, len=1, type="sunssf",
                 description="Scale factor for maximum ramp percentage.",
                 notes="Scale factor for maximum ramp percentage.")
            
   var MaxRmpRte_SF: Any? = null

   @SunSpecPoint(id="ECPNomHz_SF", label="ECPNomHz_SF", offset=29, len=1, type="sunssf",
                 description="Scale factor for nominal frequency.",
                 notes="Scale factor for nominal frequency.")
            
   var ECPNomHz_SF: Any? = null

}
