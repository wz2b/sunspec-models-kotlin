/*
 * Tracker Controller DRAFT 2
 *
 * Monitors and controls multiple trackers
 *
 * Trackers may include GPS model 305 for location information
 */
package edu.rit.gis.sunspec.models

import edu.rit.gis.sunspec.annotations.*

@SunSpecModel(id=601, len=48, name="tracker_controller")
class Model_601 {
   @SunSpecPoint(id="Nam", label="Controller", offset=0, len=8, type="string",
                 description="Descriptive name for this control unit",
                 notes="Descriptive name for this control unit")
            
   var Nam: String? = null

   @SunSpecPoint(id="Typ", label="Type", offset=8, len=0, type="enum16",
                 description="Type of tracker",
                 notes="Type of tracker")
            
   var Typ: Any? = null

   @SunSpecPoint(id="DtLoc", label="Date", offset=9, len=5, type="string",
                 description="Local date in YYYYMMDD format",
                 notes="Local date in YYYYMMDD format")
            
   var DtLoc: String? = null

   @SunSpecPoint(id="TmLoc", label="Time", offset=14, len=3, type="string",
                 description="24 hour local time stamp to second",
                 notes="24 hour local time stamp to second")
            
   var TmLoc: String? = null

   @SunSpecPoint(id="Day", label="Day", offset=17, len=1, type="uint16",
                 description="Number of the day in the year (1-366)",
                 notes="Number of the day in the year (1-366)")
            
   var Day: Int? = null

   @SunSpecPoint(id="GlblElCtl", label="Manual Elevation", offset=18, len=2, type="int32",
                 description="Global manual override target position of elevation in degrees from horizontal.  Unimplemented for single axis azimuth tracker type",
                 notes="Global manual override target position of elevation in degrees from horizontal.  Unimplemented for single axis azimuth tracker type")
            
   var GlblElCtl: Int? = null

   @SunSpecPoint(id="GlblAzCtl", label="Manual Azimuth", offset=20, len=2, type="int32",
                 description="Global manual override target position of azimuth in degrees from true north towards east.  Unimplemented for single axis azimuth tracker type",
                 notes="Global manual override target position of azimuth in degrees from true north towards east.  Unimplemented for single axis azimuth tracker type")
            
   var GlblAzCtl: Int? = null

   @SunSpecPoint(id="GlblCtl", label="Global Mode", offset=22, len=0, type="enum16",
                 description="Global Control register operates on all trackers. Normal operation is automatic.  Operator can override the position by setting the ElCtl, AzCtl and enabling Manual operation. Entering calibration mode will revert to automatic operation after calibration is complete.",
                 notes="Global Control register operates on all trackers. Normal operation is automatic.  Operator can override the position by setting the ElCtl, AzCtl and enabling Manual operation. Entering calibration mode will revert to automatic operation after calibration is complete.")
            
   var GlblCtl: Any? = null

   @SunSpecPoint(id="GlblAlm", label="Global Alarm", offset=23, len=1, type="bitfield16",
                 description="Global tracker alarm conditions",
                 notes="Global tracker alarm conditions")
            
   var GlblAlm: Short? = null

   @SunSpecPoint(id="Dgr_SF", label="SF", offset=24, len=1, type="sunssf",
                 description="Scale Factor for targets and position measurements in degrees",
                 notes="Scale Factor for targets and position measurements in degrees")
            
   var Dgr_SF: Any? = null

   @SunSpecPoint(id="N", label="Trackers", offset=25, len=1, type="uint16",
                 description="Number of trackers being controlled.  Size of repeating block.",
                 notes="Number of trackers being controlled.  Size of repeating block.")
            
   var N: Int? = null

}
