/*
 * Storage
 *
 * Basic Storage Controls 
 *
 * Ref 3: 8.7.4.2
 */
package edu.rit.gis.sunspec.models

import edu.rit.gis.sunspec.annotations.*

@SunSpecModel(id=124, len=24, name="storage")
class Model_124 {
   @SunSpecPoint(id="WChaMax", label="WChaMax", offset=0, len=1, type="uint16",
                 description="Setpoint for maximum charge.",
                 notes="Setpoint for maximum charge.")
            
   var WChaMax: UShort? = null

   @SunSpecPoint(id="WChaGra", label="WChaGra", offset=1, len=1, type="uint16",
                 description="Setpoint for maximum charging rate. Default is MaxChaRte.",
                 notes="Setpoint for maximum charging rate. Default is MaxChaRte.")
            
   var WChaGra: UShort? = null

   @SunSpecPoint(id="WDisChaGra", label="WDisChaGra", offset=2, len=1, type="uint16",
                 description="Setpoint for maximum discharge rate. Default is MaxDisChaRte.",
                 notes="Setpoint for maximum discharge rate. Default is MaxDisChaRte.")
            
   var WDisChaGra: UShort? = null

   @SunSpecPoint(id="StorCtl_Mod", label="StorCtl_Mod", offset=3, len=1, type="bitfield16",
                 description="Activate hold/discharge/charge storage control mode. Bitfield value.",
                 notes="Activate hold/discharge/charge storage control mode. Bitfield value.")
            
   var StorCtl_Mod: UShort? = null

   @SunSpecPoint(id="VAChaMax", label="VAChaMax", offset=4, len=1, type="uint16",
                 description="Setpoint for maximum charging VA.",
                 notes="Setpoint for maximum charging VA.")
            
   var VAChaMax: UShort? = null

   @SunSpecPoint(id="MinRsvPct", label="MinRsvPct", offset=5, len=1, type="uint16",
                 description="Setpoint for minimum reserve for storage as a percentage of the nominal maximum storage.",
                 notes="Setpoint for minimum reserve for storage as a percentage of the nominal maximum storage.")
            
   var MinRsvPct: UShort? = null

   @SunSpecPoint(id="ChaState", label="ChaState", offset=6, len=1, type="uint16",
                 description="Currently available energy as a percent of the capacity rating.",
                 notes="Currently available energy as a percent of the capacity rating.")
            
   var ChaState: UShort? = null

   @SunSpecPoint(id="StorAval", label="StorAval", offset=7, len=1, type="uint16",
                 description="State of charge (ChaState) minus storage reserve (MinRsvPct) times capacity rating (AhrRtg).",
                 notes="State of charge (ChaState) minus storage reserve (MinRsvPct) times capacity rating (AhrRtg).")
            
   var StorAval: UShort? = null

   @SunSpecPoint(id="InBatV", label="InBatV", offset=8, len=1, type="uint16",
                 description="Internal battery voltage.",
                 notes="Internal battery voltage.")
            
   var InBatV: UShort? = null

   @SunSpecPoint(id="ChaSt", label="ChaSt", offset=9, len=1, type="enum16",
                 description="Charge status of storage device. Enumerated value.",
                 notes="Charge status of storage device. Enumerated value.")
            
   var ChaSt: Any? = null

   @SunSpecPoint(id="OutWRte", label="OutWRte", offset=10, len=1, type="int16",
                 description="Percent of max discharge rate.",
                 notes="Percent of max discharge rate.")
            
   var OutWRte: Short? = null

   @SunSpecPoint(id="InWRte", label="InWRte", offset=11, len=1, type="int16",
                 description="Percent of max charging rate.",
                 notes="Percent of max charging rate.")
            
   var InWRte: Short? = null

   @SunSpecPoint(id="InOutWRte_WinTms", label="InOutWRte_WinTms", offset=12, len=1, type="uint16",
                 description="Time window for charge/discharge rate change.",
                 notes="Time window for charge/discharge rate change.")
            
   var InOutWRte_WinTms: UShort? = null

   @SunSpecPoint(id="InOutWRte_RvrtTms", label="InOutWRte_RvrtTms", offset=13, len=1, type="uint16",
                 description="Timeout period for charge/discharge rate.",
                 notes="Timeout period for charge/discharge rate.")
            
   var InOutWRte_RvrtTms: UShort? = null

   @SunSpecPoint(id="InOutWRte_RmpTms", label="InOutWRte_RmpTms", offset=14, len=1, type="uint16",
                 description="Ramp time for moving from current setpoint to new setpoint.",
                 notes="Ramp time for moving from current setpoint to new setpoint.")
            
   var InOutWRte_RmpTms: UShort? = null

   @SunSpecPoint(id="ChaGriSet", label="", offset=15, len=1, type="enum16",
                 description="",
                 notes="")
            
   var ChaGriSet: Any? = null

   @SunSpecPoint(id="WChaMax_SF", label="WChaMax_SF", offset=16, len=1, type="sunssf",
                 description="Scale factor for maximum charge.",
                 notes="Scale factor for maximum charge.")
            
   var WChaMax_SF: Any? = null

   @SunSpecPoint(id="WChaDisChaGra_SF", label="WChaDisChaGra_SF", offset=17, len=1, type="sunssf",
                 description="Scale factor for maximum charge and discharge rate.",
                 notes="Scale factor for maximum charge and discharge rate.")
            
   var WChaDisChaGra_SF: Any? = null

   @SunSpecPoint(id="VAChaMax_SF", label="VAChaMax_SF", offset=18, len=1, type="sunssf",
                 description="Scale factor for maximum charging VA.",
                 notes="Scale factor for maximum charging VA.")
            
   var VAChaMax_SF: Any? = null

   @SunSpecPoint(id="MinRsvPct_SF", label="MinRsvPct_SF", offset=19, len=1, type="sunssf",
                 description="Scale factor for minimum reserve percentage.",
                 notes="Scale factor for minimum reserve percentage.")
            
   var MinRsvPct_SF: Any? = null

   @SunSpecPoint(id="ChaState_SF", label="ChaState_SF", offset=20, len=1, type="sunssf",
                 description="Scale factor for available energy percent.",
                 notes="Scale factor for available energy percent.")
            
   var ChaState_SF: Any? = null

   @SunSpecPoint(id="StorAval_SF", label="StorAval_SF", offset=21, len=1, type="sunssf",
                 description="Scale factor for state of charge.",
                 notes="Scale factor for state of charge.")
            
   var StorAval_SF: Any? = null

   @SunSpecPoint(id="InBatV_SF", label="InBatV_SF", offset=22, len=1, type="sunssf",
                 description="Scale factor for battery voltage.",
                 notes="Scale factor for battery voltage.")
            
   var InBatV_SF: Any? = null

   @SunSpecPoint(id="InOutWRte_SF", label="InOutWRte_SF", offset=23, len=1, type="sunssf",
                 description="Scale factor for percent charge/discharge rate.",
                 notes="Scale factor for percent charge/discharge rate.")
            
   var InOutWRte_SF: Any? = null

}
