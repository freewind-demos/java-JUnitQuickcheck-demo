Java JUnitQuickcheck Demo
=========================

Try [JUnitQuickcheck](https://github.com/pholser/junit-quickcheck), with it's property-based testing.

`junit-quickcheck-generators` must be included, otherwise you may get such exception:

```
java.lang.IllegalArgumentException: Cannot find generator for demo.HellTest.testLength:arg0 of type java.lang.String
```