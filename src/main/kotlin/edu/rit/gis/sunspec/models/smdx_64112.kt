/*
 * OutBack FM Charge Controller
 *
 * 
 *
 * 
 */
package edu.rit.gis.sunspec.models

import edu.rit.gis.sunspec.annotations.*

@SunSpecModel(id=64112, len=64, name="model_64112")
class Model_64112 {
   @SunSpecPoint(id="Port", label="Port Number", offset=0, len=1, type="uint16",
                 description="",
                 notes="")
            
   var Port: Int? = null

   @SunSpecPoint(id="V_SF", label="", offset=1, len=1, type="sunssf",
                 description="",
                 notes="")
            
   var V_SF: Any? = null

   @SunSpecPoint(id="C_SF", label="", offset=2, len=1, type="sunssf",
                 description="",
                 notes="")
            
   var C_SF: Any? = null

   @SunSpecPoint(id="H_SF", label="", offset=3, len=1, type="sunssf",
                 description="",
                 notes="")
            
   var H_SF: Any? = null

   @SunSpecPoint(id="P_SF", label="", offset=4, len=1, type="sunssf",
                 description="",
                 notes="")
            
   var P_SF: Any? = null

   @SunSpecPoint(id="AH_SF", label="", offset=5, len=1, type="sunssf",
                 description="",
                 notes="")
            
   var AH_SF: Any? = null

   @SunSpecPoint(id="KWH_SF", label="", offset=6, len=1, type="sunssf",
                 description="",
                 notes="")
            
   var KWH_SF: Any? = null

   @SunSpecPoint(id="CC_Config_fault", label="Faults", offset=7, len=1, type="bitfield16",
                 description="",
                 notes="")
            
   var CC_Config_fault: Short? = null

   @SunSpecPoint(id="CC_Config_absorb_V", label="Absorb", offset=8, len=1, type="uint16",
                 description="",
                 notes="")
            
   var CC_Config_absorb_V: Int? = null

   @SunSpecPoint(id="CC_Config_absorb_Hr", label="Absorb Time", offset=9, len=1, type="uint16",
                 description="",
                 notes="")
            
   var CC_Config_absorb_Hr: Int? = null

   @SunSpecPoint(id="CC_Config_absorb_End_A", label="Absorb End", offset=10, len=1, type="uint16",
                 description="",
                 notes="")
            
   var CC_Config_absorb_End_A: Int? = null

   @SunSpecPoint(id="CC_Config_rebulk_V", label="Rebulk", offset=11, len=1, type="uint16",
                 description="",
                 notes="")
            
   var CC_Config_rebulk_V: Int? = null

   @SunSpecPoint(id="CC_Config_float_V", label="Float", offset=12, len=1, type="uint16",
                 description="",
                 notes="")
            
   var CC_Config_float_V: Int? = null

   @SunSpecPoint(id="CC_Config_max_Chg_A", label="Maximum Charge", offset=13, len=1, type="uint16",
                 description="",
                 notes="")
            
   var CC_Config_max_Chg_A: Int? = null

   @SunSpecPoint(id="CC_Config_equalize_V", label="Equalize", offset=14, len=1, type="uint16",
                 description="",
                 notes="")
            
   var CC_Config_equalize_V: Int? = null

   @SunSpecPoint(id="CC_Config_equalize_Hr", label="Equalize Time", offset=15, len=1, type="uint16",
                 description="",
                 notes="")
            
   var CC_Config_equalize_Hr: Int? = null

   @SunSpecPoint(id="CC_Config_auto_equalize", label="Auto Equalize Interval", offset=16, len=1, type="uint16",
                 description="",
                 notes="")
            
   var CC_Config_auto_equalize: Int? = null

   @SunSpecPoint(id="CC_Config_MPPT_mode", label="MPPT mode", offset=17, len=0, type="enum16",
                 description="",
                 notes="")
            
   var CC_Config_MPPT_mode: Any? = null

   @SunSpecPoint(id="CC_Config_sweep_width", label="Sweep Width", offset=18, len=0, type="enum16",
                 description="",
                 notes="")
            
   var CC_Config_sweep_width: Any? = null

   @SunSpecPoint(id="CC_Config_sweep_max", label="Sweep Maximum", offset=19, len=0, type="enum16",
                 description="",
                 notes="")
            
   var CC_Config_sweep_max: Any? = null

   @SunSpecPoint(id="CC_Config_U_Pick_Duty_cyc", label="U-Pick PWM Duty Cycle", offset=20, len=1, type="uint16",
                 description="",
                 notes="")
            
   var CC_Config_U_Pick_Duty_cyc: Int? = null

   @SunSpecPoint(id="CC_Config_grid_tie", label="Grid Tie Mode", offset=21, len=0, type="enum16",
                 description="",
                 notes="")
            
   var CC_Config_grid_tie: Any? = null

   @SunSpecPoint(id="CC_Config_temp_comp", label="Temp Comp Mode", offset=22, len=0, type="enum16",
                 description="",
                 notes="")
            
   var CC_Config_temp_comp: Any? = null

   @SunSpecPoint(id="CC_Config_temp_comp_llimt", label="Temp Comp Lower Limit", offset=23, len=1, type="uint16",
                 description="",
                 notes="")
            
   var CC_Config_temp_comp_llimt: Int? = null

   @SunSpecPoint(id="CC_Config_temp_comp_hlimt", label="Temp Comp Upper Limit", offset=24, len=1, type="uint16",
                 description="",
                 notes="")
            
   var CC_Config_temp_comp_hlimt: Int? = null

   @SunSpecPoint(id="CC_Config_auto_restart", label="Auto Restart Mode", offset=25, len=0, type="enum16",
                 description="",
                 notes="")
            
   var CC_Config_auto_restart: Any? = null

   @SunSpecPoint(id="CC_Config_wakeup_VOC", label="Wakeup VOC Change", offset=26, len=1, type="uint16",
                 description="",
                 notes="")
            
   var CC_Config_wakeup_VOC: Int? = null

   @SunSpecPoint(id="CC_Config_snooze_mode_A", label="Snooze Mode", offset=27, len=1, type="uint16",
                 description="",
                 notes="")
            
   var CC_Config_snooze_mode_A: Int? = null

   @SunSpecPoint(id="CC_Config_wakeup_interval", label="Wakeup Interval", offset=28, len=1, type="uint16",
                 description="",
                 notes="")
            
   var CC_Config_wakeup_interval: Int? = null

   @SunSpecPoint(id="CC_Config_AUX_mode", label="AUX Output Mode", offset=29, len=0, type="enum16",
                 description="",
                 notes="")
            
   var CC_Config_AUX_mode: Any? = null

   @SunSpecPoint(id="CC_Config_AUX_control", label="AUX Output Control", offset=30, len=0, type="enum16",
                 description="",
                 notes="")
            
   var CC_Config_AUX_control: Any? = null

   @SunSpecPoint(id="CC_Config_AUX_state", label="AUX Output State", offset=31, len=0, type="enum16",
                 description="",
                 notes="")
            
   var CC_Config_AUX_state: Any? = null

   @SunSpecPoint(id="CC_Config_AUX_polarity", label="AUX Output Polarity", offset=32, len=0, type="enum16",
                 description="",
                 notes="")
            
   var CC_Config_AUX_polarity: Any? = null

   @SunSpecPoint(id="CC_Config_AUX_L_Batt_disc", label="AUX Low Battery Disconnect", offset=33, len=1, type="uint16",
                 description="",
                 notes="")
            
   var CC_Config_AUX_L_Batt_disc: Int? = null

   @SunSpecPoint(id="CC_Config_AUX_L_Batt_rcon", label="AUX Low Battery Reconnect", offset=34, len=1, type="uint16",
                 description="",
                 notes="")
            
   var CC_Config_AUX_L_Batt_rcon: Int? = null

   @SunSpecPoint(id="CC_Config_AUX_L_Batt_dly", label="AUX Low Battery Disconnect Delay", offset=35, len=1, type="uint16",
                 description="",
                 notes="")
            
   var CC_Config_AUX_L_Batt_dly: Int? = null

   @SunSpecPoint(id="CC_Config_AUX_Vent_fan_V", label="AUX Vent Fan", offset=36, len=1, type="uint16",
                 description="",
                 notes="")
            
   var CC_Config_AUX_Vent_fan_V: Int? = null

   @SunSpecPoint(id="CC_Config_AUX_PV_triggerV", label="AUX PV Trigger", offset=37, len=1, type="uint16",
                 description="",
                 notes="")
            
   var CC_Config_AUX_PV_triggerV: Int? = null

   @SunSpecPoint(id="CC_Config_AUX_PV_trg_h_tm", label="AUX PV Trigger Hold Time", offset=38, len=1, type="uint16",
                 description="",
                 notes="")
            
   var CC_Config_AUX_PV_trg_h_tm: Int? = null

   @SunSpecPoint(id="CC_Config_AUX_Nlite_ThrsV", label="AUX Night Light Threshold", offset=39, len=1, type="uint16",
                 description="",
                 notes="")
            
   var CC_Config_AUX_Nlite_ThrsV: Int? = null

   @SunSpecPoint(id="CC_Config_AUX_Nlite_On_tm", label="AUX Night Light On Time", offset=40, len=1, type="uint16",
                 description="",
                 notes="")
            
   var CC_Config_AUX_Nlite_On_tm: Int? = null

   @SunSpecPoint(id="CC_Config_AUX_Nlite_On_hist", label="AUX Night Light On Hysteresis", offset=41, len=1, type="uint16",
                 description="",
                 notes="")
            
   var CC_Config_AUX_Nlite_On_hist: Int? = null

   @SunSpecPoint(id="CC_Config_AUX_Nlite_Off_hist", label="AUX Night Light Off Hysteresis", offset=42, len=1, type="uint16",
                 description="",
                 notes="")
            
   var CC_Config_AUX_Nlite_Off_hist: Int? = null

   @SunSpecPoint(id="CC_Config_AUX_Error_batt_V", label="AUX Error Output Low Battery", offset=43, len=1, type="uint16",
                 description="",
                 notes="")
            
   var CC_Config_AUX_Error_batt_V: Int? = null

   @SunSpecPoint(id="CC_Config_AUX_Divert_h_time", label="AUX Divert Hold Time", offset=44, len=1, type="uint16",
                 description="",
                 notes="")
            
   var CC_Config_AUX_Divert_h_time: Int? = null

   @SunSpecPoint(id="CC_Config_AUX_Divert_dly_time", label="AUX Divert Delay Time", offset=45, len=1, type="uint16",
                 description="",
                 notes="")
            
   var CC_Config_AUX_Divert_dly_time: Int? = null

   @SunSpecPoint(id="CC_Config_AUX_Divert_Rel_V", label="AUX Divert Relative", offset=46, len=1, type="uint16",
                 description="",
                 notes="")
            
   var CC_Config_AUX_Divert_Rel_V: Int? = null

   @SunSpecPoint(id="CC_Config_AUX_Divert_Hyst_V", label="AUX Divert Hysteresis", offset=47, len=1, type="uint16",
                 description="",
                 notes="")
            
   var CC_Config_AUX_Divert_Hyst_V: Int? = null

   @SunSpecPoint(id="CC_Config_MajorFWRev", label="FM CC Major Firmware Number", offset=48, len=1, type="uint16",
                 description="",
                 notes="")
            
   var CC_Config_MajorFWRev: Int? = null

   @SunSpecPoint(id="CC_Config_MidFWRev", label="FM CC Mid Firmware Number", offset=49, len=1, type="uint16",
                 description="",
                 notes="")
            
   var CC_Config_MidFWRev: Int? = null

   @SunSpecPoint(id="CC_Config_MinorFWRev", label="FM CC Minor Firmware Number", offset=50, len=1, type="uint16",
                 description="",
                 notes="")
            
   var CC_Config_MinorFWRev: Int? = null

   @SunSpecPoint(id="CC_Config_DataLog_Day_offset", label="Set Data Log Day Offset", offset=51, len=1, type="uint16",
                 description="",
                 notes="")
            
   var CC_Config_DataLog_Day_offset: Int? = null

   @SunSpecPoint(id="CC_Config_DataLog_Cur_Day_off", label="Current Data Log Day Offset", offset=52, len=1, type="uint16",
                 description="",
                 notes="")
            
   var CC_Config_DataLog_Cur_Day_off: Int? = null

   @SunSpecPoint(id="CC_Config_DataLog_Daily_AH", label="Data Log Daily (Ah)", offset=53, len=1, type="uint16",
                 description="",
                 notes="")
            
   var CC_Config_DataLog_Daily_AH: Int? = null

   @SunSpecPoint(id="CC_Config_DataLog_Daily_KWH", label="Data Log Daily (kWh)", offset=54, len=1, type="uint16",
                 description="",
                 notes="")
            
   var CC_Config_DataLog_Daily_KWH: Int? = null

   @SunSpecPoint(id="CC_Config_DataLog_Max_Out_A", label="Data Log Daily Maximum Output (A)", offset=55, len=1, type="uint16",
                 description="",
                 notes="")
            
   var CC_Config_DataLog_Max_Out_A: Int? = null

   @SunSpecPoint(id="CC_Config_DataLog_Max_Out_W", label="Data Log Daily Maximum Output (W)", offset=56, len=1, type="uint16",
                 description="",
                 notes="")
            
   var CC_Config_DataLog_Max_Out_W: Int? = null

   @SunSpecPoint(id="CC_Config_DataLog_Absorb_T", label="Data Log Daily Absorb Time", offset=57, len=1, type="uint16",
                 description="",
                 notes="")
            
   var CC_Config_DataLog_Absorb_T: Int? = null

   @SunSpecPoint(id="CC_Config_DataLog_Float_T", label="Data Log Daily Float Time", offset=58, len=1, type="uint16",
                 description="",
                 notes="")
            
   var CC_Config_DataLog_Float_T: Int? = null

   @SunSpecPoint(id="CC_Config_DataLog_Min_Batt_V", label="Data Log Daily Minimum Battery", offset=59, len=1, type="uint16",
                 description="",
                 notes="")
            
   var CC_Config_DataLog_Min_Batt_V: Int? = null

   @SunSpecPoint(id="CC_Config_DataLog_Max_Batt_V", label="Data Log Daily Maximum Battery", offset=60, len=1, type="uint16",
                 description="",
                 notes="")
            
   var CC_Config_DataLog_Max_Batt_V: Int? = null

   @SunSpecPoint(id="CC_Config_DataLog_Max_Input_V", label="Data Log Daily Maximum Input", offset=61, len=1, type="uint16",
                 description="",
                 notes="")
            
   var CC_Config_DataLog_Max_Input_V: Int? = null

   @SunSpecPoint(id="CC_Config_DataLog_Clear", label="Data Log Clear", offset=62, len=1, type="uint16",
                 description="",
                 notes="")
            
   var CC_Config_DataLog_Clear: Int? = null

   @SunSpecPoint(id="CC_Config_DataLog_Clr_Comp", label="Data Log Clear Complement", offset=63, len=1, type="uint16",
                 description="",
                 notes="")
            
   var CC_Config_DataLog_Clr_Comp: Int? = null

}
