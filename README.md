# Kotlin models for SunSpec

### Overview

This project contains SunSpec object models converted to annotated Kotlin
objects.  Software wishing to interact with the SunSpec model can then
convert Modbus messages into instances of these models.


### Annotations

Model classes include an annotation indicating the model number, its expected
length, and its name, for example:
 
```kotlin
@SunSpecModel(id=1, len=66, name="common")
class Model_1 {
   // ...
}
```

Individual fields within each model are annotated with additional descriptive information, indicating
the name, description, type, and where in the register map (within this model) the value can
be found:

```kotlin
   @SunSpecPoint(id="Mn", label="Manufacturer", offset=0, len=16, type="string",
                 description="Well known value registered with SunSpec for compliance",
                 notes="Well known value registered with SunSpec for compliance")
   var Mn: String? = null
```

Note that fields are given names that match the _id_ attribute within the model XML.  Unforunately,
model classes themselves cannot be named this way, because many models have the same 'name'
in their corresponding XML (for example, models 111, 112, and 113 all have the name _inverter_). 


# Building
