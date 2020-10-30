/*
 * Mersen GreenString
 *
 * 
 *
 * 
 */
package edu.rit.gis.sunspec.models

import edu.rit.gis.sunspec.annotations.*

@SunSpecModel(id=64020, len=46, name="model_64020")
class Model_64020 {
   @SunSpecPoint(id="Aux0Tmp", label="Aux 0 temperature", offset=0, len=1, type="int16",
                 description="",
                 notes="")
            
   var Aux0Tmp: Short? = null

   @SunSpecPoint(id="Aux1Tmp", label="Aux 1 temperature", offset=1, len=1, type="int16",
                 description="",
                 notes="")
            
   var Aux1Tmp: Short? = null

   @SunSpecPoint(id="Aux2Tmp", label="Aux 2 temperature", offset=2, len=1, type="int16",
                 description="",
                 notes="")
            
   var Aux2Tmp: Short? = null

   @SunSpecPoint(id="Aux3Tmp", label="Aux 3 temperature", offset=3, len=1, type="int16",
                 description="",
                 notes="")
            
   var Aux3Tmp: Short? = null

   @SunSpecPoint(id="Aux4Tmp", label="Aux 4 temperature", offset=4, len=1, type="int16",
                 description="",
                 notes="")
            
   var Aux4Tmp: Short? = null

   @SunSpecPoint(id="ProbeTmp", label="Probe Temperature", offset=6, len=1, type="int16",
                 description="",
                 notes="")
            
   var ProbeTmp: Short? = null

   @SunSpecPoint(id="MainTmp", label="Main Temperature", offset=5, len=1, type="int16",
                 description="",
                 notes="")
            
   var MainTmp: Short? = null

   @SunSpecPoint(id="SensorV_SF", label="Voltage scale factor for the sensors", offset=7, len=1, type="sunssf",
                 description="",
                 notes="")
            
   var SensorV_SF: Any? = null

   @SunSpecPoint(id="SensorA_SF", label="Current scale factor for the sensors", offset=8, len=1, type="sunssf",
                 description="",
                 notes="")
            
   var SensorA_SF: Any? = null

   @SunSpecPoint(id="SensorHz_SF", label="Frequency scale factor for the sensors", offset=9, len=1, type="sunssf",
                 description="",
                 notes="")
            
   var SensorHz_SF: Any? = null

   @SunSpecPoint(id="Sensor1Voltage", label="Sensor1 Voltage", offset=10, len=1, type="int16",
                 description="scale of 0-10V",
                 notes="scale of 0-10V")
            
   var Sensor1Voltage: Short? = null

   @SunSpecPoint(id="Sensor2Voltage", label="Sensor2 Voltage", offset=11, len=1, type="int16",
                 description="scale of 0-10V",
                 notes="scale of 0-10V")
            
   var Sensor2Voltage: Short? = null

   @SunSpecPoint(id="Sensor3Voltage", label="Sensor3 Voltage", offset=12, len=1, type="int16",
                 description="scale of 0-10V",
                 notes="scale of 0-10V")
            
   var Sensor3Voltage: Short? = null

   @SunSpecPoint(id="Sensor4Voltage", label="Sensor4 Voltage", offset=13, len=1, type="int16",
                 description="scale of 0-10V",
                 notes="scale of 0-10V")
            
   var Sensor4Voltage: Short? = null

   @SunSpecPoint(id="Sensor5Voltage", label="Sensor5 Voltage", offset=14, len=1, type="int16",
                 description="scale of 0-10V",
                 notes="scale of 0-10V")
            
   var Sensor5Voltage: Short? = null

   @SunSpecPoint(id="Sensor6Voltage", label="Sensor6 Voltage", offset=15, len=1, type="int16",
                 description="scale of 0-10V",
                 notes="scale of 0-10V")
            
   var Sensor6Voltage: Short? = null

   @SunSpecPoint(id="Sensor7Voltage", label="Sensor7 Voltage", offset=16, len=1, type="int16",
                 description="scale of 0-10V",
                 notes="scale of 0-10V")
            
   var Sensor7Voltage: Short? = null

   @SunSpecPoint(id="Sensor1Current", label="Sensor1 Current", offset=17, len=1, type="int16",
                 description="scale of 4-20mA",
                 notes="scale of 4-20mA")
            
   var Sensor1Current: Short? = null

   @SunSpecPoint(id="Sensor2Current", label="Sensor2 Current", offset=18, len=1, type="int16",
                 description="in 4-20mA or 4-20mA",
                 notes="in 4-20mA or 4-20mA")
            
   var Sensor2Current: Short? = null

   @SunSpecPoint(id="Sensor3Current", label="Sensor3 Current", offset=19, len=1, type="int16",
                 description="in 4-20mA or 4-20mA",
                 notes="in 4-20mA or 4-20mA")
            
   var Sensor3Current: Short? = null

   @SunSpecPoint(id="Sensor4Current", label="Sensor4 Current", offset=20, len=1, type="int16",
                 description="in 4-20mA or 4-20mA",
                 notes="in 4-20mA or 4-20mA")
            
   var Sensor4Current: Short? = null

   @SunSpecPoint(id="Sensor5Current", label="Sensor5 Current", offset=21, len=1, type="int16",
                 description="in 4-20mA or 4-20mA",
                 notes="in 4-20mA or 4-20mA")
            
   var Sensor5Current: Short? = null

   @SunSpecPoint(id="Sensor6Current", label="Sensor6 Current", offset=22, len=1, type="int16",
                 description="in 4-20mA or 4-20mA",
                 notes="in 4-20mA or 4-20mA")
            
   var Sensor6Current: Short? = null

   @SunSpecPoint(id="Sensor7Current", label="Sensor7 Current", offset=23, len=1, type="int16",
                 description="in 4-20mA or 4-20mA",
                 notes="in 4-20mA or 4-20mA")
            
   var Sensor7Current: Short? = null

   @SunSpecPoint(id="Sensor8", label="Sensor8 frequency", offset=24, len=1, type="uint16",
                 description="frequency in Hz",
                 notes="frequency in Hz")
            
   var Sensor8: Int? = null

   @SunSpecPoint(id="Relay1", label="Relay 1 state", offset=25, len=1, type="uint16",
                 description="",
                 notes="")
            
   var Relay1: Int? = null

   @SunSpecPoint(id="Relay2", label="Relay 2 state", offset=26, len=1, type="uint16",
                 description="",
                 notes="")
            
   var Relay2: Int? = null

   @SunSpecPoint(id="Relay3", label="Relay 3 state", offset=27, len=1, type="uint16",
                 description="",
                 notes="")
            
   var Relay3: Int? = null

   @SunSpecPoint(id="ResetAccumulators", label="Reset the accumulators", offset=28, len=1, type="uint16",
                 description="always 0 in reading, used the code 0xC0DA during the writing for resetting them",
                 notes="always 0 in reading, used the code 0xC0DA during the writing for resetting them")
            
   var ResetAccumulators: Int? = null

   @SunSpecPoint(id="Reset", label="Reset the system", offset=29, len=1, type="uint16",
                 description="always 0 in reading, used the code 0xC0DA during the writing for resetting the system",
                 notes="always 0 in reading, used the code 0xC0DA during the writing for resetting the system")
            
   var Reset: Int? = null

}
