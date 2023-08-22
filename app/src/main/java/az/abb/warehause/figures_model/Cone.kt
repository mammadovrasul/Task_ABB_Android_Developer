package az.abb.warehause.figures_model

import az.abb.warehause.CalculateUtil.calculateConeBottomFaceAreaPA
import az.abb.warehause.CalculateUtil.calculateConeCSA
import az.abb.warehause.CalculateUtil.calculateConeTA
import az.abb.warehause.CalculateUtil.calculateConeVolume
import az.abb.warehause.Figure

/**
 * Created by rasulmammadov on 22,August,2023
 */
data class Cone(
    val height: Double,
    val radius: Double,
    val slantHeight: Double
) : Figure() {
    override fun calculateCurvedSurfaceArea(): Double {
        return calculateConeCSA(r = radius, l = slantHeight)
    }

    override fun calculatePlaneArea(): Double {
        return calculateConeBottomFaceAreaPA(r = radius)
    }

    override fun calculateTotalArea(): Double {
        return calculateConeTA(r = radius, l = slantHeight)
    }

    override fun calculateVolumeArea(): Double {
        return calculateConeVolume(r = radius, h = height)
    }
}
