package az.abb.warehause

/**
 * Created by rasulmammadov on 22,August,2023
 */
abstract class Figure {
    abstract fun calculateCurvedSurfaceArea(): Double
    abstract fun calculatePlaneArea(): Double
    abstract fun calculateTotalArea(): Double
    abstract fun calculateVolumeArea(): Double

}