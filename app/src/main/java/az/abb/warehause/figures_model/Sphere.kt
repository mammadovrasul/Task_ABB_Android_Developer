package az.abb.warehause.figures_model

import az.abb.warehause.CalculateUtil.calculateSphereCSA
import az.abb.warehause.CalculateUtil.calculateSpherePA
import az.abb.warehause.CalculateUtil.calculateSphereTA
import az.abb.warehause.CalculateUtil.calculateSphereVolume
import az.abb.warehause.Figure

/**
 * Created by rasulmammadov on 22,August,2023
 */
data class Sphere(
    val radius: Double,
) : Figure() {
    override fun calculateCurvedSurfaceArea(): Double {
        return calculateSphereCSA(radius)
    }

    override fun calculatePlaneArea(): Double {
        return calculateSpherePA(radius)
    }

    override fun calculateTotalArea(): Double {
        return calculateSphereTA(radius)
    }

    override fun calculateVolumeArea(): Double {
        return calculateSphereVolume(radius)
    }
}
