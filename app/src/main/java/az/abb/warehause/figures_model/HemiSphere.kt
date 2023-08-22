package az.abb.warehause.figures_model

import az.abb.warehause.CalculateUtil.calculateHemisphereCSA
import az.abb.warehause.CalculateUtil.calculateHemispherePA
import az.abb.warehause.CalculateUtil.calculateHemisphereTA
import az.abb.warehause.CalculateUtil.calculateHemisphereVolume
import az.abb.warehause.Figure

/**
 * Created by rasulmammadov on 22,August,2023
 */
data class HemiSphere(
    val radius: Double,
) : Figure() {
    override fun calculateCurvedSurfaceArea(): Double {
        return calculateHemisphereCSA(radius = radius)
    }

    override fun calculatePlaneArea(): Double {
        return calculateHemispherePA(radius = radius)
    }

    override fun calculateTotalArea(): Double {
        return calculateHemisphereTA(radius = radius)
    }

    override fun calculateVolumeArea(): Double {
        return calculateHemisphereVolume(radius = radius)
    }
}
